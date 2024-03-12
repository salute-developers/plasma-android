import utils.findPropertyOrDefault
import utils.versionInfo
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.gradlePluginPublish)
    id("convention.detekt")
    id("convention.spotless")
}

afterEvaluate {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions.languageVersion = "1.7"
    }
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

publishing {
    repositories {
        mavenLocal()
    }
}

dependencies {
    implementation(libs.base.kotlin.serialization.json)
    implementation(libs.base.gradle.android)
    implementation(libs.base.kotlin.poet)
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.unit.mockk)
}
