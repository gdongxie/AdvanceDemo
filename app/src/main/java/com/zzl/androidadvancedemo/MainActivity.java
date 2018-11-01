package com.zzl.androidadvancedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.zzl.androidadvancedemo.chapter2.MaterialDesignActivity;
import com.zzl.androidadvancedemo.chapter3.ViewActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.card_01)
    CardView cardView1;
    @BindView(R.id.card_02)
    CardView cardView2;
    @BindView(R.id.card_03)
    CardView cardView3;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        tv_title.setText("选择章节");
        setListener();
    }

    private void setListener() {
        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card_01:

                break;
            case R.id.card_02:
                intent = new Intent(this, MaterialDesignActivity.class);
                startActivity(intent);
                break;
            case R.id.card_03:
                intent = new Intent(this, ViewActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
