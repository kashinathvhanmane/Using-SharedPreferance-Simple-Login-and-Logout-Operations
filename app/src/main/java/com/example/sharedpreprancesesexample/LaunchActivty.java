package com.example.sharedpreprancesesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class LaunchActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_launch_activty);


        @SuppressLint("WrongConstant") SharedPreferences sharedPreferences=getSharedPreferences("myFirstFile",MODE_APPEND);
        if (sharedPreferences.getString("LOGEDIN","").equals("1"))
        {
            startActivity(new Intent(LaunchActivty.this,Secondactivity.class));

        }
        else
        {
            startActivity(new Intent(LaunchActivty.this,MainActivity.class));
        }
    }
}