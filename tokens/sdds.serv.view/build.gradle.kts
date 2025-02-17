import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
    alias(libs.plugins.roborazzi)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.sdds.serv"
    resourcePrefix = "serv"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
    tasks.withType<Test> {
        maxHeapSize = "4096m"
    }
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("star design service version must be specified")
    themeSource(name = "sdds_serv", version = themeVersion, alias = "Sdds")
    view{
        themeParents {
            materialComponentsTheme()
        }
        setupShapeAppearance(sddsShape())
    }
    ktPackage("com.sdds.serv")
    autoGenerate(false)
    mode(THEME)
    outputLocation(SRC)
}

dependencies {
    implementation(libs.sdds.icons)
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    //tests
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.test.roborazzi)
    testImplementation(libs.test.roborazzi.rule)
    testImplementation(libs.base.test.unit.robolectric)
    testImplementation(libs.test.roborazzi)
    testImplementation(libs.base.test.ui.compose.jUnit4)
    testImplementation(libs.test.roborazzi.compose)
    testImplementation("sdds-core:testing")
}
