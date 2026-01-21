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
rootProject.name = "sdds-core"

includeBuild("../build-system")
include(
    ":icons",
    ":plugin_theme_builder",
    ":uikit",
    ":uikit-compose",
    ":testing"
)
