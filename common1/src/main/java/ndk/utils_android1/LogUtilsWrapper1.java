package ndk.utils_android1;

import android.content.Context;

public abstract class LogUtilsWrapper1 {

    public void debug(String message) {

        LogUtils1.debug(configureTAG(), message);
    }

    public abstract String configureTAG();

    public void debugOnGui(String message) {

        LogUtils1.debugOnGui(message, configureCurrentApplicationContext(), configureTAG());
    }

    public abstract Context configureCurrentApplicationContext();
}
