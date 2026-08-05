import utils.findPropertyOrDefault
import utils.versionInfo

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.gradlePluginPublish)
    id("convention.detekt")
    id("convention.spotless")
    id("convention.auto-bump")
    alias(libs.plugins.kover)
}

kover {
    reports {
        filters {
            excludes {
                packages(
                    "com.sdds.plugin.themebuilder.internal.factory",
                    "com.sdds.plugin.themebuilder.internal.universal.base",
                )
            }
        }
    }
}

group = "io.github.salute-developers"
version = versionInfo().fullName

gradlePlugin {
    website.set(findPropertyOrDefault("nexus.websiteUrl", "").toString())
    vcsUrl.set(findPropertyOrDefault("nexus.gitUrl", "").toString())
    plugins {
        create("dsBuilderPlugin") {
            id = "io.github.salute-developers.design-system-builder"
            displayName = "Design System Builder Plugin"
            description = "Unified plugin for design system theme, components, documentation and sandbox generation"
            tags.add("designSystem")
            implementationClass = "com.sdds.plugin.themebuilder.DsBuilderPlugin"
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
    implementation(libs.base.gradle.kotlin)
    implementation(libs.base.kotlin.poet)
    implementation("com.google.code.gson:gson:2.11.0")
    compileOnly(libs.base.kotlin.compiler.embeddable)
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.unit.mockk)
}
