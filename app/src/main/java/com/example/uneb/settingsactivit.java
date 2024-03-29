package com.example.uneb;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.CompoundButton;
import android.widget.Switch;

public class settingsactivit extends AppCompatActivity {
private Switch myswitch ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
setTheme(R.style.darkness);
        }
        else{
            setTheme(R.style.light);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingsactivit);
        setContentView(R.layout.activity_sst2017activity);
        myswitch=(Switch)findViewById(R.id.myswitch);
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            myswitch.setChecked(true);
        }
        myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    restartApp();
                }
                else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    restartApp();
                }
            }
        });
    }
    public void restartApp(){
        Intent i = new Intent(getApplicationContext(), Settings.class);
        startActivity(i);
        finish();
    }
}
