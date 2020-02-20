package wang.tyrael.accessibilitydebug;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

public class MyAccessibilityService extends AccessibilityService {
    private static final String TAG = Config.GLOBAL_TAG;

    public MyAccessibilityService() {
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.i(TAG, "onAccessibilityEvent: ");

    }

    @Override
    public void onInterrupt() {
        Log.i(TAG, "onInterrupt: ");
    }

}
