package com.travelog.mainapplication.mainmenu;

import com.travelog.mainapplication.mainmenu.fragments.DiaryOperationsFragment;
import com.travelog.mainapplication.mainmenu.fragments.MainMenuFragment;
import com.travelog.mainapplication.mainmenu.fragments.UpperMenuFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class MainApplicationActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.masterscreen);

//		Starting fragments
		DiaryOperationsFragment centerScreen = new DiaryOperationsFragment();
		MainMenuFragment mainMenu = new MainMenuFragment();
		UpperMenuFragment upperMenu = new UpperMenuFragment();
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		fragmentTransaction.detach(mainMenu);
		fragmentTransaction.replace(R.id.main_tool_bar_fragment, mainMenu);
		fragmentTransaction.detach(upperMenu);
		fragmentTransaction.replace(R.id.upper_menu_bar_fragment, upperMenu);
		fragmentTransaction.detach(centerScreen);
		fragmentTransaction.replace(R.id.diary_operations_fragment, centerScreen);
		fragmentTransaction.commit();
	}
}
