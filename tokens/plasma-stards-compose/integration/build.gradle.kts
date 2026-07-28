@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.dsbuilder.get().pluginId)
    id("convention.compose")
}

android {
    namespace = "com.sdkit.star.designsystem.compose.integration"
}

dsBuilder {
    sandbox {
        compose {
            generatedPackageName.set("com.sdkit.star.designsystem.integration")
            themeAlias.set("StarDs")
        }
    }
}

dependencies {
    implementation(project(":plasma-stards-compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.activity)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
}
