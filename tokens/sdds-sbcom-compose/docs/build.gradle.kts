@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-compose")
    id("convention.testing-compose")
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.sbcom.compose.docs"
}

dependencies {
    implementation(project(":sdds-sbcom-compose"))
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
