package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class settingactivity extends AppCompatActivity {
    public ScrollView scroll;
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        super.onKeyUp(keyCode, event);
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP)
        {
            this.scroll= (ScrollView) findViewById(R.id.scrollview);
            scroll.isSmoothScrollingEnabled();
            scroll.arrowScroll(ScrollView.FOCUS_UP);
            return true;
        }
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)
        {
            this.scroll= (ScrollView) findViewById(R.id.scrollview);
            scroll.isSmoothScrollingEnabled();
            scroll.arrowScroll(ScrollView.FOCUS_DOWN);
            //Toast.makeText(sst2017activity.this,"Down working",Toast.LENGTH_SHORT).show();
            return true;
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingactivity);
        getSupportActionBar().setTitle("Settings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);





        Switch sw = (Switch) findViewById(R.id.switch_scroll);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                } else {
                    // The toggle is disabled
                    Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
