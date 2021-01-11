package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class solvexyz extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solvexyz);

        final EditText buta1=(EditText)findViewById(R.id.editText6);
        final EditText butb1=(EditText)findViewById(R.id.editText69);
        final EditText butc1=(EditText)findViewById(R.id.editText62);
        final EditText buta2=(EditText)findViewById(R.id.editText64);
        final EditText butb2=(EditText)findViewById(R.id.editText68);
        final EditText butc2=(EditText)findViewById(R.id.editText63);
        final EditText buta3=(EditText)findViewById(R.id.editText61);
        final EditText butb3=(EditText)findViewById(R.id.editText691);
        final EditText butc3=(EditText)findViewById(R.id.editText621);
        final EditText butd1=(EditText)findViewById(R.id.editText65);
        final EditText butd2=(EditText)findViewById(R.id.editText66);
        final EditText butd3=(EditText)findViewById(R.id.editText651);


        final TextView buty=(TextView)findViewById(R.id.textView19);
        final TextView butz=(TextView)findViewById(R.id.textView190);
        final TextView butx=(TextView)findViewById(R.id.textView17);
        Button calc=(Button)findViewById(R.id.button46);
        calc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (!buta1.getText().toString().equals("")&&!butb1.getText().toString().equals("")&&!butc1.getText().toString().equals("")&&!buta2.getText().toString().equals("")&&!butb2.getText().toString().equals("")&&!butc2.getText().toString().equals("")&&!buta3.getText().toString().equals("")&&!butb3.getText().toString().equals("")&&!butc3.getText().toString().equals("")&&!butd1.getText().toString().equals("")&&!butd2.getText().toString().equals("")&&!butd3.getText().toString().equals("")) {
                    Double a1 = Double.parseDouble(buta1.getText().toString());
                    Double b1 = Double.parseDouble(butb1.getText().toString());
                    Double c1 = Double.parseDouble(butc1.getText().toString());
                    Double a2 = Double.parseDouble(buta2.getText().toString());
                    Double b2 = Double.parseDouble(butb2.getText().toString());
                    Double c2 = Double.parseDouble(butc2.getText().toString());
                    Double a3 = Double.parseDouble(buta3.getText().toString());
                    Double b3 = Double.parseDouble(butb3.getText().toString());
                    Double c3 = Double.parseDouble(butc3.getText().toString());
                    Double d1 = Double.parseDouble(butd1.getText().toString());
                    Double d2 = Double.parseDouble(butd2.getText().toString());
                    Double d3 = Double.parseDouble(butd3.getText().toString());

                    Double a4=((a1*b2/a2)-b1);
                    Double b4=((a1*c2/a2)-c1);
                    Double c4=((a1*d2/a2)-d1);
                    Double d4=((a1*b3/a3)-b1);
                    Double e4=((a1*c3/a3)-c1);
                    Double f4=((a1*d3/a3)-d1);

                    Double z=  (c4 - a4 * f4 / d4) / (b4 - a4 * e4 / d4);
                    Double y=(b4 * f4 / e4 - c4) / (b4 * d4 / e4 - a4);
                    Double x=d1-c1*z-b1*y;
                    butx.setText(String.valueOf(x));
                    buty.setText(String.valueOf(y));
                    butz.setText(String.valueOf(z));

                }
                else {
                    AlertDialog.Builder builder;
                    builder=new AlertDialog.Builder(solvexyz.this);
                    builder.setMessage("Please fill up all 12 fields and ensure that ratio of entered x, y and z coefficients are not equal");
                    builder.show();
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