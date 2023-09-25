package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        EditText userFirstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText userSecondNumber = (EditText) findViewById(R.id.secondNumber);

        goToActivity(String.valueOf((Integer.parseInt(userFirstNumber.getText().toString())
                + Integer.parseInt(userSecondNumber.getText().toString()))));
    }

    public void subtract(View view){
        EditText userFirstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText userSecondNumber = (EditText) findViewById(R.id.secondNumber);

        goToActivity(String.valueOf((Integer.parseInt(userFirstNumber.getText().toString())
                - Integer.parseInt(userSecondNumber.getText().toString()))));
    }

    public void multiply(View view){
        EditText userFirstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText userSecondNumber = (EditText) findViewById(R.id.secondNumber);

        goToActivity(String.valueOf((Integer.parseInt(userFirstNumber.getText().toString())
                * Integer.parseInt(userSecondNumber.getText().toString()))));
    }

    public void divide(View view){
        EditText userFirstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText userSecondNumber = (EditText) findViewById(R.id.secondNumber);

        int secondNum = Integer.parseInt(userSecondNumber.getText().toString());

        if (secondNum != 0) {
            int result = Integer.parseInt(userFirstNumber.getText().toString()) / secondNum;
            goToActivity(String.valueOf(result));
        } else {
            goToActivity("Error: Division by zero");
        }
    }


    public void goToActivity(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }
}