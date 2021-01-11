package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



public class ijkvect extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ijv);

        final EditText bba=(EditText)findViewById(R.id.editText11);
        final EditText bbb=(EditText)findViewById(R.id.editText10);
        final EditText bbc=(EditText)findViewById(R.id.editText19);
        final EditText bba2=(EditText)findViewById(R.id.editText11a);
        final EditText bbb2=(EditText)findViewById(R.id.editText10a);
        final EditText bbc2=(EditText)findViewById(R.id.editText20);

        final  Button calc=(Button)findViewById(R.id.button48);
        final  RadioButton plus=(RadioButton)findViewById(R.id.radioButton6);
        final  RadioButton minus=(RadioButton)findViewById(R.id.radioButton3);
        final  RadioButton cross=(RadioButton)findViewById(R.id.radioButton4);
        final  RadioButton dot=(RadioButton)findViewById(R.id.radioButton5);
        final TextView ada=(TextView)findViewById(R.id.textView26);

        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                double i1=Double.parseDouble(bba.getText().toString());
                double j1=Double.parseDouble(bbb.getText().toString());
                double k1=Double.parseDouble(bbc.getText().toString());
                double i2= Double.parseDouble(bba2.getText().toString());
                double j2=Double.parseDouble(bbb2.getText().toString());
                double k2=Double.parseDouble(bbc2.getText().toString());
                double ians=0.0;
                double jans=0.0;
                double kans=0.0;

                if (plus.isChecked()) {
                    ians=i1+i2;
                    jans=j1+j2;
                    kans=k1+k2;
                }
                if (minus.isChecked()) {

                    ians=i1-i2;
                    jans=j1-j2;
                    kans=k1-k2;
                }


                if (cross.isChecked()) {

                    kans=i1*j2+j1*i2;
                    jans=i1*k2+i2*k1;
                    ians=j1*k2+k1*j2;
                    if (i1==0) {
                        ians+=i2;
                    }
                    else if (i2==0) {
                        ians+=i1;
                    }
                    if (j1==0) {
                        jans+=j2;
                    }
                    else if (j2==0) {
                        jans+=j1;
                    }
                }
                if (dot.isChecked()) {

                    ians=i2*i1;
                    jans=j1*j2;
                    kans=k1*k2;
                }

                String total="0";String nians=String.valueOf(ians);String njans=String.valueOf(jans);String nkans=String.valueOf(kans);
                if (ians>0)
                    nians="+"+nians;
                if (jans>0)
                    njans="+"+njans;
                if (kans>0)
                    nkans="+"+nkans;
                if (ians==0) {
                    total=njans+"j"+nkans+"k";
                }
                if (jans==0) {
                    total=nians+"i"+nkans+"k";
                }
                if (kans==0) {
                    total=nians+"i"+njans+"j";
                }
                if (ians==0&&jans==0) {
                    total=nkans+"k";
                }
                if (jans==0&&kans==0) {
                    total=nians+"i";
                }
                if (ians==0&&kans==0) {
                    total=njans+"j";

                    if (jans==0) {
                        total=String.valueOf(0);
                    }
                }

                ada.setText(total);


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
