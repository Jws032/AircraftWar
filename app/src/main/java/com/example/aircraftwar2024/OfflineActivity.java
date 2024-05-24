package com.example.aircraftwar2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OfflineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);

        //musicState默认值为0,关闭音乐
        int musicState = getIntent().getIntExtra("musicState",0);

    }


}