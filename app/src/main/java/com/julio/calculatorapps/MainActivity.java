package com.julio.calculatorapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1;
    private EditText etNumber2;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiple;
    private Button btnDivided;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiple = findViewById(R.id.btnMultiple);
        btnDivided = findViewById(R.id.btnDivided);
        tvResult = findViewById(R.id.tvResult);
    }

    public void plus(View view) {
        String number1 = etNumber1.getText().toString();
        String number2 = etNumber2.getText().toString();

        double result = Double.parseDouble(number1) + Double.parseDouble(number2);
        tvResult.setText(String.valueOf(result));
    }

    public void minus(View view) {
        String number1 = etNumber1.getText().toString();
        String number2 = etNumber2.getText().toString();

        double result = Double.parseDouble(number1) - Double.parseDouble(number2);
        tvResult.setText(String.valueOf(result));
    }

    public void multiple(View view) {
        String number1 = etNumber1.getText().toString();
        String number2 = etNumber2.getText().toString();

        double result = Double.parseDouble(number1) * Double.parseDouble(number2);
        tvResult.setText(String.valueOf(result));
    }

    public void divided(View view) {
        String number1 = etNumber1.getText().toString();
        String number2 = etNumber2.getText().toString();

        double result = Double.parseDouble(number1) / Double.parseDouble(number2);
        tvResult.setText(String.valueOf(result));
    }
}