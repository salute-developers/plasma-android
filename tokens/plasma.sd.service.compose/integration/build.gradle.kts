import com.sdds.plugin.themebuilder.OutputLocation

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.dsbuilder.get().pluginId)
    id("convention.compose")
}

android {
    namespace = "com.sdds.plasma.sd.service.compose.integration"
}

dsBuilder {
    outputLocation.set(OutputLocation.SRC)
    sandbox {
        compose {
            generatedPackageName.set("com.sdds.plasma.sd.service.compose.integration")
            themeAlias.set("PlasmaSdService")
        }
    }
}

dependencies {
    implementation(project(":plasma.sd.service.compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.activity)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
}
