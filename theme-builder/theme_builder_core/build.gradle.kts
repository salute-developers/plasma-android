@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    id("convention.detekt")
    id("convention.spotless")
}

group = "com.sdds.plugin.core"

dependencies {
    implementation(libs.base.kotlin.serialization.json)
    implementation(libs.base.gradle.android)
    implementation(libs.base.kotlin.poet)
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.unit.mockk)
}
