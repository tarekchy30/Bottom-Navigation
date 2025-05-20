package com.tkchy.bottomnavtkchy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tkchy.buttomnav.BottomNavigationHelper;


public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationHelper bottomNav = findViewById(R.id.bottom_navigation_helper);
        bottomNav.setup(this,
                R.id.nav_home,
                HomeActivity.class,
                ProfileActivity.class,
                SettingsActivity.class
        );
    }
}
