package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.R;
import com.example.bace.BaceResponse;
import com.example.domain.GetUserDetailsResp;
import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by admin on 2017/7/31.
 */

public class UserCenterActivity  extends AppCompatActivity {

    public static final MediaType JSON= MediaType.parse("application/json; charset=utf-8");
    TextView textView;
    @Override
    protected  void  onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.user_center_layout);//加载布局
        textView = (TextView) findViewById(R.id.textView) ;
        sendRequest();//调用方法
    }


    private  void  sendRequest(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    //调用后台接口
                    OkHttpClient client = new OkHttpClient();
                    //RequestBody requestBody = new FormBody.Builder().add("userId","12563").build();
                    String json = "{\"userId\":\"1\"}";
                    RequestBody requestBody = RequestBody.create(JSON, json);
                    Request request = new Request.Builder().url("http://192.168.1.244:8303/api/user/dtial").
                            post(requestBody).build();
                    Response response = client.newCall(request).execute();
                    String data = response.body().string();
                    //ui操作
                    Gson gson = new Gson();
                    BaceResponse baceResponse = gson.fromJson(data, BaceResponse.class);
                    String bb = gson.toJson(baceResponse.getData());
                    GetUserDetailsResp ge = gson.fromJson(bb, GetUserDetailsResp.class);
                    showResponse(ge);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();

    }


    private  void  showResponse(final  GetUserDetailsResp re){

        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                Log.d("后台返回数据----",re.getName());
                textView.setText(re.getName());
            }
        });

    }


}
