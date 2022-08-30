package com.example.calculatorofficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button goToActivityTwo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToActivityTwo = findViewById((R.id.activity_main_goToActivityTwo));
        goToActivityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                changeActivity();

            }
        });
    }

    private void changeActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }
    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 - num2;

        numberSumTV.setText("" + sum);
    }
    public void findMult(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 * num2;

        numberSumTV.setText("" + sum);
    }
    public void findQuo(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 / num2;

        numberSumTV.setText("" + sum);
    }

}