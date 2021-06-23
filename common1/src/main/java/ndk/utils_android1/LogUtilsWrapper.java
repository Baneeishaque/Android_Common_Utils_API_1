package ndk.utils_android1;

import android.content.Context;

public abstract class LogUtilsWrapper {

    public void debug(String message) {

        LogUtils.debug(configureTAG(), message);
    }

    public abstract String configureTAG();

    public void debugOnGui(String message) {

        LogUtils.debugOnGui(message, configureCurrentApplicationContext(), configureTAG());
    }

    public abstract Context configureCurrentApplicationContext();
}
