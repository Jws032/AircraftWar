package com.example.aircraftwar2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    int musicState;
    final int MUSIC_ON=1;
    final int MUSIC_OFF=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart=(Button) findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OfflineActivity.class);

                intent.putExtra("musicState",musicState);
                startActivity(intent);
            }
        });

        RadioGroup radioMusic = (RadioGroup) findViewById(R.id.radioMusic);

        //注册监听器
        radioMusic.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) findViewById(checkedId);

                System.out.println(radioButton.getText());
                if(checkedId==R.id.btnMusicOn){
                    musicState=MUSIC_ON;
                }else {
                    musicState=MUSIC_OFF;
                }

            }
        });


    }
}