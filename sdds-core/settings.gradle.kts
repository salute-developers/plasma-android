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

rootProject.name = "sdds-core"

includeBuild("../build-system")
include(
    ":icons",
    ":plugin_theme_builder",
    ":uikit",
    ":uikit-compose",
    ":testing",
    ":config-codec"
)
