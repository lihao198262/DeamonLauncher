package co.smartac.hardware.deamonlauncher.app;

import android.app.Application;
import android.util.Log;

import co.smartac.hardware.deamonlauncher.R;

/**
 * Created by ros on 2017/10/27.
 */

public class LauncherApplication extends Application {

    private static final String TAG = "DeamonLauncher";

    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: LauncherApplication start");
    }

}
