plugins {
    id("convention.android-lib")
    id("convention.testing")
    id("convention.maven-publish")
    id("convention.core-fixtures")
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

    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.core)
}
