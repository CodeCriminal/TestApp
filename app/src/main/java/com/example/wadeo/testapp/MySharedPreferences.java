package com.example.wadeo.testapp;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {

    private static final String current_time = "current_time";

    private static MySharedPreferences myInstance;

    private SharedPreferences MySharedPreferences;

    public void setupShareds(Context context) {
        MySharedPreferences = context.getSharedPreferences("my shareds", Context.MODE_PRIVATE);
    }

    public static MySharedPreferences myInstance() {
        if (myInstance == null) {
            myInstance = new MySharedPreferences();
        }
        return myInstance;
    }

    public void SaveData(String CurrentTime) {
        SharedPreferences.Editor editor = MySharedPreferences.edit();
        editor.putString(current_time, CurrentTime);
        editor.apply();
    }

    public String getMyData() {
        return MySharedPreferences.getString(current_time, "");
    }

}