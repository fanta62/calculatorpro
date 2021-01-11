package com.zenzen.calculator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class inflation extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inflation);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText startp=(EditText)findViewById(R.id.editText);
        final EditText yearst=(EditText)findViewById(R.id.editText2);
        final EditText finalp=(EditText)findViewById(R.id.editText5);
        final EditText endyr=(EditText)findViewById(R.id.editText3);
        final EditText rate=(EditText)findViewById(R.id.editText4);
        startp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!startp.getText().toString().equals("")) {
                    startp.setText("");
                }
            }
        });
        yearst.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!yearst.getText().toString().equals("")) {
                    yearst.setText("");
                }
            }
        });
        endyr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!endyr.getText().toString().equals("")) {
                    endyr.setText("");
                }
            }
        });
        finalp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!finalp.getText().toString().equals("")) {
                    finalp.setText("");
                }
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!rate.getText().toString().equals("")) {
                    rate.setText("");
                }
            }
        });


        SharedPreferences sharedPref = this.getSharedPreferences(
                getString(R.string.file_key), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor2 = sharedPref.edit();
        editor2.apply();
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if (startp.getText().toString().equals("")&&(!finalp.getText().toString().equals(""))&&(!rate.getText().toString().equals(""))&&(!yearst.getText().toString().equals(""))&&(!endyr.getText().toString().equals(""))) {
                    Double time=Double.parseDouble(endyr.getText().toString())-Double.parseDouble(yearst.getText().toString());
                    Double finalprice=Double.parseDouble(finalp.getText().toString());
                    Double ratea=Double.parseDouble(rate.getText().toString());
                    startp.setText(String.valueOf(finalprice/(1+time*(ratea/100))));
                }
                if (finalp.getText().toString().equals("")&&(!startp.getText().toString().equals(""))&&(!rate.getText().toString().equals(""))&&(!yearst.getText().toString().equals(""))&&(!endyr.getText().toString().equals(""))) {
                    Double time=Double.parseDouble(endyr.getText().toString())-Double.parseDouble(yearst.getText().toString());
                    Double ratea=Double.parseDouble(rate.getText().toString());
                    Double startprice=Double.parseDouble(startp.getText().toString());
                    finalp.setText(String.valueOf(startprice*(1+time*(ratea/100))));
                }
                if(rate.getText().toString().equals("")&&(!startp.getText().toString().equals(""))&&(!finalp.getText().toString().equals(""))&&(!yearst.getText().toString().equals(""))&&(!endyr.getText().toString().equals(""))) {
                    Double time=Double.parseDouble(endyr.getText().toString())-Double.parseDouble(yearst.getText().toString());
                    Double startprice=Double.parseDouble(startp.getText().toString());
                    Double finalprice=Double.parseDouble(finalp.getText().toString());
                    rate.setText(String.valueOf(100*(finalprice-startprice)/(startprice*time)));
                }
                if(yearst.getText().toString().equals("")&&(!startp.getText().toString().equals(""))&&(!finalp.getText().toString().equals(""))&&(!rate.getText().toString().equals(""))&&(!endyr.getText().toString().equals(""))) {
                    Double startprice=Double.parseDouble(startp.getText().toString());
                    Double finalprice=Double.parseDouble(finalp.getText().toString());
                    Double endyra=Double.parseDouble(endyr.getText().toString());
                    Double ratea=Double.parseDouble(rate.getText().toString());
                    Double timea=(finalprice-startprice)/(startprice*(ratea/100));
                    yearst.setText(String.valueOf(endyra-timea));
                }
                if(endyr.getText().toString().equals("")&&(!startp.getText().toString().equals(""))&&(!finalp.getText().toString().equals(""))&&(!rate.getText().toString().equals(""))&&(!yearst.getText().toString().equals(""))) {
                    Double startprice=Double.parseDouble(startp.getText().toString());
                    Double finalprice=Double.parseDouble(finalp.getText().toString());
                    Double yearsta=Double.parseDouble(yearst.getText().toString());
                    Double ratea=Double.parseDouble(rate.getText().toString());
                    Double timea=(finalprice-startprice)/(startprice*(ratea/100));
                    endyr.setText(String.valueOf(yearsta+timea));
                }
            }
        });

    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), Finmenu.class);

        finish();
        startActivity(intent);
    }
}
