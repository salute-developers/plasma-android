package com.sdds.plugin.themebuilder.internal.components.slider.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import com.sdds.plugin.themebuilder.internal.components.slider.SliderConfig
import com.sdds.plugin.themebuilder.internal.components.slider.SliderProperties
import com.sdds.plugin.themebuilder.internal.components.slider.SliderView
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class SliderStyleGeneratorViewTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate uses color value state list when gradient is declared inside color state`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val xmlBuilderFactory = XmlResourcesDocumentBuilderFactory(RESOURCE_PREFIX, THEME_NAME)
        val resourcePrefixConfig = ResourcePrefixConfig(RESOURCE_PREFIX, true)
        val packageResolver = PackageResolver("com.test")
        val underTest = SliderStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = ResourceReferenceProvider(RESOURCE_PREFIX, THEME_NAME),
            dimensAggregator = DimensAggregator(),
            outputResDir = outputResDir,
            resourcePrefix = RESOURCE_PREFIX,
            styleComponentName = COMPONENT_NAME,
            colorStateListGeneratorFactory = ColorStateListGeneratorFactory(
                xmlBuilderFactory,
                resourcePrefixConfig,
                outputResDir,
            ),
            viewColorStateGeneratorFactory = ViewColorStateGeneratorFactory(
                ktFileBuilderFactory = KtFileBuilderFactory(packageResolver),
                xmlBuilderFactory = xmlBuilderFactory,
                packageResolver = packageResolver,
                namespace = "com.test",
                outputResDir = outputResDir,
                colorStateOutputLocation = KtFileBuilder.OutputLocation.Directory(temporaryFolder.root),
                resourcePrefixConfig = resourcePrefixConfig,
            ),
        )

        underTest.generate(CONFIG)

        val styles = outputResDir.resolve("values/styles-slidertest.xml")
        val colorValueStateList = outputResDir.resolve("xml/thmbldr_slider_test_stroke_color.xml")
        val colorStateList = outputResDir.resolve("color/thmbldr_slider_test_stroke_color.xml")

        assertTrue(styles.readText().contains("@xml/thmbldr_slider_test_stroke_color"))
        assertTrue(colorValueStateList.exists())
        assertTrue(colorValueStateList.readText().contains("<color-selector"))
        assertTrue(colorValueStateList.readText().contains("app:sd_color"))
        assertFalse(colorStateList.exists())
    }

    private companion object {
        const val RESOURCE_PREFIX = "thmbldr"
        const val THEME_NAME = "TestTheme"
        const val COMPONENT_NAME = "SliderTest"

        val CONFIG = SliderConfig(
            view = mapOf(
                "gradient" to SliderView(
                    props = SliderProperties(
                        thumbStrokeColor = SolidColor(
                            default = "outline.default.solid-secondary",
                            states = listOf(
                                ColorState(
                                    state = listOf("pressed"),
                                    value = "surface.default.accent-gradient",
                                    type = "gradient",
                                ),
                            ),
                        ),
                    ),
                ),
            ),
            props = SliderProperties(),
        )
    }
}
