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
includeBuild("../theme-builder")
include(
    ":icons",
    ":uikit",
    ":uikit-compose"
)
