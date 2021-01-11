package com.zenzen.calculator.myapplication;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.TextView;




public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = this;
        SharedPreferences sharedPref = context.getSharedPreferences(
                getString(R.string.file_key), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = sharedPref.edit();
        final Integer i2=sharedPref.getInt("txtcolor",0);
        editor2.apply();
        Button num1 = (Button) findViewById(R.id.button5);
        Button num2 = (Button) findViewById(R.id.button4);
        Button num3 = (Button) findViewById(R.id.button6);
        Button num4 = (Button) findViewById(R.id.button9);
        Button num5 = (Button) findViewById(R.id.button10);
        Button num6 = (Button) findViewById(R.id.button11);
        Button num7 = (Button) findViewById(R.id.button14);
        Button num8 = (Button) findViewById(R.id.button15);
        Button num9 = (Button) findViewById(R.id.button16);
        Button num0 = (Button) findViewById(R.id.button23);
        final TextView screen = (TextView) findViewById(R.id.textView);
        Button plus = (Button) findViewById(R.id.button8);
        Button minus = (Button) findViewById(R.id.button13);
        Button into = (Button) findViewById(R.id.button18);
        Button division = (Button) findViewById(R.id.button22);
        Button equalto=(Button) findViewById(R.id.button21);
        Button clear=(Button)findViewById(R.id.button3);
        Button dot=(Button)findViewById(R.id.button19);
        Button negative=(Button)findViewById(R.id.button20);
        Button back=(Button)findViewById(R.id.button43);
        back.setText("<-");
        final SharedPreferences put = getSharedPreferences("PREFS_NAME", 1);
        final SharedPreferences.Editor editor1 = put.edit();
        editor1.putString("holder1", "0");
        editor1.putString("holder2", "0");
        editor1.putInt("flag", 0);
        editor1.apply();
        Button menu=(Button)findViewById(R.id.button30);
        Button log=(Button)findViewById(R.id.button50);
        Button read=(Button)findViewById(R.id.button);
        Button store=(Button)findViewById(R.id.button2);
        Button squareof=(Button)findViewById(R.id.button17);
        Button trigono=(Button)findViewById(R.id.button12);
        Button root=(Button)findViewById(R.id.button44);
        Button percent=(Button)findViewById(R.id.button7);
        Button excl=(Button)findViewById(R.id.button51);
        Button power=(Button)findViewById(R.id.button52);
        Button history=(Button)findViewById(R.id.button40);
        Button paste=(Button)findViewById(R.id.button29);
        Button yroot=(Button)findViewById(R.id.button26);
        Button store2=(Button)findViewById(R.id.button27);
        Button copy=(Button)findViewById(R.id.button28);
        Button tofract=(Button)findViewById(R.id.button271);


        //THEMES
        switch (i2) {
            case 0: {
                num1.setBackgroundResource(R.drawable.button_bg);
                num2.setBackgroundResource(R.drawable.button_bg);
                num3.setBackgroundResource(R.drawable.button_bg);
                num4.setBackgroundResource(R.drawable.button_bg);
                num5.setBackgroundResource(R.drawable.button_bg);
                num6.setBackgroundResource(R.drawable.button_bg);
                num7.setBackgroundResource(R.drawable.button_bg);
                num8.setBackgroundResource(R.drawable.button_bg);
                num9.setBackgroundResource(R.drawable.button_bg);
                num0.setBackgroundResource(R.drawable.button_bg);
                root.setBackgroundResource(R.drawable.button_bg);
                percent.setBackgroundResource(R.drawable.button_bg);
                excl.setBackgroundResource(R.drawable.button_bg);
                power.setBackgroundResource(R.drawable.button_bg);
                trigono.setBackgroundResource(R.drawable.button_bg);
                read.setBackgroundResource(R.drawable.button_bg);
                store.setBackgroundResource(R.drawable.button_bg);
                log.setBackgroundResource(R.drawable.button_bg);
                clear.setBackgroundResource(R.drawable.button_bg);
                dot.setBackgroundResource(R.drawable.button_bg);
                negative.setBackgroundResource(R.drawable.button_bg);
                back.setBackgroundResource(R.drawable.button_bg);
                squareof.setBackgroundResource(R.drawable.button_bg);
                plus.setBackgroundResource(R.drawable.button_bg);
                minus.setBackgroundResource(R.drawable.button_bg);
                into.setBackgroundResource(R.drawable.button_bg);
                division.setBackgroundResource(R.drawable.button_bg);
                equalto.setBackgroundResource(R.drawable.button_bg);

                break;

            }
            case 1: {
                num1.setBackgroundResource(R.drawable.button_bg2);
                num2.setBackgroundResource(R.drawable.button_bg2);
                num3.setBackgroundResource(R.drawable.button_bg2);
                num4.setBackgroundResource(R.drawable.button_bg2);
                num5.setBackgroundResource(R.drawable.button_bg2);
                num6.setBackgroundResource(R.drawable.button_bg2);
                num7.setBackgroundResource(R.drawable.button_bg2);
                num8.setBackgroundResource(R.drawable.button_bg2);
                num9.setBackgroundResource(R.drawable.button_bg2);
                num0.setBackgroundResource(R.drawable.button_bg2);
                root.setBackgroundResource(R.drawable.button_bg2);
                percent.setBackgroundResource(R.drawable.button_bg2);
                excl.setBackgroundResource(R.drawable.button_bg2);
                power.setBackgroundResource(R.drawable.button_bg2);
                trigono.setBackgroundResource(R.drawable.button_bg2);
                read.setBackgroundResource(R.drawable.button_bg2);
                store.setBackgroundResource(R.drawable.button_bg2);
                log.setBackgroundResource(R.drawable.button_bg2);
                clear.setBackgroundResource(R.drawable.button_bg2);
                dot.setBackgroundResource(R.drawable.button_bg2);
                negative.setBackgroundResource(R.drawable.button_bg2);
                back.setBackgroundResource(R.drawable.button_bg2);
                squareof.setBackgroundResource(R.drawable.button_bg2);
                plus.setBackgroundResource(R.drawable.button_bg2);
                minus.setBackgroundResource(R.drawable.button_bg2);
                into.setBackgroundResource(R.drawable.button_bg2);
                division.setBackgroundResource(R.drawable.button_bg2);
                equalto.setBackgroundResource(R.drawable.button_bg2);
                history.setBackgroundResource(R.drawable.button_bg2);
                paste.setBackgroundResource(R.drawable.button_bg2);
                yroot.setBackgroundResource(R.drawable.button_bg2);
                yroot.setBackgroundResource(R.drawable.button_bg2);
                store2.setBackgroundResource(R.drawable.button_bg2);
                copy.setBackgroundResource(R.drawable.button_bg2);
                menu.setBackgroundResource(R.drawable.button_bg2);
                tofract.setBackgroundResource(R.drawable.button_bg2);

                num1.setTextColor(Color.parseColor("#69F0AE"));
                num2.setTextColor(Color.parseColor("#69F0AE"));
                num3.setTextColor(Color.parseColor("#69F0AE"));
                num4.setTextColor(Color.parseColor("#69F0AE"));
                num5.setTextColor(Color.parseColor("#69F0AE"));
                num6.setTextColor(Color.parseColor("#69F0AE"));
                num7.setTextColor(Color.parseColor("#69F0AE"));
                num8.setTextColor(Color.parseColor("#69F0AE"));
                num9.setTextColor(Color.parseColor("#69F0AE"));
                num0.setTextColor(Color.parseColor("#69F0AE"));
                root.setTextColor(Color.parseColor("#69F0AE"));
                percent.setTextColor(Color.parseColor("#69F0AE"));
                excl.setTextColor(Color.parseColor("#69F0AE"));
                power.setTextColor(Color.parseColor("#69F0AE"));
                trigono.setTextColor(Color.parseColor("#69F0AE"));
                read.setTextColor(Color.parseColor("#69F0AE"));
                store.setTextColor(Color.parseColor("#69F0AE"));
                log.setTextColor(Color.parseColor("#69F0AE"));
                clear.setTextColor(Color.parseColor("#69F0AE"));
                dot.setTextColor(Color.parseColor("#69F0AE"));
                negative.setTextColor(Color.parseColor("#69F0AE"));
                back.setTextColor(Color.parseColor("#69F0AE"));
                squareof.setTextColor(Color.parseColor("#69F0AE"));
                plus.setTextColor(Color.parseColor("#69F0AE"));
                minus.setTextColor(Color.parseColor("#69F0AE"));
                into.setTextColor(Color.parseColor("#69F0AE"));
                division.setTextColor(Color.parseColor("#69F0AE"));
                equalto.setTextColor(Color.parseColor("#69F0AE"));
                history.setTextColor(Color.parseColor("#69F0AE"));
                paste.setTextColor(Color.parseColor("#69F0AE"));
                yroot.setTextColor(Color.parseColor("#69F0AE"));
                store2.setTextColor(Color.parseColor("#69F0AE"));
                copy.setTextColor(Color.parseColor("#69F0AE"));
                menu.setTextColor(Color.parseColor("#69F0AE"));
                tofract.setTextColor(Color.parseColor("#69F0AE"));break;
            }

            case 2: {
                num1.setBackgroundResource(R.drawable.button_bg3);
                num2.setBackgroundResource(R.drawable.button_bg3);
                num3.setBackgroundResource(R.drawable.button_bg3);
                num4.setBackgroundResource(R.drawable.button_bg3);
                num5.setBackgroundResource(R.drawable.button_bg3);
                num6.setBackgroundResource(R.drawable.button_bg3);
                num7.setBackgroundResource(R.drawable.button_bg3);
                num8.setBackgroundResource(R.drawable.button_bg3);
                num9.setBackgroundResource(R.drawable.button_bg3);
                num0.setBackgroundResource(R.drawable.button_bg3);
                root.setBackgroundResource(R.drawable.button_bg3);
                percent.setBackgroundResource(R.drawable.button_bg3);
                excl.setBackgroundResource(R.drawable.button_bg3);
                power.setBackgroundResource(R.drawable.button_bg3);
                trigono.setBackgroundResource(R.drawable.button_bg3);
                read.setBackgroundResource(R.drawable.button_bg3);
                store.setBackgroundResource(R.drawable.button_bg3);
                log.setBackgroundResource(R.drawable.button_bg3);
                clear.setBackgroundResource(R.drawable.button_bg3);
                dot.setBackgroundResource(R.drawable.button_bg3);
                negative.setBackgroundResource(R.drawable.button_bg3);
                back.setBackgroundResource(R.drawable.button_bg3);
                squareof.setBackgroundResource(R.drawable.button_bg3);
                plus.setBackgroundResource(R.drawable.button_bg3);
                minus.setBackgroundResource(R.drawable.button_bg3);
                into.setBackgroundResource(R.drawable.button_bg3);
                division.setBackgroundResource(R.drawable.button_bg3);
                equalto.setBackgroundResource(R.drawable.button_bg3);
                history.setBackgroundResource(R.drawable.button_bg3);
                paste.setBackgroundResource(R.drawable.button_bg3);
                yroot.setBackgroundResource(R.drawable.button_bg3);
                yroot.setBackgroundResource(R.drawable.button_bg3);
                store2.setBackgroundResource(R.drawable.button_bg3);
                copy.setBackgroundResource(R.drawable.button_bg3);
                menu.setBackgroundResource(R.drawable.button_bg3);
                tofract.setBackgroundResource(R.drawable.button_bg3);

                num1.setTextColor(Color.parseColor("#ff7f7f"));
                num2.setTextColor(Color.parseColor("#ff7f7f"));
                num3.setTextColor(Color.parseColor("#ff7f7f"));
                num4.setTextColor(Color.parseColor("#ff7f7f"));
                num5.setTextColor(Color.parseColor("#ff7f7f"));
                num6.setTextColor(Color.parseColor("#ff7f7f"));
                num7.setTextColor(Color.parseColor("#ff7f7f"));
                num8.setTextColor(Color.parseColor("#ff7f7f"));
                num9.setTextColor(Color.parseColor("#ff7f7f"));
                num0.setTextColor(Color.parseColor("#ff7f7f"));
                root.setTextColor(Color.parseColor("#ff7f7f"));
                percent.setTextColor(Color.parseColor("#ff7f7f"));
                excl.setTextColor(Color.parseColor("#ff7f7f"));
                power.setTextColor(Color.parseColor("#ff7f7f"));
                trigono.setTextColor(Color.parseColor("#ff7f7f"));
                read.setTextColor(Color.parseColor("#ff7f7f"));
                store.setTextColor(Color.parseColor("#ff7f7f"));
                log.setTextColor(Color.parseColor("#ff7f7f"));
                clear.setTextColor(Color.parseColor("#ff7f7f"));
                dot.setTextColor(Color.parseColor("#ff7f7f"));
                negative.setTextColor(Color.parseColor("#ff7f7f"));
                back.setTextColor(Color.parseColor("#ff7f7f"));
                squareof.setTextColor(Color.parseColor("#ff7f7f"));
                plus.setTextColor(Color.parseColor("#ff7f7f"));
                minus.setTextColor(Color.parseColor("#ff7f7f"));
                into.setTextColor(Color.parseColor("#ff7f7f"));
                division.setTextColor(Color.parseColor("#ff7f7f"));
                equalto.setTextColor(Color.parseColor("#ff7f7f"));
                history.setTextColor(Color.parseColor("#ff7f7f"));
                paste.setTextColor(Color.parseColor("#ff7f7f"));
                yroot.setTextColor(Color.parseColor("#ff7f7f"));
                store2.setTextColor(Color.parseColor("#ff7f7f"));
                copy.setTextColor(Color.parseColor("#ff7f7f"));
                menu.setTextColor(Color.parseColor("#ff7f7f"));
                tofract.setTextColor(Color.parseColor("#ff7f7f"));break;
            }

                case 3: {
                    num1.setBackgroundResource(R.drawable.redwhite);
                    num2.setBackgroundResource(R.drawable.redwhite);
                    num3.setBackgroundResource(R.drawable.redwhite);
                    num4.setBackgroundResource(R.drawable.redwhite);
                    num5.setBackgroundResource(R.drawable.redwhite);
                    num6.setBackgroundResource(R.drawable.redwhite);
                    num7.setBackgroundResource(R.drawable.redwhite);
                    num8.setBackgroundResource(R.drawable.redwhite);
                    num9.setBackgroundResource(R.drawable.redwhite);
                    num0.setBackgroundResource(R.drawable.redwhite);
                    root.setBackgroundResource(R.drawable.redwhite);
                    percent.setBackgroundResource(R.drawable.redwhite);
                    excl.setBackgroundResource(R.drawable.redwhite);
                    power.setBackgroundResource(R.drawable.redwhite);
                    trigono.setBackgroundResource(R.drawable.redwhite);
                    read.setBackgroundResource(R.drawable.redwhite);
                    store.setBackgroundResource(R.drawable.redwhite);
                    log.setBackgroundResource(R.drawable.redwhite);
                    clear.setBackgroundResource(R.drawable.redwhite);
                    dot.setBackgroundResource(R.drawable.redwhite);
                    negative.setBackgroundResource(R.drawable.redwhite);
                    back.setBackgroundResource(R.drawable.redwhite);
                    squareof.setBackgroundResource(R.drawable.redwhite);
                    plus.setBackgroundResource(R.drawable.redwhite);
                    minus.setBackgroundResource(R.drawable.redwhite);
                    into.setBackgroundResource(R.drawable.redwhite);
                    division.setBackgroundResource(R.drawable.redwhite);
                    equalto.setBackgroundResource(R.drawable.redwhite);
                    history.setBackgroundResource(R.drawable.redwhite);
                    paste.setBackgroundResource(R.drawable.redwhite);
                    yroot.setBackgroundResource(R.drawable.redwhite);
                    yroot.setBackgroundResource(R.drawable.redwhite);
                    store2.setBackgroundResource(R.drawable.redwhite);
                    copy.setBackgroundResource(R.drawable.redwhite);
                    menu.setBackgroundResource(R.drawable.redwhite);
                    tofract.setBackgroundResource(R.drawable.redwhite);

                    num1.setTextColor(Color.parseColor("#d50000"));
                    num2.setTextColor(Color.parseColor("#d50000"));
                    num3.setTextColor(Color.parseColor("#d50000"));
                    num4.setTextColor(Color.parseColor("#d50000"));
                    num5.setTextColor(Color.parseColor("#d50000"));
                    num6.setTextColor(Color.parseColor("#d50000"));
                    num7.setTextColor(Color.parseColor("#d50000"));
                    num8.setTextColor(Color.parseColor("#d50000"));
                    num9.setTextColor(Color.parseColor("#d50000"));
                    num0.setTextColor(Color.parseColor("#d50000"));
                    root.setTextColor(Color.parseColor("#d50000"));
                    percent.setTextColor(Color.parseColor("#d50000"));
                    excl.setTextColor(Color.parseColor("#d50000"));
                    power.setTextColor(Color.parseColor("#d50000"));
                    trigono.setTextColor(Color.parseColor("#d50000"));
                    read.setTextColor(Color.parseColor("#d50000"));
                    store.setTextColor(Color.parseColor("#d50000"));
                    log.setTextColor(Color.parseColor("#d50000"));
                    clear.setTextColor(Color.parseColor("#d50000"));
                    dot.setTextColor(Color.parseColor("#d50000"));
                    negative.setTextColor(Color.parseColor("#d50000"));
                    back.setTextColor(Color.parseColor("#d50000"));
                    squareof.setTextColor(Color.parseColor("#d50000"));
                    plus.setTextColor(Color.parseColor("#d50000"));
                    minus.setTextColor(Color.parseColor("#d50000"));
                    into.setTextColor(Color.parseColor("#d50000"));
                    division.setTextColor(Color.parseColor("#d50000"));
                    equalto.setTextColor(Color.parseColor("#d50000"));
                    history.setTextColor(Color.parseColor("#d50000"));
                    paste.setTextColor(Color.parseColor("#d50000"));
                    yroot.setTextColor(Color.parseColor("#d50000"));
                    store2.setTextColor(Color.parseColor("#d50000"));
                    copy.setTextColor(Color.parseColor("#d50000"));
                    menu.setTextColor(Color.parseColor("#d50000"));
                    tofract.setTextColor(Color.parseColor("#d50000"));break;

                }
            case 4: {
                num1.setBackgroundResource(R.drawable.whitepink);
                num2.setBackgroundResource(R.drawable.whitepink);
                num3.setBackgroundResource(R.drawable.whitepink);
                num4.setBackgroundResource(R.drawable.whitepink);
                num5.setBackgroundResource(R.drawable.whitepink);
                num6.setBackgroundResource(R.drawable.whitepink);
                num7.setBackgroundResource(R.drawable.whitepink);
                num8.setBackgroundResource(R.drawable.whitepink);
                num9.setBackgroundResource(R.drawable.whitepink);
                num0.setBackgroundResource(R.drawable.whitepink);
                root.setBackgroundResource(R.drawable.whitepink);
                percent.setBackgroundResource(R.drawable.whitepink);
                excl.setBackgroundResource(R.drawable.whitepink);
                power.setBackgroundResource(R.drawable.whitepink);
                trigono.setBackgroundResource(R.drawable.whitepink);
                read.setBackgroundResource(R.drawable.whitepink);
                store.setBackgroundResource(R.drawable.whitepink);
                log.setBackgroundResource(R.drawable.whitepink);
                clear.setBackgroundResource(R.drawable.whitepink);
                dot.setBackgroundResource(R.drawable.whitepink);
                negative.setBackgroundResource(R.drawable.whitepink);
                back.setBackgroundResource(R.drawable.whitepink);
                squareof.setBackgroundResource(R.drawable.whitepink);
                plus.setBackgroundResource(R.drawable.whitepink);
                minus.setBackgroundResource(R.drawable.whitepink);
                into.setBackgroundResource(R.drawable.whitepink);
                division.setBackgroundResource(R.drawable.whitepink);
                equalto.setBackgroundResource(R.drawable.whitepink);
                history.setBackgroundResource(R.drawable.whitepink);
                paste.setBackgroundResource(R.drawable.whitepink);
                yroot.setBackgroundResource(R.drawable.whitepink);
                yroot.setBackgroundResource(R.drawable.whitepink);
                store2.setBackgroundResource(R.drawable.whitepink);
                copy.setBackgroundResource(R.drawable.whitepink);
                menu.setBackgroundResource(R.drawable.whitepink);
                tofract.setBackgroundResource(R.drawable.whitepink);

                num1.setTextColor(Color.parseColor("#ffffff"));
                num2.setTextColor(Color.parseColor("#ffffff"));
                num3.setTextColor(Color.parseColor("#ffffff"));
                num4.setTextColor(Color.parseColor("#ffffff"));
                num5.setTextColor(Color.parseColor("#ffffff"));
                num6.setTextColor(Color.parseColor("#ffffff"));
                num7.setTextColor(Color.parseColor("#ffffff"));
                num8.setTextColor(Color.parseColor("#ffffff"));
                num9.setTextColor(Color.parseColor("#ffffff"));
                num0.setTextColor(Color.parseColor("#ffffff"));
                root.setTextColor(Color.parseColor("#ffffff"));
                percent.setTextColor(Color.parseColor("#ffffff"));
                excl.setTextColor(Color.parseColor("#ffffff"));
                power.setTextColor(Color.parseColor("#ffffff"));
                trigono.setTextColor(Color.parseColor("#ffffff"));
                read.setTextColor(Color.parseColor("#ffffff"));
                store.setTextColor(Color.parseColor("#ffffff"));
                log.setTextColor(Color.parseColor("#ffffff"));
                clear.setTextColor(Color.parseColor("#ffffff"));
                dot.setTextColor(Color.parseColor("#ffffff"));
                negative.setTextColor(Color.parseColor("#ffffff"));
                back.setTextColor(Color.parseColor("#ffffff"));
                squareof.setTextColor(Color.parseColor("#ffffff"));
                plus.setTextColor(Color.parseColor("#ffffff"));
                minus.setTextColor(Color.parseColor("#ffffff"));
                into.setTextColor(Color.parseColor("#ffffff"));
                division.setTextColor(Color.parseColor("#ffffff"));
                equalto.setTextColor(Color.parseColor("#ffffff"));
                history.setTextColor(Color.parseColor("#ffffff"));
                paste.setTextColor(Color.parseColor("#ffffff"));
                yroot.setTextColor(Color.parseColor("#ffffff"));
                store2.setTextColor(Color.parseColor("#ffffff"));
                copy.setTextColor(Color.parseColor("#ffffff"));
                menu.setTextColor(Color.parseColor("#ffffff"));
                tofract.setTextColor(Color.parseColor("#ffffff"));break;

            }
            case 5: {
                num1.setBackgroundResource(R.drawable.whitebl);
                num2.setBackgroundResource(R.drawable.whitebl);
                num3.setBackgroundResource(R.drawable.whitebl);
                num4.setBackgroundResource(R.drawable.whitebl);
                num5.setBackgroundResource(R.drawable.whitebl);
                num6.setBackgroundResource(R.drawable.whitebl);
                num7.setBackgroundResource(R.drawable.whitebl);
                num8.setBackgroundResource(R.drawable.whitebl);
                num9.setBackgroundResource(R.drawable.whitebl);
                num0.setBackgroundResource(R.drawable.whitebl);
                root.setBackgroundResource(R.drawable.whitebl);
                percent.setBackgroundResource(R.drawable.whitebl);
                excl.setBackgroundResource(R.drawable.whitebl);
                power.setBackgroundResource(R.drawable.whitebl);
                trigono.setBackgroundResource(R.drawable.whitebl);
                read.setBackgroundResource(R.drawable.whitebl);
                store.setBackgroundResource(R.drawable.whitebl);
                log.setBackgroundResource(R.drawable.whitebl);
                clear.setBackgroundResource(R.drawable.whitebl);
                dot.setBackgroundResource(R.drawable.whitebl);
                negative.setBackgroundResource(R.drawable.whitebl);
                back.setBackgroundResource(R.drawable.whitebl);
                squareof.setBackgroundResource(R.drawable.whitebl);
                plus.setBackgroundResource(R.drawable.whitebl);
                minus.setBackgroundResource(R.drawable.whitebl);
                into.setBackgroundResource(R.drawable.whitebl);
                division.setBackgroundResource(R.drawable.whitebl);
                equalto.setBackgroundResource(R.drawable.whitebl);
                history.setBackgroundResource(R.drawable.whitebl);
                paste.setBackgroundResource(R.drawable.whitebl);
                yroot.setBackgroundResource(R.drawable.whitebl);
                yroot.setBackgroundResource(R.drawable.whitebl);
                store2.setBackgroundResource(R.drawable.whitebl);
                copy.setBackgroundResource(R.drawable.whitebl);
                menu.setBackgroundResource(R.drawable.whitebl);
                tofract.setBackgroundResource(R.drawable.whitebl);

                num1.setTextColor(Color.parseColor("#ffffff"));
                num2.setTextColor(Color.parseColor("#ffffff"));
                num3.setTextColor(Color.parseColor("#ffffff"));
                num4.setTextColor(Color.parseColor("#ffffff"));
                num5.setTextColor(Color.parseColor("#ffffff"));
                num6.setTextColor(Color.parseColor("#ffffff"));
                num7.setTextColor(Color.parseColor("#ffffff"));
                num8.setTextColor(Color.parseColor("#ffffff"));
                num9.setTextColor(Color.parseColor("#ffffff"));
                num0.setTextColor(Color.parseColor("#ffffff"));
                root.setTextColor(Color.parseColor("#ffffff"));
                percent.setTextColor(Color.parseColor("#ffffff"));
                excl.setTextColor(Color.parseColor("#ffffff"));
                power.setTextColor(Color.parseColor("#ffffff"));
                trigono.setTextColor(Color.parseColor("#ffffff"));
                read.setTextColor(Color.parseColor("#ffffff"));
                store.setTextColor(Color.parseColor("#ffffff"));
                log.setTextColor(Color.parseColor("#ffffff"));
                clear.setTextColor(Color.parseColor("#ffffff"));
                dot.setTextColor(Color.parseColor("#ffffff"));
                negative.setTextColor(Color.parseColor("#ffffff"));
                back.setTextColor(Color.parseColor("#ffffff"));
                squareof.setTextColor(Color.parseColor("#ffffff"));
                plus.setTextColor(Color.parseColor("#ffffff"));
                minus.setTextColor(Color.parseColor("#ffffff"));
                into.setTextColor(Color.parseColor("#ffffff"));
                division.setTextColor(Color.parseColor("#ffffff"));
                equalto.setTextColor(Color.parseColor("#ffffff"));
                history.setTextColor(Color.parseColor("#ffffff"));
                paste.setTextColor(Color.parseColor("#ffffff"));
                yroot.setTextColor(Color.parseColor("#ffffff"));
                store2.setTextColor(Color.parseColor("#ffffff"));
                copy.setTextColor(Color.parseColor("#ffffff"));
                menu.setTextColor(Color.parseColor("#ffffff"));
                tofract.setTextColor(Color.parseColor("#ffffff"));break;

            }
            case 6: {
                num1.setBackgroundResource(R.drawable.orange);
                num2.setBackgroundResource(R.drawable.orange);
                num3.setBackgroundResource(R.drawable.orange);
                num4.setBackgroundResource(R.drawable.orange);
                num5.setBackgroundResource(R.drawable.orange);
                num6.setBackgroundResource(R.drawable.orange);
                num7.setBackgroundResource(R.drawable.orange);
                num8.setBackgroundResource(R.drawable.orange);
                num9.setBackgroundResource(R.drawable.orange);
                num0.setBackgroundResource(R.drawable.orange);
                root.setBackgroundResource(R.drawable.orange);
                percent.setBackgroundResource(R.drawable.orange);
                excl.setBackgroundResource(R.drawable.orange);
                power.setBackgroundResource(R.drawable.orange);
                trigono.setBackgroundResource(R.drawable.orange);
                read.setBackgroundResource(R.drawable.orange);
                store.setBackgroundResource(R.drawable.orange);
                log.setBackgroundResource(R.drawable.orange);
                clear.setBackgroundResource(R.drawable.orange);
                dot.setBackgroundResource(R.drawable.orange);
                negative.setBackgroundResource(R.drawable.orange);
                back.setBackgroundResource(R.drawable.orange);
                squareof.setBackgroundResource(R.drawable.orange);
                plus.setBackgroundResource(R.drawable.orange);
                minus.setBackgroundResource(R.drawable.orange);
                into.setBackgroundResource(R.drawable.orange);
                division.setBackgroundResource(R.drawable.orange);
                equalto.setBackgroundResource(R.drawable.orange);
                history.setBackgroundResource(R.drawable.orange);
                paste.setBackgroundResource(R.drawable.orange);
                yroot.setBackgroundResource(R.drawable.orange);
                yroot.setBackgroundResource(R.drawable.orange);
                store2.setBackgroundResource(R.drawable.orange);
                copy.setBackgroundResource(R.drawable.orange);
                menu.setBackgroundResource(R.drawable.orange);
                tofract.setBackgroundResource(R.drawable.orange);

                num1.setTextColor(Color.parseColor("#ffffff"));
                num2.setTextColor(Color.parseColor("#ffffff"));
                num3.setTextColor(Color.parseColor("#ffffff"));
                num4.setTextColor(Color.parseColor("#ffffff"));
                num5.setTextColor(Color.parseColor("#ffffff"));
                num6.setTextColor(Color.parseColor("#ffffff"));
                num7.setTextColor(Color.parseColor("#ffffff"));
                num8.setTextColor(Color.parseColor("#ffffff"));
                num9.setTextColor(Color.parseColor("#ffffff"));
                num0.setTextColor(Color.parseColor("#ffffff"));
                root.setTextColor(Color.parseColor("#ffffff"));
                percent.setTextColor(Color.parseColor("#ffffff"));
                excl.setTextColor(Color.parseColor("#ffffff"));
                power.setTextColor(Color.parseColor("#ffffff"));
                trigono.setTextColor(Color.parseColor("#ffffff"));
                read.setTextColor(Color.parseColor("#ffffff"));
                store.setTextColor(Color.parseColor("#ffffff"));
                log.setTextColor(Color.parseColor("#ffffff"));
                clear.setTextColor(Color.parseColor("#ffffff"));
                dot.setTextColor(Color.parseColor("#ffffff"));
                negative.setTextColor(Color.parseColor("#ffffff"));
                back.setTextColor(Color.parseColor("#ffffff"));
                squareof.setTextColor(Color.parseColor("#ffffff"));
                plus.setTextColor(Color.parseColor("#ffffff"));
                minus.setTextColor(Color.parseColor("#ffffff"));
                into.setTextColor(Color.parseColor("#ffffff"));
                division.setTextColor(Color.parseColor("#ffffff"));
                equalto.setTextColor(Color.parseColor("#ffffff"));
                history.setTextColor(Color.parseColor("#ffffff"));
                paste.setTextColor(Color.parseColor("#ffffff"));
                yroot.setTextColor(Color.parseColor("#ffffff"));
                store2.setTextColor(Color.parseColor("#ffffff"));
                copy.setTextColor(Color.parseColor("#ffffff"));
                menu.setTextColor(Color.parseColor("#ffffff"));
                tofract.setTextColor(Color.parseColor("#ffffff"));break;

            }
            case 7: {
                num1.setBackgroundResource(R.drawable.yellow);
                num2.setBackgroundResource(R.drawable.yellow);
                num3.setBackgroundResource(R.drawable.yellow);
                num4.setBackgroundResource(R.drawable.yellow);
                num5.setBackgroundResource(R.drawable.yellow);
                num6.setBackgroundResource(R.drawable.yellow);
                num7.setBackgroundResource(R.drawable.yellow);
                num8.setBackgroundResource(R.drawable.yellow);
                num9.setBackgroundResource(R.drawable.yellow);
                num0.setBackgroundResource(R.drawable.yellow);
                root.setBackgroundResource(R.drawable.yellow);
                percent.setBackgroundResource(R.drawable.yellow);
                excl.setBackgroundResource(R.drawable.yellow);
                power.setBackgroundResource(R.drawable.yellow);
                trigono.setBackgroundResource(R.drawable.yellow);
                read.setBackgroundResource(R.drawable.yellow);
                store.setBackgroundResource(R.drawable.yellow);
                log.setBackgroundResource(R.drawable.yellow);
                clear.setBackgroundResource(R.drawable.yellow);
                dot.setBackgroundResource(R.drawable.yellow);
                negative.setBackgroundResource(R.drawable.yellow);
                back.setBackgroundResource(R.drawable.yellow);
                squareof.setBackgroundResource(R.drawable.yellow);
                plus.setBackgroundResource(R.drawable.yellow);
                minus.setBackgroundResource(R.drawable.yellow);
                into.setBackgroundResource(R.drawable.yellow);
                division.setBackgroundResource(R.drawable.yellow);
                equalto.setBackgroundResource(R.drawable.yellow);
                history.setBackgroundResource(R.drawable.yellow);
                paste.setBackgroundResource(R.drawable.yellow);
                yroot.setBackgroundResource(R.drawable.yellow);
                yroot.setBackgroundResource(R.drawable.yellow);
                store2.setBackgroundResource(R.drawable.yellow);
                copy.setBackgroundResource(R.drawable.yellow);
                menu.setBackgroundResource(R.drawable.yellow);
                tofract.setBackgroundResource(R.drawable.yellow);

                num1.setTextColor(Color.parseColor("#000000"));
                num2.setTextColor(Color.parseColor("#000000"));
                num3.setTextColor(Color.parseColor("#000000"));
                num4.setTextColor(Color.parseColor("#000000"));
                num5.setTextColor(Color.parseColor("#000000"));
                num6.setTextColor(Color.parseColor("#000000"));
                num7.setTextColor(Color.parseColor("#000000"));
                num8.setTextColor(Color.parseColor("#000000"));
                num9.setTextColor(Color.parseColor("#000000"));
                num0.setTextColor(Color.parseColor("#000000"));
                root.setTextColor(Color.parseColor("#000000"));
                percent.setTextColor(Color.parseColor("#000000"));
                excl.setTextColor(Color.parseColor("#000000"));
                power.setTextColor(Color.parseColor("#000000"));
                trigono.setTextColor(Color.parseColor("#000000"));
                read.setTextColor(Color.parseColor("#000000"));
                store.setTextColor(Color.parseColor("#000000"));
                log.setTextColor(Color.parseColor("#000000"));
                clear.setTextColor(Color.parseColor("#000000"));
                dot.setTextColor(Color.parseColor("#000000"));
                negative.setTextColor(Color.parseColor("#000000"));
                back.setTextColor(Color.parseColor("#000000"));
                squareof.setTextColor(Color.parseColor("#000000"));
                plus.setTextColor(Color.parseColor("#000000"));
                minus.setTextColor(Color.parseColor("#000000"));
                into.setTextColor(Color.parseColor("#000000"));
                division.setTextColor(Color.parseColor("#000000"));
                equalto.setTextColor(Color.parseColor("#000000"));
                history.setTextColor(Color.parseColor("#000000"));
                paste.setTextColor(Color.parseColor("#000000"));
                yroot.setTextColor(Color.parseColor("#000000"));
                store2.setTextColor(Color.parseColor("#000000"));
                copy.setTextColor(Color.parseColor("#000000"));
                menu.setTextColor(Color.parseColor("#000000"));
                tofract.setTextColor(Color.parseColor("#000000"));break;

            }


        }

        store.setOnClickListener((new View.OnClickListener() {
                    public void onClick(View v) {
                        editor1.putString("storage",screen.getText().toString());
                    }
                }));

        read.setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(put.getString("storage","0"));
            }
        }));

        back.setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                String string=screen.getText().toString();
                if (!string.equals("")&&!string.equals("0")) {
                    screen.setText(string.substring(0, string.length() - 1));
                }
                else if (string.equals("")) {
                    screen.setText("0");
                }
            }
        }));

        View.OnTouchListener hover=new View.OnTouchListener() {
            @Override

                public boolean onTouch(View view, MotionEvent event) {

                    if(event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (i2 == 0) {
                            view.setBackgroundResource(R.drawable.buttonhover);
                        }
                        else if (i2==1) {
                            view.setBackgroundResource(R.drawable.buttonhover2);
                        }
                        else if (i2==2) {
                            view.setBackgroundResource(R.drawable.draculahover);
                        }
                        else if (i2==3) {
                            view.setBackgroundResource(R.drawable.redwhov);
                        }
                        else if (i2==4) {
                            view.setBackgroundResource(R.drawable.whitepinkh);
                        }
                        else if (i2==5) {
                            view.setBackgroundResource(R.drawable.whiteblh);
                        }
                        else if (i2==6) {
                            view.setBackgroundResource(R.drawable.orangeh);
                        }
                        else if (i2==7) {
                            view.setBackgroundResource(R.drawable.yellowh);
                        }
                    }else if (event.getAction() == MotionEvent.ACTION_UP) {
                        if (i2 == 0) {
                            view.setBackgroundResource(R.drawable.button_bg);
                        }
                        else if (i2==1) {
                            view.setBackgroundResource(R.drawable.button_bg2);
                        }
                        else if (i2==2) {
                            view.setBackgroundResource(R.drawable.button_bg3);

                        }
                        else if (i2==3) {
                            view.setBackgroundResource(R.drawable.redwhite);
                        }
                        else if (i2==4) {
                            view.setBackgroundResource(R.drawable.whitepink);
                        }
                        else if (i2==5) {
                            view.setBackgroundResource(R.drawable.whitebl);
                        }
                        else if (i2==6) {
                            view.setBackgroundResource(R.drawable.orange);
                        }
                        else if (i2==7) {
                            view.setBackgroundResource(R.drawable.yellow);
                        }
                    }
                return false;
            }

        };


        num1.setOnTouchListener(hover);
        num2.setOnTouchListener(hover);
        num3.setOnTouchListener(hover);
        num4.setOnTouchListener(hover);
        num5.setOnTouchListener(hover);
        num6.setOnTouchListener(hover);
        num7.setOnTouchListener(hover);
        num8.setOnTouchListener(hover);
        num9.setOnTouchListener(hover);
        num0.setOnTouchListener(hover);
        plus.setOnTouchListener(hover);
        minus.setOnTouchListener(hover);
        into.setOnTouchListener(hover);
        division.setOnTouchListener(hover);
        equalto.setOnTouchListener(hover);
        clear.setOnTouchListener(hover);
        dot.setOnTouchListener(hover);
        negative.setOnTouchListener(hover);

        log.setOnTouchListener(hover);
        squareof.setOnTouchListener(hover);
        trigono.setOnTouchListener(hover);
        root.setOnTouchListener(hover);
        percent.setOnTouchListener(hover);

        excl.setOnTouchListener(hover);
        power.setOnTouchListener(hover);
        read.setOnTouchListener(hover);
        store.setOnTouchListener(hover);
        back.setOnTouchListener(hover);
        history.setOnTouchListener(hover);
        paste.setOnTouchListener(hover);
        yroot.setOnTouchListener(hover);
        store2.setOnTouchListener(hover);
        copy.setOnTouchListener(hover);
        menu.setOnTouchListener(hover);
        tofract.setOnTouchListener(hover);
        screen.setText("0");

        //INITIALIZATION OF NUMBER BUTTONS
        num1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("1");

            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }
                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("9");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (put.getBoolean("flag2",false)) {
                    screen.setText("");editor1.putBoolean("flag2", false);editor1.apply();
                }

                if(screen.getText().toString().equals("0")) {
                    screen.setText("");
                }
                screen.append("0");
            }
        });

        //END INITIALIZATION OF NUMBER BUTTONS
        //menu button
        menu.setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MenuActivity.class);
                finish();
                startActivity(i);
            }
        }));
        //end menu button

        log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder;
                final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.select_dialog_singlechoice);
                arrayAdapter.add("log x base 10");
                arrayAdapter.add("ln x base e");
                arrayAdapter.add("e ot the power x");
                arrayAdapter.add("x*e^x");
                arrayAdapter.add("e");
                builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Choose option")

                        .setAdapter(arrayAdapter , new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int item) {


                                if (item == 0) {
                                    //first menu 1st item
                                    screen.setText(String.valueOf(Math.log10(Double.parseDouble(screen.getText().toString()))));

                                }
                                if (item == 1) {
                                    //first menu 1st item
                                    screen.setText(String.valueOf(Math.log(Double.parseDouble(screen.getText().toString()))));

                                }
                                if (item == 2) {
                                    //first menu 1st item
                                    screen.setText(String.valueOf(Math.pow(Math.E,Double.parseDouble(screen.getText().toString()))));

                                }
                                if (item == 3) {
                                    //first menu 1st item
                                    screen.setText(String.valueOf(Double.parseDouble(screen.getText().toString())*Math.pow(Math.E,Double.parseDouble(screen.getText().toString()))));

                                }
                                if (item == 4) {
                                    //first menu 1st item
                                    screen.setText(String.valueOf(Math.E));

                                }
                            }
                        })
                        .show();

            builder.create();

            }
        });

        //INITIALIZATION OF OPERATION BUTTONS

            plus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!screen.getText().equals("")) {
                        if (put.getInt("flag", 0) == 0) {
                            editor1.putString("holder2", (screen.getText().toString()));


                        } else {

                            screen.setText(calculate(Double.parseDouble(put.getString("holder2", null)), Double.parseDouble(screen.getText().toString()), put.getInt("flag", 0)));
                            editor1.putString("holder2", (screen.getText().toString()));
                        }
                        editor1.putInt("flag", 1);
                        editor1.putBoolean("flag2", true);
                        editor1.apply();
                    }

                }
            });

            minus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!screen.getText().equals("")) {
                        if (put.getInt("flag", 0) == 0) {
                            editor1.putString("holder2", (screen.getText().toString()));


                        } else {

                            screen.setText(calculate(Double.parseDouble(put.getString("holder2", "0")), Double.parseDouble(screen.getText().toString()), put.getInt("flag", 0)));
                            editor1.putString("holder2", (screen.getText().toString()));
                        }
                        editor1.putInt("flag", 2);
                        editor1.putBoolean("flag2", true);
                        editor1.apply();
                    }

                }
            });

            into.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!screen.getText().equals("")) {
                        if (put.getInt("flag", 0) == 0) {
                            editor1.putString("holder2", (screen.getText().toString()));


                        } else {

                            screen.setText(calculate(Double.parseDouble(put.getString("holder2", "0")), Double.parseDouble(screen.getText().toString()), put.getInt("flag", 0)));
                            editor1.putString("holder2", (screen.getText().toString()));
                        }
                        editor1.putInt("flag", 3);
                        editor1.putBoolean("flag2", true);
                        editor1.apply();

                    }
                }
            });

            division.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!screen.getText().equals("")) {
                        if (put.getInt("flag", 0) == 0) {
                            editor1.putString("holder2", (screen.getText().toString()));


                        } else {

                            screen.setText(calculate(Double.parseDouble(put.getString("holder2", "0")), Double.parseDouble(screen.getText().toString()), put.getInt("flag", 0)));
                            editor1.putString("holder2", (screen.getText().toString()));
                        }
                        editor1.putInt("flag", 4);
                        editor1.putBoolean("flag2", true);
                        editor1.apply();
                    }

                }
            });

            equalto.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!screen.getText().equals("")) {
                        if (put.getInt("flag", 0) == 0) {
                            editor1.putString("holder2", (screen.getText().toString()));


                        } else {

                            screen.setText(calculate(Double.parseDouble(put.getString("holder2", "0")), Double.parseDouble(screen.getText().toString()), put.getInt("flag", 0)));
                            editor1.putString("holder2", (screen.getText().toString()));
                        }
                        editor1.putInt("flag", 0);
                        editor1.putBoolean("flag2", true);
                        editor1.apply();
                    }

                }
            });

            clear.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    screen.setText("0");
                    editor1.putInt("flag", 0);
                    editor1.putBoolean("flag2", false);
                    editor1.putString("holder2", "0");
                    editor1.apply();
                }
            });

            dot.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (put.getBoolean("flag2",false)) {
                        editor1.putBoolean("flag2",false);editor1.apply();
                        screen.setText("0.");
                    }
                    if (screen.getText().toString().contains(".")) {
                        return;
                    }
                    else if (screen.getText().toString().equals("")) {
                        screen.append("0");
                    }
                    if (!screen.getText().toString().contains(".")) {
                        screen.append(".");
                    }

                }
            });

            negative.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final java.text.DecimalFormat df = new java.text.DecimalFormat("################.###########");
                    if (!(screen.getText().toString().equals("") || (screen.getText().toString().equals(".")))) {
                        screen.setText(String.valueOf(df.format((0 - Double.parseDouble(screen.getText().toString())))));
                    }

                }
            });

        //New code

        squareof.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(String.valueOf(Double.parseDouble(screen.getText().toString())*Double.parseDouble(screen.getText().toString())));
            }
        });
        store2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(String.valueOf(Double.parseDouble(screen.getText().toString())*Double.parseDouble(screen.getText().toString())*Double.parseDouble(screen.getText().toString())));
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str=String.valueOf(Math.sqrt(Double.parseDouble(screen.getText().toString())));
                screen.setText(str);
            }
        });
        tofract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double scr=Double.parseDouble(screen.getText().toString());
                final java.text.DecimalFormat df=new java.text.DecimalFormat("##############");
                String scr2=df.format(scr);
                Integer scr3=Integer.parseInt(scr2);
                screen.setText(Integer.toBinaryString(scr3));
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double scr=Double.parseDouble(screen.getText().toString());
                final java.text.DecimalFormat df=new java.text.DecimalFormat("##############");
                String scr2=df.format(scr);
                Integer scr3=Integer.parseInt(scr2);
                screen.setText(Integer.toHexString(scr3));
            }
        });
        copy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("simple text",screen.getText().toString());
                clipboard.setPrimaryClip(clip);
            }
        });
        paste.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData.Item item = clipboard.getPrimaryClip().getItemAt(0);
                screen.setText(item.getText().toString());
            }
        });
        trigono.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            AlertDialog.Builder builder2;
            final ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.select_dialog_singlechoice);
            arrayAdapter2.add("sin(x)");
            arrayAdapter2.add("cos(x)");
            arrayAdapter2.add("tan(x)");
            arrayAdapter2.add("asin(x)");
            arrayAdapter2.add("acos(x)");
                arrayAdapter2.add("atan(x)");
                arrayAdapter2.add("sin^2(x)");
                arrayAdapter2.add("cos^2(x)");
                arrayAdapter2.add("tan^2(x)");
                arrayAdapter2.add("π");
            builder2 = new AlertDialog.Builder(MainActivity.this);
            builder2.setTitle("Choose option")

                    .setAdapter(arrayAdapter2 , new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int item) {

                            final java.text.DecimalFormat df=new java.text.DecimalFormat("############.#######");
                            if (item == 0) {
                                screen.setText(String.valueOf(df.format(Math.sin(Math.PI*Double.parseDouble(screen.getText().toString())/180))));

                            }

                            if (item == 1) {
                                screen.setText(String.valueOf(df.format(Math.cos(Math.PI/180*Double.parseDouble(screen.getText().toString())))));

                            }

                            if (item == 2) {
                                screen.setText(String.valueOf(df.format((Math.tan(Math.PI/180*Double.parseDouble(screen.getText().toString()))))));

                            }

                            if (item == 3) {
                                screen.setText(String.valueOf(df.format(Math.toDegrees(Math.asin(Math.toRadians(Double.parseDouble(screen.getText().toString())))))));

                            }

                            if (item == 4) {
                                screen.setText(String.valueOf(df.format(Math.toDegrees(Math.acos(Math.toRadians(Double.parseDouble(screen.getText().toString())))))));

                            }

                            if (item == 5) {
                                screen.setText(String.valueOf(df.format(Math.toDegrees(Math.atan(Math.toRadians(Double.parseDouble(screen.getText().toString())))))));

                            }
                            if (item == 6) {
                                screen.setText(String.valueOf(df.format(Math.pow(Math.sin(Double.parseDouble(screen.getText().toString())),2))));

                            }
                            if (item == 7) {
                                screen.setText(String.valueOf(df.format(Math.pow(Math.cos(Double.parseDouble(screen.getText().toString())),2))));

                            }
                            if (item == 8) {
                                screen.setText(String.valueOf(df.format(Math.pow(Math.tan(Double.parseDouble(screen.getText().toString())),2))));

                            }
                            if (item == 9) {
                                screen.setText(String.valueOf(df.format(Math.PI)));

                            }
                        }
                    })
                    .show();

            builder2.create();

        }
    });

        percent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen.setText(String.valueOf(Double.parseDouble(screen.getText().toString())/100));
            }
        });

        excl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double x=Double.parseDouble(screen.getText().toString());
                if (x>1) {
                    double y=1;
                    while (x>0) {
                        y=y*x;
                        x=x-1;
                    }
                    screen.setText(String.valueOf(y));
                }
            }
        });


        power.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    if (put.getInt("flag", 0) == 0) {
                        editor1.putString("holder2", (screen.getText().toString()));
                        screen.setText("Enter y");

                    } else {

                        screen.setText(calculate(Double.parseDouble(put.getString("holder2", "0")), Double.parseDouble(screen.getText().toString()), put.getInt("flag", 0)));
                        editor1.putString("holder2", (screen.getText().toString()));
                    }
                    editor1.putInt("flag", 5);
                    editor1.putBoolean("flag2", true);
                    editor1.apply();

                }
            }
        });
        yroot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    if (put.getInt("flag", 0) == 0) {
                        editor1.putString("holder2", (screen.getText().toString()));
                        screen.setText("Enter y");

                    } else {

                        screen.setText(calculate(Double.parseDouble(put.getString("holder2", "0")), Double.parseDouble(screen.getText().toString()), put.getInt("flag", 0)));
                        editor1.putString("holder2", (screen.getText().toString()));
                    }
                    editor1.putInt("flag", 6);
                    editor1.putBoolean("flag2", true);
                    editor1.apply();

                }
            }
        });
    }

    public String calculate(Double holder2, Double holder1, int flag) {
        final java.text.DecimalFormat df=new java.text.DecimalFormat("############.#######");
        switch (flag) {
            case 1:
                return String.valueOf(df.format(holder2+holder1));

            case 2:
                return String.valueOf(df.format(holder2 - holder1));

            case 3:
                return String.valueOf(df.format(holder2 * holder1));

            case 4:
                return String.valueOf(df.format(holder2 / holder1));
            case 5:
                return String.valueOf(df.format(Math.pow(holder2, holder1)));
            case 6:
                return String.valueOf(df.format(nthroot(holder2,holder1)));

        }
        return "hi";
    }
    double nthroot(double A, double N)
    {


        double firstx = 0.001;

        double error = 0.00001;

        double delX = 2147483647;

        double finalx = 0.0;

        while (delX > error)
        {

            finalx = ((N - 1.0) * firstx + A / Math.pow(firstx, N - 1)) / N;
            delX = Math.abs(finalx - firstx);
            firstx = finalx;
        }

        return finalx;
    }
}
