  package com.example.user.mysqldemo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

  public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    EditText UsernameEt,PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenHome();
            }
        });
        UsernameEt = (EditText)findViewById(R.id.etUserName);
        PasswordEt = (EditText)findViewById(R.id.etPassword);

    }

    public void OnLogin(View view) {
        String usernmae = UsernameEt.getText().toString();
        String password = UsernameEt.getText().toString();
        String type ="login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,usernmae,password);
    }

    public void OpenReg(View view){
        startActivity(new Intent(this,Register.class));
    }

    public void OpenHome(){
        startActivity(new Intent(this,Home.class));

    }








}
