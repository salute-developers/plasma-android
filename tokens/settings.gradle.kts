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
            // Костыль. Версия иконок лежит в отдельном toml файле, чтобы избежать конфликтов из-за
            // раздельных релизных процессов иконок и остальных библиотек
            org.gradle.api.internal.catalog.parser.TomlCatalogFileParser
                .parse(file("../gradle/icons.version.toml").toPath(), this)
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
