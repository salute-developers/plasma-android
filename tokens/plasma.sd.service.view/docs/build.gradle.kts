@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-view")
    id("convention.testing")
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.plasma.sd.service.docs"
}

dependencies {
    implementation(project(":plasma.sd.service.view"))
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
