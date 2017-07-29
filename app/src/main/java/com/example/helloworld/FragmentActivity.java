package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.R;

/**
 * Created by admin on 2017/7/29.
 */

public class FragmentActivity extends AppCompatActivity {

    //重写方法，定义自己的业务逻辑
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment_layout);
    }
}
