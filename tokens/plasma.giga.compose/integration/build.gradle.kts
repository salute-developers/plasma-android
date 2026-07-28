import com.sdds.plugin.themebuilder.OutputLocation

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id(libs.plugins.dsbuilder.get().pluginId)
}

dsBuilder {
    outputLocation.set(OutputLocation.SRC)
    sandbox {
        compose {
            generatedPackageName.set("com.sdds.plasma.giga.integration")
            themeAlias.set("PlasmaGiga")
        }
    }
}

android {
    namespace = "com.sdds.plasma.giga.compose.integration"
}

dependencies {
    implementation(project(":plasma.giga.compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.activity)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
}
