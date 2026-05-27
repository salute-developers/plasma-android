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

rootProject.name = "playground"
includeBuild("../build-system")
includeBuild("../sdds-core")
includeBuild("../integration-core")
includeBuild("../tokens")
include(":theme-builder")
include(":sandbox-integration-test")
