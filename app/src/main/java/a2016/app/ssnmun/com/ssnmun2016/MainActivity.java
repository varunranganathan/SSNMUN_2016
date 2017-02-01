package a2016.app.ssnmun.com.ssnmun2016;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab.hide();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        Fragment fragment = new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
            fragmentManager.popBackStack();
        }
        fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
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
        getMenuInflater().inflate(R.menu.main, menu);
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
            WebView view = (WebView) LayoutInflater.from(this).inflate(R.layout.dialog_licenses, null);
            view.loadUrl("file:///android_asset/LICENSE-2.0.html");
            AlertDialog mAlertDialog = new AlertDialog.Builder(this, R.style.Theme_AppCompat_Light_Dialog_Alert)
                    .setTitle("Licenses")
                    .setView(view)
                    .setPositiveButton(android.R.string.ok, null)
                    .show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            Fragment fragment = new HomeFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
                fragmentManager.popBackStack();
            }
            fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
        } else if (id == R.id.nav_committee) {
            Fragment fragment = new CommitteeFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
                fragmentManager.popBackStack();
            }
            fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
        } else if (id == R.id.nav_applications) {
            Fragment fragment = new ApplicationsFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
                fragmentManager.popBackStack();
            }
            fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
        } else if (id == R.id.nav_contact) {
            Fragment fragment = new ContactFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
                fragmentManager.popBackStack();
            }
            fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
        } else if(id == R.id.nav_oc) {
            Fragment fragment = new OCFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
                fragmentManager.popBackStack();
            }
            fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
        } else if(id == R.id.nav_payment) {
            Fragment fragment = new PaymentFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
                fragmentManager.popBackStack();
            }
            fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
        } else if(id == R.id.nav_ip) {
            Fragment fragment = new IPFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
                fragmentManager.popBackStack();
            }
            fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
        } else if(id==R.id.nav_sponsors) {
            Fragment fragment = new SponsorFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            for(int i=0;i<fragmentManager.getBackStackEntryCount();i++) {
                fragmentManager.popBackStack();
            }
            fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
