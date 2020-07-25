package ndk.utils_android1;

import android.content.Context;

import org.json.JSONObject;

public class ErrorUtils {

    public static void displayException(Context context, Exception exception, String applicationName) {

        ToastUtils.errorToast(context);
        LogUtils.debug(applicationName, ExceptionUtils1.getExceptionDetails(exception));
    }

    public static void displayJSONFieldMiss(Context context, JSONObject jsonObject, String applicationName) {

        ToastUtils.errorToast(context);
        LogUtils.debug(applicationName, "Error, Check JSON : " + jsonObject);
    }
}
