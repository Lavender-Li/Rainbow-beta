package com.example.testproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class DetailActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private android.widget.TextView ColorNameTextView;
    private String colorname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);
        ColorNameTextView = findViewById(R.id.pixel_color_name);
        Intent cIntent = getIntent();
        colorname = cIntent.getStringExtra("colorname");
        ColorNameTextView.setText(colorname);
    }

    public void startDetection(View view){
        startActivity(new Intent(this, ColorDetectionActivity.class));
    }


}