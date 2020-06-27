package ndk.utils_android1;

import android.content.Context;
import android.content.Intent;

public class ActivityUtils1 {

    public static void startActivity(Context currentActivityContext, Intent nextActivityIntent) {

        currentActivityContext.startActivity(nextActivityIntent);
    }

    public static void startActivity(Context activityContext, Class activity) {

        startActivity(activityContext, new Intent(activityContext, activity));
    }
}
