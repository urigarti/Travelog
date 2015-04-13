package com.travelog.mainapplication.fragments.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.travelog.mainapplication.mainmenu.R;

/**
 * Created by Administrator on 11/04/2015.
 */
public class DeletionsFragment extends TravelogFragmentBase {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.deletions_fragment, container, false);
    }
}
