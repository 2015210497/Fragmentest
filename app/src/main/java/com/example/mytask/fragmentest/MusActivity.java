package com.example.mytask.fragmentest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/12/8.
 */

public class MusActivity extends Fragment {
    public View onCreateView (LayoutInflater inflater, ViewGroup conyainer, Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_mus,null);
    }

}
