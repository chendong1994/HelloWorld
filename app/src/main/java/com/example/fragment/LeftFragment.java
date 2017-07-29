package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.R;

/**
 * 碎片类
 * Created by chendong on 2017/7/29.
 */

public class LeftFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle saved){
        View view = inflater.inflate(R.layout.left_fragment,container,false);
        return  view;
    }
}
