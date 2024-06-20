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
    ":caldera.online.compose",
    ":caldera.online.view",
    ":flamingo.compose",
    ":flamingo.view",
    ":plasma.b2c.compose",
    ":plasma.b2c.view",
    ":plasma.web.compose",
    ":plasma.web.view",
    ":sberhealth.compose",
    ":sberhealth.view",
    ":sbermarket.compose",
    ":sbermarket.view",
    ":sbermarket.business.compose",
    ":sbermarket.business.view",
    ":sbermarket.metro.compose",
    ":sbermarket.metro.view",
    ":sbermarket.selgros.compose",
    ":sbermarket.selgros.view",
    ":sbermarket.wlbusiness.compose",
    ":sbermarket.wlbusiness.view",
    ":sberonline.compose",
    ":sberonline.view",
    ":sberprime.compose",
    ":sberprime.view",
    ":sdds.serv.compose",
    ":sdds.serv.view",
    ":stylessalute.compose",
    ":stylessalute.view",
)
