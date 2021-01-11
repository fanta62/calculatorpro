package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class sphere extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sphere);

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

                if (!side1.getText().toString().equals("")&&side3.getText().toString().equals("")&&side2.getText().toString().equals("")) {
                    Double a=Double.parseDouble(side1.getText().toString());
                    side3.setText(String.valueOf((4/3)*Math.PI*Math.pow(a,3)));
                    side2.setText(String.valueOf(4*Math.PI*a*a));

                }
                else if (side1.getText().toString().equals("")&&side3.getText().toString().equals("")&&!side2.getText().toString().equals("")) {
                    Double b=Double.parseDouble(side2.getText().toString());
                    Double r=Math.sqrt(b/(4*Math.PI));
                    side1.setText(String.valueOf(r));
                    side3.setText(String.valueOf((4/3)*Math.PI*Math.pow(r,3)));


                }
                else if (side1.getText().toString().equals("")&&!side3.getText().toString().equals("")&&side2.getText().toString().equals("")) {


                    Double c=Double.parseDouble(side3.getText().toString());
                    Double r=nthroot(((3*c)/(4*Math.PI)),3);
                    side1.setText(String.valueOf(r));
                    side2.setText(String.valueOf(4*Math.PI*r*r));


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
    double nthroot(double A, double N)
    {


        double firstx = 0.2;

        double error = 0.01;

        double delX = 21474;

        double finalx = 4000;

        while (delX > error)
        {

            finalx = ((N - 1.0) * firstx + A / Math.pow(firstx, N - 1)) / N;
            delX = Math.abs(finalx - firstx);
            firstx = finalx;
        }

        return finalx;
    }

}
