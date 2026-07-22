import utils.addDefaultTargets

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.kmp-lib")
    id("convention.maven-publish")
    alias(libs.plugins.kotlin.serialization)
}

group = "integration-core"

android {
    namespace = "com.sdds.preview.contract"
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain.dependencies {
            api(libs.base.kotlin.serialization.json)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
        jvmTest.dependencies {
            implementation("com.networknt:json-schema-validator:1.0.87")
        }
    }
}
