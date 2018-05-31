package com.example.wadeo.testapp;

import android.app.Application;

public class ApplicationCore extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MySharedPreferences.myInstance().setupShareds(this);
    }
}