package com.travelog.mainapplication.mainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainApplicationActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.masterscreen);

		Intent intent = new Intent(this, MainMenuActivity.class);
		startActivity(intent);
//		finish();
	}
}
