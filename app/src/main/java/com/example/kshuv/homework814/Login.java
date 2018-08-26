package com.example.kshuv.homework814;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Button sub,reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sub=(Button) findViewById(R.id.sub);
        reg=(Button) findViewById(R.id.reg);
        sub.setOnClickListener(this);
        reg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.sub){
            Toast.makeText(this,"Successfully login",Toast.LENGTH_LONG).show();
        }
        if (view.getId()==R.id.reg){
            Intent cm= new Intent(this,Register.class);
            startActivity(cm);
        }
    }
}
