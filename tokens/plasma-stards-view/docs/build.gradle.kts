@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-view")
    id("convention.testing")
}

android {
    namespace = "com.sdkit.star.designsystem.docs"
}

dependencies {
    implementation(project(":plasma-stards-view"))
    implementation(libs.sdds.uikit)
}
