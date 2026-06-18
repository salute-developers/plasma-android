package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.VariationReference
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.squareup.kotlinpoet.ClassName
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

class VariationTreeProcessorTest {

    private val mockKtFileBuilder: KtFileBuilder = mockk(relaxed = true)
    private val mockKtFileBuilderFactory: KtFileBuilderFactory = mockk {
        every { create(any<String>(), any<String>()) } returns mockk(relaxed = true)
    }
    private val styleBuilderType = ClassName("com.sdds.compose.uikit", "TestStyleBuilder")
    private val styleType = ClassName("com.sdds.compose.uikit", "TestStyle")

    private fun createProcessor() = VariationTreeProcessor(
        camelComponentName = "Test",
        componentStyleName = "TestStyle",
        styleBuilderType = styleBuilderType,
        styleType = styleType,
        baseWrapperInterfaceName = "WrapperTest",
        styleBuilderFactoryFunName = "builder",
        ktFileBuilder = mockKtFileBuilder,
        ktFileBuilderFactory = mockKtFileBuilderFactory,
        componentPackage = "com.sdds.styles.test",
        outputLocation = KtFileBuilder.OutputLocation.Directory(File(".")),
    )

    @Test
    fun `компонент без вариаций — создаётся вариация Default`() {
        val config = simpleConfig(props = emptyOwner())

        val result = createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "view",
            configuredViewBinding = null,
            builderCallsProvider = { _, _ -> emptyList() },
        )

        // When no variations defined, processor adds a "Default" child
        assertEquals(mapOf("Default" to VariationReference("Test.Default")), result.variations)
    }

    @Test
    fun `компонент с одной вариацией — словарь содержит вариацию`() {
        // Variation id "l" → camelCase "L" → reference "Test.L"
        val config = configWithVariations(listOf(simpleVariation("l")))

        val result = createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "view",
            configuredViewBinding = null,
            builderCallsProvider = { _, _ -> emptyList() },
        )

        assertTrue(result.variations.containsKey("l"))
        assertEquals(VariationReference("Test.L"), result.variations["l"])
    }

    @Test
    fun `компонент с иерархией вариаций — словарь содержит полные пути`() {
        // "l" → "Test.L", "l.brand" with parent "l" → name "brand" → "Test.L.Brand"
        val config = configWithVariations(
            listOf(
                simpleVariation("l"),
                simpleVariation("l.brand", parent = "l"),
            ),
        )

        val result = createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "view",
            configuredViewBinding = null,
            builderCallsProvider = { _, _ -> emptyList() },
        )

        assertTrue(result.variations.containsKey("l.brand"))
        assertEquals(VariationReference("Test.L.Brand"), result.variations["l.brand"])
    }

    @Test
    fun `builderCallsProvider вызывается для каждой вариации`() {
        val callLog = mutableListOf<String>()
        val config = configWithVariations(
            listOf(simpleVariation("size.l")),
        )

        createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "view",
            configuredViewBinding = null,
            builderCallsProvider = { _, variationId ->
                callLog.add(variationId)
                emptyList()
            },
        )

        assertTrue(callLog.isNotEmpty())
    }

    private fun emptyOwner(): UniversalPropertyOwner =
        UniversalPropertyOwner(kotlinx.serialization.json.JsonObject(emptyMap()))

    private fun simpleConfig(props: PropertyOwner): Config<*> = object : Config<PropertyOwner> {
        override val props: PropertyOwner = props
        override val view: Map<String, ViewVariation<PropertyOwner>> = emptyMap()
        override val variations: List<ChildVariation<PropertyOwner>> = emptyList()
        override val bindings: List<Bindings> = emptyList()
    }

    private fun configWithVariations(
        variations: List<ChildVariation<PropertyOwner>>,
    ): Config<*> = object : Config<PropertyOwner> {
        override val props: PropertyOwner = emptyOwner()
        override val view: Map<String, ViewVariation<PropertyOwner>> = emptyMap()
        override val variations: List<ChildVariation<PropertyOwner>> = variations
        override val bindings: List<Bindings> = emptyList()
    }

    private fun simpleVariation(id: String, parent: String? = null): ChildVariation<PropertyOwner> =
        object : ChildVariation<PropertyOwner> {
            override val id: String = id
            override val parent: String? = parent
            override val binding: List<Binding>? = null
            override val view: Map<String, ViewVariation<PropertyOwner>> = emptyMap()
            override val props: PropertyOwner = emptyOwner()
        }
}
