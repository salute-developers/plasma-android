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
rootProject.name = "integration-core"

includeBuild("../build-system")
includeBuild("../sdds-core")
include(
    ":sandbox-core",
    ":sandbox-compose",
    ":sandbox-view",
    ":sandbox-ksp",
    ":uikit-fixtures",
    ":uikit-testcases",
    ":uikit-compose-fixtures",
    ":uikit-compose-testcases",
)
