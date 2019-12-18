package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sci2017activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci2017activity);
        getSupportActionBar().setTitle("Science 2017");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
