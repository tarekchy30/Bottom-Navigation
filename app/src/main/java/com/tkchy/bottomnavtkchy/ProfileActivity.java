package com.tkchy.bottomnavtkchy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tkchy.buttomnav.BottomNavigationHelper;


public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationHelper bottomNav = findViewById(R.id.bottom_navigation_helper);
        bottomNav.setup(this,
                R.id.nav_profile,
                HomeActivity.class,
                ProfileActivity.class,
                SettingsActivity.class
        );
    }
}
