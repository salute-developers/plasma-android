pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "theme-builder"

includeBuild("../build-system")
include(
    ":theme_builder_core",
    ":plugin_attribute_builder",
    ":plugin_theme_builder",
)
