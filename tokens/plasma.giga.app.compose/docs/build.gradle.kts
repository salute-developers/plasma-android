@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-compose")
    id("convention.testing-compose")
}

android {
    namespace = "com.sdds.plasma.giga.app.compose.docs"
}

dependencies {
    implementation(project(":plasma.giga.app.compose"))
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
}
