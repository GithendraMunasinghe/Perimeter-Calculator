package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Parrallegram extends AppCompatActivity {
    EditText p1;
    EditText p2;
    Button bp;
    TextView tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parrallegram);

        p1 = findViewById(R.id.ep1);
        p2 = findViewById(R.id.ep2);
        bp = findViewById(R.id.btnp);
        tp = findViewById(R.id.ansp);


        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                calculatePerimeter();


            }

            private void calculatePerimeter() {
                try{
                    Double sideLength = Double.parseDouble(p1.getText().toString());
                    Double sidewidth = Double.parseDouble(p2.getText().toString());
                    Double perimeter = (sidewidth+sideLength)*2;
                    tp.setText("Perimeter :" + perimeter);
                }catch (NumberFormatException e){
                    tp.setText("Please enter a valid number");
                }
            }
        });
    }
}
