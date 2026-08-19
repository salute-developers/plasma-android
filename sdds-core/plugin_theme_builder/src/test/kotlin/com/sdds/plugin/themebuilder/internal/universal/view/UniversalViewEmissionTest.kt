package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.universal.PropertyType
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalComponentConfig
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.componentStyleXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import kotlinx.serialization.decodeFromString
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Правила проекции меты на XML: типы свойств, размещение, состояния и значения
 * под состоянием. Проверяется вывод генератора на синтетическом компоненте.
 */
class UniversalViewEmissionTest {

    private lateinit var xmlBuilderFactory: XmlResourcesDocumentBuilderFactory
    private lateinit var resourceReferenceProvider: ResourceReferenceProvider
    private lateinit var dimensAggregator: DimensAggregator
    private lateinit var mockOutputResDir: File
    private lateinit var styleOutput: ByteArrayOutputStream
    private lateinit var colorOutput: ByteArrayOutputStream
    private lateinit var ktOutput: ByteArrayOutputStream

    @Before
    fun setUp() {
        mockkObject(FileProvider)
        xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme")
        resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme")
        dimensAggregator = DimensAggregator()
        styleOutput = ByteArrayOutputStream()
        colorOutput = ByteArrayOutputStream()
        ktOutput = ByteArrayOutputStream()
        val styleFile = mockk<File>(relaxed = true) { every { fileWriter() } returns styleOutput.writer() }
        val colorFile = mockk<File>(relaxed = true) { every { fileWriter() } returns colorOutput.writer() }
        val attrsFile = mockk<File>(relaxed = true) {
            every { fileWriter() } returns ByteArrayOutputStream().writer()
        }
        mockOutputResDir = mockk(relaxed = true) {
            every { componentStyleXmlFile(any()) } returns styleFile
            every { attrsFile(any()) } returns attrsFile
            every { colorXmlFile(any(), any()) } returns colorFile
        }
    }

    @After
    fun tearDown() {
        clearAllMocks()
    }

    @Test
    fun `each property type is projected to its own emitter`() {
        val meta = meta(
            params = listOf(
                PropertyMeta("shape", "sd_shapeAppearance", PropertyType.SHAPE, "shape"),
                PropertyMeta("shadow", "sd_shadowAppearance", PropertyType.SHADOW, "shadow"),
                PropertyMeta("icon", "sd_icon", PropertyType.ICON, "icon"),
                PropertyMeta("enabled", "sd_enabled", PropertyType.BOOLEAN, "enabled"),
                PropertyMeta("threshold", "sd_threshold", PropertyType.INTEGER, "threshold"),
                PropertyMeta("labelStyle", "sd_labelAppearance", PropertyType.TYPOGRAPHY, "label_appearance"),
                PropertyMeta("size", "sd_size", PropertyType.DIMENSION, "size"),
            ),
        )
        val config = config(
            """
            "shape": { "value": "round.l" },
            "shadow": { "value": "down.soft.s" },
            "icon": { "value": "ic.close" },
            "enabled": { "value": true },
            "threshold": { "value": "3" },
            "labelStyle": { "value": "body.l.bold" },
            "size": { "value": 24.0 }
            """,
        )

        generator(meta).generate(config)
        val style = styleOutput.toString()

        assertTrue(style, style.contains("""<item name="sd_shapeAppearance">?thmbldr_shapeRoundL</item>"""))
        assertTrue(style, style.contains("""<item name="sd_shadowAppearance">?thmbldr_shadowDownSoftS</item>"""))
        assertTrue(style, style.contains("""<item name="sd_icon">@drawable/ic_ic_close</item>"""))
        assertTrue(style, style.contains("""<item name="sd_enabled">true</item>"""))
        assertTrue(style, style.contains("""<item name="sd_threshold">3</item>"""))
        assertTrue(style, style.contains("""<item name="sd_labelAppearance">@style/"""))
        assertTrue(style, style.contains("""<item name="sd_size">@dimen/thmbldr_test_component_size</item>"""))
    }

