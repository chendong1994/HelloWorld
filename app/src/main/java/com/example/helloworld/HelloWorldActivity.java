package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.R;


/**
 * Created by chendong on 2017/7/20.
 *
 */
public class HelloWorldActivity extends AppCompatActivity {

    //重写方法，定义自己的业务逻辑
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haello_world_layout);
        Button button1 = (Button) findViewById(R.id.button1);
        //设置鉴定器，监听事件的触发
        button1.setOnClickListener(new View.OnClickListener(){
            //重写触发的方法
            @Override
            public  void onClick(View v){
                //Toast.makeText(HelloWorldActivity.this, "跳出来了", Toast.LENGTH_SHORT).show();//设置短期时长
                Intent intent = new Intent(HelloWorldActivity.this, SecondActivity.class);//跳转页面，显示intent
                String data = "实现数据传递";
                intent.putExtra("data1",data);
                //startActivity(intent);
                startActivityForResult(intent,1);
            }
        });

//        Intent intent2 = getIntent();
//        String data2 = intent2.getStringExtra("data_se");
//        Log.d("接受到的传递数据",data2);
    }

    //重写数据传递上个活动销毁方法
    @Override
    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
         switch (requestCode) {
             case 1:
                 if(resultCode == RESULT_OK){
                     String returnData = data.getStringExtra("data_return");
                     Log.d("第二个活动销毁返回的数据",returnData);
                 }
                 break;
             default:
         }

    }


    //重写菜单实现方法
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return  true;
    }

    //重写菜单响应事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "你点击添加", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你点击移除", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return  true;
    }

    //销毁一个活动


}
