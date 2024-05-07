import com.sdds.plugin.attributebuilder.AttributeBuilderExtension
import com.sdds.plugin.attributebuilder.AttributeBuilderTarget

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id(libs.plugins.attributebuilder.get().pluginId)
    alias(libs.plugins.paparazzi)
    alias(libs.plugins.binary.compatibility.validator)
}

configure<AttributeBuilderExtension> {
    themeUrl.set("file://${parent?.projectDir?.path}/meta/meta.zip")
    target.set(AttributeBuilderTarget.View("sdds"))
}

group = "sdds-core"

android {
    namespace = "com.sdds.uikit"
}

dependencies {
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
    androidTestImplementation(libs.base.test.ui.espresso.core)
}
