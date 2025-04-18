@file:Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.root-project")
    id("convention.core-dependencies")
    alias(libs.plugins.android.app) apply false
    alias(libs.plugins.android.lib) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.android.cache.fix) apply false
    alias(libs.plugins.paparazzi) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }

    dependencies {
        configurations.all {
            resolutionStrategy {
                force(libs.base.kotlin.serialization.json)
            }
        }
        classpath(libs.base.gradle.android)
        classpath(libs.base.gradle.kotlin)
        classpath(libs.base.gradle.detekt)
        classpath(libs.base.gradle.spotless)
        classpath(libs.base.gradle.paparazzi)
        classpath(libs.base.gradle.cacheFix)
        classpath(files("../build-system/libs/star-dimens.jar"))
    }
}
