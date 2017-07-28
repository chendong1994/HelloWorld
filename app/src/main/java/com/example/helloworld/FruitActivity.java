package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.domain.Fruit;
import com.example.domain.FruitAdapter;

import java.util.ArrayList;
import java.util.List;
import com.example.R;

/**
 * Created by admin on 2017/7/27.
 */

public class FruitActivity extends AppCompatActivity {

    //private  String[] data = { "apple","banana","orange","watermelon","pear","grape","mhfj","dasd","1554","d4sd5","dsad","5254sd","dsda"};

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected  void  onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.fruits_layout);
//        ArrayAdapter<String> adpter = new ArrayAdapter<String>(FruitActivity.this , android.R.layout.simple_list_item_1,data);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adpter);
        initFruits(); //初始化水果数据
        FruitAdapter adapter = new FruitAdapter(FruitActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

    private  void  initFruits(){
         for (int i = 0; i < 1; i++){
             Fruit apple = new Fruit("apple" , R.drawable.yy);
             fruitList.add(apple);
             Fruit apple2 = new Fruit("apple" , R.drawable.aiqiyi);
             fruitList.add(apple2);
             Fruit apple3 = new Fruit("apple" , R.drawable.baiduyinyue);
             fruitList.add(apple3);
             Fruit apple4 = new Fruit("apple" , R.drawable.manhua);
             fruitList.add(apple4);
             Fruit apple5 = new Fruit("apple" , R.drawable.qiushi1);
             fruitList.add(apple5);

         }


    }


}
