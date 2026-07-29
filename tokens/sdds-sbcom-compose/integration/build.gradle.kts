import com.sdds.plugin.themebuilder.OutputLocation

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.integration-detekt")
    id(libs.plugins.dsbuilder.get().pluginId)
    id("convention.compose")
}

android {
    namespace = "com.sdds.sbcom.compose.integration"
}

dsBuilder {
    outputLocation.set(OutputLocation.SRC)
    autoGenerate.set(false)
    sandbox {
        compose {
            generatedPackageName.set("com.sdds.sbcom.integration")
            themeAlias.set("SddsSbCom")
        }
    }
}

dependencies {
    implementation(project(":sdds-sbcom-compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.activity)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
}
