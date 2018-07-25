package com.example.user.mysqldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {
    private CardView MyAccount,StartLearning,WordCard,Previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        MyAccount =(CardView) findViewById(R.id.MyAccountID);
        StartLearning =(CardView) findViewById(R.id.StartLearnigID);
        WordCard =(CardView) findViewById(R.id.WordCardID);
        Previous =(CardView) findViewById(R.id.PreviousID);

        MyAccount.setOnClickListener(this);
        StartLearning.setOnClickListener(this);
        WordCard.setOnClickListener(this);
        Previous.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.MyAccountID: i = new Intent(this, Myaccount.class);startActivity(i);break;
            case R.id.StartLearnigID: i = new Intent(this, Startlearning.class);startActivity(i);break;
            case R.id.WordCardID: i = new Intent(this,WordCard.class);startActivity(i);break;
            case R.id.PreviousID:i = new Intent(this,Previous.class);startActivity(i);break;
            default:break;
        }
    }
}
