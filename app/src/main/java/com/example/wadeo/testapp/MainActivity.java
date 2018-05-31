package com.example.wadeo.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
TextView tV1,tV2;
    Date currentTime = Calendar.getInstance().getTime();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV1 = findViewById(R.id.tV1);
        tV1.setText(String.valueOf(currentTime.getTime()));
        MySharedPreferences.myInstance().SaveData(String.valueOf(currentTime.getTime()));
        tV2 = findViewById(R.id.tV2);

    }
    private void save(String time) {
        MySharedPreferences.myInstance().SaveData(time);
    }
   /** @Override
    protected void onDestroy() {
        super.onDestroy();
        save(tV1.getText().toString());
    }**/
}
