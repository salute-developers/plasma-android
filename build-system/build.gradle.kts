plugins {
    `kotlin-dsl`
}

buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath(libs.base.gradle.kotlin)
        classpath(libs.base.gradle.nexusPublish)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
}

tasks.register("spotlessApplyAll")
tasks.register("spotlessCheckAll")
tasks.register("mergeReports")
tasks.register("copyTestsReports")
tasks.register("detektAll")
tasks.register("apiCheckAll")
tasks.register("apiDumpAll")
tasks.register("assembleDebugAll")
tasks.register("assembleReleaseAll")
tasks.register("lintDebugAll")
tasks.register("testDebugAll")
tasks.register("testAll")
