package utils.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import utils.buttons.resources.ResourcesTools;

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


    public void toggleIcon(boolean toSelected) {
//        String newResourceName = toSelected ? this.srcImagePrefix + "_selected" : this.srcImagePrefix + "_not_selected";
//        int resourceId = ResourcesTools.getDrawableId(newResourceName);
//        setImageResource(resourceId);
    }

}
