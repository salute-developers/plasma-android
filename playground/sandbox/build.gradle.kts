import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-app")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.sandbox"
    defaultConfig {
        applicationId = "com.sdds.playground.sandbox"
    }
    buildFeatures {
        viewBinding = true
    }
}

themeBuilder {
    themeSource(name = "stylesSalute")
    view {
        themeParents {
            materialComponentsTheme("DayNight")
        }
        setupShapeAppearance(sddsShape())
    }
    resourcesPrefix("thmbldr")
    ktPackage("com.sdds.playground.sandbox.tokens")
    mode(ThemeBuilderMode.THEME)
}

dependencies {
    implementation("sdds-core:uikit")
    implementation("sdds-core:icons")

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
    implementation(libs.base.androidX.constraintLayout)
    implementation(libs.base.androidX.lifecycle.viewmodel)
    implementation(libs.base.androidX.navigation.fragment)
    implementation(libs.base.androidX.navigation.ui)
    implementation(libs.base.androidX.activity.ktx)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)
}
