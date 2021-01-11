package com.zenzen.calculator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class mvmenu extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvmenu);

        Button twoxm=(Button)findViewById(R.id.button35);
        Button thrxm=(Button)findViewById(R.id.button36);
        Button ijvee=(Button)findViewById(R.id.button10);
        Button ijkvee=(Button)findViewById(R.id.button100);
        SharedPreferences sharedPref = this.getSharedPreferences(
                getString(R.string.file_key), Context.MODE_PRIVATE);
        final Integer i2=sharedPref.getInt("txtcolor",0);
        switch (i2) {
            case 0:
                twoxm.setBackgroundResource(R.drawable.button_bg);
                thrxm.setBackgroundResource(R.drawable.button_bg);
                ijvee.setBackgroundResource(R.drawable.button_bg);
                ijkvee.setBackgroundResource(R.drawable.button_bg);

                twoxm.setTextColor(Color.parseColor("#000000"));
                thrxm.setTextColor(Color.parseColor("#000000"));
                ijvee.setTextColor(Color.parseColor("#000000"));
                ijkvee.setTextColor(Color.parseColor("#000000"));break;
            case 1:
                twoxm.setBackgroundResource(R.drawable.button_bg2);
                thrxm.setBackgroundResource(R.drawable.button_bg2);
                ijvee.setBackgroundResource(R.drawable.button_bg2);
                ijkvee.setBackgroundResource(R.drawable.button_bg2);

                twoxm.setTextColor(Color.parseColor("#69F0AE"));
                thrxm.setTextColor(Color.parseColor("#69F0AE"));
                ijvee.setTextColor(Color.parseColor("#69F0AE"));
                ijkvee.setTextColor(Color.parseColor("#69F0AE"));break;
            case 2:
                twoxm.setBackgroundResource(R.drawable.button_bg3);
                thrxm.setBackgroundResource(R.drawable.button_bg3);
                ijvee.setBackgroundResource(R.drawable.button_bg3);
                ijkvee.setBackgroundResource(R.drawable.button_bg3);

                twoxm.setTextColor(Color.parseColor("#ff7f7f"));
                thrxm.setTextColor(Color.parseColor("#ff7f7f"));
                ijvee.setTextColor(Color.parseColor("#ff7f7f"));
                ijkvee.setTextColor(Color.parseColor("#ff7f7f"));break;
            case 3:
                twoxm.setBackgroundResource(R.drawable.redwhite);
                thrxm.setBackgroundResource(R.drawable.redwhite);
                ijvee.setBackgroundResource(R.drawable.redwhite);
                ijkvee.setBackgroundResource(R.drawable.redwhite);

                twoxm.setTextColor(Color.parseColor("#d50000"));
                thrxm.setTextColor(Color.parseColor("#d50000"));
                ijvee.setTextColor(Color.parseColor("#d50000"));
                ijkvee.setTextColor(Color.parseColor("#d50000"));break;

            case 4:
                twoxm.setBackgroundResource(R.drawable.whitepink);
                thrxm.setBackgroundResource(R.drawable.whitepink);
                ijvee.setBackgroundResource(R.drawable.whitepink);
                ijkvee.setBackgroundResource(R.drawable.whitepink);

                twoxm.setTextColor(Color.parseColor("#ffffff"));
                thrxm.setTextColor(Color.parseColor("#ffffff"));
                ijvee.setTextColor(Color.parseColor("#ffffff"));
                ijkvee.setTextColor(Color.parseColor("#ffffff"));break;
            case 5:
                twoxm.setBackgroundResource(R.drawable.whitebl);
                thrxm.setBackgroundResource(R.drawable.whitebl);
                ijvee.setBackgroundResource(R.drawable.whitebl);
                ijkvee.setBackgroundResource(R.drawable.whitebl);

                twoxm.setTextColor(Color.parseColor("#ffffff"));
                thrxm.setTextColor(Color.parseColor("#ffffff"));
                ijvee.setTextColor(Color.parseColor("#ffffff"));
                ijkvee.setTextColor(Color.parseColor("#ffffff"));break;
            case 6:
                twoxm.setBackgroundResource(R.drawable.orange);
                thrxm.setBackgroundResource(R.drawable.orange);
                ijvee.setBackgroundResource(R.drawable.orange);
                ijkvee.setBackgroundResource(R.drawable.orange);

                twoxm.setTextColor(Color.parseColor("#ffffff"));
                thrxm.setTextColor(Color.parseColor("#ffffff"));
                ijvee.setTextColor(Color.parseColor("#ffffff"));
                ijkvee.setTextColor(Color.parseColor("#ffffff"));break;
            case 7:
                twoxm.setBackgroundResource(R.drawable.yellow);
                thrxm.setBackgroundResource(R.drawable.yellow);
                ijvee.setBackgroundResource(R.drawable.yellow);
                ijkvee.setBackgroundResource(R.drawable.yellow);

                twoxm.setTextColor(Color.parseColor("#000000"));
                thrxm.setTextColor(Color.parseColor("#000000"));
                ijvee.setTextColor(Color.parseColor("#000000"));
                ijkvee.setTextColor(Color.parseColor("#000000"));break;



        }
        twoxm.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i=new Intent(getApplicationContext(), twomat.class);
                                        finish();
                                        startActivity(i);
                                    }
                                }
        );


        thrxm.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         Intent i=new Intent(getApplicationContext(), threemat.class);
                                         finish();
                                         startActivity(i);
                                     }
                                 }
        );
        ijvee.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         Intent i=new Intent(getApplicationContext(), ijvect.class);
                                         finish();
                                         startActivity(i);
                                     }
                                 }
        );
        ijkvee.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         Intent i=new Intent(getApplicationContext(), ijkvect.class);
                                         finish();
                                         startActivity(i);
                                     }
                                 }
        );
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), MenuActivity.class);

        finish();
        startActivity(intent);
    }
}
