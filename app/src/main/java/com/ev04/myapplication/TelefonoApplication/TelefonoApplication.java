package com.ev04.myapplication.TelefonoApplication;

import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatDelegate;

public class TelefonoApplication extends Application {

    private static TelefonoApplication instance;
    private static Context appContext;

    public static TelefonoApplication getInstance() {
        return instance;
    }
    public static Context getAppContext() {
        return appContext;
    }
    public void setAppContext(Context mAppContext) {
        this.appContext = mAppContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        this.setAppContext(getApplicationContext());
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
