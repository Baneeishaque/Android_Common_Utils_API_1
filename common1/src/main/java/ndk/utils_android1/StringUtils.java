package ndk.utils_android1;

public class StringUtils {

    public static String removeQuotations(String string) {
        return removeSymbol(string, "\"");
    }

    public static String removeSymbol(String string, String symbol) {

        return string.replace(symbol, "");
    }
}
