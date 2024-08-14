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

rootProject.name = "playground"
includeBuild("../build-system")
includeBuild("../sdds-core")
include(
    ":sandbox",
    ":sandbox-compose",
    ":theme-builder",
)
