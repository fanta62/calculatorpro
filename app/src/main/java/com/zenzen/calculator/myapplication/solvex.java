package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class solvex extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xgiven);

        final EditText a1=(EditText)findViewById(R.id.editText7);
        final EditText b1=(EditText)findViewById(R.id.editText8);
        final EditText a2=(EditText)findViewById(R.id.editText71);
        final EditText b2=(EditText)findViewById(R.id.editText81);
        final EditText a3=(EditText)findViewById(R.id.editText72);
        final EditText b3=(EditText)findViewById(R.id.editText82);
        final EditText a4=(EditText)findViewById(R.id.editText73);
        final EditText b4=(EditText)findViewById(R.id.editText83);
        final EditText a5=(EditText)findViewById(R.id.editText74);
        final EditText b5=(EditText)findViewById(R.id.editText84);
        final EditText upper=(EditText)findViewById(R.id.editText9);
        final EditText con=(EditText)findViewById(R.id.editText85);
        final TextView aler=(TextView)findViewById(R.id.textView24);
        final TextView alert=(TextView)findViewById(R.id.textView25);

        final EditText lower=(EditText)findViewById(R.id.editText91);

        Button calc=(Button)findViewById(R.id.button47);
        calc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String a1s = a1.getText().toString();
                String a2s = a2.getText().toString();
                String a3s = a3.getText().toString();
                String a4s = a4.getText().toString();
                String a5s = a5.getText().toString();
                String b1s = b1.getText().toString();
                String b2s = b2.getText().toString();
                String b3s = b3.getText().toString();
                String b4s = b4.getText().toString();
                String b5s = b5.getText().toString();
                Double uppernum = Double.parseDouble(upper.getText().toString());
                Double lowernum = Double.parseDouble(lower.getText().toString());
                Double xaa = (uppernum + lowernum) / 2;

                Double expr = 0.0;


                Integer i = 0;
                Integer flag = 0;
                Double aa1 = 0.0, aa2 = 0.0, aa3 = 0.0, aa4 = 0.0, aa5 = 0.0, ba1 = 0.0, ba2 = 0.0, ba3 = 0.0, ba4 = 0.0, ba5 = 0.0, k = 0.0;


                if (!a1s.equals("") && !b1s.equals("")) {
                    aa1 = Double.parseDouble(a1s);
                    ba1 = Double.parseDouble(b1s);
                    flag = 1;


                    if (!a2s.equals("") && !b2s.equals("")) {
                        aa2 = Double.parseDouble(a2s);
                        ba2 = Double.parseDouble(b2s);
                        flag = 2;


                        if (!a3s.equals("") && !b3s.equals("")) {
                            aa3 = Double.parseDouble(a3s);
                            ba3 = Double.parseDouble(b3s);
                            flag = 3;

                            if (!a4s.equals("") && !b4s.equals("")) {
                                aa4 = Double.parseDouble(a4s);
                                ba4 = Double.parseDouble(b4s);
                                flag = 4;
                                if (!a5s.equals("") && !b5s.equals("")) {
                                    aa5 = Double.parseDouble(a5s);
                                    ba5 = Double.parseDouble(b5s);
                                    flag = 5;
                                }
                            }
                        }
                    }


                }
                if (!con.getText().toString().equals("")) {
                    k = Double.parseDouble(con.getText().toString());
                }
                Double result = bisection(aa1, ba1, aa2, ba2, aa3, ba3, aa4, ba4, aa5, ba5, k, lowernum, uppernum);

                alert.setText(String.valueOf(result));


            }

            private double funcx(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double x, double k) {
                double funcxa = a * Math.pow(x, b) + c * Math.pow(x, d) + e * Math.pow(x, f) + g * Math.pow(x, h) + i * Math.pow(x, j) - k;
                return funcxa;
            }

            public double bisection(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double low, double up) {
                double ca = 0, temp;
                int i2 = 0;

                do {
                    ca = (low + up) / 2;
                    double error = funcx(a, b, c, d, e, f, g, h, i, j, ca, k);
                    if (up > low) {
                        if (funcx(a, b, c, d, e, f, g, h, i, j, ca, k) < 0) {
                            temp = low;
                            low = ca;
                            if (funcx(a, b, c, d, e, f, g, h, i, j, (low + up) / 2, k) < error) {
                                low = temp;
                                up = ca;
                            }

                        }

                        if (funcx(a, b, c, d, e, f, g, h, i, j, ca, k) > 0) {
                            temp = up;
                            up = ca;
                            if (funcx(a, b, c, d, e, f, g, h, i, j, (low + up) / 2, k) > error) {
                                up = temp;
                                low = ca;
                            }

                        }


                        ca = (up + low) / 2;
                        i2++;
                    }
                        if (up < low) {
                            temp = low;
                            low = up;
                            up = temp;
                        }

                } while (i2 < 100);
                return ca;
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