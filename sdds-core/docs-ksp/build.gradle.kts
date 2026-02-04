plugins {
    id("convention.kotlin-lib")
}

group = "sdds-core"

dependencies {
    implementation(libs.base.kotlin.ksp)
}
