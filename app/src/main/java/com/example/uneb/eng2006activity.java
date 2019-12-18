package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class eng2006activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng2006activity);
        getSupportActionBar().setTitle("English 2006");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
