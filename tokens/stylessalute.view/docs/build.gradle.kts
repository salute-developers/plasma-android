@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-view")
    id("convention.testing")
}

android {
    namespace = "com.sdds.stylessalute.docs"
}

dependencies {
    implementation(project(":stylessalute.view"))
    implementation(libs.sdds.uikit)
}
