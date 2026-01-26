@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation")
    id("convention.testing")
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.sdkit.star.designsystem.docs"
}

dependencies {
    implementation(project(":plasma-stards-view"))
    implementation(libs.sdds.uikit)
    ksp(":sdds-core:docs-ksp")
}
