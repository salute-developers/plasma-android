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

ksp {
    arg("sandbox.packageName", "com.sdds.compose.uikit.fixtures.stories")
}

dependencies {
    implementation(project(":uikit-compose"))
    implementation(project(":icons"))
    implementation(project(":docs"))
    implementation(project(":docs-compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    ksp(project(":docs-ksp"))
    ksp("integration-core:sandbox-ksp")
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.test.roborazzi)
    implementation(libs.test.roborazzi.rule)
    implementation(libs.base.test.unit.robolectric)
    implementation(libs.base.test.ui.compose.jUnit4)
    implementation(libs.test.roborazzi.compose)
}
