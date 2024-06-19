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

rootProject.name = "themes"

includeBuild("../build-system")
includeBuild("../sdds-core")
include(
    ":caldera_online_compose",
    ":caldera_online_view",
    ":default_compose",
    ":default_view",
    ":flamingo_compose",
    ":flamingo_view",
    ":plasma_b2c_compose",
    ":plasma_b2c_view",
    ":plasma_web_compose",
    ":plasma_web_view",
    ":sberHealth_compose",
    ":sberHealth_view",
    ":sbermarket_compose",
    ":sbermarket_view",
    ":sbermarket_business_compose",
    ":sbermarket_business_view",
    ":sbermarket_metro_compose",
    ":sbermarket_metro_view",
    ":sbermarket_selgros_compose",
    ":sbermarket_selgros_view",
    ":sbermarket_wlbusiness_compose",
    ":sbermarket_wlbusiness_view",
    ":sberonline_compose",
    ":sberonline_view",
    ":sberprime_compose",
    ":sberprime_view",
    ":sdds_serv_compose",
    ":sdds_serv_view",
    ":stylesSalute_compose",
    ":stylesSalute_view",
)
