package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sst2004activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sst2004activity);
        getSupportActionBar().setTitle("SST 2004");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
