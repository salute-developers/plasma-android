import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.kmp-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.jetbrainsCompose)
}

android {
    namespace = "com.sdds.serv.compose"
    resourcePrefix = "serv_cmp"
    sourceSets {
        named("main") {
            res.srcDirs("resources")
        }
    }
}

kotlin {
    jvm("desktop") {
        sourceSets {
            named("desktopMain") {
                resources.srcDirs("resources")
            }
        }
    }
    sourceSets {
        commonMain.configure {
            dependencies {
                implementation(compose.foundation)
                implementation(libs.sdds.uikit.compose)
            }
        }
    }
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("sdds serv version must be specified")
    themeSource(name = "sdds_serv", version = themeVersion, alias = "SddsServ")
    compose()
    ktPackage(ktPackage = "com.sdds.serv")
    mode(THEME)
    autoGenerate(false)
    outputLocation(SRC)
}
