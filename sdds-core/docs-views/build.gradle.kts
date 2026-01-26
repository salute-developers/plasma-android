@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
}

group = "sdds-core"

android {
    namespace = "com.sdds.docs.views"
}

dependencies {
    implementation(project(":docs"))
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.core)

}
