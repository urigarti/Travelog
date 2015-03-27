package utils.buttons;

import android.app.ActionBar;
import android.graphics.Point;
import android.view.View;
import android.widget.*;
import com.travelog.mainapplication.userdetails.UserDetailsActivity;
import utils.buttons.resources.ResourcesTools;
import utils.enums.ResourceType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yasminuri on 3/20/2015.
 */
public class MainOptionsSwitcher {


    List<TravelogImageButton> mainButtons = new ArrayList<TravelogImageButton>();

	public MainOptionsSwitcher(RelativeLayout parentLayout, List<ImageButton> buttons) {
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setOnClickListener(groupClickListener);
			TravelogImageButton tb = new TravelogImageButton(buttons.get(i).getContext());
			mainButtons.add(tb);
			this.mainButtons.add(tb);
		}
	}

    public void switchToOption(RelativeLayout parentLayout, String optionName) {
        for(ImageButton currentButton : this.mainButtons) {
            if(currentButton.getId() == ResourcesTools.getDrawableId(optionName, ResourceType.Drawable)) {
            }
//                    ((ImageButton) v).
        }

    }

    public void autoAdjustHeights() {
        Point displaySize = new Point();
        UserDetailsActivity.activity.getWindowManager().getDefaultDisplay().getSize(displaySize);
        int buttonHeight = displaySize.y / mainButtons.size();

        for(View currentButton : mainButtons) {
            currentButton.setLayoutParams(new ActionBar.LayoutParams(currentButton.getWidth(), buttonHeight));
        }
    }

    public void switchImages(View v) {
    	if(v instanceof ImageButton) {
    		Toast.makeText(v.getRootView().getContext(), "" + v.getId(), Toast.LENGTH_SHORT).show();
    	}
    }

    View.OnClickListener groupClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switchImages(v);
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
