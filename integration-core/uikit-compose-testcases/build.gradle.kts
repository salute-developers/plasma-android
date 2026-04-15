plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.testing-compose")
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

dependencies {
    implementation(project(":sandbox-core"))
    implementation(project(":sandbox-compose"))
    implementation(project(":uikit-compose-fixtures"))
    implementation("sdds-core:docs")
    implementation("sdds-core:docs-compose")
    implementation("sdds-core:uikit-compose")
    implementation("sdds-core:icons")


    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.test.roborazzi)
    implementation(libs.test.roborazzi.rule)
    implementation(libs.base.koil.compose)
    implementation(libs.base.test.unit.robolectric)
    implementation(libs.base.test.ui.compose.jUnit4)
    implementation(libs.test.roborazzi.compose)
}
