package com.zzl.androidadvancedemo.chapter3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zzl.androidadvancedemo.R;

public class TitleBar extends RelativeLayout {
    private ImageView iv_left, iv_right;
    private TextView tv_title;
    private RelativeLayout layout_titlebar_rootlayout;
    private int mColor = Color.BLUE;
    private int mTextColor = Color.WHITE;
    private String titleName = "";

    public TitleBar(Context context) {
        super(context);
        initView(context);
    }

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray mTypedArray = context.obtainStyledAttributes(attrs, R.styleable.TitleBar);
        mColor = mTypedArray.getColor(R.styleable.TitleBar_title_bg, Color.BLUE);
        mTextColor = mTypedArray.getColor(R.styleable.TitleBar_title_text_color, Color.WHITE);
        titleName = mTypedArray.getString(R.styleable.TitleBar_title_text);
        mTypedArray.recycle();
        initView(context);
    }

    public TitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.titlebar, this, true);
        iv_left = findViewById(R.id.iv_titlebar_left);
        iv_right = findViewById(R.id.iv_titlebar_right);
        tv_title = findViewById(R.id.tv_titlebar_title);
        layout_titlebar_rootlayout = findViewById(R.id.layout_titlebar_rootlayout);
        //设置背景颜色
        layout_titlebar_rootlayout.setBackgroundColor(mColor);
        //设置标题文字颜色
        tv_title.setTextColor(mTextColor);
        //设置标题文字
        tv_title.setText(titleName);
    }

    public void setLeftListener(OnClickListener leftListener) {
        iv_left.setOnClickListener(leftListener);
    }

    public void setRightListener(OnClickListener rightListener) {
        iv_right.setOnClickListener(rightListener);
    }
}
