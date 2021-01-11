package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class circle extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText radius=(EditText)findViewById(R.id.editText);
        final EditText area=(EditText)findViewById(R.id.editText2);
        final EditText circumf=(EditText)findViewById(R.id.editText4);


        radius.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!radius.getText().toString().equals("")) {
                    radius.setText("");
                }
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!area.getText().toString().equals("")) {
                    area.setText("");
                }
            }
        });
        circumf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!circumf.getText().toString().equals("")) {
                    circumf.setText("");
                }
            }
        });

        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (radius.getText().toString().equals("")&&circumf.getText().toString().equals("")&&!area.getText().toString().equals("")) {
                    String areaa=area.getText().toString();
                    radius.setText(String.valueOf(Math.sqrt(Double.parseDouble(areaa)/Math.PI)));
                    circumf.setText(String.valueOf(2*Math.PI*Double.parseDouble(radius.getText().toString())));
                }

                else if (area.getText().toString().equals("")&&circumf.getText().toString().equals("")&&!radius.getText().toString().equals("")) {
                    String radiusa=radius.getText().toString();
                    area.setText(String.valueOf(Math.PI*Math.pow(Double.parseDouble(radiusa),2)));
                    circumf.setText(String.valueOf(2*Math.PI*Double.parseDouble(radius.getText().toString())));
                }

                else if (!circumf.getText().toString().equals("")&&radius.getText().toString().equals("")&&area.getText().toString().equals("")) {
                    String circumfa=circumf.getText().toString();
                    radius.setText(String.valueOf(Double.parseDouble(circumfa)/(2*Math.PI)));
                    area.setText(String.valueOf(Math.PI*Math.pow(Double.parseDouble(radius.getText().toString()),2)));
                }
                else {
                    tv4.setText("Please fill up at least one of the three fields");
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
