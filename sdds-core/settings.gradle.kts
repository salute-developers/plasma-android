pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }

    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
        create("icons") {
            from(files("../gradle/icons.version.toml"))
        }
        create("iconsCompose") {
            from(files("../gradle/icons-compose.version.toml"))
        }
    }
}
rootProject.name = "sdds-core"

includeBuild("../build-system")
includeBuild("../third-party/sdds-haze")
include(
    ":icons",
    ":icons-compose",
    ":plugin_theme_builder",
    ":uikit",
    ":uikit-compose",
    ":docs",
    ":api-info-ksp",
    ":api-info-compose",
)
