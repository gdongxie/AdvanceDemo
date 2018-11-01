package com.zzl.androidadvancedemo.chapter2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zzl.androidadvancedemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MaterialDesignActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.btn_snackbar)
    Button btn_snackbar;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tv_title.setText("Material Design各控件");
        setListener();
    }

    private void setListener() {
        btn_snackbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_snackbar:
                intent = new Intent(this, SnackBarActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
