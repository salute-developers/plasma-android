@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.dsbuilder.get().pluginId)
}

android {
    namespace = "com.sdkit.star.designsystem.integration"
}

dsBuilder {
    sandbox {
        view {
            generatedPackageName.set("com.sdkit.star.designsystem.integration")
            themeAlias.set("StarDs")
        }
    }
}

dependencies {
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    implementation(project(":plasma-stards-view"))
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
