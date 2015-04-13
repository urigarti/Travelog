package com.travelog.utils.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.travelog.utils.enums.buttons.MainMenuButton;

/**
 * Created by yasminuri on 3/21/2015.
 */
public class TravelogImageButton extends ImageButton {

	public TravelogImageButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public TravelogImageButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public TravelogImageButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public void deselect() {
		toggleIcon(false);
	}

	public void select() {
		toggleIcon(true);
	}

	protected void toggleIcon(boolean toSelected) {
		setSelected(toSelected);
	}

}
