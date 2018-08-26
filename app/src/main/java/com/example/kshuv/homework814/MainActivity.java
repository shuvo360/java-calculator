package com.example.kshuv.homework814;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button calculator,login,checkbox;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator=(Button) findViewById(R.id.calculator);
        login=(Button) findViewById(R.id.login);
        checkbox=(Button) findViewById(R.id.checkbox);
        img=(ImageView) findViewById(R.id.img);

        calculator.setOnClickListener(this);
        login.setOnClickListener(this);
        checkbox.setOnClickListener(this);
        img.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.img){
            Toast.makeText(this,"This is a image",Toast.LENGTH_LONG).show();
        }
        if (view.getId()==R.id.calculator){
            Intent cm= new Intent(this,Calculator.class);
            startActivity(cm);
        }
        if (view.getId()==R.id.login){
            Intent cm= new Intent(this,Login.class);
            startActivity(cm);
        }
        if (view.getId()==R.id.checkbox){
            Intent cm= new Intent(this,Checkbox.class);
            startActivity(cm);
        }

    }
}
