@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.kmp-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.dokka")
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.binary.compatibility.validator)
}

group = "sdds-core"

kotlin {
    sourceSets {
        commonMain.configure {
            dependencies {
                implementation(compose.foundation)
                implementation(compose.animation)

            }
        }
        androidMain.configure {
            dependencies {
                implementation(compose.preview)
                implementation(compose.uiTooling)
            }
        }
    }
}

android {
    namespace = "com.sdds.compose.uikit"

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
