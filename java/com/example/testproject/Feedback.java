package com.example.testproject;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Feedback extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void startMain(View view){
        startActivity(new Intent(this, MainPage.class));
    }
}