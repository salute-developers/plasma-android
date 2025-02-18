import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.serv.compose"
    resourcePrefix = "serv_cmp"
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
        ?: throw GradleException("sdds serv version must be specified")
    themeSource(name = "sdds_serv", version = themeVersion, alias = "SddsServ")
    compose()
    ktPackage(ktPackage = "com.sdds.serv")
    mode(THEME)
    autoGenerate(false)
    outputLocation(SRC)
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.test.roborazzi)
    testImplementation(libs.test.roborazzi.rule)
    testImplementation(libs.base.test.unit.robolectric)
    testImplementation(libs.test.roborazzi)
    testImplementation(libs.base.test.ui.compose.jUnit4)
    testImplementation(libs.test.roborazzi.compose)
    testImplementation("sdds-core:testing")
}
