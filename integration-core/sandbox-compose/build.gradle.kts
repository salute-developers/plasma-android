import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME
import utils.addDefaultTargets
import utils.componentsName
import utils.componentsVersion
import utils.themeAlias
import utils.themeName
import utils.themeVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.cmp-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

group = "integration-core"

android {
    namespace = "com.sdds.compose.sandbox"
}

themeBuilder {
    themeSource(name = themeName, version = themeVersion, alias = themeAlias)
    componentSource(name = componentsName, version = componentsVersion, alias = themeAlias)
    compose {
        multiplatform(true)
    }
    ktPackage(ktPackage = "com.sdds.compose.sandbox")
    mode(THEME)
    autoGenerate(false)
    outputLocation(SRC)
}

kotlin {
    addDefaultTargets()
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":sandbox-core"))
                implementation(libs.sdds.uikit.compose)
                implementation(iconsCompose.sdds.icons.compose)
                implementation(compose.foundation)
                implementation(compose.components.resources)
                implementation(libs.base.jetbrains.androidX.navigation.compose)
                implementation(libs.base.kotlin.serialization.json)
            }
        }
        androidMain {
            dependencies {
                implementation(libs.base.androidX.activity.compose)
                implementation(libs.base.androidX.appcompat)
                implementation(libs.base.androidX.activity)
                implementation(libs.base.androidX.lifecycle.compose.viewmodel)
                implementation(libs.base.androidX.compose.uiTooling.preview)
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

compose.resources {
    publicResClass = true
    packageOfResClass = "com.sdds.compose.sandbox.generated.resources"
}

dependencies {
    debugImplementation(libs.base.androidX.compose.uiTooling)
}
