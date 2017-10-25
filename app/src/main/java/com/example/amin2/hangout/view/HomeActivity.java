package com.example.amin2.hangout.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.amin2.hangout.R;
import com.example.amin2.hangout.map.MapsActivity;

public class HomeActivity extends AppCompatActivity {
    private Activity camera;
    private TextView mTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    break;
                case R.id.navigation_dashboard:
                    Intent intentDashboard= new Intent(HomeActivity.this,DashboardActivity.class);
                    startActivity(intentDashboard);
                    break;
                case R.id.navigation_camera:
                    Intent intentCamera= new Intent(HomeActivity.this,cameraActivity.class);
                    startActivity(intentCamera);
                    break;
                case R.id.navigation_weather:
                    break;
                case R.id.navigation_nearby:
                    Intent intentNearBy= new Intent(HomeActivity.this,MapsActivity.class);
                    startActivity(intentNearBy);
                    break;
            }
            return false;
        }

    };

}
