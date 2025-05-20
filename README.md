# BottomNavigationLib

A reusable BottomNavigationView Android library for switching between activities.

## How to Use

1. Add the module to your project.
2. In your layout XML:

```xml
<com.example.bottomnavlib.BottomNavigationHelper
    android:id="@+id/bottom_navigation_helper"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />


3. In Your Activity : 
BottomNavigationHelper nav = findViewById(R.id.bottom_navigation_helper);
nav.setup(this, R.id.nav_profile, HomeActivity.class, ProfileActivity.class, SettingsActivity.class);

