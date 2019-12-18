package com.example.uneb;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.nfc.Tag;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import static java.lang.Character.UnicodeScript.COMMON;

public class MainActivity extends AppCompatActivity {
Button Ple;
Button pleresults;
Button moreapps;

    private ScaleGestureDetector mScaleGestureDetector;

    private float mScaleFactor = 1.0f;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
                 break;
            case R.id.share:
                Intent intentInvite = new Intent(Intent.ACTION_SEND);
                intentInvite.setType("text/plain");
                String body = "Link to your app";
                String subject = "Your Subject";
                intentInvite.putExtra(Intent.EXTRA_SUBJECT, subject);
                intentInvite.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(intentInvite, "Share using"));
                break;
            case R.id.exit:
                this.finish();
                break;

                case  R.id.aboutus:
                    showAlertDialog();
                    break;
            case R.id.contactus:

                break;
        }

        return super.onOptionsItemSelected(item);

    }

private void showAlertDialog(){
        final AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setMessage("This applicaion was developed by Bazirakye Tonny Mubangizi and Baraka Mark Bright. Great inspiration from Buyondo vale. All students of Muni University pursuing a degree in information technology");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
}

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        mScaleGestureDetector.onTouchEvent(motionEvent);

        return true;
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


            setContentView(R.layout.activity_main);
        Ple=(Button)findViewById(R.id.buttonple);
        Ple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, pleactivity.class);
                startActivity(i);
            }                     
        });
}
        }



