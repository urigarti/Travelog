package com.travelog.utils.buttons.resources;

import android.util.Log;
import android.view.View;

import java.lang.reflect.Field;

import com.travelog.utils.enums.ResourceType;

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

    public static String getResourceName(View parentView, int resourceId) {
    	return parentView.getResources().getResourceEntryName(resourceId);
    }

//    private String getStringResourceByName(String aString) {
//        String packageName = getPackageName();
//        int resId = getResources().getIdentifier(aString, "string", packageName);
//        return getString(resId);
//    }
}
