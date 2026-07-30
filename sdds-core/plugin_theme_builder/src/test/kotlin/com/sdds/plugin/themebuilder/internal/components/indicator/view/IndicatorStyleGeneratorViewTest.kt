package com.sdds.plugin.themebuilder.internal.components.indicator.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorConfig
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorProperties
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorVariation
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorView
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.ByteArrayOutputStream

class IndicatorStyleGeneratorViewTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate uses appearance name for styles resources and color states`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val colorStateOutput = ByteArrayOutputStream()
        val xmlBuilderFactory = XmlResourcesDocumentBuilderFactory(RESOURCE_PREFIX, THEME_NAME)
        val resourcePrefixConfig = ResourcePrefixConfig(RESOURCE_PREFIX, true)
        val packageResolver = PackageResolver("com.test")
        val underTest = IndicatorStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = ResourceReferenceProvider(RESOURCE_PREFIX, THEME_NAME),
            dimensAggregator = DimensAggregator(),
            outputResDir = outputResDir,
            resourcePrefix = RESOURCE_PREFIX,
            styleComponentName = APPEARANCE_NAME,
            colorStateComponentName = APPEARANCE_NAME,
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
                colorStateOutputLocation = KtFileBuilder.OutputLocation.Stream(colorStateOutput),
                resourcePrefixConfig = resourcePrefixConfig,
            ),
        )

        val result = underTest.generate(CONFIG) as ComponentStyleGenerator.Result.Xml

        assertEquals("Indicator", result.coreName)
        assertEquals(APPEARANCE_NAME, result.styleName)

        val styles = outputResDir.resolve("values/styles-avatarindicator.xml")
        val attributes = outputResDir.resolve("values/avatarindicator-attributes.xml")
        val backgroundColors = outputResDir.resolve("color/thmbldr_avatar_indicator_bg_color.xml")

        assertTrue(styles.exists())
        assertTrue(attributes.exists())
        assertTrue(backgroundColors.exists())
        assertTrue(styles.readText().contains("TestTheme.Components.AvatarIndicator"))
        assertTrue(attributes.readText().contains("thmbldr_avatarindicatorColors"))
        assertTrue(colorStateOutput.toString().contains("AvatarIndicatorColorState"))
    }

    private companion object {
        const val RESOURCE_PREFIX = "thmbldr"
        const val THEME_NAME = "TestTheme"
        const val APPEARANCE_NAME = "AvatarIndicator"

        val CONFIG = IndicatorConfig(
            view = mapOf(
                "default" to IndicatorView(
                    props = IndicatorProperties(
                        backgroundColor = SolidColor(default = "surfaceDefault"),
                    ),
                ),
            ),
            props = IndicatorProperties(),
            variations = listOf(
                IndicatorVariation(
                    id = "l",
                    props = IndicatorProperties(
                        width = Dimension(24f),
                        height = Dimension(24f),
                    ),
                ),
            ),
        )
    }
}
