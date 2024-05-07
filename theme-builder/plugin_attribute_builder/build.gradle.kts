import utils.findPropertyOrDefault
import utils.versionInfo

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.serialization)
    id("convention.detekt")
    id("convention.spotless")
}

group = "io.github.salute-developers"
version = versionInfo().fullName

gradlePlugin {
    website.set(findPropertyOrDefault("nexus.websiteUrl", "").toString())
    vcsUrl.set(findPropertyOrDefault("nexus.gitUrl", "").toString())

    plugins {
        create("attributeBuilderPlugin") {
            id = "io.github.salute-developers.attribute-builder-plugin"
            displayName = "Attribute Builder Plugin"
            description = "Plugin automatically generates base attributes based on tokens provided by ThemeBuilder"
            tags.add("designSystem")
            implementationClass = "com.sdds.plugin.attributebuilder.AttributeBuilderPlugin"
        }
    }
}

dependencies {
    implementation(project(":theme_builder_core"))
    implementation(libs.base.kotlin.serialization.json)
    implementation(libs.base.gradle.android)
    implementation(libs.base.kotlin.poet)
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.unit.mockk)
}
