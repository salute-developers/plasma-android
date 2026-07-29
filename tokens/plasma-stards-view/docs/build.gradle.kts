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
    namespace = "com.sdkit.star.designsystem.docs"
}

ksp {
    arg("packageName", "com.sdkit.star.designsystem.docs")
}

dsBuilder {
    autoGenerate.set(false)
    documentation {
        view()
    }
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
    testImplementation("integration-core:uikit-fixtures")
    implementation(project(":plasma-stards-view"))
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
