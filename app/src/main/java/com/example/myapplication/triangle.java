package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangle extends AppCompatActivity {

    EditText tr1;
    EditText tr2;
    EditText tr3;
    Button btr;
    TextView ttr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        tr1 = findViewById(R.id.etr1);
        tr2 = findViewById(R.id.etr2);
        tr3 = findViewById(R.id.etr3);
        btr = findViewById(R.id.btntr);
        ttr = findViewById(R.id.anstr);


        btr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                calculatePerimeter();


            }

            private void calculatePerimeter() {
                try{
                    Double sideLength = Double.parseDouble(tr1.getText().toString());
                    Double sidewidth = Double.parseDouble(tr2.getText().toString());
                    Double base = Double.parseDouble(tr3.getText().toString());
                    Double perimeter = (sidewidth+sideLength+base);
                    ttr.setText("Perimeter :" + perimeter);
                }catch (NumberFormatException e){
                    ttr.setText("Please enter a valid number");
                }
            }
        });

    }
}
