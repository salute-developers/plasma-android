@file:OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)

import utils.addDefaultTargets

plugins {
    id("convention.cmp-lib")
}

group = "integration-core"

android {
    namespace = "com.sdds.compose.uikit.fixtures.testcases.kmp"
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            dependencies {
                implementation("sdds-core:uikit-compose")
                implementation("sdds-core:icons-compose")
                implementation(compose.foundation)
                implementation(compose.ui)
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
