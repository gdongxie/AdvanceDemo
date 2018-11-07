package com.zzl.androidadvancedemo.chapter3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zzl.androidadvancedemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CombinationActivity extends AppCompatActivity {
    TitleBar mTitleBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combination);
        mTitleBar = findViewById(R.id.title);

        mTitleBar.setLeftListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTitleBar.setRightListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CombinationActivity.this, "点击右键添加", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
