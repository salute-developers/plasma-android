import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform")
    id("convention.detekt")
    id("convention.spotless")
    id("convention.kotlin-java-version-sync")
}

group = "sdds-core"

// SOURCE-retention annotations are platform-neutral and are consumed by KSP from common code.
kotlin {
    jvmToolchain(17)

    jvm()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    js(IR) {
        browser()
    }
}
