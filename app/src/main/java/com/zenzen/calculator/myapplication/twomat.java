package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



public class twomat extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoxmat);

        final EditText aa11=(EditText)findViewById(R.id.editText11);
        final EditText aa12=(EditText)findViewById(R.id.editText10);
        final EditText aa21=(EditText)findViewById(R.id.editText12);
        final EditText aa22=(EditText)findViewById(R.id.editText1x);
        final EditText ab11=(EditText)findViewById(R.id.editText11a);
        final EditText ab12=(EditText)findViewById(R.id.editText10a);
        final EditText ab21=(EditText)findViewById(R.id.editText12a);
        final EditText ab22=(EditText)findViewById(R.id.editText1xa);
        final RadioButton plus=(RadioButton)findViewById(R.id.radioButton6);
        final  RadioButton minus=(RadioButton)findViewById(R.id.radioButton3);
        final  RadioButton cross=(RadioButton)findViewById(R.id.radioButton4);
        final  RadioButton dot=(RadioButton)findViewById(R.id.radioButton5);
        final TextView line1=(TextView)findViewById(R.id.textView26);
        final TextView line2=(TextView)findViewById(R.id.textView27);
        final Button calc=(Button)findViewById(R.id.button48);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double ta11=Double.parseDouble(aa11.getText().toString());
                Double ta12=Double.parseDouble(aa12.getText().toString());
                Double ta21=Double.parseDouble(aa21.getText().toString());
                Double ta22=Double.parseDouble(aa22.getText().toString());
                Double tb11=Double.parseDouble(ab11.getText().toString());
                Double tb12=Double.parseDouble(ab12.getText().toString());
                Double tb21=Double.parseDouble(ab21.getText().toString());
                Double tb22=Double.parseDouble(ab22.getText().toString());
                Double tc11=0.0,tc12=0.0,tc21=0.0,tc22=0.0;
                if (plus.isChecked()) {

                    tc11=ta11+tb11;
                    tc12=ta12+tb12;
                    tc21=ta21+tb21;
                    tc22=ta22+tb22;
                }
                if (minus.isChecked()) {

                    tc11=ta11-tb11;
                    tc12=ta12-tb12;
                    tc21=ta21-tb21;
                    tc22=ta22-tb22;
                }

                if (cross.isChecked()) {

                    tc11=ta11*tb11+ta12*tb21;
                    tc12=ta11*tb12+ta12*tb22;
                    tc21=ta21*tb11 +ta22*tb21;
                    tc22=ta21*tb12+ta22*tb22;

                }
                if (dot.isChecked()) {

                    Double a=tb22;
                    Double b=0-tb12;
                    Double c=0-tb21;
                    Double d=tb11;
                    Double det=1/(a*d-b*c);
                    tb11=a/det;tb12=b/det;tb21=c/det;tb22=d/det;
                    tc11=ta11*tb11+ta12*tb21;
                    tc12=ta11*tb12+ta12*tb22;
                    tc21=ta21*tb11 +ta22*tb21;
                    tc22=ta21*tb12+ta22*tb22;


                }
            String line1a=String.valueOf(tc11)+"\t"+String.valueOf(tc12);
                String line2a=String.valueOf(tc21)+"\t"+String.valueOf(tc22);
                line1.setText(line1a);
                line2.setText(line2a);

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
