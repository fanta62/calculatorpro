package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class pyramid extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cone);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText side1=(EditText)findViewById(R.id.editText);
        final EditText side2=(EditText)findViewById(R.id.editText2);
        final TextView side3=(TextView)findViewById(R.id.textView11);
        final TextView side4=(TextView)findViewById(R.id.textView12);


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

        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!side1.getText().toString().equals("")&&!side2.getText().toString().equals("")) {
                    Double b=Double.parseDouble(side1.getText().toString());
                    Double c=Double.parseDouble(side2.getText().toString());

                    Double middle=Math.sqrt(c*c+b*b/4);
                    Double surfar=0.555*middle*(b*4);
                    Double vol=((0.3333333333333)*b*b*c);
                    side3.setText(String.valueOf(vol));
                    side4.setText(String.valueOf(surfar));


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
