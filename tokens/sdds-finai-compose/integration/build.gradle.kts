import com.sdds.plugin.themebuilder.OutputLocation
import utils.addDefaultTargets

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.cmp-lib")
    id("convention.integration-detekt")
    id(libs.plugins.dsbuilder.get().pluginId)
}

android {
    namespace = "com.sdds.finai.compose.integration"
}

dsBuilder {
    outputLocation.set(OutputLocation.SRC)
    autoGenerate.set(false)
    targets {
        compose()
    }
    sandbox {
        compose {
            generatedPackageName.set("com.sdds.finai.integration")
            themeAlias.set("SddsFinAi")
            multiplatform.set(true)
        }
    }
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":sdds-finai-compose"))
                implementation("integration-core:sandbox-core")
                implementation("integration-core:sandbox-compose")
                implementation(libs.sdds.uikit.compose)
                implementation(iconsCompose.sdds.icons.compose)
                implementation(compose.foundation)
            }
        }
    }
}
