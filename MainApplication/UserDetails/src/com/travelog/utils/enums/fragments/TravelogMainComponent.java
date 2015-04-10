package com.travelog.utils.enums.fragments;

import com.travelog.mainapplication.mainmenu.R;

public enum TravelogMainComponent {
	
	MainMenu(R.id.main_tool_bar_fragment),
	UpperMenu(R.id.upper_menu_bar_fragment),
	DiaryOperations(R.id.diary_operations_fragment);

	int componentId;
	
	TravelogMainComponent(int componentName) {
		this.componentId = componentName;
	}
	
	public int getCompenentId() {
		return this.componentId;
	}
}
