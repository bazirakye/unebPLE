package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class eng2004activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng2004activity);
        getSupportActionBar().setTitle("English 2004");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
