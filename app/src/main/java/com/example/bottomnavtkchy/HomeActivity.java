package com.example.bottomnavtkchy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.buttomnav.BottomNavigationHelper;
import com.example.myapplication.R;

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
