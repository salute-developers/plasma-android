plugins {
    id("convention.android-lib")
    id("convention.testing")
    id("convention.maven-publish")
    id("convention.core-fixtures")
    id("kotlin-parcelize")
    alias(libs.plugins.ksp)
}

group = "sdds-core"

android {
    namespace = "com.sdds.uikit.fixtures"
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
    implementation(project(":uikit"))
    implementation(project(":testing"))
    implementation(project(":icons"))
    implementation(project(":docs"))
    implementation(project(":docs-views"))
    ksp(project(":docs-ksp"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    ksp("integration-core:sandbox-ksp")

    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.recyclerView)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.compose.foundation)
}
