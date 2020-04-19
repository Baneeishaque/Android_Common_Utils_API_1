package ndk.utils_android1;

import android.content.Context;
import android.content.Intent;

public class ActivityUtils {

    public static void startActivity(Context activityContext, Intent intent) {

        activityContext.startActivity(intent);
    }

    public static void startActivity(Context activityContext, Class activity) {

        startActivity(activityContext, new Intent(activityContext, activity));
    }
}
