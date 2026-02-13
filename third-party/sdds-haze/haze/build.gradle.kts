// Copyright 2023, Christopher Banes and the Haze project contributors
// SPDX-License-Identifier: Apache-2.0

import org.jetbrains.compose.ExperimentalComposeLibrary
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import utils.addDefaultTargets

plugins {
  id("convention.cmp-lib")
  id("convention.maven-publish")
  id("convention.auto-bump")
  id("convention.dokka")
  id("dev.drewhamilton.poko")
}

android {
  namespace = "com.sdds.haze"

  defaultConfig {
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    consumerProguardFiles("consumer-rules.pro")
  }

  testOptions {
    unitTests {
      isIncludeAndroidResources = true
    }
  }
}

kotlin {
  addDefaultTargets()
  explicitApi()

  sourceSets {
    commonMain {
      dependencies {
        api(compose.ui)
        implementation(compose.foundation)
        implementation(libs.base.androidX.collection)
      }
    }

    androidMain {
      dependencies {
        implementation(libs.base.androidX.activity)
        implementation(libs.base.androidX.tracing)
      }
    }

    val skikoMain by creating {
      dependsOn(commonMain.get())
    }

//    iosMain {
//      dependsOn(skikoMain)
//    }
//
//    macosMain {
//      dependsOn(skikoMain)
//    }
//
    jvmMain {
      dependsOn(skikoMain)
    }

//    named("wasmJsMain") {
//      dependsOn(skikoMain)
//    }
//
//    jsMain {
//      dependsOn(skikoMain)
//    }

    commonTest {
      dependencies {
        implementation(kotlin("test"))
        implementation(libs.base.test.assertk)

        @OptIn(ExperimentalComposeLibrary::class)
        implementation(compose.uiTest)
      }
    }

    jvmTest {
      dependencies {
        implementation(compose.desktop.currentOs)
      }
    }
  }

  @OptIn(ExperimentalKotlinGradlePluginApi::class)
  compilerOptions {
    optIn.add("com.sdds.haze.ExperimentalHazeApi")
    optIn.add("com.sdds.haze.InternalHazeApi")
  }
}

// https://youtrack.jetbrains.com/issue/CMP-4906
tasks.withType<org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest> {
  enabled = false
}

/**
 * Disable Mac host and iOS sim tests. They have a high CI cost (mostly linking) but
 * provide little value over the quicker JVM + Android tests
 */
tasks.withType<org.jetbrains.kotlin.gradle.targets.native.tasks.KotlinNativeSimulatorTest> {
  enabled = false
}
tasks.withType<org.jetbrains.kotlin.gradle.targets.native.tasks.KotlinNativeHostTest> {
  enabled = false
}

poko {
  pokoAnnotation.set("com/sdds/haze/Poko")
}
