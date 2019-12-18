package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sci1999activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci1999activity);
        getSupportActionBar().setTitle("Science 1999");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
