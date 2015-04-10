package com.travelog.mainapplication.fragments.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import com.travelog.mainapplication.mainmenu.R;
import com.travelog.utils.buttons.MainOptionsSwitcher;
import com.travelog.utils.buttons.TravelogImageButton;
import com.travelog.utils.enums.buttons.MainMenuButtons;

public class MainMenuFragment extends TravelogFragmentBase {

	MainOptionsSwitcher mainOptionsSwitcher;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.main_tool_bar, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		getView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
			@Override
			public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
				List<TravelogImageButton> viewButtons = new ArrayList<TravelogImageButton>();
				for (MainMenuButtons button : MainMenuButtons.values()) {
					TravelogImageButton bt = (TravelogImageButton) getView().findViewById(button.getId());
					viewButtons.add(bt);
				}
				mainOptionsSwitcher = new MainOptionsSwitcher(viewButtons);

				if (right != oldRight || left != oldLeft || top != oldTop || bottom != oldBottom) {
					mainOptionsSwitcher.autoAdjustHeights(bottom - top);
				}
			}
		});

	}





}
