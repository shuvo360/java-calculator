package com.example.kshuv.homework814;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    EditText number1,number2;
    TextView result;
    Button sum,subtract,multiple,divide;

    float ch;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        number1=(EditText) findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);
        result=(TextView) findViewById(R.id.result);
        sum=(Button) findViewById(R.id.sum);
        subtract=(Button) findViewById(R.id.subtract);
        multiple=(Button) findViewById(R.id.multiple);
        divide=(Button) findViewById(R.id.divide);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                ch=num1+num2;
                result.setText(String.valueOf(ch));

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                ch=num1-num2;
                result.setText(String.valueOf(ch));

            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                ch=num1*num2;
                result.setText(String.valueOf(ch));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                ch=num1/num2;
                result.setText(String.valueOf(ch));

            }
        });
    }
}
