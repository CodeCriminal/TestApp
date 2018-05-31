package com.example.wadeo.testapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
TextView tV1,tV2;
    public static final String CURRENT_TIME = "CURRENT_TIME";
SharedPreferences Share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Share = getSharedPreferences(CURRENT_TIME, Context.MODE_PRIVATE);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        String time = format.format(calendar.getTime());
        TextView textView = findViewById(R.id.tV2);
        textView.setText(time);

        tV1 = (TextView) findViewById(R.id.tV1);


    }
    public void save(View v) {
        String time  = tV1.getText().toString();SharedPreferences.Editor editor = Share.edit();
        editor.putString(CURRENT_TIME, time);
        editor.commit();}
}
