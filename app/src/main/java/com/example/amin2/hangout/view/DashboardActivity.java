package com.example.amin2.hangout.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.amin2.hangout.R;
import com.example.amin2.hangout.map.MapsActivity;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton proBtns,signupBtns,settingBtns,cameraBts,homeBts,weatherBts,GallaryBts,nearbyBts,exitBts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        inti();




        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private void inti() {
        proBtns = (ImageButton)findViewById(R.id.proBtn);
        signupBtns = (ImageButton)findViewById(R.id.signupBtn);
        settingBtns = (ImageButton)findViewById(R.id.settingBtn);
        cameraBts = (ImageButton)findViewById(R.id.cameraBt);
        homeBts = (ImageButton)findViewById(R.id.homeBt);
        weatherBts = (ImageButton)findViewById(R.id.weatherBt);
        GallaryBts = (ImageButton)findViewById(R.id.GallaryBt);
        nearbyBts = (ImageButton)findViewById(R.id.nearbyBt);
        exitBts = (ImageButton)findViewById(R.id.exitBt);
        proBtns.setOnClickListener(this);
        signupBtns.setOnClickListener(this);
        settingBtns.setOnClickListener(this);
        cameraBts.setOnClickListener(this);
        homeBts.setOnClickListener(this);
        weatherBts.setOnClickListener(this);
        GallaryBts.setOnClickListener(this);
        exitBts.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.proBtn:
                Toast.makeText(this, "sdfsd", Toast.LENGTH_SHORT).show();

                break;
            case R.id.signupBtn:
                Toast.makeText(this, "sdfsd", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settingBtn:
                Intent intentsetting = new Intent(DashboardActivity.this,UserSettingActivity.class);
                startActivity(intentsetting);
                break;
            case R.id.cameraBt:
                Intent intentCamera= new Intent(DashboardActivity.this,cameraActivity.class);
                startActivity(intentCamera);
                break;
            case R.id.homeBt:
                Intent intenthome = new Intent(DashboardActivity.this,HomeActivity.class);
                startActivity(intenthome);
                break;
            case R.id.GallaryBt:
                Toast.makeText(this, "sdfsd", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nearbyBt:
                Intent intentNearBy= new Intent(DashboardActivity.this,MapsActivity.class);
                startActivity(intentNearBy);
                break;
            case R.id.exitBt:
                new AlertDialog.Builder(this)
                        .setTitle("Close App?")
                        .setMessage("Do you really want to close this app?")
                        .setPositiveButton("YES",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        android.os.Process.killProcess(android.os.Process.myPid());
                                    }
                                })
                        .setNegativeButton("NO",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                    }
                                }).show();
                break;



        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    item.setCheckable(true);
                    Intent intentHome= new Intent(DashboardActivity.this,HomeActivity.class);
                    startActivity(intentHome);
                    break;
                case R.id.navigation_dashboard:
                    item.setCheckable(true);
                    break;
                case R.id.navigation_camera:
                    item.setCheckable(true);
                    Intent intentCamera= new Intent(DashboardActivity.this,cameraActivity.class);
                    startActivity(intentCamera);
                    break;
                case R.id.navigation_weather:
                    item.setCheckable(true);
                    break;
                case R.id.navigation_nearby:
                    item.setCheckable(true);
                    Intent intentNearBy= new Intent(DashboardActivity.this,MapsActivity.class);
                    startActivity(intentNearBy);
                    break;
            }
            return false;
        }

    };


}
