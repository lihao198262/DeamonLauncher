package co.smartac.hardware.deamonlauncher.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AddPackageReceiver extends BroadcastReceiver {

    private static final String TAG = "DeamonLauncher";

    @Override
    public void onReceive(Context context, Intent intent) {
        String str = intent.getDataString();
        Log.d(TAG, "onReceive: " + String.format("action:(%s) package:(%s)", intent.getAction(), str));

        if (str.contains("co.smartac.hardware.aidltest"))
        {
            Log.d(TAG, "aidltest installed.");
            intent = new Intent("co.smartac.hardware.aidltest.action.MyService");
            intent.setPackage("co.smartac.hardware.aidltest");
            context.startService(intent);
            return;
        }
    }
}
