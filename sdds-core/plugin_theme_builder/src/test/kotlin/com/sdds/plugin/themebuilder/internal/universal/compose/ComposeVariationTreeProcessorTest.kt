package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.universal.Binding
import com.sdds.plugin.themebuilder.internal.universal.BindingType
import com.sdds.plugin.themebuilder.internal.universal.Bindings
import com.sdds.plugin.themebuilder.internal.universal.ChildVariation
import com.sdds.plugin.themebuilder.internal.universal.Config
import com.sdds.plugin.themebuilder.internal.universal.PropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.VariationProp
import com.sdds.plugin.themebuilder.internal.universal.VariationReference
import com.sdds.plugin.themebuilder.internal.universal.ViewVariation
import com.squareup.kotlinpoet.ClassName
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

class ComposeVariationTreeProcessorTest {

    private val mockKtFileBuilder: KtFileBuilder = mockk(relaxed = true)
    private val mockKtFileBuilderFactory: KtFileBuilderFactory = mockk {
        every { create(any<String>(), any<String>()) } returns mockk(relaxed = true)
    }
    private val styleBuilderType = ClassName("com.sdds.compose.uikit", "TestStyleBuilder")
    private val styleType = ClassName("com.sdds.compose.uikit", "TestStyle")

    private fun createProcessor() = ComposeVariationTreeProcessor(
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
        val config = configWithVariations(
            listOf(
                simpleVariation(
                    id = "l",
                    binding = listOf(Binding("size", "l")),
                ),
            ),
        )

        val result = createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "view",
            configuredViewBinding = null,
            builderCallsProvider = { _, _ -> emptyList() },
        )

        assertTrue(result.variations.containsKey("l"))
        assertEquals(VariationReference("Test.L"), result.variations["l"])
        assertEquals(
            listOf(VariationProp(name = "size", value = "l")),
            result.variationProps["l"],
        )
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
    fun `view вложенной вариации добавляется к полному пути`() {
        val config = configWithVariations(
            listOf(
                simpleVariation("m"),
                simpleVariation(
                    id = "m.brand",
                    parent = "m",
                    view = mapOf("warning" to simpleView()),
                ),
            ),
        )

        val result = createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "appearance",
            configuredViewBinding = null,
            builderCallsProvider = { _, _ -> emptyList() },
        )

