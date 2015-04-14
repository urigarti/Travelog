package com.travelog.mainapplication;

import java.util.*;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentTransaction;
import com.travelog.mainapplication.fragments.TravelogFragment;
import com.travelog.mainapplication.fragments.impl.TravelogFragmentBase;
import com.travelog.utils.enums.fragments.TravelogMainComponent;

public class TravelogFragmentManager {
	
	FragmentActivity managedActivity;
	FragmentManager travelogManager;
	
	Map<TravelogMainComponent, TravelogFragmentBase> applicationFragment = new HashMap<TravelogMainComponent, TravelogFragmentBase>();
	
	public TravelogFragmentManager(FragmentActivity parentActivity) {
		this.managedActivity = parentActivity;
		travelogManager = this.managedActivity.getSupportFragmentManager();
	}

	public void replaceFragment(int originalFragment, TravelogFragment newFragment) {
		FragmentTransaction trans = travelogManager.beginTransaction();
		trans.replace(originalFragment, (Fragment) newFragment);
		trans.addToBackStack(null);
		trans.commit();
	}

	public void detach(TravelogFragment removedFragment) {
		detach(Arrays.asList(new TravelogFragment[]{removedFragment}));
	}

	public void detach(List<TravelogFragment> removedFragment) {
		FragmentTransaction fragmentTransaction = travelogManager.beginTransaction();
		detachList(fragmentTransaction, removedFragment).commit();
	}

	private FragmentTransaction detachList(FragmentTransaction target, List<TravelogFragment> detachedComponents) {
		for(TravelogFragment component : detachedComponents) {
			target.detach((Fragment)component);
		}
		return target;
	}

	public void attach(TravelogFragment removedFragment) {
		attach(Arrays.asList(new TravelogFragment[]{removedFragment}));
	}

	public void attach(List<TravelogFragment> addedFragment) {
		FragmentTransaction fragmentTransaction = travelogManager.beginTransaction();
		attachList(fragmentTransaction, addedFragment).commit();
	}
	
	public Fragment getFragment(Class<? extends TravelogFragment> requestedFragment) {
		List<Fragment> fragments = travelogManager.getFragments();
		for(Fragment current : fragments) {
			if(current instanceof TravelogFragment) {
				return current;
			}
		}
		return null;
	}

	private FragmentTransaction attachList(FragmentTransaction target, List<TravelogFragment> attachedComponents) {
		for(TravelogFragment component : attachedComponents) {
			target.attach((Fragment) component);
		}
		return target;
	}

}
