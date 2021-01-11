package com.zenzen.calculator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class Finmenu extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financialmenu);
        Button simple=(Button)findViewById(R.id.button35); SharedPreferences sharedPref = this.getSharedPreferences(
                getString(R.string.file_key), Context.MODE_PRIVATE);
        final Integer i2=sharedPref.getInt("txtcolor",0);
        simple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), SimpleInterest.class);
                finish();
                startActivity(i);
            }
        });
        Button compou=(Button)findViewById(R.id.button36);
        compou.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), CompundInterest.class);
                finish();
                startActivity(i);
            }
        });

        Button infla=(Button)findViewById(R.id.button39);
        infla.setOnClickListener(new View.OnClickListener() {
                   public void onClick(View v) {
                       Intent i = new Intent(getApplicationContext(), inflation.class);
                       finish();
                       startActivity(i);
                   }
        }
        );
        Button profit=(Button)findViewById(R.id.button41);
        profit.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         Intent i = new Intent(getApplicationContext(), profitloss.class);
                                         finish();
                                         startActivity(i);
                                     }
                                 }
        );
        Button disc=(Button)findViewById(R.id.button42);
        disc.setOnClickListener(new View.OnClickListener() {
                   public void onClick(View v) {
                       Intent i = new Intent(getApplicationContext(), discount.class);
                       finish();
                       startActivity(i);

                           }
            }
        );
        switch (i2) {
            case 0:
                simple.setBackgroundResource(R.drawable.button_bg);
                compou.setBackgroundResource(R.drawable.button_bg);
                infla.setBackgroundResource(R.drawable.button_bg);
                profit.setBackgroundResource(R.drawable.button_bg);
                disc.setBackgroundResource(R.drawable.button_bg);

                simple.setTextColor(Color.parseColor("#000000"));
                compou.setTextColor(Color.parseColor("#000000"));
                infla.setTextColor(Color.parseColor("#000000"));
                profit.setTextColor(Color.parseColor("#000000"));
                disc.setTextColor(Color.parseColor("#000000"));break;
            case 1:
                simple.setBackgroundResource(R.drawable.button_bg2);
                compou.setBackgroundResource(R.drawable.button_bg2);
                infla.setBackgroundResource(R.drawable.button_bg2);
                profit.setBackgroundResource(R.drawable.button_bg2);
                disc.setBackgroundResource(R.drawable.button_bg2);

                simple.setTextColor(Color.parseColor("#69F0AE"));
                compou.setTextColor(Color.parseColor("#69F0AE"));
                infla.setTextColor(Color.parseColor("#69F0AE"));
                profit.setTextColor(Color.parseColor("#69F0AE"));
                disc.setTextColor(Color.parseColor("#69F0AE"));break;
            case 2:
                simple.setBackgroundResource(R.drawable.button_bg3);
                compou.setBackgroundResource(R.drawable.button_bg3);
                infla.setBackgroundResource(R.drawable.button_bg3);
                profit.setBackgroundResource(R.drawable.button_bg3);
                disc.setBackgroundResource(R.drawable.button_bg3);

                simple.setTextColor(Color.parseColor("#ff7f7f"));
                compou.setTextColor(Color.parseColor("#ff7f7f"));
                infla.setTextColor(Color.parseColor("#ff7f7f"));
                profit.setTextColor(Color.parseColor("#ff7f7f"));
                disc.setTextColor(Color.parseColor("#ff7f7f"));break;
            case 3:
                simple.setBackgroundResource(R.drawable.redwhite);
                compou.setBackgroundResource(R.drawable.redwhite);
                infla.setBackgroundResource(R.drawable.redwhite);
                profit.setBackgroundResource(R.drawable.redwhite);
                disc.setBackgroundResource(R.drawable.redwhite);

                simple.setTextColor(Color.parseColor("#d50000"));
                compou.setTextColor(Color.parseColor("#d50000"));
                infla.setTextColor(Color.parseColor("#d50000"));
                profit.setTextColor(Color.parseColor("#d50000"));
                disc.setTextColor(Color.parseColor("#d50000"));break;

            case 4:
                simple.setBackgroundResource(R.drawable.whitepink);
                compou.setBackgroundResource(R.drawable.whitepink);
                infla.setBackgroundResource(R.drawable.whitepink);
                profit.setBackgroundResource(R.drawable.whitepink);
                disc.setBackgroundResource(R.drawable.whitepink);

                simple.setTextColor(Color.parseColor("#ffffff"));
                compou.setTextColor(Color.parseColor("#ffffff"));
                infla.setTextColor(Color.parseColor("#ffffff"));
                profit.setTextColor(Color.parseColor("#ffffff"));
                disc.setTextColor(Color.parseColor("#ffffff"));break;
            case 5:
                simple.setBackgroundResource(R.drawable.whitebl);
                compou.setBackgroundResource(R.drawable.whitebl);
                infla.setBackgroundResource(R.drawable.whitebl);
                profit.setBackgroundResource(R.drawable.whitebl);
                disc.setBackgroundResource(R.drawable.whitebl);

                simple.setTextColor(Color.parseColor("#ffffff"));
                compou.setTextColor(Color.parseColor("#ffffff"));
                infla.setTextColor(Color.parseColor("#ffffff"));
                profit.setTextColor(Color.parseColor("#ffffff"));
                disc.setTextColor(Color.parseColor("#ffffff"));break;
            case 6:
                simple.setBackgroundResource(R.drawable.orange);
                compou.setBackgroundResource(R.drawable.orange);
                infla.setBackgroundResource(R.drawable.orange);
                profit.setBackgroundResource(R.drawable.orange);
                disc.setBackgroundResource(R.drawable.orange);

                simple.setTextColor(Color.parseColor("#ffffff"));
                compou.setTextColor(Color.parseColor("#ffffff"));
                infla.setTextColor(Color.parseColor("#ffffff"));
                profit.setTextColor(Color.parseColor("#ffffff"));
                disc.setTextColor(Color.parseColor("#ffffff"));break;
            case 7:
                simple.setBackgroundResource(R.drawable.yellow);
                compou.setBackgroundResource(R.drawable.yellow);
                infla.setBackgroundResource(R.drawable.yellow);
                profit.setBackgroundResource(R.drawable.yellow);
                disc.setBackgroundResource(R.drawable.yellow);

                simple.setTextColor(Color.parseColor("#000000"));
                compou.setTextColor(Color.parseColor("#000000"));
                infla.setTextColor(Color.parseColor("#000000"));
                profit.setTextColor(Color.parseColor("#000000"));
                disc.setTextColor(Color.parseColor("#000000"));break;



        }
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), MenuActivity.class);

        finish();
        startActivity(intent);
    }
}
