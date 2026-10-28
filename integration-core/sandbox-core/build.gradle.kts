import utils.addDefaultTargets

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.cmp-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
}

group = "integration-core"

android {
    namespace = "com.sdds.sandbox.core"
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.base.kotlin.coroutines)
                implementation(libs.sdds.uikit.compose)
                implementation(compose.foundation)
            }
        }
    }
}
