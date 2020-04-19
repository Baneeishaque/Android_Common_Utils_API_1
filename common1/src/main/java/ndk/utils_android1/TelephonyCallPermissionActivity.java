package ndk.utils_android1;

import android.Manifest;

public abstract class TelephonyCallPermissionActivity extends PermissionActivity {

    private static final int CALL_PERMISSION_REQUEST_CODE = 1;

    @Override
    protected int configurePermissionRequiredMessage() {

        return R.string.call_permission_required;
    }

    @Override
    protected String configurePermission() {

        return Manifest.permission.CALL_PHONE;
    }

    @Override
    protected int configurePermissionRequestCode() {

        return CALL_PERMISSION_REQUEST_CODE;
    }
}
