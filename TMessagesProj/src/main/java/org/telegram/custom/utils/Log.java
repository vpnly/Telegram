package org.telegram.custom.utils;

public class Log {
    public static void show(Type type, String tag, String message) {
        switch (type) {
            case Debug:
                android.util.Log.d("t-" + tag, message);
                break;
            case Info:
                android.util.Log.i("t-" + tag, message);
                break;
            case Error:
                android.util.Log.e("t-" + tag, message);
                break;
        }
    }

    public enum Type {
        Debug,
        Info,
        Error
    }
}