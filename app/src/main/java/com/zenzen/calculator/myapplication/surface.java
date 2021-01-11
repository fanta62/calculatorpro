package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class surface extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surface);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText forc=(EditText)findViewById(R.id.editText);
        final EditText radius=(EditText)findViewById(R.id.editText2);
        final EditText surfac=(EditText)findViewById(R.id.editText4);


        forc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!forc.getText().toString().equals("")) {
                    forc.setText("");
                }
            }
        });
        radius.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!radius.getText().toString().equals("")) {
                    radius.setText("");
                }
            }
        });
        surfac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!surfac.getText().toString().equals("")) {
                    surfac.setText("");
                }
            }
        });

        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!forc.getText().toString().equals("")&&surfac.getText().toString().equals("")&&!radius.getText().toString().equals("")) {
                    String radiusa=radius.getText().toString();
                    String forca=forc.getText().toString();
                    surfac.setText(String.valueOf(Double.parseDouble(forca)/(4*Math.PI*Double.parseDouble(radiusa))));
                }

                else if (radius.getText().toString().equals("")&&!surfac.getText().toString().equals("")&&!forc.getText().toString().equals("")) {
                    String forca=forc.getText().toString();
                    String surfaca=surfac.getText().toString();
                    radius.setText(String.valueOf(Double.parseDouble(forca)/(4*Math.PI*Double.valueOf(surfaca))));
                }

                else if (!surfac.getText().toString().equals("")&&forc.getText().toString().equals("")&&!radius.getText().toString().equals("")) {
                    String surfaca=surfac.getText().toString();
                    String radiusa=radius.getText().toString();
                    forc.setText(String.valueOf(4*Math.PI*Double.parseDouble(surfaca)*Double.parseDouble(radiusa)));
                }
                else {
                    tv4.setText("Please fill up at least one of the three fields");
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
