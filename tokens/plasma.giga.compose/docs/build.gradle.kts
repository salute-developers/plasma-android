@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-compose")
    id("convention.testing-compose")
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.plasma.giga.compose.docs"
}

dependencies {
    implementation(project(":plasma.giga.compose"))
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
}
