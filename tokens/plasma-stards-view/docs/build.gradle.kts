@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-view")
    id("convention.testing")
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdkit.star.designsystem.docs"
}

dependencies {
    implementation(project(":plasma-stards-view"))
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
