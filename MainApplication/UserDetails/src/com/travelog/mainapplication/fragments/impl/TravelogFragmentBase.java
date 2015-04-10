package com.travelog.mainapplication.fragments.impl;

import android.os.Bundle;
import com.travelog.mainapplication.fragments.TravelogFragment;

import android.support.v4.app.Fragment;

public class TravelogFragmentBase extends Fragment implements TravelogFragment{

	Bundle currentState;

	public void saveCurrentBundle(Bundle current){

	}

	@Override
	public void replace(Class<? extends TravelogFragment> newFragment) {
		// TODO Auto-generated method stub
	}

}
