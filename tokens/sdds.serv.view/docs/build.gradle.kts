@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.documentation-view")
    id("convention.testing")
}

android {
    namespace = "com.sdds.serv.docs"
}

dependencies {
    implementation(project(":sdds.serv.view"))
    implementation(libs.sdds.uikit)
}