    @Test
    fun `enum value is projected through configName`() {
        val meta = meta(
            params = listOf(
                PropertyMeta(
                    id = "placement",
                    attrName = "sd_labelPlacement",
                    type = PropertyType.VALUE,
                    resSuffix = "placement",
                    values = listOf(EnumValue("spaceBetween", "1", "space-between")),
                ),
            ),
        )

        generator(meta).generate(config(""""placement": { "value": "space-between" }"""))

        assertTrue(
            styleOutput.toString(),
            styleOutput.toString().contains("""<item name="sd_labelPlacement">spaceBetween</item>"""),
        )
    }

    @Test
    fun `shape adjustment is emitted only by the owning property`() {
        val meta = meta(
            params = listOf(
                PropertyMeta(
                    id = "externalShape",
                    attrName = "sd_externalShapeAppearance",
                    type = PropertyType.SHAPE,
                    resSuffix = "external_shape",
                ),
                PropertyMeta(
                    id = "shape",
                    attrName = "sd_shapeAppearance",
                    type = PropertyType.SHAPE,
                    resSuffix = "shape",
                    shapeAdjustment = true,
                ),
            ),
        )

        generator(meta).generate(
            config(
                """
                "externalShape": { "value": "round.l", "adjustment": 2.0 },
                "shape": { "value": "round.m", "adjustment": 4.0 }
                """,
            ),
        )
        val style = styleOutput.toString()

        assertTrue(style, style.contains("""<item name="sd_externalShapeAppearance">?thmbldr_shapeRoundL</item>"""))
        assertTrue(style, style.contains("""<item name="sd_shapeAppearance">?thmbldr_shapeRoundM</item>"""))
        assertEquals(1, style.split("sd_shapeAppearanceAdjustment").size - 1)
    }

    @Test
    fun `two owners of shape adjustment in one style are rejected`() {
        val meta = meta(
            params = listOf(
                PropertyMeta(
                    id = "externalShape",
                    attrName = "sd_externalShapeAppearance",
                    type = PropertyType.SHAPE,
                    resSuffix = "external_shape",
                    shapeAdjustment = true,
                ),
                PropertyMeta(
                    id = "shape",
                    attrName = "sd_shapeAppearance",
                    type = PropertyType.SHAPE,
                    resSuffix = "shape",
                    shapeAdjustment = true,
                ),
            ),
        )

        val ex = assertThrows(ThemeBuilderException::class.java) {
            generator(meta).generate(
                config(
                    """
                    "externalShape": { "value": "round.l", "adjustment": 2.0 },
                    "shape": { "value": "round.m", "adjustment": 4.0 }
                    """,
                ),
            )
        }
        assertTrue(ex.message, ex.message!!.contains("sd_shapeAppearanceAdjustment"))
    }

    @Test
    fun `component style attribute distinguishes style from overlay`() {
        val meta = meta(
            params = listOf(
                PropertyMeta("statusStyle", "sd_statusStyle", PropertyType.COMPONENT_STYLE, "status_style"),
                PropertyMeta("chipStyle", "sd_chipStyleOverlay", PropertyType.COMPONENT_STYLE, "chip_style"),
            ),
        )

        generator(meta).generate(
            config(
                """
                "statusStyle": { "value": "indicator.l" },
                "chipStyle": { "value": "chip.m.secondary" }
                """,
            ),
        )
        val style = styleOutput.toString()

        assertTrue(
            style,
            style.contains("""<item name="sd_statusStyle">@style/Thmbldr.TestTheme.Components.Indicator.L</item>"""),
        )
        assertTrue(
            style,
            style.contains(
                """<item name="sd_chipStyleOverlay">@style/Thmbldr.TestTheme.ComponentOverlays.ChipMSecondary</item>""",
            ),
        )
    }

    @Test
    fun `overlay placement moves item to theme overlay style`() {
        val meta = meta(
            params = listOf(
                PropertyMeta(
                    id = "checkBoxStyle",
                    attrName = "android:checkboxStyle",
                    type = PropertyType.COMPONENT_STYLE,
                    resSuffix = "check_box_style",
                    placement = PLACEMENT_OVERLAY,
                ),
            ),
        )

        // ThemeOverlay создаётся для вариаций, поэтому нужен вариационный конфиг.
        generator(meta).generate(variationConfig(""""checkBoxStyle": { "value": "checkBox.m" }"""))
        val style = styleOutput.toString()

        val overlayStyle = style.substringAfter("ComponentOverlays.TestComponentL")
        assertTrue(
            "Атрибут должен попасть в ThemeOverlay:\n$style",
            overlayStyle.contains("""<item name="android:checkboxStyle">"""),
        )
        val mainStyle = style.substringBefore("ComponentOverlays.TestComponentL")
        assertTrue(
            "Атрибут не должен попасть в основной стиль:\n$style",
            !mainStyle.contains("""<item name="android:checkboxStyle">"""),
        )
    }

