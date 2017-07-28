package com.example.domain;

/**
 * Created by admin on 2017/7/27.
 */

public class Fruit {

    private  String namae;
    private  int imageId;

    public  Fruit(String name,int imageId){
        this.namae= name;
        this.imageId=imageId;
    }

    public String getNamae() {
        return namae;
    }

    public void setNamae(String namae) {
        this.namae = namae;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
