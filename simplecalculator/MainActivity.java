package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText btn1,btn2;
    TextView textbtn1;
    Button PlusButton;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        textbtn1 = findViewById(R.id.textbtn1);
        PlusButton = findViewById(R.id.PlusButton);

    }

    public void sum(View view) {
        float n1=Float.parseFloat(btn1.getText().toString());
        float n2=Float.parseFloat(btn2.getText().toString());
        float s=n1+n2;
        textbtn1.setText(Float.toString(s));


    }

    public void Sub(View view) {
        float n1=Float.parseFloat(btn1.getText().toString());
        float n2=Float.parseFloat(btn2.getText().toString());
        float s = n1 - n2;
        textbtn1.setText(Float.toString(s));

    }

    public void Div(View view) {
        float n1=Float.parseFloat(btn1.getText().toString());
        float n2=Float.parseFloat(btn2.getText().toString());
        float s=n1/n2;
        textbtn1.setText(Float.toString(s));


    }


    public void Mul(View view) {
        float n1=Float.parseFloat(btn1.getText().toString());
        float n2=Float.parseFloat(btn2.getText().toString());
        float s=n1*n2;
        textbtn1.setText(Float.toString(s));


    }



}