package com.example.sharedpreprancesesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {

    TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        txt1=findViewById(R.id.usernametxt);
        txt2=findViewById(R.id.addresstxt);
        txt3=findViewById(R.id.emailtxt);

        @SuppressLint("WrongConstant") SharedPreferences sharedPreferences=getSharedPreferences("myFirstFile",MODE_APPEND);
        String username=sharedPreferences.getString("username","");
        String email=sharedPreferences.getString("email","");
        String address=sharedPreferences.getString("address","");


        txt1.setText(username);
        txt2.setText(address);
        txt3.setText(email);




    }

    public void logOut(View view) {

        SharedPreferences sharedPreferences=getSharedPreferences("myFirstFile",MODE_PRIVATE);

        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("LOGEDIN","0");
        editor.commit();
        startActivity(new Intent(Secondactivity.this,LaunchActivty.class));
    }
}