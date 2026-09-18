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
                implementation(compose.uiTest)
            }
        }

        val screenshotMain by creating {
            dependsOn(commonMain.get())
        }

        androidMain {
            dependsOn(screenshotMain)
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
            dependsOn(screenshotMain)
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation(compose.desktop.uiTestJUnit4)
                implementation(libs.test.roborazzi)
                implementation(libs.test.roborazzi.compose.desktop)
            }
        }

        val iosMain by creating {
            dependsOn(screenshotMain)
            dependencies {
                implementation(compose.uiTest)
                implementation(libs.test.roborazzi.compose.ios)
            }
        }

        val iosX64Main by getting {
            dependsOn(iosMain)
        }

        val iosArm64Main by getting {
            dependsOn(iosMain)
        }

        val iosSimulatorArm64Main by getting {
            dependsOn(iosMain)
        }

    }
}
