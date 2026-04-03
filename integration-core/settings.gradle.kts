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
rootProject.name = "integration-core"

includeBuild("../build-system")
include(
    ":sandbox-core",
    ":sandbox-compose",
    ":sandbox-view",
    ":sandbox-ksp",
    ":uikit-fixtures",
    ":uikit-compose-fixtures",
)
