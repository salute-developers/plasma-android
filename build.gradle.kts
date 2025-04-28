plugins {
    id("convention.root-project")
    alias(libs.plugins.kotlin.jvm) apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
