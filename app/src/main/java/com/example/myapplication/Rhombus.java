package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Rhombus extends AppCompatActivity {

    EditText e;
    Button b;

    TextView Ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);

        e = findViewById(R.id.s);
        b = findViewById(R.id.btn);
        Ans = findViewById(R.id.ans);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatePerimeter();
            }

            private void calculatePerimeter() {
                try{
                    int sideLength = Integer.parseInt(e.getText().toString());
                    int perimeter = 4*sideLength;
                    Ans.setText("Perimeter :" + perimeter);
                }catch (NumberFormatException e){
                    Ans.setText("Please enter a valid number");
                }
            }
        });
    }
}