    @Test
    fun `shared state is resolved through module dictionary`() {
        val meta = meta(params = listOf(colorParam()))

        generator(meta, sharedStates = mapOf("loading" to "sd_state_loading"))
            .generate(configWithColorStates("loading"))

        assertTrue(
            colorOutput.toString(),
            colorOutput.toString().contains("""app:sd_state_loading="true""""),
        )
    }

    @Test
    fun `composite state produces every bound attribute`() {
        val meta = meta(
            params = listOf(colorParam()),
            stateSets = listOf(
                StateSet(
                    name = "Focus",
                    states = listOf(
                        StateInfo("inner", "android:state_focused", "android"),
                        StateInfo("inner", "android:state_activated", "android", negated = true),
                    ),
                ),
            ),
        )

        generator(meta).generate(configWithColorStates("inner"))
        val colors = colorOutput.toString()

        assertTrue(colors, colors.contains("""android:state_focused="true""""))
        assertTrue(colors, colors.contains("""android:state_activated="false""""))
    }

    @Test
    fun `unknown state name fails generation`() {
        val meta = meta(params = listOf(colorParam()))

        val error = assertThrows(IllegalStateException::class.java) {
            generator(meta).generate(configWithColorStates("mysterious"))
        }

        assertTrue(error.message, error.message!!.contains("mysterious"))
    }

    @Test
    fun `alias state value is emitted before the base value`() {
        val meta = meta(
            params = listOf(
                PropertyMeta(
                    id = "valueColor",
                    attrName = "sd_valueColor",
                    type = PropertyType.COLOR,
                    resSuffix = "value_color",
                    stateValues = listOf(StateValue("readonly", "valueColorReadOnly", "alias")),
                ),
            ),
        )
        val config = config(
            """
            "valueColor": { "type": "color", "default": "textPrimary" },
            "valueColorReadOnly": { "type": "color", "default": "textSecondary" }
            """,
        )

        generator(meta, sharedStates = mapOf("readonly" to "sd_state_readonly")).generate(config)
        val colors = colorOutput.toString()

        val readonlyIndex = colors.indexOf("sd_state_readonly")
        val baseIndex = colors.indexOf("thmbldr_textPrimary")
        assertTrue("Ожидалась запись под состоянием readonly:\n$colors", readonlyIndex >= 0)
        assertTrue("Запись под состоянием должна идти раньше базовой:\n$colors", readonlyIndex < baseIndex)
        assertTrue(colors, colors.contains("?thmbldr_textSecondary"))
    }

    @Test
    fun `alpha state value derives from the base color`() {
        val meta = meta(
            params = listOf(
                PropertyMeta(
                    id = "labelColor",
                    attrName = "android:textColor",
                    type = PropertyType.COLOR,
                    resSuffix = "text_color",
                    stateValues = listOf(StateValue("loading", "loadingAlpha", "alpha")),
                ),
            ),
        )
        val config = config(
            """
            "labelColor": { "type": "color", "default": "textPrimary" },
            "loadingAlpha": { "value": 0.4 }
            """,
        )

        generator(meta, sharedStates = mapOf("loading" to "sd_state_loading")).generate(config)
        val colors = colorOutput.toString()

        assertTrue(colors, colors.contains("""app:sd_state_loading="true""""))
        assertTrue(colors, colors.contains("""android:alpha="0.4""""))
    }

    @Test
    fun `color state entities are named after the uikit class by default`() {
        val meta = meta(params = listOf(colorParam()))

        generator(meta, styleComponentName = "SegmentItemCounter").generate(configWithView("accent"))

        val styles = styleOutput.toString()
        assertTrue(styles, styles.contains("TestTheme.Components.SegmentItemCounter"))
        assertTrue(styles, styles.contains("thmbldr_testcomponentColors"))
        assertTrue(ktOutput.toString(), ktOutput.toString().contains("TestComponentColorState"))
    }

    @Test
    fun `color state entities are named after the component variety when scoped to it`() {
        val meta = meta(params = listOf(colorParam()))

        generator(
            meta,
            styleComponentName = "SegmentItemCounter",
            colorStateComponentName = "SegmentItemCounter",
        ).generate(configWithView("accent"))

        val styles = styleOutput.toString()
        assertTrue(styles, styles.contains("thmbldr_segmentitemcounterColors"))
        assertTrue(styles, styles.contains("SegmentItemCounterColorStateProvider"))
        assertTrue(ktOutput.toString(), ktOutput.toString().contains("SegmentItemCounterColorState"))
    }

    @Test
    fun `sub style kind style генерирует nested style и owner theme reference`() {
        val meta = meta(
            params = emptyList(),
            subStyles = listOf(
                SubStyleMeta(
                    info = SubStyleInfo(
                        name = "Content",
                        kind = SUB_STYLE_KIND_STYLE,
                        styleRef = "sd_contentStyle",
                        parent = "Sdds.Components.TestComponent.Content",
                    ),
                    params = listOf(
                        PropertyMeta("contentShape", "sd_shapeAppearance", PropertyType.SHAPE, "content_shape"),
                    ),
                ),
            ),
        )

        generator(meta).generate(config(""""contentShape": { "value": "round.l" }"""))

        val style = styleOutput.toString()
        assertTrue(style, style.contains("""name="Thmbldr.TestTheme.Components.TestComponentContent""""))
        assertTrue(style, style.contains("""parent="Sdds.Components.TestComponent.Content""""))
        assertTrue(style, style.contains("""<item name="sd_shapeAppearance">?thmbldr_shapeRoundL</item>"""))
        assertTrue(style, style.contains("""name="Thmbldr.TestTheme.ComponentOverlays.TestComponentContent""""))
        assertTrue(
            style,
            style.contains(
                """<item name="sd_contentStyle">@style/Thmbldr.TestTheme.Components.TestComponentContent</item>""",
            ),
        )
    }

    @Test
    fun `value expression ratio генерирует calculated value если condition выполняется`() {
        val meta = meta(
            params = listOf(
                PropertyMeta("mode", "sd_mode", PropertyType.VALUE, "mode"),
                PropertyMeta("width", "sd_width", PropertyType.DIMENSION, "width"),
                PropertyMeta("height", "sd_height", PropertyType.DIMENSION, "height"),
                PropertyMeta(
                    id = "ratio",
                    attrName = "sd_ratio",
                    type = PropertyType.VALUE,
                    resSuffix = "ratio",
                    valueExpr = "ratio(width,height)",
                    condition = "mode=wide",
                ),
            ),
        )

        generator(meta).generate(
            config(
                """
                "mode": { "value": "wide" },
                "width": { "value": 24.0 },
                "height": { "value": 12.0 }
                """,
            ),
        )

        assertTrue(styleOutput.toString(), styleOutput.toString().contains("""<item name="sd_ratio">2.0</item>"""))
    }

    // region фикстуры

    @Test
    fun `value expression literal генерирует значение если condition из own props выполняется`() {
        val meta = meta(
            params = listOf(
                PropertyMeta("mode", "sd_mode", PropertyType.VALUE, "mode"),
                PropertyMeta(
                    id = "orientation",
                    attrName = "sd_orientation",
                    type = PropertyType.VALUE,
                    resSuffix = "orientation",
                    valueExpr = "horizontal",
                    condition = "mode=wide",
                ),
            ),
        )

        generator(meta).generate(
            config(
                """
                "mode": { "value": "wide" }
                """,
            ),
        )

        assertTrue(
            styleOutput.toString(),
            styleOutput.toString().contains("""<item name="sd_orientation">horizontal</item>"""),
        )
    }

    @Test
    fun `value expression пропускается если condition не выполняется`() {
        val meta = meta(
            params = listOf(
                PropertyMeta("mode", "sd_mode", PropertyType.VALUE, "mode"),
                PropertyMeta(
                    id = "ratio",
                    attrName = "sd_ratio",
                    type = PropertyType.VALUE,
                    resSuffix = "ratio",
                    valueExpr = "ratio(width,height)",
                    condition = "mode=wide",
                ),
                PropertyMeta("width", "sd_width", PropertyType.DIMENSION, "width"),
                PropertyMeta("height", "sd_height", PropertyType.DIMENSION, "height"),
            ),
        )

        generator(meta).generate(
            config(
                """
                "mode": { "value": "compact" },
                "width": { "value": 24.0 },
                "height": { "value": 12.0 }
                """,
            ),
        )

        assertTrue(styleOutput.toString(), !styleOutput.toString().contains("""<item name="sd_ratio">"""))
    }

    @Test
    fun `ratio expression пропускается если denominator равен zero`() {
        val meta = meta(
            params = listOf(
                PropertyMeta("width", "sd_width", PropertyType.DIMENSION, "width"),
                PropertyMeta("height", "sd_height", PropertyType.DIMENSION, "height"),
                PropertyMeta(
                    id = "ratio",
                    attrName = "sd_ratio",
                    type = PropertyType.VALUE,
                    resSuffix = "ratio",
                    valueExpr = "ratio(width,height)",
                ),
            ),
        )

        generator(meta).generate(
            config(
                """
                "width": { "value": 24.0 },
                "height": { "value": 0.0 }
                """,
            ),
        )

        assertTrue(styleOutput.toString(), !styleOutput.toString().contains("""<item name="sd_ratio">"""))
    }

    @Test
    fun `sub style kind overlay генерирует overlay и component overlay reference`() {
        val meta = meta(
            params = emptyList(),
            subStyles = listOf(
                SubStyleMeta(
                    info = SubStyleInfo(
                        name = "Icon",
                        kind = "overlay",
                        styleRef = "sd_iconStyleOverlay",
                    ),
                    params = listOf(
                        PropertyMeta("iconSize", "sd_iconSize", PropertyType.DIMENSION, "icon_size"),
                    ),
                ),
            ),
        )

        generator(meta).generate(config(""""iconSize": { "value": 16.0 }"""))

        val style = styleOutput.toString()
        assertTrue(style, style.contains("""name="Thmbldr.TestTheme.ComponentOverlays.TestComponentIcon""""))
        assertTrue(style, style.contains("""<item name="sd_iconSize">@dimen/thmbldr_test_component_icon_size</item>"""))
        assertTrue(
            style,
            style.contains(
                "<item name=\"sd_iconStyleOverlay\">" +
                    "@style/Thmbldr.TestTheme.ComponentOverlays.TestComponentIcon</item>",
            ),
        )
    }

    @Test
    fun `resource prefix вставляется перед resource suffix`() {
        val meta = meta(
            params = listOf(
                PropertyMeta(
                    id = "contentWidth",
                    attrName = "sd_contentWidth",
                    type = PropertyType.DIMENSION,
                    resSuffix = "width",
                    resPrefix = "content",
                ),
            ),
        )
        val config = Serializer.componentConfig.decodeFromString<UniversalComponentConfig>(
            """
            {
              "props": {
                "contentWidth": { "value": 12.0 }
              },
              "variations": [
                {
                  "id": "l",
                  "props": {
                    "contentWidth": { "value": 24.0 }
                  }
                }
              ]
            }
            """.trimIndent(),
        )

        generator(meta).generate(config)

        val dimenNames = dimensAggregator.dimens.map { it.name }
        assertTrue(dimenNames.toString(), dimenNames.contains("test_component_content_width"))
        assertTrue(dimenNames.toString(), dimenNames.contains("test_component_l_content_width"))
    }

    private fun colorParam() = PropertyMeta("labelColor", "sd_labelColor", PropertyType.COLOR, "label_color")

    private fun meta(
        params: List<PropertyMeta>,
        stateSets: List<StateSet> = emptyList(),
        subStyles: List<SubStyleMeta> = emptyList(),
    ) = MergedComponentMeta(
        componentName = "TestComponent",
        identity = ComponentIdentity("TestComponent", "sd_testComponentStyle", "Sdds.Components.TestComponent"),
        params = params,
        stateSets = stateSets,
        subStyles = subStyles,
    )

    private fun config(props: String): UniversalComponentConfig =
        Serializer.componentConfig.decodeFromString("""{ "props": { $props } }""")

    /** Конфиг с вариацией: ThemeOverlay генерируется только для вариаций. */
    private fun variationConfig(props: String): UniversalComponentConfig =
        Serializer.componentConfig.decodeFromString(
            """{ "variations": [ { "id": "l", "props": { $props } } ] }""",
        )

    private fun configWithColorStates(stateName: String): UniversalComponentConfig =
        Serializer.componentConfig.decodeFromString(
            """
            {
              "props": {
                "labelColor": {
                  "type": "color",
                  "default": "textPrimary",
                  "states": [ { "state": ["$stateName"], "value": "textSecondary" } ]
                }
              }
            }
            """.trimIndent(),
        )

    /** Конфиг с видом компонента: виды порождают сущности `ColorState`. */
    private fun configWithView(viewName: String): UniversalComponentConfig =
        Serializer.componentConfig.decodeFromString(
            """
            {
              "props": { "labelColor": { "type": "color", "default": "textPrimary" } },
              "view": {
                "$viewName": {
                  "props": { "labelColor": { "type": "color", "default": "textAccent" } }
                }
              }
            }
            """.trimIndent(),
        )

    private fun generator(
        meta: MergedComponentMeta,
        sharedStates: Map<String, String> = emptyMap(),
        styleComponentName: String = "TestComponent",
        colorStateComponentName: String = meta.identity.coreName,
    ): UniversalViewVariationGenerator {
        val resourcePrefixConfig = ResourcePrefixConfig("thmbldr", true)
        val packageResolver = PackageResolver("com.test")
        return UniversalViewVariationGenerator(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = mockOutputResDir,
            resourcePrefix = "thmbldr",
            coreComponentName = meta.identity.coreName,
            styleComponentName = styleComponentName,
            colorStateComponentName = colorStateComponentName,
            componentParent = meta.identity.parent,
            viewColorStateGeneratorFactory = ViewColorStateGeneratorFactory(
                ktFileBuilderFactory = KtFileBuilderFactory(packageResolver),
                xmlBuilderFactory = xmlBuilderFactory,
                packageResolver = packageResolver,
                namespace = "com.test",
                outputResDir = mockOutputResDir,
                colorStateOutputLocation = KtFileBuilder.OutputLocation.Stream(ktOutput),
                resourcePrefixConfig = resourcePrefixConfig,
            ),
            colorStateListGeneratorFactory = ColorStateListGeneratorFactory(
                xmlBuilderFactory,
                resourcePrefixConfig,
                mockOutputResDir,
            ),
            defStyleAttr = meta.identity.defStyleAttr,
            meta = meta,
            sharedStates = sharedStates,
        )
    }

    // endregion

    @Test
    fun `state set is merged from several styleables of the same component`() {
        val index = ViewMetaIndex(
            ApiMeta(
                components = listOf(
                    ComponentMeta(
                        componentNames = listOf("Avatar"),
                        styleableName = "SdAvatarStatus",
                        params = emptyList(),
                        stateSets = listOf(
                            StateSet("AvatarStatus", listOf(StateInfo("active", "sd_status_active", "scoped"))),
                        ),
                    ),
                    ComponentMeta(
                        componentNames = listOf("Avatar"),
                        styleableName = "Avatar",
                        identity = mapOf(
                            "Avatar" to ComponentIdentity("Avatar", "sd_avatarStyle", "Sdds.Components.Avatar"),
                        ),
                        params = listOf(colorParam()),
                    ),
                ),
                sharedStates = mapOf("loading" to "sd_state_loading"),
            ),
        )

        val merged = requireNotNull(index.forComponent("Avatar"))

        assertEquals("Avatar", merged.identity.coreName)
        assertEquals(listOf("labelColor"), merged.params.map { it.id })
        assertEquals(listOf("active"), merged.stateSets.single().states.map { it.configName })
    }

    @Test
    fun `component without identity is not generated`() {
        val index = ViewMetaIndex(
            ApiMeta(
                components = listOf(
                    ComponentMeta(
                        componentNames = listOf("Badge"),
                        styleableName = "Badge",
                        params = listOf(colorParam()),
                    ),
                ),
            ),
        )

        assertEquals(null, index.forComponent("Badge"))
        assertEquals(null, index.forComponent("Unknown"))
    }
}
