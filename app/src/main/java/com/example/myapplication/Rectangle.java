package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Rectangle extends AppCompatActivity {
    EditText r1;
    EditText r2;
    Button br;
    TextView tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        r1 = findViewById(R.id.er1);
        r2 = findViewById(R.id.er2);
        br = findViewById(R.id.btnre);
        tr = findViewById(R.id.ansre);


        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                calculatePerimeter();


            }

            private void calculatePerimeter() {
                try{
                    Double sideLength = Double.parseDouble(r1.getText().toString());
                    Double sidewidth = Double.parseDouble(r2.getText().toString());
                    Double perimeter = (sidewidth+sideLength)*2;
                    tr.setText("Perimeter :" + perimeter);
                }catch (NumberFormatException e){
                    tr.setText("Please enter a valid number");
                }
            }
        });

    }
}
