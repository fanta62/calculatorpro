package com.zenzen.calculator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;




public class areamenu extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areamenu);

        final Button circle=(Button)findViewById(R.id.button35);
        final Button square=(Button)findViewById(R.id.button36);
        final Button trian=(Button)findViewById(R.id.button37);
        final Button quad=(Button)findViewById(R.id.button38);
        final Button cube1=(Button)findViewById(R.id.button39);
        final Button cube2=(Button)findViewById(R.id.button391);
        final Button spheree=(Button)findViewById(R.id.button41);
        final Button cyli=(Button)findViewById(R.id.button43);
        final Button cone2=(Button)findViewById(R.id.button42);
        final Button pyra=(Button)findViewById(R.id.button45);
        SharedPreferences sharedPref = this.getSharedPreferences(
                getString(R.string.file_key), Context.MODE_PRIVATE);
        final Integer i2=sharedPref.getInt("txtcolor",0);
        switch (i2) {
            case 0:
                circle.setBackgroundResource(R.drawable.button_bg);
                square.setBackgroundResource(R.drawable.button_bg);
                trian.setBackgroundResource(R.drawable.button_bg);
                quad.setBackgroundResource(R.drawable.button_bg);
                cube1.setBackgroundResource(R.drawable.button_bg);
                cube2.setBackgroundResource(R.drawable.button_bg);
                spheree.setBackgroundResource(R.drawable.button_bg);
                cyli.setBackgroundResource(R.drawable.button_bg);
                cone2.setBackgroundResource(R.drawable.button_bg);
                pyra.setBackgroundResource(R.drawable.button_bg);

                circle.setTextColor(Color.parseColor("#000000"));
                square.setTextColor(Color.parseColor("#000000"));
                trian.setTextColor(Color.parseColor("#000000"));
                quad.setTextColor(Color.parseColor("#000000"));
                cube1.setTextColor(Color.parseColor("#000000"));
                cube2.setTextColor(Color.parseColor("#000000"));
                spheree.setTextColor(Color.parseColor("#000000"));
                cyli.setTextColor(Color.parseColor("#000000"));
                cone2.setTextColor(Color.parseColor("#000000"));
                pyra.setTextColor(Color.parseColor("#000000"));break;
            case 1:
                circle.setBackgroundResource(R.drawable.button_bg2);
                square.setBackgroundResource(R.drawable.button_bg2);
                trian.setBackgroundResource(R.drawable.button_bg2);
                quad.setBackgroundResource(R.drawable.button_bg2);
                cube1.setBackgroundResource(R.drawable.button_bg2);
                cube2.setBackgroundResource(R.drawable.button_bg2);
                spheree.setBackgroundResource(R.drawable.button_bg2);
                cyli.setBackgroundResource(R.drawable.button_bg);
                cone2.setBackgroundResource(R.drawable.button_bg2);
                pyra.setBackgroundResource(R.drawable.button_bg2);

                circle.setTextColor(Color.parseColor("#69F0AE"));
                square.setTextColor(Color.parseColor("#69F0AE"));
                trian.setTextColor(Color.parseColor("#69F0AE"));
                quad.setTextColor(Color.parseColor("#69F0AE"));
                cube1.setTextColor(Color.parseColor("#69F0AE"));
                cube2.setTextColor(Color.parseColor("#69F0AE"));
                spheree.setTextColor(Color.parseColor("#69F0AE"));
                cyli.setTextColor(Color.parseColor("#69F0AE"));
                cone2.setTextColor(Color.parseColor("#69F0AE"));
                pyra.setTextColor(Color.parseColor("#69F0AE"));break;
            case 2:
                circle.setBackgroundResource(R.drawable.button_bg3);
                square.setBackgroundResource(R.drawable.button_bg3);
                trian.setBackgroundResource(R.drawable.button_bg3);
                quad.setBackgroundResource(R.drawable.button_bg3);
                cube1.setBackgroundResource(R.drawable.button_bg3);
                cube2.setBackgroundResource(R.drawable.button_bg3);
                spheree.setBackgroundResource(R.drawable.button_bg3);
                cyli.setBackgroundResource(R.drawable.button_bg3);
                cone2.setBackgroundResource(R.drawable.button_bg3);
                pyra.setBackgroundResource(R.drawable.button_bg3);

                circle.setTextColor(Color.parseColor("#ff7f7f"));
                square.setTextColor(Color.parseColor("#ff7f7f"));
                trian.setTextColor(Color.parseColor("#ff7f7f"));
                quad.setTextColor(Color.parseColor("#ff7f7f"));
                cube1.setTextColor(Color.parseColor("#ff7f7f"));
                cube2.setTextColor(Color.parseColor("#ff7f7f"));
                spheree.setTextColor(Color.parseColor("#ff7f7f"));
                cyli.setTextColor(Color.parseColor("#ff7f7f"));
                cone2.setTextColor(Color.parseColor("#ff7f7f"));
                pyra.setTextColor(Color.parseColor("#ff7f7f"));break;
            case 3:
                circle.setBackgroundResource(R.drawable.redwhite);
                square.setBackgroundResource(R.drawable.redwhite);
                trian.setBackgroundResource(R.drawable.redwhite);
                quad.setBackgroundResource(R.drawable.redwhite);
                cube1.setBackgroundResource(R.drawable.redwhite);
                cube2.setBackgroundResource(R.drawable.redwhite);
                spheree.setBackgroundResource(R.drawable.redwhite);
                cyli.setBackgroundResource(R.drawable.redwhite);
                cone2.setBackgroundResource(R.drawable.redwhite);
                pyra.setBackgroundResource(R.drawable.redwhite);

                circle.setTextColor(Color.parseColor("#d50000"));
                square.setTextColor(Color.parseColor("#d50000"));
                trian.setTextColor(Color.parseColor("#d50000"));
                quad.setTextColor(Color.parseColor("#d50000"));
                cube1.setTextColor(Color.parseColor("#d50000"));
                cube2.setTextColor(Color.parseColor("#d50000"));
                spheree.setTextColor(Color.parseColor("#d50000"));
                cyli.setTextColor(Color.parseColor("#d50000"));
                cone2.setTextColor(Color.parseColor("#d50000"));
                pyra.setTextColor(Color.parseColor("#d50000"));break;

            case 4:
                circle.setBackgroundResource(R.drawable.whitepink);
                square.setBackgroundResource(R.drawable.whitepink);
                trian.setBackgroundResource(R.drawable.whitepink);
                quad.setBackgroundResource(R.drawable.whitepink);
                cube1.setBackgroundResource(R.drawable.whitepink);
                cube2.setBackgroundResource(R.drawable.whitepink);
                spheree.setBackgroundResource(R.drawable.whitepink);
                cyli.setBackgroundResource(R.drawable.whitepink);
                cone2.setBackgroundResource(R.drawable.whitepink);
                pyra.setBackgroundResource(R.drawable.whitepink);

                circle.setTextColor(Color.parseColor("#ffffff"));
                square.setTextColor(Color.parseColor("#ffffff"));
                trian.setTextColor(Color.parseColor("#ffffff"));
                quad.setTextColor(Color.parseColor("#ffffff"));
                cube1.setTextColor(Color.parseColor("#ffffff"));
                cube2.setTextColor(Color.parseColor("#ffffff"));
                spheree.setTextColor(Color.parseColor("#ffffff"));
                cyli.setTextColor(Color.parseColor("#ffffff"));
                cone2.setTextColor(Color.parseColor("#ffffff"));
                pyra.setTextColor(Color.parseColor("#ffffff"));break;
            case 5:
                circle.setBackgroundResource(R.drawable.whitebl);
                square.setBackgroundResource(R.drawable.whitebl);
                trian.setBackgroundResource(R.drawable.whitebl);
                quad.setBackgroundResource(R.drawable.whitebl);
                cube1.setBackgroundResource(R.drawable.whitebl);
                cube2.setBackgroundResource(R.drawable.whitebl);
                spheree.setBackgroundResource(R.drawable.whitebl);
                cyli.setBackgroundResource(R.drawable.whitebl);
                cone2.setBackgroundResource(R.drawable.whitebl);
                pyra.setBackgroundResource(R.drawable.whitebl);

                circle.setTextColor(Color.parseColor("#ffffff"));
                square.setTextColor(Color.parseColor("#ffffff"));
                trian.setTextColor(Color.parseColor("#ffffff"));
                quad.setTextColor(Color.parseColor("#ffffff"));
                cube1.setTextColor(Color.parseColor("#ffffff"));
                cube2.setTextColor(Color.parseColor("#ffffff"));
                spheree.setTextColor(Color.parseColor("#ffffff"));
                cyli.setTextColor(Color.parseColor("#ffffff"));
                cone2.setTextColor(Color.parseColor("#ffffff"));
                pyra.setTextColor(Color.parseColor("#ffffff"));break;
            case 6:
                circle.setBackgroundResource(R.drawable.orange);
                square.setBackgroundResource(R.drawable.orange);
                trian.setBackgroundResource(R.drawable.orange);
                quad.setBackgroundResource(R.drawable.orange);
                cube1.setBackgroundResource(R.drawable.orange);
                cube2.setBackgroundResource(R.drawable.orange);
                spheree.setBackgroundResource(R.drawable.orange);
                cyli.setBackgroundResource(R.drawable.orange);
                cone2.setBackgroundResource(R.drawable.orange);
                pyra.setBackgroundResource(R.drawable.orange);

                circle.setTextColor(Color.parseColor("#ffffff"));
                square.setTextColor(Color.parseColor("#ffffff"));
                trian.setTextColor(Color.parseColor("#ffffff"));
                quad.setTextColor(Color.parseColor("#ffffff"));
                cube1.setTextColor(Color.parseColor("#ffffff"));
                cube2.setTextColor(Color.parseColor("#ffffff"));
                spheree.setTextColor(Color.parseColor("#ffffff"));
                cyli.setTextColor(Color.parseColor("#ffffff"));
                cone2.setTextColor(Color.parseColor("#ffffff"));
                pyra.setTextColor(Color.parseColor("#ffffff"));break;
            case 7:
                circle.setBackgroundResource(R.drawable.yellow);
                square.setBackgroundResource(R.drawable.yellow);
                trian.setBackgroundResource(R.drawable.yellow);
                quad.setBackgroundResource(R.drawable.yellow);
                cube1.setBackgroundResource(R.drawable.yellow);
                cube2.setBackgroundResource(R.drawable.yellow);
                spheree.setBackgroundResource(R.drawable.yellow);
                cyli.setBackgroundResource(R.drawable.yellow);
                cone2.setBackgroundResource(R.drawable.yellow);
                pyra.setBackgroundResource(R.drawable.yellow);

                circle.setTextColor(Color.parseColor("#000000"));
                square.setTextColor(Color.parseColor("#000000"));
                trian.setTextColor(Color.parseColor("#000000"));
                quad.setTextColor(Color.parseColor("#000000"));
                cube1.setTextColor(Color.parseColor("#000000"));
                cube2.setTextColor(Color.parseColor("#000000"));
                spheree.setTextColor(Color.parseColor("#000000"));
                cyli.setTextColor(Color.parseColor("#000000"));
                cone2.setTextColor(Color.parseColor("#000000"));
                pyra.setTextColor(Color.parseColor("#000000"));break;



        }
        circle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), circle.class);
                finish();
                startActivity(i);
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), square.class);
                finish();
                startActivity(i);
            }
        });
        trian.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), triangle.class);
                finish();
                startActivity(i);
            }
        });
        quad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), quadr.class);
                finish();
                startActivity(i);
            }
        });
        cube1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), cube.class);
                finish();
                startActivity(i);
            }
        });
        spheree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), sphere.class);
                finish();
                startActivity(i);
            }
        });
        cube2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), cuboid.class);
                finish();
                startActivity(i);
            }
        });
        cyli.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), cylinder.class);
                finish();
                startActivity(i);
            }
        });
        cone2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), cone.class);
                finish();
                startActivity(i);
            }
        });
        pyra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), pyramid.class);
                finish();
                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), MenuActivity.class);

        finish();
        startActivity(intent);
    }
}
