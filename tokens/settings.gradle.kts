pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "tokens"

includeBuild("../build-system")
includeBuild("../sdds-core")
include(
    ":plasma.sd.service.compose",
    ":plasma.sd.service.view",
    ":sdds.serv.compose",
    ":sdds.serv.view",
    ":stylessalute.compose",
    ":stylessalute.view",
)
