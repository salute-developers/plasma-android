import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode
import ru.sberdevices.starplugin.stardimens.GenerateStarDimensTask
import utils.componentsName
import utils.componentsVersion
import utils.themeAlias
import utils.themeUrl
import utils.themeResPrefix

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.dsbuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing")
    alias(libs.plugins.roborazzi)
    id("star-dimens-generator")
    id("convention.docusaurus")
}

android {
    namespace = "com.sdkit.star.designsystem"
    resourcePrefix = themeResPrefix
}

dsBuilder {
    autoGenerate.set(false)
    targets {
        view {
            themeParents {
                materialComponentsTheme("NoActionBar")
                materialComponentsTheme("Dialog")
            }
            setupShapeAppearance(sddsShape())
        }
    }
    packageName.set("com.sdkit.star.designsystem")
    resourcePrefix.set(themeResPrefix)
    outputLocation.set(OutputLocation.SRC)
    dimensions {
        multiplier(2f)
        breakPoints {
            large(960)
            medium(560)
        }
    }
    theme {
        source(url = themeUrl, name = themeAlias)
        mode.set(ThemeBuilderMode.THEME)
    }
    components {
        source(name = componentsName, version = componentsVersion, alias = themeAlias)
    }
}

dependencies {
    testImplementation("integration-core:uikit-fixtures")
    implementation(icons.sdds.icons)
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
}

tasks.matching { it.name.matches(Regex("generate\\w+Resources")) }.configureEach {
    dependsOn(tasks.withType<GenerateStarDimensTask>())
}
