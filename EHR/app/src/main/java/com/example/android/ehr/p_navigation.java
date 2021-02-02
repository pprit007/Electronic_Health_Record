package com.example.android.ehr;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class p_navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.p_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(p_navigation.this, OptionMain.class)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.demographics) {

            TextView d=(TextView)findViewById(R.id.textviewlogo) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);

            webView.loadUrl("http://prit.dx.am/hospital/hms/edit-profile2.php?mailid="+datacallclass.lemail);

            // Handle the camera action
        } else if (id == R.id.history) {
            TextView d=(TextView)findViewById(R.id.textviewlogo) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);

            webView.loadUrl("http://prit.dx.am/hospital/hms/doctor/displaymedicalhistory.php?mailid="+datacallclass.lemail);

        } else if (id == R.id.medication) {
            TextView d=(TextView)findViewById(R.id.textviewlogo) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);

            webView.loadUrl("http://prit.dx.am/hospital/hms/doctor/displaymedication.php?mailid="+datacallclass.lemail);

        } else if (id == R.id.allergies) {
            TextView d=(TextView)findViewById(R.id.textviewlogo) ;
           // d.setVisibility(View.GONE);
           // WebView webView = (WebView) findViewById(R.id.webviewdata);
          //  webView.setVisibility(View.VISIBLE);
          //  WebSettings webSettings = webView.getSettings();
          //  webSettings.setJavaScriptEnabled(true);
         //   webView.setVerticalScrollBarEnabled(true);

         //   webView.loadUrl("");

        } else if (id == R.id.radiology) {
            TextView d=(TextView)findViewById(R.id.textviewlogo) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);

            webView.loadUrl("http://prit.dx.am/hospital/hms/doctor/displayradioimage.php?mailid="+datacallclass.lemail);

        }else if (id == R.id.labtest) {
            TextView d=(TextView)findViewById(R.id.textviewlogo) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);

            webView.loadUrl("http://prit.dx.am/hospital/hms/doctor/displaylabtest.php?mailid="+datacallclass.lemail);

        }else if (id == R.id.QR) {
            TextView d=(TextView)findViewById(R.id.textviewlogo) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);

            webView.loadUrl("http://prit.dx.am/hospital/hms/edit-profile2.php?mailid="+datacallclass.lemail);

        } else if (id == R.id.changepassword)
    {
        TextView d=(TextView)findViewById(R.id.textviewlogo) ;
        d.setVisibility(View.GONE);
        WebView webView = (WebView) findViewById(R.id.webviewdata);
        webView.setVisibility(View.VISIBLE);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled(true);

        webView.loadUrl("http://prit.dx.am/hospital/hms/changepassword.php?"+datacallclass.lemail);
    }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
