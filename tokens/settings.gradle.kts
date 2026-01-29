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
include(
    ":plasma.giga.compose",
    ":plasma.giga.compose:docs",
    ":plasma.giga.app.compose",
    ":plasma.giga.app.compose:docs",
    ":plasma.sd.service.compose",
    ":plasma.sd.service.compose:docs",
    ":plasma.homeds.compose",
    ":plasma.homeds.compose:docs",
    ":plasma.sd.service.view",
    ":plasma.sd.service.view:docs",
    ":sdds.serv.compose",
    ":sdds.serv.compose:docs",
    ":sdds.serv.view",
    ":sdds.serv.view:docs",
    ":stylessalute.compose",
    ":stylessalute.compose:docs",
    ":stylessalute.view",
    ":stylessalute.view:docs",
    ":plasma-stards-view",
    ":plasma-stards-view:docs",
    ":plasma-stards-compose",
    ":plasma-stards-compose:docs",
)
