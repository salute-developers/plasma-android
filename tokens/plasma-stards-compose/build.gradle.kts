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
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
    id("star-dimens-generator")
    id("convention.docusaurus")
}

android {
    namespace = "com.sdkit.star.designsystem.compose"
    resourcePrefix = themeResPrefix
}

themeBuilder {
    themeSource {
        url(themeUrl)
        name(themeAlias)
    }
    componentSource(name = componentsName, componentsVersion, themeAlias)
    compose()
    ktPackage("com.sdkit.star.designsystem")
    resourcesPrefix(prefix = themeResPrefix)
    outputLocation(OutputLocation.SRC)
    autoGenerate(false)
    mode(ThemeBuilderMode.THEME)
    dimensions {
        fromResources(true)
        multiplier(2f)
        breakPoints {
            large(960)
            medium(560)
        }
    }
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}


tasks.matching { it.name.matches(Regex("generate\\w+Resources")) }.configureEach {
    dependsOn(tasks.withType<GenerateStarDimensTask>())
}
