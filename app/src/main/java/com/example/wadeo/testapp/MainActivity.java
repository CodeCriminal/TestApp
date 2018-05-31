package com.example.wadeo.testapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;


import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends Activity {
    TextView tV1,tV2;
    public static final String CURRENT_TIME = "CURRENT_TIME";
    SharedPreferences Share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        String time = format.format(calendar.getTime());
        TextView textView = findViewById(R.id.tV2);
        textView.setText(time);
        MySharedPreferences.myInstance().SaveData(String.valueOf(calendar.getTime()));
        tV1.setText(String.valueOf(MySharedPreferences.myInstance().getMyData()));
        }
        private void save(String time) {
            MySharedPreferences.myInstance().SaveData(time);
        }

}



