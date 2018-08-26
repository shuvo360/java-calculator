package com.example.kshuv.homework814;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener{
    private Button sub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        sub2=(Button)findViewById(R.id.sub2);
        sub2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.sub2){
            Toast.makeText(this,"Succesfully registarterd",Toast.LENGTH_SHORT).show();
        }
    }
}
