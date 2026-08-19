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
    id(libs.plugins.dsbuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
    id("convention.docusaurus")
}

android {
    namespace = "com.sdds.finai.compose"
    resourcePrefix = themeResPrefix
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
    packageOfResClass = "com.sdds.finai.compose.generated.resources"
}

dsBuilder {
    autoGenerate.set(false)
    targets {
        compose(multiplatform = true)
    }
    packageName.set("com.sdds.finai")
    outputLocation.set(SRC)
    theme {
        source(name = themeName, version = themeVersion, alias = themeAlias)
        mode.set(THEME)
    }
    components {
        source(name = componentsName, version = componentsVersion, alias = themeAlias)
        componentsMetaStyleClass.set(true)
    }
}
