package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class force extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.force);


        final EditText mass=(EditText)findViewById(R.id.editText5);
        final EditText accl=(EditText)findViewById(R.id.editText2);
        final EditText taim=(EditText)findViewById(R.id.editText4);
        final EditText forc=(EditText)findViewById(R.id.editText22);
        final EditText displ=(EditText)findViewById(R.id.editText255);
        final EditText work=(EditText)findViewById(R.id.editText42);
        final EditText volt=(EditText)findViewById(R.id.editText1);
        final EditText curr=(EditText)findViewById(R.id.editText21);
        final EditText power=(EditText)findViewById(R.id.editText41);
        final EditText mass2=(EditText)findViewById(R.id.editText3);
        final EditText velo=(EditText)findViewById(R.id.editText23);
        final EditText kine=(EditText)findViewById(R.id.editText43);
        final Button calc1 = (Button) findViewById(R.id.button24);
        final Button calc2 = (Button) findViewById(R.id.button242);
        final Button calc3 = (Button) findViewById(R.id.button241);
        final Button calc4 = (Button) findViewById(R.id.button243);

        mass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!mass.getText().toString().equals("")) {
                    mass.setText("");
                }
            }
        });
        accl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!accl.getText().toString().equals("")) {
                    accl.setText("");
                }
            }
        });
        taim.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!taim.getText().toString().equals("")) {
                    taim.setText("");
                }
            }
        });


        calc1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!mass.getText().toString().equals("")&&taim.getText().toString().equals("")&&!accl.getText().toString().equals("")) {
                    String accla=accl.getText().toString();
                    String massa=mass.getText().toString();
                    taim.setText(String.valueOf(Double.parseDouble(massa)*Double.parseDouble(accla)));
                }

                else if (accl.getText().toString().equals("")&&!taim.getText().toString().equals("")&&!mass.getText().toString().equals("")) {
                    String massa=mass.getText().toString();
                    String taima=taim.getText().toString();
                    accl.setText(String.valueOf(Double.parseDouble(taima)/Double.valueOf(massa)));
                }

                else if (!taim.getText().toString().equals("")&&mass.getText().toString().equals("")&&!accl.getText().toString().equals("")) {
                    String taima=taim.getText().toString();
                    String accla=accl.getText().toString();
                    mass.setText(String.valueOf(Double.parseDouble(taima)/Double.parseDouble(accla)));
                }


            }
        });
        forc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!forc.getText().toString().equals("")) {
                    forc.setText("");
                }
            }
        });
        displ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!displ.getText().toString().equals("")) {
                    displ.setText("");
                }
            }
        });
        work.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!work.getText().toString().equals("")) {
                    work.setText("");
                }
            }
        });


        calc2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!forc.getText().toString().equals("")&&work.getText().toString().equals("")&&!displ.getText().toString().equals("")) {
                    String displa=displ.getText().toString();
                    String forca=forc.getText().toString();
                    work.setText(String.valueOf(Double.parseDouble(forca)*Double.parseDouble(displa)));
                }

                else if (displ.getText().toString().equals("")&&!work.getText().toString().equals("")&&!forc.getText().toString().equals("")) {
                    String forca=forc.getText().toString();
                    String worka=work.getText().toString();
                    displ.setText(String.valueOf(Double.parseDouble(worka)/Double.valueOf(forca)));
                }

                else if (!work.getText().toString().equals("")&&forc.getText().toString().equals("")&&!displ.getText().toString().equals("")) {
                    String worka=work.getText().toString();
                    String displa=displ.getText().toString();
                    forc.setText(String.valueOf(Double.parseDouble(worka)/Double.parseDouble(displa)));
                }


            }
        });

        volt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!volt.getText().toString().equals("")) {
                    volt.setText("");
                }
            }
        });
        curr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!curr.getText().toString().equals("")) {
                    curr.setText("");
                }
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!power.getText().toString().equals("")) {
                    power.setText("");
                }
            }
        });


        calc3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!volt.getText().toString().equals("")&&power.getText().toString().equals("")&&!curr.getText().toString().equals("")) {
                    String curra=curr.getText().toString();
                    String volta=volt.getText().toString();
                    power.setText(String.valueOf(Double.parseDouble(volta)*Double.parseDouble(curra)));
                }

                else if (curr.getText().toString().equals("")&&!power.getText().toString().equals("")&&!volt.getText().toString().equals("")) {
                    String volta=volt.getText().toString();
                    String powera=power.getText().toString();
                    curr.setText(String.valueOf(Double.parseDouble(powera)/Double.valueOf(volta)));
                }

                else if (!power.getText().toString().equals("")&&volt.getText().toString().equals("")&&!curr.getText().toString().equals("")) {
                    String powera=power.getText().toString();
                    String curra=curr.getText().toString();
                    volt.setText(String.valueOf(Double.parseDouble(powera)/Double.parseDouble(curra)));
                }



            }
        });
        mass2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!mass2.getText().toString().equals("")) {
                    mass2.setText("");
                }
            }
        });
        velo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!velo.getText().toString().equals("")) {
                    velo.setText("");
                }
            }
        });
        kine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!kine.getText().toString().equals("")) {
                    kine.setText("");
                }
            }
        });


        calc4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!mass2.getText().toString().equals("")&&kine.getText().toString().equals("")&&!velo.getText().toString().equals("")) {
                    String veloa=velo.getText().toString();
                    String mass2a=mass2.getText().toString();
                    kine.setText(String.valueOf(0.5*Double.parseDouble(mass2a)*Double.parseDouble(veloa)*Double.parseDouble(veloa)));
                }

                else if (velo.getText().toString().equals("")&&!kine.getText().toString().equals("")&&!mass2.getText().toString().equals("")) {
                    String mass2a=mass2.getText().toString();
                    String kinea=kine.getText().toString();
                    velo.setText(String.valueOf(Math.sqrt(2*Double.parseDouble(kinea)/Double.valueOf(mass2a))));
                }

                else if (!kine.getText().toString().equals("")&&mass2.getText().toString().equals("")&&!velo.getText().toString().equals("")) {
                    String kinea=kine.getText().toString();
                    String veloa=velo.getText().toString();
                    mass2.setText(String.valueOf(2*Double.parseDouble(kinea)/(Double.parseDouble(veloa)*Double.parseDouble(veloa))));
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
