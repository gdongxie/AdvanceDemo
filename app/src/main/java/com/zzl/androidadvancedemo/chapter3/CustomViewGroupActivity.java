package com.zzl.androidadvancedemo.chapter3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zzl.androidadvancedemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomViewGroupActivity extends AppCompatActivity {
    @BindView(R.id.title)
    TitleBar mTitleBar;
    @BindView(R.id.lv_one)
    ListView lv_one;
    @BindView(R.id.lv_two)
    ListView lv_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_group);
        ButterKnife.bind(this);
        mTitleBar.setLeftListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        String[] str1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, str1);
        lv_one.setAdapter(adapter1);
        String[] str2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, str2);
        lv_two.setAdapter(adapter2);
    }
}
