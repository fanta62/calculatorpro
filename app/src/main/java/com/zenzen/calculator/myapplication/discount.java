package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class discount extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discount);
        final Button back = (Button) findViewById(R.id.button25);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText orig=(EditText)findViewById(R.id.editText);
        final EditText final2=(EditText)findViewById(R.id.editText2);
        final EditText rate=(EditText)findViewById(R.id.editText3);
        final EditText saved=(EditText)findViewById(R.id.editText4);
        final String final2a=final2.getText().toString();
        final String ratea=rate.getText().toString();
        final String saveda=saved.getText().toString();
        orig.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!orig.getText().toString().equals("")) {
                    orig.setText("");
                }
            }
        });
        final2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!final2.getText().toString().equals("")) {
                    final2.setText("");
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
        saved.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!saved.getText().toString().equals("")) {
                    saved.setText("");
                }
            }
        });
        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (orig.getText().toString().equals("")&&!rate.getText().toString().equals("")&&!final2.getText().toString().equals("")) {
                    String final2a=final2.getText().toString();
                    String ratea=rate.getText().toString();
                    orig.setText(String.valueOf(Double.parseDouble(final2a)*100/(1+Double.parseDouble(ratea)/100)));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (final2.getText().toString().equals("")&&!rate.getText().toString().equals("")&&!orig.getText().toString().equals("")) {
                    String origa=orig.getText().toString();
                    String ratea=rate.getText().toString();
                    final2.setText(String.valueOf(Double.parseDouble(origa)*(1-Double.parseDouble(ratea)/100)));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (rate.getText().toString().equals("")&&!orig.getText().toString().equals("")&&!final2.getText().toString().equals("")) {
                    String origa=orig.getText().toString();
                    String final2a=final2.getText().toString();
                    rate.setText(String.valueOf((1-(Double.parseDouble(final2a)/Double.parseDouble(origa)))*100));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
            saved.setText(String.valueOf(Double.parseDouble(orig.getText().toString())-Double.parseDouble(final2.getText().toString())));
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
