import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-app")
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
    id("kotlin-parcelize")
}

android {
    namespace = "com.sdds.playground.sandbox"
    defaultConfig {
        applicationId = "com.sdds.playground.sandbox"
    }
    buildFeatures {
        viewBinding = true
    }
    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
}

themeBuilder {
    themeSource(name = "sdds_serv", version = "latest")
    view {
        themeParents {
            materialComponentsTheme()
        }
        setupShapeAppearance(sddsShape())
    }
    resourcesPrefix("serv")
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
    implementation(libs.base.glide)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)

    //Screenshot tests
    testImplementation(libs.test.roborazzi)
    testImplementation(libs.test.roborazzi.compose)
    testImplementation(libs.test.roborazzi.rule)
    testImplementation(libs.base.test.unit.robolectric)
}
