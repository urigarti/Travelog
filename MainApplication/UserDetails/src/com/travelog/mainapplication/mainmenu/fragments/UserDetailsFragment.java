package com.travelog.mainapplication.mainmenu.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.travelog.mainapplication.userdetails.R;

/**
 * Created by yasminuri on 3/20/2015.
 */
public class UserDetailsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstances) {
        return inflater.inflate(R.layout.masterscreen, container,false);
    }
}
