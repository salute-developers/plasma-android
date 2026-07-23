import utils.addDefaultTargets

plugins {
    id("convention.cmp-lib")
    id("convention.maven-publish")
}

group = "integration-core"

android { namespace = "com.sdds.preview.compose" }

kotlin {
    addDefaultTargets()
    sourceSets {
        commonMain.dependencies {
            api(project(":preview-contract"))
            api(project(":sandbox-core"))
            implementation(libs.sdds.uikit.compose)
            implementation(compose.foundation)
            implementation(compose.ui)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
        }
    }
}
