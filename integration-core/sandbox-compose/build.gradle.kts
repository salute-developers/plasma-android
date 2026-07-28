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
    id(libs.plugins.dsbuilder.get().pluginId)
}

group = "integration-core"

android {
    namespace = "com.sdds.compose.sandbox"
}

dsBuilder {
    compose(multiplatform = true)
    packageName.set("com.sdds.compose.sandbox")
    outputLocation.set(SRC)
    theme {
        source(name = themeName, version = themeVersion, alias = themeAlias)
        mode.set(THEME)
        autoGenerate.set(false)
    }
    components {
        source(name = componentsName, version = componentsVersion, alias = themeAlias)
    }
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
                implementation(libs.base.jetbrains.compose.ui.backhandler)
                implementation(libs.base.jetbrains.androidX.navigation.compose)
                implementation(libs.base.jetbrains.androidX.lifecycle.compose.viewmodel)
                implementation(libs.base.kotlin.serialization.json)
            }
        }
        androidMain {
            dependencies {
                implementation(libs.base.androidX.activity.compose)
                implementation(libs.base.androidX.appcompat)
                implementation(libs.base.androidX.activity)
                implementation(libs.base.androidX.compose.uiTooling.preview)
            }
        }
        jvmMain {
            dependencies {
                implementation(libs.base.kotlin.coroutines.swing)
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
