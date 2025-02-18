@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-app")
    id("convention.compose")
    id("kotlin-parcelize")
    alias(libs.plugins.roborazzi)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.sdds.playground.sandbox"

    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.sdds.playground.sandbox.compose"
    }
    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
    tasks.withType<Test> {
        maxHeapSize = "4096m"
    }
    kotlinOptions {
        //comment following lines (freeCompilerArgs) to disable compose-metrics
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=" + project.buildDir.absolutePath + "/compose_metrics")
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination="  + project.buildDir.absolutePath + "/compose_metrics")
    }
}

dependencies {
    implementation(libs.sdds.icons)
    implementation("tokens:sdds.serv.compose")
    implementation("tokens:sdds.serv.view")
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.compose.material)
    implementation(libs.base.androidX.compose.animation)
    implementation(libs.base.androidX.activity.compose)
    implementation(libs.base.androidX.lifecycle.compose.viewmodel)
    implementation(libs.base.koil.compose)

    implementation(libs.base.android.material)
    implementation(libs.base.androidX.constraintLayout)
    implementation(libs.base.androidX.lifecycle.viewmodel)
    implementation(libs.base.androidX.navigation.fragment)
    implementation(libs.base.androidX.navigation.ui)
    implementation(libs.base.androidX.activity.ktx)
    implementation(libs.base.glide)

    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

    // UI Tests
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.ui.compose.jUnit4)

    //Screenshot tests
    testImplementation(libs.test.roborazzi)
    testImplementation(libs.test.roborazzi.compose)
    testImplementation(libs.test.roborazzi.rule)
    testImplementation(libs.base.test.unit.robolectric)
}
