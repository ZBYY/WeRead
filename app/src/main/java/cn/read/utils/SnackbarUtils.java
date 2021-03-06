package cn.read.utils;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.View;

/**
 * Created by Administrator on 2017-03-17.
 */

public class SnackbarUtils {

    private SnackbarUtils() {
        throw new AssertionError();
    }


    /**
     * 显示 Snackbar
     *
     * @param activity
     * @param message
     * @param isLong
     */
    public static void showSnackbar(Activity activity, String message, boolean isLong) {
        if (activity == null) {
            return;
        }
        View view = activity.getWindow().getDecorView().findViewById(android.R.id.content);
        Snackbar.make(view, message, isLong ? Snackbar.LENGTH_LONG : Snackbar.LENGTH_SHORT).show();
    }
}
