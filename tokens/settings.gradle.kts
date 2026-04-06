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
        create("icons") {
            from(files("../gradle/icons.version.toml"))
        }
    }
}

rootProject.name = "tokens"

includeBuild("../build-system")
includeBuild("../sdds-core")
includeBuild("../integration-core")
include(
    ":plasma.giga.compose",
    ":plasma.giga.compose:docs",
    ":plasma.giga.compose:app",
    ":plasma.giga.compose:integration",
    ":plasma.sd.service.compose",
    ":plasma.sd.service.compose:app",
    ":plasma.sd.service.compose:integration",
    ":plasma.sd.service.compose:docs",
    ":plasma.homeds.compose",
    ":plasma.homeds.compose:docs",
    ":plasma.homeds.compose:integration",
    ":plasma.homeds.compose:app",
    ":plasma.sd.service.view",
    ":plasma.sd.service.view:app",
    ":plasma.sd.service.view:docs",
    ":plasma.sd.service.view:integration",
    ":sdds.serv.compose",
    ":sdds.serv.compose:app",
    ":sdds.serv.compose:integration",
    ":sdds.serv.compose:docs",
    ":sdds.serv.view",
    ":sdds.serv.view:docs",
    ":sdds.serv.view:integration",
    ":sdds.serv.view:app",
    ":plasma-stards-view",
    ":plasma-stards-view:docs",
    ":plasma-stards-view:app",
    ":plasma-stards-view:integration",
    ":plasma-stards-compose",
    ":plasma-stards-compose:app",
    ":plasma-stards-compose:integration",
    ":plasma-stards-compose:docs",
    ":sdds-sbcom-compose",
    ":sdds-sbcom-compose:app",
    ":sdds-sbcom-compose:integration",
    ":sdds-sbcom-compose:docs",
)
