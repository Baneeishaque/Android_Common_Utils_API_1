package ndk.utils_android1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import static ndk.utils_android1.TelephonyUtils.isTelephonyEnabled;

public abstract class TelephonyCallActivity extends TelephonyCallPermissionActivity {

    @SuppressLint("MissingPermission")
    public boolean callMobileNumber(Context context, String mobileNumber) {

        if (isTelephonyEnabled(context)) {

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + mobileNumber));

            getRuntimePermission(new PermissionGrantedActions() {

                @SuppressLint("MissingPermission")
                @Override
                public void configurePermissionGrantedActions() {

                    context.startActivity(callIntent);
                }

            }, new PermissionAcceptedActions() {

                @SuppressLint("MissingPermission")
                @Override
                public void configurePermissionAcceptedActions() {

                    context.startActivity(callIntent);
                }

            }, new PermissionDeniedActions() {

                @Override
                public void configurePermissionDeniedActions() {

                    Toast.makeText(activityContext, R.string.call_permission_required, Toast.LENGTH_SHORT).show();
                }
            });

            return true;
        }

        return false;
    }
}
