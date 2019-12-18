package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sst2015activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sst2015activity);
        getSupportActionBar().setTitle("SST 2015");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
