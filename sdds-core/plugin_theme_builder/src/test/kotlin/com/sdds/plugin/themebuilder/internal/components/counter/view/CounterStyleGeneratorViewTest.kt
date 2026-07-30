package com.sdds.plugin.themebuilder.internal.components.counter.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import com.sdds.plugin.themebuilder.internal.components.counter.CounterConfig
import com.sdds.plugin.themebuilder.internal.components.counter.CounterProperties
import com.sdds.plugin.themebuilder.internal.components.counter.CounterVariation
import com.sdds.plugin.themebuilder.internal.components.counter.CounterView
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

class CounterStyleGeneratorViewTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate uses appearance name for styles resources and color states`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val colorStateOutput = ByteArrayOutputStream()
        val xmlBuilderFactory = XmlResourcesDocumentBuilderFactory(RESOURCE_PREFIX, THEME_NAME)
        val resourcePrefixConfig = ResourcePrefixConfig(RESOURCE_PREFIX, true)
        val packageResolver = PackageResolver("com.test")
        val underTest = CounterStyleGeneratorView(
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

        assertEquals("Counter", result.coreName)
        assertEquals(APPEARANCE_NAME, result.styleName)

        val styles = outputResDir.resolve("values/styles-segmentitemcounter.xml")
        val attributes = outputResDir.resolve("values/segmentitemcounter-attributes.xml")
        val backgroundColors = outputResDir.resolve("color/thmbldr_segment_item_counter_bg_color.xml")

        assertTrue(styles.exists())
        assertTrue(attributes.exists())
        assertTrue(backgroundColors.exists())
        assertTrue(styles.readText().contains("TestTheme.Components.SegmentItemCounter"))
        assertTrue(attributes.readText().contains("thmbldr_segmentitemcounterColors"))
        assertTrue(colorStateOutput.toString().contains("SegmentItemCounterColorState"))
    }

    private companion object {
        const val RESOURCE_PREFIX = "thmbldr"
        const val THEME_NAME = "TestTheme"
        const val APPEARANCE_NAME = "SegmentItemCounter"

        val CONFIG = CounterConfig(
            view = mapOf(
                "default" to CounterView(
                    props = CounterProperties(
                        backgroundColor = SolidColor(default = "surfaceDefault"),
                        textColor = SolidColor(default = "textDefault"),
                    ),
                ),
            ),
            props = CounterProperties(),
            variations = listOf(
                CounterVariation(
                    id = "s",
                    props = CounterProperties(
                        minWidth = Dimension(20f),
                        minHeight = Dimension(20f),
                    ),
                ),
            ),
        )
    }
}
