import com.sdds.plugin.themebuilder.OutputLocation

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.integration-detekt")
    id(libs.plugins.dsbuilder.get().pluginId)
}

dsBuilder {
    outputLocation.set(OutputLocation.SRC)
    sandbox {
        view {
            generatedPackageName.set("com.sdds.serv.integration")
            themeAlias.set("Sdds")
        }
    }
}

android {
    namespace = "com.sdds.serv.sandbox.integration"
}

dependencies {
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    implementation(project(":sdds.serv.view"))
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
