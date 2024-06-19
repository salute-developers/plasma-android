pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "sdds-android"

includeBuild("build-system")
includeBuild("playground")
includeBuild("sdds-core")
includeBuild("themes")
