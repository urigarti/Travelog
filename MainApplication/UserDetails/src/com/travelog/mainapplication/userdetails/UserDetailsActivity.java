package com.travelog.mainapplication.userdetails;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.*;
import utils.buttons.MainOptionsSwitcher;
import utils.enums.buttons.MainMenuButtons;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsActivity extends FragmentActivity {

	MainOptionsSwitcher mainOptionsSwitcher;
	public static Activity activity;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.masterscreen);

		activity = this;
		
		List<ImageButton> viewButtons = new ArrayList<ImageButton>();
		for (MainMenuButtons button : MainMenuButtons.values()) {
			ImageButton bt = (ImageButton) findViewById(button.getId());
			viewButtons.add(bt);
		}

		LayoutInflater inflater = getLayoutInflater();
		RelativeLayout l = (RelativeLayout) inflater.inflate(R.layout.main_tool_bar, null);
		mainOptionsSwitcher = new MainOptionsSwitcher(l, viewButtons);

		mainOptionsSwitcher.autoAdjustHeights();
	}
	
}
