
package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class gravity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gravity);

        final EditText bb11=(EditText)findViewById(R.id.editText5);
        final EditText bb12=(EditText)findViewById(R.id.editText2);
        final EditText bb13=(EditText)findViewById(R.id.editText4);
        final EditText bb21=(EditText)findViewById(R.id.editText255);
        final EditText bb22=(EditText)findViewById(R.id.editText22);
        final EditText bb23=(EditText)findViewById(R.id.editText42);
        final EditText bb31=(EditText)findViewById(R.id.editText1);
        final EditText bb32=(EditText)findViewById(R.id.editText41);
        final  Button calc1=(Button)findViewById(R.id.button24);
        final Button calc2=(Button)findViewById(R.id.button242);
        final  Button calc3=(Button)findViewById(R.id.button241);



        bb11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb11.getText().toString().equals("")) {
                    bb11.setText("");
                }
            }
        });
        bb12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb12.getText().toString().equals("")) {
                    bb12.setText("");
                }
            }
        });
        bb13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb13.getText().toString().equals("")) {
                    bb13.setText("");
                }
            }
        });


        calc1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb11.getText().toString().equals("")&&bb13.getText().toString().equals("")&&!bb12.getText().toString().equals("")) {
                    String bb12a=bb12.getText().toString();
                    String bb11a=bb11.getText().toString();
                    bb13.setText(String.valueOf(Double.parseDouble(bb12a)*Double.parseDouble(bb12a)/(2*Double.parseDouble(bb11a))));
                }

                else if (bb12.getText().toString().equals("")&&!bb13.getText().toString().equals("")&&!bb11.getText().toString().equals("")) {
                    String bb11a=bb11.getText().toString();
                    String bb13a=bb13.getText().toString();
                    bb12.setText(String.valueOf(Math.sqrt(Double.parseDouble(bb11a)*Double.valueOf(bb13a)*2)));
                }

                else if (!bb13.getText().toString().equals("")&&bb11.getText().toString().equals("")&&!bb12.getText().toString().equals("")) {
                    String bb13a=bb13.getText().toString();
                    String bb12a=bb12.getText().toString();
                    bb11.setText(String.valueOf(Double.parseDouble(bb12a)*Double.parseDouble(bb12a)/(2*Double.parseDouble(bb13a))));
                }


            }
        });

        bb21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb21.getText().toString().equals("")) {
                    bb21.setText("");
                }
            }
        });
        bb22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb22.getText().toString().equals("")) {
                    bb22.setText("");
                }
            }
        });
        bb23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb23.getText().toString().equals("")) {
                    bb23.setText("");
                }
            }
        });


        calc2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Double capg=6.67408; //10&-11

                if (!bb21.getText().toString().equals("")&&bb23.getText().toString().equals("")&&!bb22.getText().toString().equals("")) {
                    String bb22a=bb22.getText().toString();
                    String bb21a=bb21.getText().toString();
                    bb23.setText(String.valueOf(Double.parseDouble(bb21a)/ Double.parseDouble(bb22a)));
                }

                else if (bb22.getText().toString().equals("")&&!bb23.getText().toString().equals("")&&!bb21.getText().toString().equals("")) {
                    String bb21a=bb21.getText().toString();
                    String bb23a=bb23.getText().toString();
                    bb22.setText(String.valueOf(Double.parseDouble(bb21a)/Double.valueOf(bb23a)));
                }

                else if (!bb23.getText().toString().equals("")&&bb21.getText().toString().equals("")&&!bb22.getText().toString().equals("")) {
                    String bb23a=bb23.getText().toString();
                    String bb22a=bb22.getText().toString();
                    bb21.setText(String.valueOf(Double.parseDouble(bb23a)*Double.parseDouble(bb22a)));
                }


            }
        });
        bb31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb31.getText().toString().equals("")) {
                    bb31.setText("");
                }
            }
        });
        bb32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!bb32.getText().toString().equals("")) {
                    bb32.setText("");
                }
            }
        });



        calc3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double grav=398576.058;
                Double dist=6371000.0;
                if (!bb31.getText().toString().equals("")&&bb32.getText().toString().equals("")) {

                    String bb31a=bb31.getText().toString();
                    bb32.setText(String.valueOf(grav/Math.pow(dist+Double.parseDouble(bb31a)*1000,2)));
                }
                if (!bb32.getText().toString().equals("")&&bb31.getText().toString().equals("")) {

                    String bb32a=bb32.getText().toString();
                    bb31.setText(String.valueOf((Math.sqrt((grav*1000)/Double.parseDouble(bb32a))-dist/1000)));
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
