package com.travelog.mainapplication.fragments.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.travelog.mainapplication.mainmenu.R;
import com.travelog.utils.buttons.MainOptionsSwitcher;
import com.travelog.utils.buttons.TravelogImageButton;
import com.travelog.utils.enums.buttons.MainMenuButton;
import com.travelog.utils.events.fragmentswitch.AppModeChangedEvent;
import com.travelog.utils.events.fragmentswitch.AppModeListener;
import com.travelog.utils.events.mainmenuoperations.MainMenuOperationsListener;

public class MainMenuFragment extends TravelogFragmentBase {

	MainOptionsSwitcher mainOptionsSwitcher;

	List<AppModeListener> appModeListeners = new ArrayList<AppModeListener>();

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.main_tool_bar_fragment, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		List<TravelogImageButton> viewButtons = new ArrayList<TravelogImageButton>();
		for (MainMenuButton button : MainMenuButton.values()) {
			TravelogImageButton bt = (TravelogImageButton) getView().findViewById(button.getButtonId());
			viewButtons.add(bt);
		}
		mainOptionsSwitcher = new MainOptionsSwitcher(viewButtons);
		mainOptionsSwitcher.addMainOptionChangedListener(new MainMenuOperationsListener() {
			@Override
			public void mainMenuOperationClicked(String buttonId) {
				appModeChanged(buttonId);
			}
		});

		getView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
			@Override
			public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
				if (right != oldRight || left != oldLeft || top != oldTop || bottom != oldBottom) {
					mainOptionsSwitcher.autoAdjustHeights(bottom - top);
				}
			}
		});
	}

	public synchronized void appModeChanged(String buttonTag) {
		fireModeEvent(Enum.valueOf(MainMenuButton.class, buttonTag));
	}
	public synchronized void addAppModeChangedListener(AppModeListener l) {
		appModeListeners.add(l);
	}

	public synchronized void removeAppModeChangedListener(AppModeListener l) {
		appModeListeners.remove(l);
	}

	private synchronized void fireModeEvent(MainMenuButton buttonId) {
		AppModeChangedEvent optionChangedEvent = new AppModeChangedEvent(this, buttonId);
		Iterator<AppModeListener> listeners = appModeListeners.iterator();
		while(listeners.hasNext() ) {
			( (AppModeListener) listeners.next()).appModeChanged(optionChangedEvent);
		}
	}
}
