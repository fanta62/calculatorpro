package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class quadr extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quadr);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText side1=(EditText)findViewById(R.id.editText);
        final EditText side2=(EditText)findViewById(R.id.editText2);
        final EditText side3=(EditText)findViewById(R.id.editText4);
        final EditText side4=(EditText)findViewById(R.id.editText5);
        final TextView ans=(TextView)findViewById(R.id.textView9);


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
        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side1.getText().toString().equals("")&&!side3.getText().toString().equals("")&&!side2.getText().toString().equals("")&&!side4.getText().toString().equals("")) {
                    Double a=Double.parseDouble(side3.getText().toString());
                    Double b=Double.parseDouble(side1.getText().toString());
                    Double c=Double.parseDouble(side2.getText().toString());
                    Double d=Double.parseDouble(side4.getText().toString());
                    Double s=(a+b+c+d)/2;
                    Double area=Math.sqrt((s-a)*(s-b)*(s-c)*(s-d));
                    ans.setText(String.valueOf(area));
                }
                else {
                    tv4.setText("Please fill up all the fields");
                }

            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), areamenu.class);

        finish();
        startActivity(intent);
    }
}
