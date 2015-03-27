package utils.buttons.resources;

import android.util.Log;
import android.view.View;
import utils.enums.ResourceType;

import java.lang.reflect.Field;

/**
 * Created by yasminuri on 3/21/2015.
 */
public class ResourcesTools {

    public static int getDrawableId(String drawableName, ResourceType resourceType) {
        int id = -1;
        try {
            Class<? extends Object> res = resourceType.getType();
            Field field = res.getField(drawableName);
            id =  field.getInt(null);
        }
        catch (Exception e) {
            Log.e("Travelog", "Failure to get drawable id.", e);
        }
        return id;
    }

    public String getResourceName(View v, int resourceId) {
        return v.getResources().getResourceEntryName(resourceId);
    }

//    public int getResourceId(String resourceName)
}
