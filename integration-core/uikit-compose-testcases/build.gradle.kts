@file:OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)

import utils.addDefaultTargets

plugins {
    id("convention.cmp-lib")
}

group = "integration-core"

android {
    namespace = "com.sdds.compose.uikit.fixtures.testcases"
    buildFeatures {
        viewBinding = true
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":uikit-compose-fixtures"))
                implementation("sdds-core:uikit-compose")
                implementation("sdds-core:icons-compose")
                implementation(compose.components.resources)
                implementation(compose.foundation)
                implementation(compose.ui)
            }
        }

        androidMain {
            dependencies {
                implementation(project(":sandbox-core"))
                implementation(project(":sandbox-compose"))
                implementation("sdds-core:docs")
                implementation("sdds-core:icons")
                implementation(libs.base.androidX.appcompat)
                implementation(libs.base.koil.compose)
                implementation(libs.base.test.unit.robolectric)
                implementation(libs.base.test.ui.compose.jUnit4)
                implementation(libs.test.roborazzi)
                implementation(libs.test.roborazzi.rule)
                implementation(libs.test.roborazzi.compose)
            }
        }

        jvmMain {
            dependencies {
                implementation(compose.desktop.currentOs)
                api(compose.desktop.uiTestJUnit4)
                api(libs.base.test.unit.jUnit)
                implementation(libs.test.roborazzi)
                implementation(libs.test.roborazzi.compose.desktop)
            }
        }

        iosMain {
            dependencies {
                api(compose.uiTest)
                implementation(libs.test.roborazzi.compose.ios)
            }
        }
    }
}
