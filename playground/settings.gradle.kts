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
includeBuild("../tokens")
include(
    ":sandbox-compose",
    ":theme-builder",
)
