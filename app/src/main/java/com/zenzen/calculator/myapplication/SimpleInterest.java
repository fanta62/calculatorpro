package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class SimpleInterest extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleinterest);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText princ=(EditText)findViewById(R.id.editText);
        final EditText rate=(EditText)findViewById(R.id.editText2);
        final EditText time=(EditText)findViewById(R.id.editText3);
        final EditText intr=(EditText)findViewById(R.id.editText4);
        final String ratea=rate.getText().toString();
        final String timea=time.getText().toString();
        final String intra=intr.getText().toString();
        princ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!princ.getText().toString().equals("")) {
                    princ.setText("");
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
        time.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!time.getText().toString().equals("")) {
                    time.setText("");
                }
            }
        });
        intr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!intr.getText().toString().equals("")) {
                    intr.setText("");
                }
            }
        });
        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (princ.getText().toString().equals("")&&!intr.getText().toString().equals("")&&!time.getText().toString().equals("")&&!rate.getText().toString().equals("")) {
                    String ratea=rate.getText().toString();
                    String timea=time.getText().toString();
                    String intra=intr.getText().toString();
                    princ.setText(String.valueOf(Double.parseDouble(intra)/((Double.parseDouble(ratea)/100)*Double.parseDouble(timea))));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (rate.getText().toString().equals("")&&!intr.getText().toString().equals("")&&!time.getText().toString().equals("")&&!princ.getText().toString().equals("")) {
                    String princa=princ.getText().toString();
                    String timea=time.getText().toString();
                    String intra=intr.getText().toString();
                    rate.setText(String.valueOf(100*Double.parseDouble(intra)/((Double.parseDouble(princa))*Double.parseDouble(timea))));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (time.getText().toString().equals("")&&!intr.getText().toString().equals("")&&!princ.getText().toString().equals("")&&!rate.getText().toString().equals("")) {
                    String princa=princ.getText().toString();
                    String ratea=rate.getText().toString();
                    String intra=intr.getText().toString();
                    time.setText(String.valueOf(Double.parseDouble(intra)/((Double.parseDouble(princa))*(Double.parseDouble(ratea)/100))));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (intr.getText().toString().equals("")&&!princ.getText().toString().equals("")&&!time.getText().toString().equals("")&&!rate.getText().toString().equals("")) {
                    String princa=princ.getText().toString();
                    String ratea=rate.getText().toString();
                    String timea=time.getText().toString();
                    intr.setText(String.valueOf(Double.parseDouble(princa)*(Double.parseDouble(ratea)/100)*Double.parseDouble(timea)));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
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
