package com.example.elton.basiccalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Addition, Subtraction, Multiplication, Division;
    private EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addition = (Button) findViewById(R.id.btnadd);
        Subtraction = (Button) findViewById(R.id.btnsub);
        Multiplication = (Button) findViewById(R.id.btnmul);
        Division = (Button) findViewById(R.id.btndiv);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Addition.setBackgroundColor(Color.BLUE);

                if (et1.getText().toString().equals("") || et2.getText().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter some details", Toast.LENGTH_SHORT).show();
                } else {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1+a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("") || et2.getText().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter some details", Toast.LENGTH_SHORT).show();
                } else {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 - a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("") || et2.getText().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter some details", Toast.LENGTH_SHORT).show();
                } else {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 * a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("")||et2.getText().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter some details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 / a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });
    }
}






