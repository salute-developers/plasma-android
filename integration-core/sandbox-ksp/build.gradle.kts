plugins {
    id("convention.kotlin-lib")
}

group = "integration-core"

dependencies {
    implementation(libs.base.kotlin.ksp)
    implementation(libs.base.kotlin.poet)
    implementation(libs.base.kotlin.poetKsp)
}
