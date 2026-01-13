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
    ":plasma.giga.app.compose",
    ":plasma.sd.service.compose",
    ":plasma.homeds.compose",
    ":plasma.sd.service.view",
    ":sdds.serv.compose",
    ":sdds.serv.view",
    ":stylessalute.compose",
    ":stylessalute.view",
    ":plasma-stards-view",
    ":plasma-stards-compose",
)
