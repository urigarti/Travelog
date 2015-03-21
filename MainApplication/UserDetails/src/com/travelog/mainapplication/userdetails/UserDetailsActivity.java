package com.travelog.mainapplication.userdetails;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import utils.buttons.MainOptionsSwitcher;


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

        LayoutInflater inflater = getLayoutInflater();
        RelativeLayout l = (RelativeLayout) inflater.inflate(R.layout.main_tool_bar,null);
        mainOptionsSwitcher = new MainOptionsSwitcher(l);
        mainOptionsSwitcher.autoAdjustHeights();
    }
}
