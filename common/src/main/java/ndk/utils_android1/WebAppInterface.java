package ndk.utils_android1;

import android.content.Context;
import android.webkit.JavascriptInterface;

public class WebAppInterface {

    private Context mContext;
    private FurtherActions mfurtherActions;

    /**
     * Instantiate the interface and set the context
     */
    public WebAppInterface(Context context, FurtherActions furtherActions) {
        mContext = context;
        mfurtherActions = furtherActions;
    }

    @JavascriptInterface
    public void doActions() {
        mfurtherActions.furtherActions();
    }
}