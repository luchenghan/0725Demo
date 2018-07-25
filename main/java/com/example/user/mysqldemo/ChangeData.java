package com.example.user.mysqldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ChangeData extends AppCompatActivity {
    private Button btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_data);
        btnConfirm = (Button) findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Confirm();
            }
        });

        Spinner stGender = (Spinner) findViewById(R.id.SpinnerGender);
        Spinner stAge = (Spinner) findViewById(R.id.SpinnerAge);
        Spinner stAcadamic = (Spinner) findViewById(R.id.SpinnerAcadamid);

        ArrayAdapter<String> Gender = new ArrayAdapter<String>(ChangeData.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
        Gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stGender.setAdapter(Gender);


        ArrayAdapter<String> Age = new ArrayAdapter<String>(ChangeData.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Age));
        Age.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stAge.setAdapter(Age);


        ArrayAdapter<String> Acadamic = new ArrayAdapter<String>(ChangeData.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Acadamic));
        Acadamic.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stAcadamic.setAdapter(Acadamic);
    }

    public void Confirm(){
        Intent intent = new Intent(this,Myaccount.class);
        startActivity(intent);
    }
}
