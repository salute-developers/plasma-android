import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME
import utils.addDefaultTargets
import utils.componentsName
import utils.componentsVersion
import utils.themeAlias
import utils.themeName
import utils.themeResPrefix
import utils.themeVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.cmp-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
    id("convention.docusaurus")
}

android {
    namespace = "com.sdds.serv.compose"
    resourcePrefix = themeResPrefix

    // roborazzi (Robolectric) screenshot-тесты живут в androidUnitTest.
    // Настройки повторяют convention.testing, которую нельзя применить к KMP-модулю
    // (она тянет convention.android-lib).
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            all { it.systemProperty("moduleDir", projectDir.absolutePath) }
        }
    }
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.sdds.uikit.compose)
                implementation(iconsCompose.sdds.icons.compose)
                implementation(compose.foundation)
                implementation(compose.components.resources)
            }
        }
        androidUnitTest {
            dependencies {
                implementation("integration-core:uikit-testcases")
                implementation("integration-core:uikit-compose-testcases")
                implementation("integration-core:uikit-compose-fixtures")
                implementation(libs.base.test.unit.jUnit)
                implementation(libs.base.test.unit.robolectric)
                implementation(libs.base.test.ui.compose.jUnit4)
                implementation(libs.test.roborazzi)
                implementation(libs.test.roborazzi.rule)
                implementation(libs.test.roborazzi.compose)
            }
        }
    }
}

tasks.withType<Test> {
    maxHeapSize = "4096m"
}

compose.resources {
    publicResClass = true
    packageOfResClass = "com.sdds.serv.compose.generated.resources"
}

themeBuilder {
    themeSource(name = themeName, version = themeVersion, alias = themeAlias)
    componentSource(name = componentsName, version = componentsVersion, alias = themeAlias)
    compose {
        componentsMetaStyleClass(true)
        multiplatform(true)
    }
    ktPackage(ktPackage = "com.sdds.serv")
    mode(THEME)
    autoGenerate(false)
    outputLocation(SRC)
}
