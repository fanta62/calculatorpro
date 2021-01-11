package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.view.View.GONE;



public class triangle extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle);
        final RadioButton basech = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton sidech = (RadioButton) findViewById(R.id.radioButton2);
        final LinearLayout sidel=(LinearLayout)findViewById(R.id.side3l);
        final TextView txt1=(TextView)findViewById(R.id.textView5);
        final TextView txt2=(TextView)findViewById(R.id.txtview);
        final TextView txt3=(TextView)findViewById(R.id.txtview2);
        sidel.setVisibility(View.GONE);
        basech.setChecked(true);

        final Button calc = (Button) findViewById(R.id.button24);
        final EditText base = (EditText) findViewById(R.id.editText);
        final EditText height = (EditText) findViewById(R.id.editText2);
        final EditText area = (EditText) findViewById(R.id.editText41);

        final EditText side3 = (EditText) findViewById(R.id.editText4);

        base.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!base.getText().toString().equals("")) {
                    base.setText("");
                }
            }
        });
        height.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!height.getText().toString().equals("")) {
                    height.setText("");
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

        final TextView tv4 = (TextView) findViewById(R.id.textView4);
        basech.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (basech.isChecked()) {
                    area.setEnabled(true);
                    sidel.setVisibility(View.GONE);
                    txt1.setText("Base");
                    txt2.setText("Height");
                    calc.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            if (base.getText().toString().equals("") && !area.getText().toString().equals("") && !height.getText().toString().equals("")) {
                                Double heighta = Double.parseDouble(height.getText().toString());
                                Double areaa=Double.parseDouble(area.getText().toString());
                                base.setText(String.valueOf(2*areaa/heighta));

                            } else if (height.getText().toString().equals("") && !area.getText().toString().equals("") && !base.getText().toString().equals("")) {
                                Double basea = Double.parseDouble(base.getText().toString());
                                Double areaa=Double.parseDouble(area.getText().toString());
                                height.setText(String.valueOf(2*areaa/basea));
                            } else if (area.getText().toString().equals("") && !base.getText().toString().equals("") && !height.getText().toString().equals("")) {
                                Double basea = Double.parseDouble(base.getText().toString());
                                Double heighta=Double.parseDouble(height.getText().toString());
                                area.setText(String.valueOf(0.5*basea*heighta));
                            } else {
                                tv4.setText("Please fill up at least two of the three fields");
                            }

                        }
                    });
                }
            }
        });
        sidech.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (sidech.isChecked()) {
                    sidel.setVisibility(View.VISIBLE);
                    txt1.setText("Side 1");
                    txt2.setText("Side 2");
                    area.setEnabled(false);
                    calc.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                                Double side1a=Double.parseDouble(base.getText().toString());
                                Double side2a=Double.parseDouble(height.getText().toString());
                                Double side3a=Double.parseDouble(side3.getText().toString());
                                Double semip=(side1a+side2a+side3a)/2;
                            Double area2=Math.sqrt(semip*(semip-side1a)*(semip-side2a)*(semip-side3a));
                            if ( !base.getText().toString().equals("") && !height.getText().toString().equals("")&&!side3.getText().toString().equals("")) {

                                area.setText(String.valueOf(area2));
                            } else {
                                tv4.setText("Please fill up at least two of the three fields");
                            }

                        }
                    });
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
