package com.example.myapplication;
import static java.lang.Math.PI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {

    EditText c;
    Button i ;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        c = findViewById(R.id.c);
        i = findViewById(R.id.btnc);
        t = findViewById(R.id.ansc);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatePerimeter();
            }

            private void calculatePerimeter() {
                try {
                    double radius = Double.parseDouble(c.getText().toString());
                    double perimeter = 2*PI*radius;
                    t.setText("Perimeter : " + perimeter);
                }catch (NumberFormatException c){
                    t.setText("Please Enter a valid Number");
                }
            }
        });
    }
}