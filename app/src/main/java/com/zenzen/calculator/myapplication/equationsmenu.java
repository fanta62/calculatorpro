package com.zenzen.calculator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class equationsmenu extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.equationsmenu);
        Button xy=(Button)findViewById(R.id.button35);
        Button xyz=(Button)findViewById(R.id.button36);

        xy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                        Intent i=new Intent(getApplicationContext(), solvexy.class);
                        finish();
                        startActivity(i);

            }
        });

        Button sx=(Button)findViewById(R.id.button10);
        sx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(), solvex.class);
                finish();
                startActivity(i);

            }
        });
        xyz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(), solvexyz.class);
                finish();
                startActivity(i);

            }
        });
        SharedPreferences sharedPref = this.getSharedPreferences(
                getString(R.string.file_key), Context.MODE_PRIVATE);
        final Integer i2=sharedPref.getInt("txtcolor",0);
        switch (i2) {
            case 0:
                xy.setBackgroundResource(R.drawable.button_bg);
                sx.setBackgroundResource(R.drawable.button_bg);
                xyz.setBackgroundResource(R.drawable.button_bg);

                xy.setTextColor(Color.parseColor("#000000"));
                sx.setTextColor(Color.parseColor("#000000"));
                xyz.setTextColor(Color.parseColor("#000000"));break;
            case 1:
                xy.setBackgroundResource(R.drawable.button_bg2);
                sx.setBackgroundResource(R.drawable.button_bg2);
                xyz.setBackgroundResource(R.drawable.button_bg2);

                xy.setTextColor(Color.parseColor("#69F0AE"));
                sx.setTextColor(Color.parseColor("#69F0AE"));
                xyz.setTextColor(Color.parseColor("#69F0AE"));break;
            case 2:
                xy.setBackgroundResource(R.drawable.button_bg3);
                sx.setBackgroundResource(R.drawable.button_bg3);
                xyz.setBackgroundResource(R.drawable.button_bg3);

                xy.setTextColor(Color.parseColor("#ff7f7f"));
                sx.setTextColor(Color.parseColor("#ff7f7f"));
                xyz.setTextColor(Color.parseColor("#ff7f7f"));break;
            case 3:
                xy.setBackgroundResource(R.drawable.redwhite);
                sx.setBackgroundResource(R.drawable.redwhite);
                xyz.setBackgroundResource(R.drawable.redwhite);

                xy.setTextColor(Color.parseColor("#d50000"));
                sx.setTextColor(Color.parseColor("#d50000"));
                xyz.setTextColor(Color.parseColor("#d50000"));break;

            case 4:
                xy.setBackgroundResource(R.drawable.whitepink);
                sx.setBackgroundResource(R.drawable.whitepink);
                xyz.setBackgroundResource(R.drawable.whitepink);

                xy.setTextColor(Color.parseColor("#ffffff"));
                sx.setTextColor(Color.parseColor("#ffffff"));
                xyz.setTextColor(Color.parseColor("#ffffff"));break;
            case 5:
                xy.setBackgroundResource(R.drawable.whitebl);
                sx.setBackgroundResource(R.drawable.whitebl);
                xyz.setBackgroundResource(R.drawable.whitebl);

                xy.setTextColor(Color.parseColor("#ffffff"));
                sx.setTextColor(Color.parseColor("#ffffff"));
                xyz.setTextColor(Color.parseColor("#ffffff"));break;
            case 6:
                xy.setBackgroundResource(R.drawable.orange);
                sx.setBackgroundResource(R.drawable.orange);
                xyz.setBackgroundResource(R.drawable.orange);

                xy.setTextColor(Color.parseColor("#ffffff"));
                sx.setTextColor(Color.parseColor("#ffffff"));
                xyz.setTextColor(Color.parseColor("#ffffff"));break;
            case 7:
                xy.setBackgroundResource(R.drawable.yellow);
                sx.setBackgroundResource(R.drawable.yellow);
                xyz.setBackgroundResource(R.drawable.yellow);

                xy.setTextColor(Color.parseColor("#000000"));
                sx.setTextColor(Color.parseColor("#000000"));
                xyz.setTextColor(Color.parseColor("#000000"));break;



        }
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), MenuActivity.class);

        finish();
        startActivity(intent);
    }
}
