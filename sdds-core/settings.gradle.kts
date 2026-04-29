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
includeBuild("../third-party/sdds-haze")
include(
    ":icons",
    ":plugin_theme_builder",
    ":uikit",
    ":uikit-compose",
//    ":uikit-fixtures",
//    ":uikit-compose-fixtures",
    ":docs",
    ":docs-views",
    ":docs-compose",
    ":docs-ksp",
    ":config-codec"
)
