package utils.buttons;

import android.graphics.Point;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.travelog.mainapplication.userdetails.UserDetailsActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yasminuri on 3/20/2015.
 */
public class MainOptionsSwitcher {


    List<ImageView> mainButtons = new ArrayList<ImageView>();
    public MainOptionsSwitcher(RelativeLayout parentLayout) {
        for(int i = 0; i < parentLayout.getChildCount(); i++) {
            View v = parentLayout.getChildAt(i);
            if(v instanceof ImageButton) {
               this.mainButtons.add((ImageButton)v);
            }
        }
    }

    public void switchToOption(RelativeLayout parentLayout, String optionName) {
//        for(ImageButton currentButton : this.mainButtons) {
////            if(currentButton.get
////            ((ImageButton)v).
//        }

    }

    public void autoAdjustHeights() {
        Point displaySize = new Point();
        UserDetailsActivity.activity.getWindowManager().getDefaultDisplay().getSize(displaySize);
        int buttonHeight = displaySize.y / mainButtons.size();

        for(ImageView currentButton : mainButtons) {
            android.view.ViewGroup.LayoutParams params = currentButton.getLayoutParams();
            params.height = buttonHeight;
            currentButton.setLayoutParams(params);
        }
    }

//    private String getStringResourceByName(String aString) {
//        String packageName = getPackageName();
//        int resId = getResources().getIdentifier(aString, "string", packageName);
//        return getString(resId);
//    }
}
