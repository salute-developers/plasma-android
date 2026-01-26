@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-compose")
    id("convention.testing-compose")
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.sdds.plasma.homeds.compose.docs"
}

dependencies {
    implementation(project(":plasma.homeds.compose"))
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
    ksp(":sdds-core:docs-ksp")
}
