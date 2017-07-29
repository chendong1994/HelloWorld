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
        View view;
        ViewHolder viewHolder;
        if(converView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);//将viewHolder储存在view里
        }else{
            view = converView;
            viewHolder = (ViewHolder) view.getTag();//重新获取 ViewHolder
        }

        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getNamae());
        return  view;
    }

    class  ViewHolder{
        ImageView fruitImage;
        TextView  fruitName;
    }


}
