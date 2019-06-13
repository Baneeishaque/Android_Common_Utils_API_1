package ndk.utils_android1;

import android.content.Context;
import android.webkit.JavascriptInterface;

public class WebAppInterface {

    private Context mContext;
    private WebAppInterfaceFurtherActions webAppInterfaceFurtherActions;

    /**
     * Instantiate the interface and set the context
     *
     * @param context
     * @param webAppInterfaceFurtherActions
     */
    public WebAppInterface(Context context, WebAppInterfaceFurtherActions webAppInterfaceFurtherActions) {
        mContext = context;
        this.webAppInterfaceFurtherActions = webAppInterfaceFurtherActions;
    }

    @JavascriptInterface
    public void doActions() {
        webAppInterfaceFurtherActions.doActions();
    }
}