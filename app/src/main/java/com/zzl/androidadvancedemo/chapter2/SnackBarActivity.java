package com.zzl.androidadvancedemo.chapter2;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.zzl.androidadvancedemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SnackBarActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.btn_show_snackbar)
    Button btn_show;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tv_title.setText("SnackBar");
        view = this.findViewById(R.id.rl_activity_snackbar);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar();
            }
        });
    }

    private void showSnackBar() {
        Snackbar.make(view, "Title", Snackbar.LENGTH_SHORT)
                .setAction("Click", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackBarActivity.this, "Hello I'm a snackBar", Toast.LENGTH_SHORT).show();
                    }
                }).setDuration(Snackbar.LENGTH_LONG).show();

    }
}