        assertEquals(
            VariationReference("Test.M.Brand.Warning"),
            result.variations["m.brand.warning"],
        )
        assertEquals(
            listOf(VariationProp(name = "appearance", value = "warning")),
            result.variationProps["m.brand.warning"],
        )
    }

    @Test
    fun `соседние числовые сегменты разделяются x в kotlin-имени`() {
        val config = configWithVariations(
            listOf(simpleVariation("size.12.16")),
        )

        val result = createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "view",
            configuredViewBinding = null,
            builderCallsProvider = { _, _ -> emptyList() },
        )

        assertEquals(
            VariationReference("Test.Size12x16"),
            result.variations["size.12.16"],
        )
    }

    @Test
    fun `builderCallsProvider вызывается для view корня и дочерней вариации`() {
        val callLog = mutableListOf<String>()
        val config = configWithVariations(
            variations = listOf(simpleVariation("size.l")),
            view = mapOf("default" to simpleView()),
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

        assertEquals(listOf("default", "Test", "size_l"), callLog)
    }

    @Test
    fun `компонент только с view — создаёт view-вариации и обновляет component props`() {
        val config = simpleConfig(
            view = mapOf(
                "default" to simpleView(),
                "warning" to simpleView(),
            ),
        )
        val sizeProp = VariationProp(name = "size", values = setOf("s", "m"))
        val staleViewProp = VariationProp(name = "appearance", values = setOf("old"))

        val result = createProcessor().process(
            config = config,
            componentProps = listOf(sizeProp, staleViewProp),
            viewPropName = "appearance",
            configuredViewBinding = Bindings(
                name = "appearance",
                type = BindingType.VIEW,
                values = setOf("legacy"),
                defaultValue = "legacy",
            ),
            builderCallsProvider = { _, _ -> emptyList() },
        )

        assertEquals(
            mapOf(
                "default" to VariationReference("Test.Default"),
                "warning" to VariationReference("Test.Warning"),
            ),
            result.variations,
        )
        assertEquals(
            listOf(VariationProp(name = "appearance", value = "default")),
            result.variationProps["default"],
        )
        assertEquals(
            listOf(VariationProp(name = "appearance", value = "warning")),
            result.variationProps["warning"],
        )
        assertEquals(
            listOf(
                sizeProp,
                VariationProp(
                    name = "appearance",
                    values = setOf("legacy", "default", "warning"),
                    defaultValue = "legacy",
                ),
            ),
            result.componentProps,
        )
    }

    @Test
    fun `обычные и view-вариации образуют комбинации с объединёнными props`() {
        val config = configWithVariations(
            variations = listOf(
                simpleVariation(
                    id = "l",
                    binding = listOf(Binding("size", "l")),
                ),
            ),
            view = mapOf(
                "default" to simpleView(),
                "warning" to simpleView(),
            ),
        )

        val result = createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "appearance",
            configuredViewBinding = null,
            builderCallsProvider = { _, _ -> emptyList() },
        )

        assertEquals(
            mapOf(
                "l.default" to VariationReference("Test.L.Default"),
                "l.warning" to VariationReference("Test.L.Warning"),
            ),
            result.variations,
        )
        assertEquals(
            listOf(
                VariationProp(name = "size", value = "l"),
                VariationProp(name = "appearance", value = "warning"),
            ),
            result.variationProps["l.warning"],
        )
    }

    @Test
    fun `явный binding view-вариации используется вместо автоматического view prop`() {
        val config = simpleConfig(
            view = mapOf(
                "warning" to simpleView(
                    binding = listOf(Binding("tone", "danger")),
                ),
            ),
        )

        val result = createProcessor().process(
            config = config,
            componentProps = emptyList(),
            viewPropName = "appearance",
            configuredViewBinding = null,
            builderCallsProvider = { _, _ -> emptyList() },
        )

        assertEquals(
            listOf(VariationProp(name = "tone", value = "danger")),
            result.variationProps["warning"],
        )
        assertTrue(result.componentProps.isEmpty())
    }

    private fun emptyOwner(): UniversalPropertyOwner =
        UniversalPropertyOwner(kotlinx.serialization.json.JsonObject(emptyMap()))

    private fun simpleConfig(
        props: PropertyOwner = emptyOwner(),
        view: Map<String, ViewVariation<PropertyOwner>> = emptyMap(),
    ): Config<*> = object : Config<PropertyOwner> {
        override val props: PropertyOwner = props
        override val view: Map<String, ViewVariation<PropertyOwner>> = view
        override val variations: List<ChildVariation<PropertyOwner>> = emptyList()
        override val bindings: List<Bindings> = emptyList()
    }

    private fun configWithVariations(
        variations: List<ChildVariation<PropertyOwner>>,
        view: Map<String, ViewVariation<PropertyOwner>> = emptyMap(),
    ): Config<*> = object : Config<PropertyOwner> {
        override val props: PropertyOwner = emptyOwner()
        override val view: Map<String, ViewVariation<PropertyOwner>> = view
        override val variations: List<ChildVariation<PropertyOwner>> = variations
        override val bindings: List<Bindings> = emptyList()
    }

    private fun simpleVariation(
        id: String,
        parent: String? = null,
        binding: List<Binding>? = null,
        view: Map<String, ViewVariation<PropertyOwner>> = emptyMap(),
    ): ChildVariation<PropertyOwner> =
        object : ChildVariation<PropertyOwner> {
            override val id: String = id
            override val parent: String? = parent
            override val binding: List<Binding>? = binding
            override val view: Map<String, ViewVariation<PropertyOwner>> = view
            override val props: PropertyOwner = emptyOwner()
        }

    private fun simpleView(
        binding: List<Binding>? = null,
    ): ViewVariation<PropertyOwner> = object : ViewVariation<PropertyOwner> {
        override val props: PropertyOwner = emptyOwner()
        override val binding: List<Binding>? = binding
    }
}
