package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by tapojyoti on 5/20/2018.
 */

public class cube extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cube);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText side1=(EditText)findViewById(R.id.editText);

        final TextView ans=(TextView)findViewById(R.id.textView9);


        side1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side1.getText().toString().equals("")) {
                    side1.setText("");
                }
            }
        });


        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side1.getText().toString().equals("")) {

                    Double c=Double.parseDouble(side1.getText().toString());
                    ans.setText(String.valueOf(Math.pow(c,3)));

                }

                else {
                    tv4.setText("Please fill up only one of the fields");
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
