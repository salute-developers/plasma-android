plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.core-fixtures")
    id("kotlin-parcelize")
    alias(libs.plugins.ksp)
}

group = "integration-core"

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

ksp {
    arg("packageName", "com.sdds.docs")
    arg("sandbox.packageName", "com.sdds.uikit.fixtures.stories")
}

dependencies {
    implementation(project(":sandbox-core"))
    implementation(project(":sandbox-compose"))
    implementation(project(":sandbox-view"))
    ksp(project(":sandbox-ksp"))
    implementation("sdds-core:uikit")
    implementation("sdds-core:uikit-compose")
    implementation("sdds-core:icons")
    implementation("sdds-core:docs")
    implementation("sdds-core:docs-views")
    ksp("sdds-core:docs-ksp")

    implementation(libs.base.glide)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.recyclerView)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.constraintLayout)
    implementation(libs.base.android.material)
    implementation(libs.base.androidX.compose.foundation)
}
