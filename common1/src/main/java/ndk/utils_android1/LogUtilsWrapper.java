package ndk.utils_android1;

public abstract class LogUtilsWrapper {

    public void debug(String message) {

        LogUtils.debug(configureTAG(), message);
    }

    public abstract String configureTAG();

}
