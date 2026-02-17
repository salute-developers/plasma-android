plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.testing-compose")
    id("convention.maven-publish")
    id("convention.core-fixtures")
    alias(libs.plugins.ksp)
}

group = "sdds-core"

android {
    namespace = "com.sdds.compose.uikit.fixtures"
    buildFeatures {
        viewBinding = true
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(project(":uikit-compose"))
    implementation(project(":icons"))
    implementation(project(":docs"))
    implementation(project(":docs-compose"))
    ksp(project(":docs-ksp"))
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.test.roborazzi)
    implementation(libs.test.roborazzi.rule)
    implementation(libs.base.test.unit.robolectric)
    implementation(libs.base.test.ui.compose.jUnit4)
    implementation(libs.test.roborazzi.compose)
}
