package com.example.buttomnav;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.app.Activity;

public class BottomNavigationHelper extends LinearLayout {

    private BottomNavigationView bottomNavigationView;

    public BottomNavigationHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BottomNavigationHelper(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_bottom_nav, this, true);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
    }

    public void setup(final Activity activity, int selectedItemId,
                      final Class<?> homeActivity,
                      final Class<?> profileActivity,
                      final Class<?> settingsActivity) {

        bottomNavigationView.setSelectedItemId(selectedItemId);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_home && selectedItemId != R.id.nav_home) {
                activity.startActivity(new Intent(activity, homeActivity));
                activity.overridePendingTransition(0, 0);
                return true;
            } else if (id == R.id.nav_profile && selectedItemId != R.id.nav_profile) {
                activity.startActivity(new Intent(activity, profileActivity));
                activity.overridePendingTransition(0, 0);
                return true;
            } else if (id == R.id.nav_settings && selectedItemId != R.id.nav_settings) {
                activity.startActivity(new Intent(activity, settingsActivity));
                activity.overridePendingTransition(0, 0);
                return true;
            }
            return true;
        });
    }
}

