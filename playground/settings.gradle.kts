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
    ":sandbox-core-integration",
    ":sandbox-sdds-serv-integration",
    ":sandbox-plasma-sd-service-integration",
    ":sandbox-stylessalute-integration",
    ":sandbox-plasma-stards-integration",
    ":sandbox-plasma-giga-integration",
    ":sandbox-plasma-giga-app-integration",
    ":sandbox-plasma-homeds-integration",
)
