package com.noor.myrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {


    //duration of splash screen in mile second
    private static int SplashTimeOut=2000; //in mile seconds
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        actionBar =getSupportActionBar();
        actionBar.hide();


        //Post delayed for main activity
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                //After 4 seconds ,start this activity
                Intent intent=new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(intent);

                //closing this activity.
                finish();

            }
        }, SplashTimeOut);
    }
}
