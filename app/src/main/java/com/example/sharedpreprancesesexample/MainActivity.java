package com.example.sharedpreprancesesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username,email,adress;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.usernmae);
        email=findViewById(R.id.email);
        adress=findViewById(R.id.address);


    }


    public void writeData(View view)
    {

        SharedPreferences sharedPreferences=getSharedPreferences("myFirstFile",MODE_PRIVATE);

        SharedPreferences.Editor editor=sharedPreferences.edit();

        editor.putString("username",username.getText().toString());
        editor.putString("address",adress.getText().toString());
        editor.putString("email",email.getText().toString());
        editor.putString("LOGEDIN","1");

        editor.commit();

        username.setText("");
        email.setText("");
        adress.setText("");
        startActivity(new Intent(MainActivity.this,Secondactivity.class));





    }

    public void readData(View view)
    {
        startActivity(new Intent(MainActivity.this,Secondactivity.class));

    }
}