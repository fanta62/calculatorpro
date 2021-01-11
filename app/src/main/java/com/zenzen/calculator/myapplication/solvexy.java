package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class solvexy extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xygiven);

        final EditText buta=(EditText)findViewById(R.id.editText6);
        final EditText butb=(EditText)findViewById(R.id.editText62);
        final EditText butc=(EditText)findViewById(R.id.editText65);
        final EditText butd=(EditText)findViewById(R.id.editText64);
        final EditText bute=(EditText)findViewById(R.id.editText63);
        final EditText butf=(EditText)findViewById(R.id.editText66);

        final TextView buty=(TextView)findViewById(R.id.textView19);
        final TextView butx=(TextView)findViewById(R.id.textView17);
        Button calc=(Button)findViewById(R.id.button46);
        calc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (!buta.getText().toString().equals("")&&!butb.getText().toString().equals("")&&!butc.getText().toString().equals("")&&!butd.getText().toString().equals("")&&!bute.getText().toString().equals("")&&!butf.getText().toString().equals("")) {

                    Double a = Double.parseDouble(buta.getText().toString());
                    Double b = Double.parseDouble(butb.getText().toString());
                    Double c = Double.parseDouble(butc.getText().toString());
                    Double d = Double.parseDouble(butd.getText().toString());
                    Double e = Double.parseDouble(bute.getText().toString());
                    Double f = Double.parseDouble(butf.getText().toString());
                    if (!(a/d==b/e)) {
                        Double ansy = (c - a * f / d) / (b - a * e / d);
                        Double ansx = (b * f / e - c) / (b * d / e - a);
                        butx.setText(String.valueOf(ansx));
                        buty.setText(String.valueOf(ansy));
                    }

                }






            }
        });

    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), equationsmenu.class);

        finish();
        startActivity(intent);
    }
}