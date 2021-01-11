package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class CompundInterest extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compoundinterest);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText princ=(EditText)findViewById(R.id.editText);
        final EditText rate=(EditText)findViewById(R.id.editText2);
        final EditText time=(EditText)findViewById(R.id.editText3);
        final EditText intr=(EditText)findViewById(R.id.editText4);

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
                    princ.setText(String.valueOf(Double.parseDouble(intra)/((Math.pow((1+Double.parseDouble(ratea)/100),Double.parseDouble(timea))-1))));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (rate.getText().toString().equals("")&&!intr.getText().toString().equals("")&&!time.getText().toString().equals("")&&!princ.getText().toString().equals("")) {
                    String princa=princ.getText().toString();
                    String timea=time.getText().toString();
                    String intra=intr.getText().toString();
                    rate.setText(String.valueOf(100*(nthroot((Double.parseDouble(intra)/Double.parseDouble(princa))+1,Double.parseDouble(timea))-1)));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (time.getText().toString().equals("")&&!intr.getText().toString().equals("")&&!princ.getText().toString().equals("")&&!rate.getText().toString().equals("")) {
                    Double princa=Double.parseDouble(princ.getText().toString());
                    Double ratea=Double.parseDouble(rate.getText().toString());
                    Double intra=Double.parseDouble(intr.getText().toString());
                    time.setText(String.valueOf(Math.log(intra/princa+1)/Math.log(1+ratea/100)));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (intr.getText().toString().equals("")&&!princ.getText().toString().equals("")&&!time.getText().toString().equals("")&&!rate.getText().toString().equals("")) {
                    Double princa=Double.parseDouble(princ.getText().toString());
                    Double ratea=Double.parseDouble(rate.getText().toString());
                    Double timea=Double.parseDouble(time.getText().toString());
                    intr.setText(String.valueOf(princa*(Math.pow((1+ratea/100),timea))-princa));
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
