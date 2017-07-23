package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by chendong on 2017/7/20.
 */

public class SecondActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent intent = getIntent();
        String data2 = intent.getStringExtra("data1");
        Log.d("接受到的传递数据",data2);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.putExtra("data_return","第二个传递到第一个页面");
        setResult(RESULT_OK,intent);
        finish();
    }



}
