package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



public class threemat extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threexmat);

        final EditText aa11=(EditText)findViewById(R.id.editText13);
        final EditText aa12=(EditText)findViewById(R.id.editText11);
        final EditText aa13=(EditText)findViewById(R.id.editText10);
        final EditText aa21=(EditText)findViewById(R.id.editText12);
        final EditText aa22=(EditText)findViewById(R.id.editText14);
        final EditText aa23=(EditText)findViewById(R.id.editText1x);
        final EditText aa31=(EditText)findViewById(R.id.editText12t);
        final EditText aa32=(EditText)findViewById(R.id.editText14t);
        final EditText aa33=(EditText)findViewById(R.id.editText1t);
        final EditText ab11=(EditText)findViewById(R.id.editText11a);
        final EditText ab12=(EditText)findViewById(R.id.editText15);
        final EditText ab13=(EditText)findViewById(R.id.editText10a);
        final EditText ab21=(EditText)findViewById(R.id.editText12a);
        final EditText ab22=(EditText)findViewById(R.id.editText16);
        final EditText ab23=(EditText)findViewById(R.id.editText1xa);
        final EditText ab31=(EditText)findViewById(R.id.editText12r);
        final EditText ab32=(EditText)findViewById(R.id.editText16r);
        final EditText ab33=(EditText)findViewById(R.id.editText1xr);
        final RadioButton plus=(RadioButton)findViewById(R.id.radioButton6);
        final  RadioButton minus=(RadioButton)findViewById(R.id.radioButton3);
        final  RadioButton cross=(RadioButton)findViewById(R.id.radioButton4);
        final TextView line1=(TextView)findViewById(R.id.textView26);
        final TextView line2=(TextView)findViewById(R.id.textView27);
        final TextView line3=(TextView)findViewById(R.id.textView28);
        final Button calc=(Button)findViewById(R.id.button48);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double ta11=Double.parseDouble(aa11.getText().toString());
                Double ta12=Double.parseDouble(aa12.getText().toString());
                Double ta13=Double.parseDouble(aa13.getText().toString());
                Double ta21=Double.parseDouble(aa21.getText().toString());
                Double ta22=Double.parseDouble(aa22.getText().toString());
                Double ta23=Double.parseDouble(aa23.getText().toString());
                Double ta31=Double.parseDouble(aa31.getText().toString());
                Double ta32=Double.parseDouble(aa32.getText().toString());
                Double ta33=Double.parseDouble(aa33.getText().toString());
                Double tb11=Double.parseDouble(ab11.getText().toString());
                Double tb12=Double.parseDouble(ab12.getText().toString());
                Double tb13=Double.parseDouble(ab13.getText().toString());
                Double tb21=Double.parseDouble(ab21.getText().toString());
                Double tb22=Double.parseDouble(ab22.getText().toString());
                Double tb23=Double.parseDouble(ab23.getText().toString());
                Double tb31=Double.parseDouble(ab31.getText().toString());
                Double tb32=Double.parseDouble(ab32.getText().toString());
                Double tb33=Double.parseDouble(ab33.getText().toString());
                Double tc11=0.0,tc12=0.0,tc13=0.0,tc21=0.0,tc22=0.0,tc23=0.0,tc31=0.0,tc32=0.0,tc33=0.0;
                if (plus.isChecked()) {

                    tc11=ta11+tb11;
                    tc12=ta12+tb12;
                    tc13=ta13+tb13;
                    tc21=ta21+tb21;
                    tc22=ta22+tb22;
                    tc23=ta23+tb23;
                    tc31=ta31+tb31;
                    tc32=ta32+tb32;
                    tc33=ta33+tb33;
                }
                if (minus.isChecked()) {

                    tc11=ta11-tb11;
                    tc12=ta12-tb12;
                    tc13=ta13-tb13;
                    tc21=ta21-tb21;
                    tc22=ta22-tb22;
                    tc23=ta23-tb23;
                    tc31=ta31-tb31;
                    tc32=ta32-tb32;
                    tc33=ta33-tb33;
                }

                if (cross.isChecked()) {

                    tc11=ta11*tb11+ta12*tb21+ta13*tb31;
                    tc12=ta11*tb12+ta12*tb22+ta13*tb32;
                    tc13=ta11*tb13+ta12*tb23+ta13*tb33;
                    tc21=ta21*tb11 +ta22*tb21+ta23*tb31;
                    tc22=ta21*tb12+ta22*tb22+ta23*tb32;
                    tc23=ta21*tb13+ta22*tb23+ta23*tb33;
                    tc31=ta31*tb11+ta32*tb21+ta33*tb31;
                    tc32=ta31*tb12+ta32*tb22+ta33*tb32;
                    tc33=ta31*tb13+ta32*tb23+ta33*tb33;

                }

                String line1a=String.valueOf(tc11)+"\t"+String.valueOf(tc12)+"\t"+String.valueOf(tc13);
                String line2a=String.valueOf(tc21)+"\t"+String.valueOf(tc22)+"\t"+String.valueOf(tc23);
                String line3a=String.valueOf(tc31)+"\t"+String.valueOf(tc32)+"\t"+String.valueOf(tc33);
                line1.setText(line1a);
                line2.setText(line2a);
                line3.setText(line3a);

            }
        });

    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), mvmenu.class);

        finish();
        startActivity(intent);
    }
}
