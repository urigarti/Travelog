package com.travelog.mainapplication.mainmenu.fragments;

import com.travelog.mainapplication.mainmenu.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 04/04/2015.
 */
public class DiaryOperationsFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.diary_operations, container, false);
    }
}
