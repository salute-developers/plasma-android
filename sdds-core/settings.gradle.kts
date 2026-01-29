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
        create("icons") {
            from(files("../gradle/icons.version.toml"))
        }
    }
}
rootProject.name = "sdds-core"

includeBuild("../build-system")
include(
    ":icons",
    ":plugin_theme_builder",
    ":uikit",
    ":uikit-compose",
    ":testing",
    ":uikit-fixtures",
    ":uikit-compose-fixtures",
    ":docs",
    ":docs-views",
    ":docs-compose",
    ":docs-ksp",
)
