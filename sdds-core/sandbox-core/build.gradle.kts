@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.kotlin-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
}

group = "sdds-core"

dependencies {
    implementation(libs.base.kotlin.coroutines)
}