package com.zzl.androidadvancedemo.chapter3;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class CustomView extends View {
    private int lastX;
    private int lastY;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();  //获取点击事件距离控件左边的距离，即视图坐标
        int y = (int) event.getY(); //获取点击事件距离控件定边的距离，即视图坐标

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                //计算移动距离
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                // 第一种方法调用layout()方法重新放置它的位置
                layout(getLeft() + offsetX, getTop() + offsetY, getRight() + offsetX, getBottom() + offsetY);


                //第二种方法调用offsetLeftAndRight()与offsetTopAndBottom
                //对left和right进行偏移
                //  offsetLeftAndRight(offsetX);
                //对top和bottom进行偏移
                //  offsetTopAndBottom(offsetY);

                //第三种改变布局参数
//                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
//                layoutParams.leftMargin = getLeft() + offsetX;
//                layoutParams.topMargin = getTop() + offsetY;
//                setLayoutParams(layoutParams);
                break;
            default:
                break;
        }
        return true;
    }
}
