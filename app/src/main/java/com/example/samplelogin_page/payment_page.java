package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class payment_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_payment_page);
    }
}