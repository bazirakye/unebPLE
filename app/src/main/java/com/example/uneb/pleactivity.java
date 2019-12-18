package com.example.uneb;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.app.Activity;
public class pleactivity extends AppCompatActivity {

  Button Sst;
  Button Sci;
  Button Eng;
  Button Math;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pleactivity);
    Math=(Button)findViewById(R.id.buttonmath);
    getSupportActionBar().setTitle("PLE subjects");
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);

    Math.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        PopupMenu popupMenu= new PopupMenu(pleactivity.this, Math);
        popupMenu.getMenuInflater().inflate(R.menu.menumath, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
          @Override
          public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
              case R.id.p2017:
                Intent i1 = new Intent(pleactivity.this, math2017activity.class);
                startActivity(i1);
                break;
              case R.id.p2016:
                Intent i2 = new Intent(pleactivity.this, math2016.class);
                startActivity(i2);
                break;
              case R.id.p2015:
                Intent i3 = new Intent(pleactivity.this, math2015activity.class);
                startActivity(i3);
                break;
              case R.id.p2014:
                Intent i4 = new Intent(pleactivity.this, math2014actictivity.class);
                startActivity(i4);
                break;
              case R.id.p2013:
                Intent i5 = new Intent(pleactivity.this, math2013activity.class);
                startActivity(i5);
                break;

            }
            return true;
          }
        });
        popupMenu.show();
      }
    });


    Eng=(Button)findViewById(R.id.buttoneng);
    Eng.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        PopupMenu popupMenu= new PopupMenu(pleactivity.this, Eng);
        popupMenu.getMenuInflater().inflate(R.menu.menueng, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
          @Override
          public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
              case R.id.p2017:
                Intent i1 = new Intent(pleactivity.this, eng2017activity.class);
                startActivity(i1);
                break;
              case R.id.p2016:
                Intent i2 = new Intent(pleactivity.this, eng2016activity.class);
                startActivity(i2);
                break;
              case R.id.p2015:
                Intent i3 = new Intent(pleactivity.this, eng2015activity.class);
                startActivity(i3);
                break;
              case R.id.p2014:
                Intent i4 = new Intent(pleactivity.this, eng2014activity.class);
                startActivity(i4);
                break;
              case R.id.p2013:
                Intent i5 = new Intent(pleactivity.this, eng2013activity.class);
                startActivity(i5);
                break;

              case R.id.p2011:
                Intent i6 = new Intent(pleactivity.this, eng2011activity.class);
                startActivity(i6);
                break;
              case R.id.p2009:
                Intent i7 = new Intent(pleactivity.this, eng2009activity.class);
                startActivity(i7);
                break;
              case R.id.p2008:
                Intent i8 = new Intent(pleactivity.this, eng2008activity.class);
                startActivity(i8);
                break;
              case R.id.p2007:
                Intent i9 = new Intent(pleactivity.this, eng2007activity.class);
                startActivity(i9);
                break;
              case R.id.p2006:
                Intent i10 = new Intent(pleactivity.this, eng2006activity.class);
                startActivity(i10);
                break;
              case R.id.p2005:
                Intent i11 = new Intent(pleactivity.this, eng2005activity.class);
                startActivity(i11);
                break;
              case R.id.p2004:
                Intent i12 = new Intent(pleactivity.this, eng2004activity.class);
                startActivity(i12);
                break;
              case R.id.p2003:
                Intent i13 = new Intent(pleactivity.this, eng2003activity.class);
                startActivity(i13);
                break;
              case R.id.p2002:
                Intent i14 = new Intent(pleactivity.this, eng2002activity.class);
                startActivity(i14);
                break;
              case R.id.p2001:
                Intent i15 = new Intent(pleactivity.this, eng2001activity.class);
                startActivity(i15);
                break;
              case R.id.p2000:
                Intent i16 = new Intent(pleactivity.this, eng2000activity.class);
                startActivity(i16);
                break;
              case R.id.p1999:
                Intent i17 = new Intent(pleactivity.this, eng1999activity.class);
                startActivity(i17);
                break;
              case R.id.p1998:
                Intent i18 = new Intent(pleactivity.this, eng1998activity.class);
                startActivity(i18);
                break;

            }
            return true;
          }
        });
        popupMenu.show();
      }
    });
    Sci=(Button)findViewById(R.id.buttonsci);
    Sci.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        PopupMenu popupMenu= new PopupMenu(pleactivity.this, Sci);
        popupMenu.getMenuInflater().inflate(R.menu.menusci, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
          @Override
          public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
              case R.id.p2017:
                Intent i1 = new Intent(pleactivity.this, sci2017activity.class);
                startActivity(i1);
                break;
              case R.id.p2016:
                Intent i2 = new Intent(pleactivity.this, sci2016activity.class);
                startActivity(i2);
                break;
              case R.id.p2015:
                Intent i3 = new Intent(pleactivity.this, sci2015activity.class);
                startActivity(i3);
                break;

              case R.id.p2014:
                Intent i4 = new Intent(pleactivity.this, sci2014activity.class);
                startActivity(i4);
                break;
              case R.id.p2009:
                Intent i5 = new Intent(pleactivity.this, sci2009activity.class);
                startActivity(i5);
                break;
              case R.id.p2008:
                Intent i6 = new Intent(pleactivity.this, sci2008activity.class);
                startActivity(i6);
                break;
              case R.id.p2007:
                Intent i7 = new Intent(pleactivity.this, sci2007activity.class);
                startActivity(i7);
                break;
              case R.id.p2006:
                Intent i8 = new Intent(pleactivity.this, sci2006activity.class);
                startActivity(i8);
                break;
              case R.id.p2005:
                Intent i9 = new Intent(pleactivity.this, sci2005activity.class);
                startActivity(i9);
                break;
              case R.id.p2004:
                Intent i10 = new Intent(pleactivity.this, sci2004activity.class);
                startActivity(i10);
                break;
              case R.id.p2003:
                Intent i11 = new Intent(pleactivity.this, sci2003activity.class);
                startActivity(i11);
                break;
              case R.id.p2002:
                Intent i12 = new Intent(pleactivity.this, sci2002activity.class);
                startActivity(i12);
                break;
              case R.id.p2001:
                Intent i13 = new Intent(pleactivity.this, sci2001activity.class);
                startActivity(i13);
                break;
              case R.id.p2000:
                Intent i14 = new Intent(pleactivity.this, sci2000activity.class);
                startActivity(i14);
                break;
              case R.id.p1999:
                Intent i15 = new Intent(pleactivity.this, sci1999activity.class);
                startActivity(i15);
                break;
              case R.id.p1998:
                Intent i16 = new Intent(pleactivity.this, sci1998activity.class);
                startActivity(i16);
                break;

            }
            return true;
          }
        });
        popupMenu.show();
      }
    });
    Sst=(Button)findViewById(R.id.buttonsst);
    Sst.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        PopupMenu popupMenu= new PopupMenu(pleactivity.this, Sst);
        popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
          @Override
          public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
              case R.id.p1998:
                Intent i = new Intent(pleactivity.this, sst1998activity.class);
                startActivity(i);

                break;
              case R.id.p2017:
                Intent intent = new Intent(pleactivity.this, sst2017activity.class);
                startActivity(intent);

                break;

              case R.id.p2016:
                Intent it = new Intent(pleactivity.this, sst2016activity.class);
                startActivity(it);

                break;
              case R.id.p2015:
                Intent it2 = new Intent(pleactivity.this, sst2015activity.class);
                startActivity(it2);

                break;
              case R.id.p2014:
                Intent it3 = new Intent(pleactivity.this, sst2014activity.class);
                startActivity(it3);

                break;
              case R.id.p1999:
                Intent it4 = new Intent(pleactivity.this, sst1999.class);
                startActivity(it4);

                break;

              case R.id.p2000:
                Intent it5 = new Intent(pleactivity.this, sst2000activity.class);
                startActivity(it5);

                break;
              case R.id.p2001:
                Intent it6 = new Intent(pleactivity.this, sst2001activity.class);
                startActivity(it6);

                break;
              case R.id.p2002:
                Intent it7 = new Intent(pleactivity.this, sst2002activity.class);
                startActivity(it7);

                break;
              case R.id.p2003:
                Intent it8 = new Intent(pleactivity.this, sst2003activity.class);
                startActivity(it8);

                break;
              case R.id.p2004:
                Intent it9 = new Intent(pleactivity.this, sst2004activity.class);
                startActivity(it9);

                break;
              case R.id.p2005:
                Intent it10 = new Intent(pleactivity.this, sst2005activity.class);
                startActivity(it10);

                break;
              case R.id.p2006:
                Intent it11= new Intent(pleactivity.this, sst2006activity.class);
                startActivity(it11);

                break;
              case R.id.p2007:
                Intent it12= new Intent(pleactivity.this, sst2007activity.class);
                startActivity(it12);

                break;
              case R.id.p2008:
                Intent it13= new Intent(pleactivity.this, sst2008activity.class);
                startActivity(it13);

                break;
              case R.id.p2009:
                Intent it14= new Intent(pleactivity.this, sst2009activity.class);
                startActivity(it14);

                break;


            }
            return true;
          }
        });
        popupMenu.show();
      }
    });
  }
}

