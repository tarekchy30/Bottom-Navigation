## ✨ Features
- 🔄 Activity/Fragment navigation
- 🎨 Customizable colors and styles
- 🔔 Badge notifications
- 🌙 Dark/Light theme support
- ⚡ Smooth animations

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
<com.example.buttomnav.BottomNavigationHelper
    android:id="@+id/bottomNav"
    android:layout_width="match_parent"
    android:layout_height="56dp"
    app:menu="@menu/nav_menu"
    app:activeColor="#FF5722"/>

```

## Java Code
```groovy
bottomNav.setup(
    this, // Context
    R.id.nav_home, // Default item
    HomeActivity.class,
    SearchActivity.class
);
```


## Kotlin Code 
```groovy
BottomNavigationHelper bottomNav = findViewById(R.id.bottom_navigation_helper);
bottomNav.setup(this,
     R.id.nav_home,
     HomeActivity.class,
     ProfileActivity.class,
     SettingsActivity.class
);

```




   
