package ndk.utils_android1;

import android.content.Context;
import android.content.Intent;

public class ActivityUtils1 {

    public static void startActivityForIntent(Context currentActivityContext, Intent nextActivityIntent) {

        currentActivityContext.startActivity(nextActivityIntent);
    }

    public static void startActivityForClass(Context currentActivityContext, Class nextActivityClass) {

        startActivityForIntent(currentActivityContext, new Intent(currentActivityContext, nextActivityClass));
    }
}
