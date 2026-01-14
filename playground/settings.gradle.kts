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
            // Костыль. Версия иконок лежит в отдельном toml файле, чтобы избежать конфликтов из-за
            // раздельных релизных процессов иконок и остальных библиотек
            org.gradle.api.internal.catalog.parser.TomlCatalogFileParser
                .parse(file("../gradle/icons.version.toml").toPath(), this)
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
