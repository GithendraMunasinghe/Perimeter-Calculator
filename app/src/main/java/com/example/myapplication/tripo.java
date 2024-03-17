package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tripo extends AppCompatActivity {

    EditText z1;
    EditText z2;
    EditText z3;
    EditText z4;
    Button btz;
    TextView tz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripo);

        z1 = findViewById(R.id.ez1);
        z2 = findViewById(R.id.ez2);
        z3 = findViewById(R.id.ez3);
        z4 = findViewById(R.id.ez4);
        btz = findViewById(R.id.btnz);
        tz = findViewById(R.id.ansz);


        btz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                calculatePerimeter();


            }

            private void calculatePerimeter() {
                try{
                    Double sideL = Double.parseDouble(z1.getText().toString());
                    Double sideR = Double.parseDouble(z2.getText().toString());
                    Double base = Double.parseDouble(z3.getText().toString());
                    Double up = Double.parseDouble(z4.getText().toString());
                    Double perimeter = (sideR+sideL+base+up);
                    tz.setText("Perimeter :" + perimeter);
                }catch (NumberFormatException e){
                    tz.setText("Please enter a valid number");
                }
            }
        });
    }
}
