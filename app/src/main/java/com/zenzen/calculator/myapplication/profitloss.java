package com.zenzen.calculator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class profitloss extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profitandloss);

        Button calc=(Button)findViewById(R.id.button24);
        final EditText costpr=(EditText)findViewById(R.id.editText);
        final EditText sellpr=(EditText)findViewById(R.id.editText2);
        final EditText numbitem=(EditText)findViewById(R.id.editText3);
        final EditText profit=(EditText)findViewById(R.id.editText4);
        final TextView anss=(TextView)findViewById(R.id.textView36);

        costpr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!costpr.getText().toString().equals("")) {
                    costpr.setText("");
                }
            }
        });
        sellpr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!sellpr.getText().toString().equals("")) {
                    sellpr.setText("");
                }
            }
        });
        numbitem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!numbitem.getText().toString().equals("")) {
                    numbitem.setText("");
                }
            }
        });
        profit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!profit.getText().toString().equals("")) {
                    profit.setText("");
                }
            }
        });
        final TextView tv4=(TextView)findViewById(R.id.textView4);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (costpr.getText().toString().equals("")&&!profit.getText().toString().equals("")&&!numbitem.getText().toString().equals("")&&!sellpr.getText().toString().equals("")) {
                    String sellpra=sellpr.getText().toString();
                    String numbitema=numbitem.getText().toString();
                    String profita=profit.getText().toString();
                    costpr.setText(String.valueOf(Double.parseDouble(sellpra)-Double.parseDouble(profita)/Double.parseDouble(numbitema)));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (sellpr.getText().toString().equals("")&&!profit.getText().toString().equals("")&&!numbitem.getText().toString().equals("")&&!costpr.getText().toString().equals("")) {
                    String costpra=costpr.getText().toString();
                    String numbitema=numbitem.getText().toString();
                    String profita=profit.getText().toString();
                    sellpr.setText(String.valueOf(Double.parseDouble(costpra)+Double.parseDouble(profita)/Double.parseDouble(numbitema)));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (numbitem.getText().toString().equals("")&&!profit.getText().toString().equals("")&&!costpr.getText().toString().equals("")&&!sellpr.getText().toString().equals("")) {
                    String costpra=costpr.getText().toString();
                    String sellpra=sellpr.getText().toString();
                    String profita=profit.getText().toString();
                    numbitem.setText(String.valueOf(Double.parseDouble(profita)/(Double.parseDouble(sellpra)-Double.parseDouble(costpra))));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                if (profit.getText().toString().equals("")&&!costpr.getText().toString().equals("")&&!numbitem.getText().toString().equals("")&&!sellpr.getText().toString().equals("")) {
                    String costpra=costpr.getText().toString();
                    String sellpra=sellpr.getText().toString();
                    String numbitema=numbitem.getText().toString();
                    profit.setText(String.valueOf((Double.parseDouble(sellpra)-Double.parseDouble(costpra))*Double.parseDouble(numbitema)));
                }
                else {
                    tv4.setText("Please fill up exactly three of the four fields");
                }
                String costpra=costpr.getText().toString();
                String profita=profit.getText().toString();
                Double perc=Double.parseDouble(costpra)/Double.parseDouble(profita)*100;
                String ansa="Profit percent : "+ String.valueOf(perc)+"%";
                anss.setText(ansa);
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(getApplicationContext(), Finmenu.class);

        finish();
        startActivity(intent);
    }
}
