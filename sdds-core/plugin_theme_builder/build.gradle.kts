import utils.findPropertyOrDefault
import utils.versionInfo

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `java-gradle-plugin`
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.gradlePluginPublish)
    id("convention.detekt")
    id("convention.spotless")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

group = "io.github.salute-developers"
version = versionInfo().fullName

gradlePlugin {
    website.set(findPropertyOrDefault("nexus.websiteUrl", "").toString())
    vcsUrl.set(findPropertyOrDefault("nexus.gitUrl", "").toString())
    plugins {
        create("themeBuilderPlugin") {
            id = "io.github.salute-developers.theme-builder-plugin"
            displayName = "Theme Builder Plugin"
            description = "Plugin automatically generates design tokens based on configuration provided by ThemeBuilder"
            tags.add("designSystem")
            implementationClass = "com.sdds.plugin.themebuilder.ThemeBuilderPlugin"
        }
    }
}

dependencies {
    implementation(libs.base.kotlin.stdlib)
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.unit.mockk)
}
