import com.sdds.plugin.themebuilder.OutputLocation

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.integration-detekt")
    id(libs.plugins.dsbuilder.get().pluginId)
}

android {
    namespace = "com.sdds.sd.service.sandbox.integration"
}

dsBuilder {
    outputLocation.set(OutputLocation.SRC)
    autoGenerate.set(false)
    targets {
        view()
    }
    sandbox {
        view {
            generatedPackageName.set("com.plasma.sd.service.integration")
            themeAlias.set("SdService")
        }
    }
}

dependencies {
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    implementation(project(":plasma.sd.service.view"))
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
