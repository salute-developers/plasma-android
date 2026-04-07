plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.core-fixtures")
    alias(libs.plugins.ksp)
}

group = "integration-core"

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
    arg("packageName", "com.sdds.compose.docs")
    arg("sandbox.packageName", "com.sdds.compose.uikit.fixtures.stories")
}

dependencies {
    implementation(project(":sandbox-core"))
    implementation(project(":sandbox-compose"))
    ksp(project(":sandbox-ksp"))
    implementation("sdds-core:uikit-compose")
    implementation("sdds-core:icons")
    implementation("sdds-core:docs")
    implementation("sdds-core:docs-compose")
    ksp("sdds-core:docs-ksp")

    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.koil.compose)
}
