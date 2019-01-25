package com.fenghui.tvscreenprotection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private boolean isChildMode = true;

    @BindView(R.id.rb_child)
    RadioButton rbChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_ok)
    void doSelect(View v) {
        isChildMode = rbChild.isChecked();
        if(isChildMode) {   //儿童模式

        } else {            //成人模式
            //不作处理直接打开系统默认launcher
        }
    }
}
