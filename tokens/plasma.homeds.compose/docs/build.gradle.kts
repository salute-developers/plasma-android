import extensions.docs.DocusaurusExtension

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.integration-detekt")
    id("convention.docusaurus")
    id("convention.compose")
    id("com.google.devtools.ksp")
    id(libs.plugins.dsbuilder.get().pluginId)
    id("convention.testing-compose")
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.plasma.homeds.compose.docs"
}

docusaurus {
    additionalComponentNames.add("NumberPanel")
}

ksp {
    arg("packageName", "com.sdds.plasma.homeds.compose.docs")
}

dsBuilder {
    autoGenerate.set(false)
    targets { compose() }
    documentation {}
}

extensions.configure<DocusaurusExtension>("docusaurus") {
    components.set(layout.projectDirectory.file("../.sdds/config-info-compose.json"))
    snippetsDir.set(layout.projectDirectory.dir("../.sdds/temp/docs/assets/examples"))
}

tasks.named("docusaurusGenerate") {
    dependsOn("documentationAggregate")
}

dependencies {
    "sddsCoreDocumentation"("integration-core:uikit-compose-fixtures:unspecified:docs@jar")
    implementation("sdds-core:docs")
    ksp("sdds-core:docs")
    testImplementation("integration-core:uikit-compose-fixtures")
    implementation(project(":plasma.homeds.compose"))
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
