package com.travelog.mainapplication.userdetails;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

import com.travelog.utils.buttons.MainOptionsSwitcher;
import com.travelog.utils.buttons.TravelogImageButton;
import com.travelog.utils.enums.buttons.MainMenuButtons;

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
		
		List<TravelogImageButton> viewButtons = new ArrayList<TravelogImageButton>();
		for (MainMenuButtons button : MainMenuButtons.values()) {
			TravelogImageButton bt = (TravelogImageButton) findViewById(button.getId());
			viewButtons.add(bt);
		}

		LayoutInflater inflater = getLayoutInflater();
		RelativeLayout l = (RelativeLayout) inflater.inflate(R.layout.main_tool_bar, null);
		mainOptionsSwitcher = new MainOptionsSwitcher(l, viewButtons);
		
		int i = getWindow().getDecorView().getHeight();
		mainOptionsSwitcher.autoAdjustHeights(i);
		
		final View content = findViewById(android.R.id.content); 
		content.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
		    @Override
		    public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
		        // Make changes
		    	mainOptionsSwitcher.autoAdjustHeights(top - bottom);
		    }
		});
	}
	
	
	
	
	
}
