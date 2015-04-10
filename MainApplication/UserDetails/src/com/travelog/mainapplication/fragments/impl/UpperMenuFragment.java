package com.travelog.mainapplication.fragments.impl;

import com.travelog.mainapplication.mainmenu.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class UpperMenuFragment extends TravelogFragmentBase {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.upper_menu_bar, container, false);

	}

}
