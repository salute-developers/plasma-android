@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.compose")
    id("convention.auto-bump")
    id("convention.dokka")
    alias(libs.plugins.binary.compatibility.validator)
    alias(libs.plugins.ksp)
}

group = "sdds-core"

android {
    namespace = "com.sdds.compose.uikit"
    sourceSets {
        getByName("debug") {
            resources.srcDir("build/generated/ksp/debug/resources")
        }
        getByName("release") {
            resources.srcDir("build/generated/ksp/release/resources")
        }
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll(
            listOf(
                "-P",
                "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=${project.buildDir.absolutePath}/compose_metrics",
                "-P",
                "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=${project.buildDir.absolutePath}/compose_metrics"
            )
        )
    }
}

dependencies {

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.compose.material)
    implementation(libs.base.androidX.compose.animation)
    implementation(libs.sdds.haze)
    implementation(libs.base.androidX.lifecycle.compose.viewmodel)

    compileOnly(project(":api-info-compose"))
    ksp(project(":api-info-ksp"))

    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

    // UI Tests
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)

}
