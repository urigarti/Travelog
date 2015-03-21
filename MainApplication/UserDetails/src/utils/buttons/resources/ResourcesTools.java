package utils.buttons.resources;

import android.util.Log;
import com.travelog.mainapplication.userdetails.R;

import java.lang.reflect.Field;

/**
 * Created by yasminuri on 3/21/2015.
 */
public class ResourcesTools {

    public static int getDrawableId(String drawableName) {
        try {
            Class res = R.drawable.class;
            Field field = res.getField(drawableName);
            return field.getInt(null);
        }
        catch (Exception e) {
            Log.e("Travelog", "Failure to get drawable id.", e);
        }
        return -1;
    }
}
