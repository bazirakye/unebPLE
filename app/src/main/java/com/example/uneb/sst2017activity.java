package com.example.uneb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class sst2017activity extends AppCompatActivity {
    private LinearLayout llScroll;
    private Bitmap bitmap;
    private MenuItem btn;
       private ScrollView scroll;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.small_menu, menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                Intent i1 = new Intent(sst2017activity.this, settingactivity.class);
                startActivity(i1);


                break;
        }
            return super.onOptionsItemSelected(item);
        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        llScroll = findViewById(R.id.llScroll);
        scroll=findViewById(R.id.scrollview);
         btn=findViewById(R.id.pdf);
        setContentView(R.layout.activity_sst2017activity);
        getSupportActionBar().setTitle("SST 2017");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        super.onKeyUp(keyCode, event);
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP)
        {
          this.scroll= (ScrollView) findViewById(R.id.scrollview);
          scroll.isSmoothScrollingEnabled();
          scroll.arrowScroll(ScrollView.FOCUS_UP);
           // Toast.makeText(sst2017activity.this,"Up working",Toast.LENGTH_SHORT).show();
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


}
