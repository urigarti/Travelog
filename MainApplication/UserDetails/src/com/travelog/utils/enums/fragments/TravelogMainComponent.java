package com.travelog.utils.enums.fragments;

import com.travelog.mainapplication.fragments.TravelogFragment;
import com.travelog.mainapplication.fragments.impl.DiaryOperationsFragment;
import com.travelog.mainapplication.fragments.impl.MainMenuFragment;
import com.travelog.mainapplication.fragments.impl.UpperMenuFragment;

public enum TravelogMainComponent {
	
	MainMenu(MainMenuFragment.class),
	UpperMenu(UpperMenuFragment.class),
	DiaryOperations(DiaryOperationsFragment.class);

	Class<? extends TravelogFragment> componentClass;
	
	TravelogMainComponent(Class<? extends TravelogFragment> componentClass) {
		this.componentClass = componentClass;
	}
	
	public Class<? extends TravelogFragment> getCompenentId() {
		return this.componentClass;
	}
}
