KotlinGAEGradleExample
======================
This is a Hello World Google App Engine example with Kotlin and Gradle. It is mostly an ordinary Java GAE project but uses the Kotlin gradle plugin for Kotlin support. It also includes the Idea gradle plugin for use with Intellij Idea.

## Usage

Make sure you have downloaded the App Engine SDK and set the APPENGINE_HOME evironment variable to its location. The SDK can be found here https://cloud.google.com/appengine/docs/java/download and the version that is used in this project is 1.9.42

```
git clone git@github.com:widarlein/KotlinGAEGradleExample.git
cd KotlinGAEGradleExample
./gradlew appengineRun
```

Go to http://localhost:8080/

*Hello, Kotlin!*