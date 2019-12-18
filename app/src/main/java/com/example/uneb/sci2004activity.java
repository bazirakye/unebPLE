package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sci2004activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci2004activity);
        getSupportActionBar().setTitle("Science 2004");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
