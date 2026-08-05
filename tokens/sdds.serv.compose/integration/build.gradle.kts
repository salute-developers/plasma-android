import com.sdds.plugin.themebuilder.OutputLocation
import utils.addDefaultTargets

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.cmp-lib")
    id("convention.integration-detekt")
    id(libs.plugins.dsbuilder.get().pluginId)
}

android {
    namespace = "com.sdds.serv.compose.integration"
}

dsBuilder {
    outputLocation.set(OutputLocation.SRC)
    autoGenerate.set(false)
    targets {
        compose()
    }
    sandbox {
        compose {
            generatedPackageName.set("com.sdds.serv.integration")
            themeAlias.set("SddsServ")
            multiplatform.set(true)
        }
    }
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":sdds.serv.compose"))
                implementation("integration-core:sandbox-core")
                implementation("integration-core:sandbox-compose")
                implementation(libs.sdds.uikit.compose)
                implementation(iconsCompose.sdds.icons.compose)
                implementation(compose.foundation)
            }
        }
    }
}
