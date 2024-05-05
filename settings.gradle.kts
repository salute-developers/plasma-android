pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "sdds-android"

includeBuild("build-system")
includeBuild("theme-builder")
includeBuild("playground")
includeBuild("sdds-core")
