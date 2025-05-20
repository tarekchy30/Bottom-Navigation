---

### 🧪 Optional: Publish via JitPack (for global Gradle access)

If you want others to use your library in their Gradle projects like this:

```groovy
implementation 'com.github.YOUR_GITHUB_USERNAME:BottomNavigationLib:1.0.0'
Follow these steps:

1. Push Your Library to GitHub
Make sure your library is in a public GitHub repo and includes a valid build.gradle.

2. Tag a Release
On GitHub:

Go to Releases → Draft a new release

Set the tag (e.g., v1.0.0)

Click Publish release

3. Add JitPack Repository
In the root-level build.gradle of the user project, add:

groovy
Copy
Edit
allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
4. Add the Dependency
In the app-level build.gradle file:

groovy

dependencies {
    implementation 'com.github.YOUR_GITHUB_USERNAME:BottomNavigationLib:1.0.0'
}

