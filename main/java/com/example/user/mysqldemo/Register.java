package com.example.user.mysqldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText name,password,email,id,gender,age,academic;
    String str_name,str_password,str_email,str_id,str_gender,str_age,str_academic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText)findViewById(R.id.et_name);
        password = (EditText)findViewById(R.id.et_password);
        email = (EditText)findViewById(R.id.et_email);
        id = (EditText)findViewById(R.id.et_id);
        gender = (EditText)findViewById(R.id.et_gender);
        age = (EditText)findViewById(R.id.et_age);
        academic = (EditText)findViewById(R.id.et_academic);

    }

       public void OnReg(View view){
           String str_name = name.getText().toString();
           String str_password = password.getText().toString();
           String str_email = email.getText().toString();
           String str_id = id.getText().toString();
           String str_gender = gender.getText().toString();
           String str_age = age.getText().toString();
           String str_academic = academic.getText().toString();
           String type ="register";
           BackgroundWorker backgroundWorker = new BackgroundWorker(this);
           backgroundWorker.execute(type,str_name,str_password,str_email,str_id,str_gender,str_age,str_academic);
       }
}
