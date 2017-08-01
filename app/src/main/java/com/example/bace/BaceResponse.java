package com.example.bace;

import java.io.Serializable;

/**
 * Created by admin on 2017/7/31.
 */

public class BaceResponse<T> implements Serializable{




    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private  String result;

    private  String message;

    private T data;

}
