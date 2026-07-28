import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ThemeBuilderMode
import ru.sberdevices.starplugin.stardimens.GenerateStarDimensTask
import utils.componentsName
import utils.componentsVersion
import utils.themeAlias
import utils.themeResPrefix
import utils.themeUrl

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing-compose")
    id(libs.plugins.dsbuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
    id("star-dimens-generator")
    id("convention.docusaurus")
}

android {
    namespace = "com.sdkit.star.designsystem.compose"
    resourcePrefix = themeResPrefix
}

dsBuilder {
    compose()
    packageName.set("com.sdkit.star.designsystem")
    resourcePrefix.set(themeResPrefix)
    outputLocation.set(OutputLocation.SRC)
    dimensions {
        fromResources(true)
        multiplier(2f)
        breakPoints {
            large(960)
            medium(560)
        }
    }
    theme {
        source(url = themeUrl, name = themeAlias)
        autoGenerate.set(false)
        mode.set(ThemeBuilderMode.THEME)
    }
    components {
        source(name = componentsName, version = componentsVersion, alias = themeAlias)
        componentsMetaStyleClass.set(true)
    }
}

dependencies {
    testImplementation("integration-core:uikit-compose-fixtures")
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}


tasks.matching { it.name.matches(Regex("generate\\w+Resources")) }.configureEach {
    dependsOn(tasks.withType<GenerateStarDimensTask>())
}
