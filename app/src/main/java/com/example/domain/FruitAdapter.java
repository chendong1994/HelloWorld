package com.example.domain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.R;

import java.util.List;

/**
 * Created by admin on 2017/7/27.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private  int resourceId;

    public  FruitAdapter(Context context , int textResourceId , List<Fruit> objects){
        super(context ,textResourceId,objects);
        resourceId = textResourceId;
    }
    @Override
    public View getView(int position , View converView, ViewGroup parent){
        Fruit fruit = getItem(position); //获取当前项的Fruit实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getNamae());
        return  view;
    }

}
