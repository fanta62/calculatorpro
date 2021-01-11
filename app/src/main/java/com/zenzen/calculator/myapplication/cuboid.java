package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class cuboid extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuboid);
        final Button back = (Button) findViewById(R.id.button25);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText side1=(EditText)findViewById(R.id.editText);
        final EditText side2=(EditText)findViewById(R.id.editText2);
        final EditText side3=(EditText)findViewById(R.id.editText4);
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

        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side1.getText().toString().equals("")&&!side3.getText().toString().equals("")&&!side2.getText().toString().equals("")) {
                    Double a=Double.parseDouble(side3.getText().toString());
                    Double b=Double.parseDouble(side1.getText().toString());
                    Double c=Double.parseDouble(side2.getText().toString());
                    Double s=a*b*c;
                    ans.setText(String.valueOf(s));
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
