package utils.buttons;

import android.widget.ImageButton;
import utils.buttons.resources.ResourcesTools;

/**
 * Created by yasminuri on 3/21/2015.
 */
public class TravelogImageButton {

    ImageButton button;
    String srcImagePrefix;

    public TravelogImageButton(ImageButton button, String srcImagePrefix) {
        this.button = button;
        this.srcImagePrefix = srcImagePrefix;
    }

    public void toggleIcon(boolean toSelected) {
        String newResourceName = toSelected ? this.srcImagePrefix + "_selected" : this.srcImagePrefix + "_not_selected";
        int resourceId = ResourcesTools.getDrawableId(newResourceName);
        this.button.setImageResource(resourceId);
    }

}
