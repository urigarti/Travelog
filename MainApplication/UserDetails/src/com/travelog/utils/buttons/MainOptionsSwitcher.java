package com.travelog.utils.buttons;

import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yasminuri on 3/20/2015.
 */
public class MainOptionsSwitcher {

	View parentView;
	TravelogImageButton selectedOption;
    List<TravelogImageButton> mainButtons = new ArrayList<TravelogImageButton>();
    
    protected MainOptionsSwitcher() {}

	public MainOptionsSwitcher(RelativeLayout parentLayout, List<TravelogImageButton> buttons) {
		this.parentView = parentLayout;
		selectedOption = buttons.get(0);
		selectedOption.select();
//		for(int childIdx = 0; childIdx < parentLayout.getChildCount(); childIdx++) {
//			TravelogImageButton currentView = (TravelogImageButton)parentLayout.getChildAt(childIdx); 
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setOnClickListener(groupClickListener);
//			currentView.setOnClickListener(groupClickListener);
//			TravelogImageButton tb = new TravelogImageButton(buttons.get(i).getContext());
//			tb.setTag(buttons.get(i).getTag());
//			mainButtons.add(tb);
			this.mainButtons.add((TravelogImageButton)buttons.get(i));
		}
	}

    public void autoAdjustHeights(int buttonHeight) {
		int height = buttonHeight / mainButtons.size();
        for(TravelogImageButton currentButton : mainButtons) {
        	ViewGroup.LayoutParams lp = currentButton.getLayoutParams();
        	lp.height = height;
        	currentButton.setLayoutParams(lp);
        }
    }

	public void switchImages(View v) {
		if (v instanceof TravelogImageButton) {
			if (!(v.getTag().equals(selectedOption.getTag()))) {
				((TravelogImageButton) v).select();
				selectedOption.deselect();
			}
		}
	}

    View.OnClickListener groupClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switchImages(v);
            selectedOption = (TravelogImageButton)v;
        }
    };

    public List<TravelogImageButton> getMainButtons() {
        return mainButtons;
    }

}
