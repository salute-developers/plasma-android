plugins {
    `kotlin-dsl`
}

buildscript {
    repositories {
        mavenCentral()
        google()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
    }
    dependencies {
        classpath(libs.base.gradle.kotlin)
        classpath(libs.base.gradle.nexusPublish)
        classpath(libs.base.dokka.graddle)
        classpath(libs.base.dokka.analysis)
        classpath(libs.base.kotlin.ksp)
        classpath(libs.base.gradle.compose)
    }

    configurations.all {
        resolutionStrategy.eachDependency {
            if (requested.group == "org.jetbrains.kotlin") {
                useVersion(libs.versions.global.kotlin.get())
                because("Avoid NoSuchMethodError in Kotlin Daemon due to version mismatch")
            }
        }
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
tasks.register("mavenPublishAll")
tasks.register("testAll") {
    dependsOn(subprojects.flatMap { project -> project.tasks.matching { it.name == "test" } })
    dependsOn(tasks.named("test"))
}
