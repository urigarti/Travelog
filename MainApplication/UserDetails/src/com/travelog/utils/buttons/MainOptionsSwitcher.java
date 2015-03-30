package com.travelog.utils.buttons;

import android.R.layout;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.*;

import com.travelog.mainapplication.mainmenu.MainMenuActivity;
import com.travelog.mainapplication.userdetails.R;

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
//		autoAdjustHeights(parentLayout.getHeight());
	}

//    public void switchToOption(RelativeLayout parentLayout, String optionName) {
//        for(ImageButton currentButton : this.mainButtons) {
//            if(currentButton.getId() == ResourcesTools.getDrawableId(optionName, ResourceType.Drawable)) {
//            }
////                    ((ImageButton) v).
//        }
//
//    }

    public void autoAdjustHeights(int buttonHeight) {
        Point displaySize = new Point();
        MainMenuActivity.activity.getWindowManager().getDefaultDisplay().getSize(displaySize);
//        int buttonHeight = displaySize.x / mainButtons.size();
//    	LayoutInflater.inflate(R.layout.main_tool_bar, null);
//    	parentView.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
//    	int widht = parentView.getMeasuredWidth();
//    	int height = parentView.getMeasuredHeight();
//        int buttonHeight = widht / mainButtons.size();

        for(TravelogImageButton currentButton : mainButtons) {
        	ViewGroup.LayoutParams lp = currentButton.getLayoutParams();
        	lp.height = buttonHeight;
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

//    private String getStringResourceByName(String aString) {
//        String packageName = getPackageName();
//        int resId = getResources().getIdentifier(aString, "string", packageName);
//        return getString(resId);
//    }

    public List<TravelogImageButton> getMainButtons() {
        return mainButtons;
    }

}
