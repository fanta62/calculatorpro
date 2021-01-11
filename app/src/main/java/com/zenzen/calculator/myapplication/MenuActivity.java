package com.zenzen.calculator.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;


public class MenuActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final Button back = (Button) findViewById(R.id.button25);
        Button financial=(Button)findViewById(R.id.button24b);
        Button area=(Button)findViewById(R.id.button30);
        Button themes=(Button)findViewById(R.id.button34);
        Button equa=(Button)findViewById(R.id.button31);
        Button formu=(Button)findViewById(R.id.button32);
        Button mvv=(Button)findViewById(R.id.button30a);
        SharedPreferences sharedPref = this.getSharedPreferences(
                getString(R.string.file_key), Context.MODE_PRIVATE);
        final Integer i2=sharedPref.getInt("txtcolor",0);
        switch (i2) {
            case 0:
                themes.setBackgroundResource(R.drawable.button_bg);
                financial.setBackgroundResource(R.drawable.button_bg);
                area.setBackgroundResource(R.drawable.button_bg);
                equa.setBackgroundResource(R.drawable.button_bg);
                formu.setBackgroundResource(R.drawable.button_bg);
                mvv.setBackgroundResource(R.drawable.button_bg);

                themes.setTextColor(Color.parseColor("#000000"));
                financial.setTextColor(Color.parseColor("#000000"));
                area.setTextColor(Color.parseColor("#000000"));
                equa.setTextColor(Color.parseColor("#000000"));
                formu.setTextColor(Color.parseColor("#000000"));
                mvv.setTextColor(Color.parseColor("#000000"));break;
            case 1:
                themes.setBackgroundResource(R.drawable.button_bg2);
                financial.setBackgroundResource(R.drawable.button_bg2);
                area.setBackgroundResource(R.drawable.button_bg2);
                equa.setBackgroundResource(R.drawable.button_bg2);
                formu.setBackgroundResource(R.drawable.button_bg2);
                mvv.setBackgroundResource(R.drawable.button_bg2);

                themes.setTextColor(Color.parseColor("#69F0AE"));
                financial.setTextColor(Color.parseColor("#69F0AE"));
                area.setTextColor(Color.parseColor("#69F0AE"));
                equa.setTextColor(Color.parseColor("#69F0AE"));
                formu.setTextColor(Color.parseColor("#69F0AE"));
                mvv.setTextColor(Color.parseColor("#69F0AE"));break;
            case 2:
                themes.setBackgroundResource(R.drawable.button_bg3);
                financial.setBackgroundResource(R.drawable.button_bg3);
                area.setBackgroundResource(R.drawable.button_bg3);
                equa.setBackgroundResource(R.drawable.button_bg3);
                formu.setBackgroundResource(R.drawable.button_bg3);
                mvv.setBackgroundResource(R.drawable.button_bg3);

                themes.setTextColor(Color.parseColor("#ff7f7f"));
                financial.setTextColor(Color.parseColor("#ff7f7f"));
                area.setTextColor(Color.parseColor("#ff7f7f"));
                equa.setTextColor(Color.parseColor("#ff7f7f"));
                formu.setTextColor(Color.parseColor("#ff7f7f"));
                mvv.setTextColor(Color.parseColor("#ff7f7f"));break;
            case 3:
                themes.setBackgroundResource(R.drawable.redwhite);
                financial.setBackgroundResource(R.drawable.redwhite);
                area.setBackgroundResource(R.drawable.redwhite);
                equa.setBackgroundResource(R.drawable.redwhite);
                formu.setBackgroundResource(R.drawable.redwhite);
                mvv.setBackgroundResource(R.drawable.redwhite);

                themes.setTextColor(Color.parseColor("#d50000"));
                financial.setTextColor(Color.parseColor("#d50000"));
                area.setTextColor(Color.parseColor("#d50000"));
                equa.setTextColor(Color.parseColor("#d50000"));
                formu.setTextColor(Color.parseColor("#d50000"));
                mvv.setTextColor(Color.parseColor("#d50000"));break;

            case 4:
                themes.setBackgroundResource(R.drawable.whitepink);
                financial.setBackgroundResource(R.drawable.whitepink);
                area.setBackgroundResource(R.drawable.whitepink);
                equa.setBackgroundResource(R.drawable.whitepink);
                formu.setBackgroundResource(R.drawable.whitepink);
                mvv.setBackgroundResource(R.drawable.whitepink);

                themes.setTextColor(Color.parseColor("#ffffff"));
                financial.setTextColor(Color.parseColor("#ffffff"));
                area.setTextColor(Color.parseColor("#ffffff"));
                equa.setTextColor(Color.parseColor("#ffffff"));
                formu.setTextColor(Color.parseColor("#ffffff"));
                mvv.setTextColor(Color.parseColor("#ffffff"));break;
            case 5:
                themes.setBackgroundResource(R.drawable.whitebl);
                financial.setBackgroundResource(R.drawable.whitebl);
                area.setBackgroundResource(R.drawable.whitebl);
                equa.setBackgroundResource(R.drawable.whitebl);
                formu.setBackgroundResource(R.drawable.whitebl);
                mvv.setBackgroundResource(R.drawable.whitebl);

                themes.setTextColor(Color.parseColor("#ffffff"));
                financial.setTextColor(Color.parseColor("#ffffff"));
                area.setTextColor(Color.parseColor("#ffffff"));
                equa.setTextColor(Color.parseColor("#ffffff"));
                formu.setTextColor(Color.parseColor("#ffffff"));
                mvv.setTextColor(Color.parseColor("#ffffff"));break;
            case 6:
                themes.setBackgroundResource(R.drawable.orange);
                financial.setBackgroundResource(R.drawable.orange);
                area.setBackgroundResource(R.drawable.orange);
                equa.setBackgroundResource(R.drawable.orange);
                formu.setBackgroundResource(R.drawable.orange);
                mvv.setBackgroundResource(R.drawable.orange);

                themes.setTextColor(Color.parseColor("#ffffff"));
                financial.setTextColor(Color.parseColor("#ffffff"));
                area.setTextColor(Color.parseColor("#ffffff"));
                equa.setTextColor(Color.parseColor("#ffffff"));
                formu.setTextColor(Color.parseColor("#ffffff"));
                mvv.setTextColor(Color.parseColor("#ffffff"));break;
            case 7:
                themes.setBackgroundResource(R.drawable.yellow);
                financial.setBackgroundResource(R.drawable.yellow);
                area.setBackgroundResource(R.drawable.yellow);
                equa.setBackgroundResource(R.drawable.yellow);
                formu.setBackgroundResource(R.drawable.yellow);
                mvv.setBackgroundResource(R.drawable.yellow);

                themes.setTextColor(Color.parseColor("#000000"));
                financial.setTextColor(Color.parseColor("#000000"));
                area.setTextColor(Color.parseColor("#000000"));
                equa.setTextColor(Color.parseColor("#000000"));
                formu.setTextColor(Color.parseColor("#000000"));
                mvv.setTextColor(Color.parseColor("#000000"));break;



        }
        themes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Themes.class);
                finish();
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MenuActivity.this);
                builder1.setTitle("Title");
                builder1.setMessage(R.string.help);
                builder1.setCancelable(true);
                builder1.setNeutralButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
                       }
                   }
        );

        financial.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Finmenu.class);

                finish();
                startActivity(intent);

            }
        }
        );
        area.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), areamenu.class);
                finish();
                startActivity(intent);

                                         }
                                     }
        );
        equa.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
              Intent intent=new Intent(getApplicationContext(), equationsmenu.class);
                finish();
             startActivity(intent);

                   }
                                }
        );
        formu.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent intent=new Intent(getApplicationContext(), formulasmenu.class);
                                        finish();
                                        startActivity(intent);

                                    }
                                }
        );

        mvv.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         Intent intent=new Intent(getApplicationContext(), mvmenu.class);
                                         finish();
                                         startActivity(intent);

                                     }
                                 }
        );
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);

        finish();
        startActivity(intent);
    }
}