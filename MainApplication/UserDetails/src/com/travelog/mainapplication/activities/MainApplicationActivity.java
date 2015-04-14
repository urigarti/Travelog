package com.travelog.mainapplication.activities;

import com.travelog.mainapplication.TravelogFragmentManager;
import com.travelog.mainapplication.fragments.impl.MainMenuFragment;
import com.travelog.mainapplication.mainmenu.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.travelog.utils.events.fragmentswitch.AppModeChangedEvent;
import com.travelog.utils.events.fragmentswitch.AppModeListener;

public class MainApplicationActivity extends FragmentActivity {

	public final static int centerDynamicFragmentId = R.id.center_fragment;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.masterscreen);
		
		final TravelogFragmentManager manager = new TravelogFragmentManager(this);

		((MainMenuFragment)(manager.getFragment(MainMenuFragment.class))).addAppModeChangedListener(new AppModeListener() {
			@Override
			public void appModeChanged(AppModeChangedEvent appModeChangedEvent) {
				manager.replaceFragment(R.id.center_fragment, appModeChangedEvent.getTargetComponent().getComponentClass());
			}
		});
	}
	
}
