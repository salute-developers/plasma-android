@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-compose")
    id("convention.testing-compose")
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.serv.compose.docs"
}

dependencies {
    implementation(project(":sdds.serv.compose"))
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
}
