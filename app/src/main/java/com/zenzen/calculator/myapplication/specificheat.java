package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class specificheat extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specificheat);
        final EditText side1=(EditText)findViewById(R.id.editText5);
        final EditText side2=(EditText)findViewById(R.id.editText2);
        final EditText side3=(EditText)findViewById(R.id.editText4);
        final EditText side4=(EditText)findViewById(R.id.editText4x);
        Button calc=(Button)findViewById(R.id.button24);
        side1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side1.getText().toString().equals("")) {
                    side1.setText("");
                }
            }
        });
        side2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side2.getText().toString().equals("")) {
                    side2.setText("");
                }
            }
        });
        side3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side3.getText().toString().equals("")) {
                    side3.setText("");
                }
            }
        });
        side4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side3.getText().toString().equals("")) {
                    side3.setText("");
                }
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side1.getText().toString().equals("")&&!side3.getText().toString().equals("")&&!side2.getText().toString().equals("")&&side4.getText().toString().equals("")) {
                    Double a=Double.parseDouble(side3.getText().toString());
                    Double b=Double.parseDouble(side1.getText().toString());
                    Double c=Double.parseDouble(side2.getText().toString());


                    Double area=a*b*c;
                    side4.setText(String.valueOf(area));
                }
                else if (!side4.getText().toString().equals("")&&!side3.getText().toString().equals("")&&!side2.getText().toString().equals("")&&side1.getText().toString().equals("")) {
                    Double a=Double.parseDouble(side3.getText().toString());
                    Double b=Double.parseDouble(side4.getText().toString());
                    Double c=Double.parseDouble(side2.getText().toString());


                    Double area=b/a*c;
                    side1.setText(String.valueOf(area));
                }
                else if (!side4.getText().toString().equals("")&&!side1.getText().toString().equals("")&&!side2.getText().toString().equals("")&&side3.getText().toString().equals("")) {
                    Double a=Double.parseDouble(side1.getText().toString());
                    Double b=Double.parseDouble(side4.getText().toString());
                    Double c=Double.parseDouble(side2.getText().toString());


                    Double area=b/a*c;
                    side3.setText(String.valueOf(area));
                }
                else if (!side4.getText().toString().equals("")&&!side3.getText().toString().equals("")&&!side1.getText().toString().equals("")&&side2.getText().toString().equals("")) {
                    Double a=Double.parseDouble(side3.getText().toString());
                    Double b=Double.parseDouble(side4.getText().toString());
                    Double c=Double.parseDouble(side1.getText().toString());


                    Double area=b/a*c;
                    side2.setText(String.valueOf(area));
                }


            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), formulasmenu.class);

        finish();
        startActivity(intent);
    }
}
