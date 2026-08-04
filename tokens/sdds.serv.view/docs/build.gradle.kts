import extensions.docs.DocusaurusExtension

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.integration-detekt")
    id("convention.docusaurus")
    id("com.google.devtools.ksp")
    id(libs.plugins.dsbuilder.get().pluginId)
    id("convention.testing")
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.serv.docs"
}

ksp {
    arg("packageName", "com.sdds.serv.docs")
}

dsBuilder {
    autoGenerate.set(false)
    targets { view() }
    documentation {}
}

extensions.configure<DocusaurusExtension>("docusaurus") {
    components.set(layout.projectDirectory.file("../.sdds/config-info-view-system.json"))
    snippetsDir.set(layout.projectDirectory.dir("../.sdds/temp/docs/assets/examples"))
}

tasks.named("docusaurusGenerate") {
    dependsOn("documentationAggregate")
}

dependencies {
    "sddsCoreDocumentation"("integration-core:uikit-fixtures:unspecified:docs@jar")
    implementation("sdds-core:docs")
    ksp("sdds-core:docs")
    implementation(project(":sdds.serv.view"))
    testImplementation("integration-core:uikit-fixtures")
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
