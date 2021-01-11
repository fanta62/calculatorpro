package com.zenzen.calculator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class Themes extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.themes);

        Button green=(Button)findViewById(R.id.button36);
        Button cer=(Button)findViewById(R.id.button35);
        Button drac=(Button)findViewById(R.id.button37);
        Button redw=(Button)findViewById(R.id.button38);
        Button blackw=(Button)findViewById(R.id.button39);
        Button pink=(Button)findViewById(R.id.button41);
        Button orang=(Button)findViewById(R.id.button42);
        Button yello=(Button)findViewById(R.id.button43);
        SharedPreferences sharedPref = this.getSharedPreferences(
                getString(R.string.file_key), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor2 = sharedPref.edit();
        editor2.apply();
        green.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor2.putInt("txtcolor",1);
                editor2.apply();
            }
        });
        cer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor2.putInt("txtcolor",0);
                editor2.apply();
            }
        });
        drac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor2.putInt("txtcolor",2);
                editor2.apply();
            }
        });
        redw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor2.putInt("txtcolor",3);
                editor2.apply();
            }
        });
        pink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor2.putInt("txtcolor",4);
                editor2.apply();
            }
        });
        blackw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor2.putInt("txtcolor",5);
                editor2.apply();
            }
        });
        orang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor2.putInt("txtcolor",6);
                editor2.apply();
            }
        });
        yello.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor2.putInt("txtcolor",7);
                editor2.apply();
            }
        });
    }
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), MenuActivity.class);

        finish();
        startActivity(intent);
    }
}
