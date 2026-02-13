@file:Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.root-project")
    alias(libs.plugins.android.lib) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.android.cache.fix) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.compose.multiplatform) apply false
    alias(libs.plugins.poko) apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        mavenLocal()
    }
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        mavenLocal()
    }

    dependencies {
        classpath(libs.base.gradle.android)
        classpath(libs.base.gradle.kotlin)
        classpath(libs.base.gradle.detekt)
        classpath(libs.base.gradle.spotless)
        classpath(libs.base.gradle.cacheFix)
    }
}
