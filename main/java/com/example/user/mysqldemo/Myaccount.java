package com.example.user.mysqldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Myaccount extends AppCompatActivity {
    private Button btnPassword ,btnData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount);
        btnPassword = (Button)findViewById(R.id.btnPassword);
        btnData = (Button)findViewById(R.id.btnData);

        btnPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePassword();
            }
        });

        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changedata();
            }
        });


    }

    public void changePassword(){
        Intent intent = new Intent(this,ChangePassword.class);
        startActivity(intent);
    }

    public void changedata(){
        Intent intent = new Intent(this,ChangeData.class);
        startActivity(intent);
    }
}
