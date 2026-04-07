plugins {
    id("convention.android-lib")
    id("kotlin-parcelize")
}

group = "integration-core"

android {
    namespace = "com.sdds.uikit.fixtures.testcases"
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
    implementation(project(":sandbox-view"))
    implementation(project(":uikit-fixtures"))
    implementation("sdds-core:docs")
    implementation("sdds-core:docs-views")
    implementation("sdds-core:uikit")
    implementation("sdds-core:icons")

    implementation(libs.base.glide)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.recyclerView)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.constraintLayout)
    implementation(libs.base.android.material)
    implementation(libs.base.test.unit.jUnit)
    implementation(libs.test.roborazzi)
    implementation(libs.test.roborazzi.rule)
    implementation(libs.base.test.unit.robolectric)
    implementation(libs.base.androidX.compose.foundation)
}
