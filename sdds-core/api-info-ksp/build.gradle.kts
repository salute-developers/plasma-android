plugins {
    id("convention.kotlin-lib")
    alias(libs.plugins.kotlin.serialization)
}

group = "sdds-core"

dependencies {
    implementation(libs.base.kotlin.serialization.json)
    implementation(libs.base.kotlin.ksp)
}
