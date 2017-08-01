package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.R;
/**
 * Created by chendong on 2017/7/20.
 */

public class SecondActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
        Intent intent = getIntent();
        String data2 = intent.getStringExtra("data1");
        Log.d("接受到的传递数据",data2);
//        EditText test = (EditText)findViewById(R.id.editText2);
//        if(savedInstanceState != null){
//             test.setText(savedInstanceState.getString("save_data"));
//             Log.d("拿到保存的数据",savedInstanceState.getString("save_data"));
//        }
        Button button2 = (Button) findViewById(R.id.button2);
        //设置鉴定器，监听事件的触发
        button2.setOnClickListener(new View.OnClickListener(){
            //重写触发的方法
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(SecondActivity.this, FruitActivity.class);//跳转页面，显示intent
                startActivity(intent);
            }
        });

        Button button = (Button) findViewById(R.id.button);
        //设置鉴定器，监听事件的触发
        button.setOnClickListener(new View.OnClickListener(){
            //重写触发的方法
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(SecondActivity.this, UserCenterActivity.class);//跳转页面，显示intent
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.putExtra("data_return","第二个传递到第一个页面");
        setResult(RESULT_OK,intent);
        finish();
    }
//    //重写数据保存方法
//    @Override
//    protected  void  onSaveInstanceState(Bundle outState){
//        super.onSaveInstanceState(outState);
//        //重输入框那数据
//        EditText test = (EditText)findViewById(R.id.editText2);
//        String tmpData = test.getText().toString();
//        outState.putString("save_data",tmpData);
//        Log.d("保存的数据",tmpData);
//
//    }



}
