## ✨ Features
- 🔄 Activity/Fragment navigation
- 🎨 Customizable colors and styles
- 🔔 Badge notifications
- 🌙 Dark/Light theme support
- ⚡ Smooth animations

## Bottom Navigation Demo:


https://github.com/user-attachments/assets/3e604025-7adb-4efd-af07-6bb1204ee574

## 📥 Installation

### Gradle (JitPack)
```groovy
// Project-level build.gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

## App Level (gradle.build)
```groovy
// App-level build.gradle
dependencies {
     implementation 'com.github.tarekchy30:Bottom-Navigation:1.0.0'
}

```

## 💻 Usage
   XML Layout
```groovy
<com.tkchy.buttomnav.BottomNavigationHelper
    android:id="@+id/bottomNav"
    android:layout_width="match_parent"
    android:layout_height="56dp"
    app:menu="@menu/nav_menu"
    app:activeColor="#FF5722"/>

```

## Java Code
```groovy
BottomNavigationHelper bottomNav = findViewById(R.id.bottom_navigation_helper);
bottomNav.setup(this,
     R.id.nav_home,
     HomeActivity.class,
     ProfileActivity.class,
     SettingsActivity.class
);
```


## Kotlin Code 
```groovy
val bottomNav: BottomNavigationHelper = findViewById(R.id.bottom_navigation_helper)
bottomNav.setup(
    this,
    R.id.nav_home,
    HomeActivity::class.java,
    ProfileActivity::class.java,
    SettingsActivity::class.java
)

```




   
