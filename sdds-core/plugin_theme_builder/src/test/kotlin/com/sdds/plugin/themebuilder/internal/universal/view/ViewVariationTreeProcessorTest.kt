package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalChildVariation
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalComponentConfig
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class ViewVariationTreeProcessorTest {

    @Test
    fun `process рекурсивно обходит дерево вариаций`() {
        val styles = mutableListOf<String>()
        val overlays = mutableListOf<String>()
        val config = UniversalComponentConfig(
            variations = listOf(
                UniversalChildVariation(id = "m"),
                UniversalChildVariation(id = "m.brand", parent = "m"),
            ),
        )

        ViewVariationTreeProcessor(resourceWriter()).process(
            config = config,
            emitters = ViewVariationTreeProcessor.Emitters(
                style = { variation, _, _ -> styles += variation },
                colorStateStyle = { _, _, _ -> },
                overlay = { variation, _, _ -> overlays += variation },
            ),
        )

        assertEquals(listOf("", "m", "m_brand"), styles)
        assertEquals(listOf("m", "m_brand"), overlays)
    }

    private fun resourceWriter() = ViewStyleResourceWriter(
        xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("test", "TestTheme"),
        resourceReferenceProvider = ResourceReferenceProvider("test", "TestTheme"),
        dimensAggregator = DimensAggregator(),
        outputResDir = mockk(relaxed = true),
        resourcePrefix = "test",
        coreComponentName = "Test",
        componentParent = "Sdds.Components.Test",
        viewColorStateGeneratorFactory = mockk<ViewColorStateGeneratorFactory>(relaxed = true),
        colorStateListGeneratorFactory = mockk<ColorStateListGeneratorFactory>(relaxed = true),
        defStyleAttr = "sd_testStyle",
    )
}
