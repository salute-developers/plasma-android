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

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            dsBuilder {
                outputLocation.set(OutputLocation.SRC)
                sandbox {
                    compose {
                        generatedPackageName.set("com.sdds.serv.integration")
                        themeAlias.set("SddsServ")
                        multiplatform.set(true)
                    }
                }
            }

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
