package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.universal.PropertyType
import com.sdds.plugin.themebuilder.internal.universal.asVariationTree
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalComponentConfig
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.BooleanViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.ColorViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.ComponentStyleViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.DimensionViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.FloatViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.IconViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.RawValueViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.ShadowViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.ShapeViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.TypographyViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.ValueViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.ViewPropertyMapperRegistry
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.componentStyleXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.selectorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import kotlinx.serialization.decodeFromString
import org.junit.After
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

class ViewPropertyMapperTest {

    private lateinit var xmlBuilderFactory: XmlResourcesDocumentBuilderFactory
    private lateinit var resourceReferenceProvider: ResourceReferenceProvider
    private lateinit var dimensAggregator: DimensAggregator
    private lateinit var outputResDir: File
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
        outputResDir = mockk(relaxed = true) {
            every { componentStyleXmlFile(any()) } returns styleFile
            every { attrsFile(any()) } returns attrsFile
            every { colorXmlFile(any(), any()) } returns colorFile
            every { selectorXmlFile(any(), any()) } returns colorFile
        }
    }

    @After
    fun tearDown() {
        clearAllMocks()
    }

    @Test
    fun `registry creates mapper for every property type`() {
        val params = listOf(
            param(PropertyType.COLOR),
            param(PropertyType.DIMENSION),
            param(PropertyType.TYPOGRAPHY),
            param(PropertyType.FLOAT),
            param(PropertyType.SHAPE),
            param(PropertyType.SHADOW),
            param(PropertyType.ICON),
            param(PropertyType.BOOLEAN),
            param(PropertyType.VALUE),
            param(PropertyType.COMPONENT_STYLE),
            param(PropertyType.INTEGER),
            param(PropertyType.UNKNOWN),
        )

        val registry = registry(params, writer())

        assertTrue(registry[params[0]] is ColorViewPropertyMapper)
        assertTrue(registry[params[1]] is DimensionViewPropertyMapper)
        assertTrue(registry[params[2]] is TypographyViewPropertyMapper)
        assertTrue(registry[params[3]] is FloatViewPropertyMapper)
        assertTrue(registry[params[4]] is ShapeViewPropertyMapper)
        assertTrue(registry[params[5]] is ShadowViewPropertyMapper)
        assertTrue(registry[params[6]] is IconViewPropertyMapper)
        assertTrue(registry[params[7]] is BooleanViewPropertyMapper)
        assertTrue(registry[params[8]] is ValueViewPropertyMapper)
        assertTrue(registry[params[9]] is ComponentStyleViewPropertyMapper)
        assertTrue(registry[params[10]] is RawValueViewPropertyMapper)
        assertTrue(registry[params[11]] is RawValueViewPropertyMapper)
    }

    @Test
    fun `visual and scalar mappers emit their xml values`() {
        val params = listOf(
            PropertyMeta("shape", "sd_shapeAppearance", PropertyType.SHAPE),
            PropertyMeta("shadow", "sd_shadowAppearance", PropertyType.SHADOW),
            PropertyMeta("icon", "sd_icon", PropertyType.ICON),
            PropertyMeta("enabled", "sd_enabled", PropertyType.BOOLEAN),
            PropertyMeta("threshold", "sd_threshold", PropertyType.INTEGER),
        )

        map(
            params,
            """
            "shape": { "value": "round.l" },
            "shadow": { "value": "down.soft.s" },
            "icon": { "value": "actions.close" },
            "enabled": { "value": true },
            "threshold": { "value": 3 }
            """,
        )

        val xml = styleOutput.toString()
        assertTrue(xml, xml.contains("""<item name="sd_shapeAppearance">?thmbldr_shapeRoundL</item>"""))
        assertTrue(xml, xml.contains("""<item name="sd_shadowAppearance">?thmbldr_shadowDownSoftS</item>"""))
        assertTrue(xml, xml.contains("""<item name="sd_icon">@drawable/ic_actions_close</item>"""))
        assertTrue(xml, xml.contains("""<item name="sd_enabled">true</item>"""))
        assertTrue(xml, xml.contains("""<item name="sd_threshold">3</item>"""))
    }

    @Test
    fun `stateful value mappers emit direct values`() {
        val params = listOf(
            PropertyMeta("color", "sd_color", PropertyType.COLOR, "color"),
            PropertyMeta("size", "sd_size", PropertyType.DIMENSION, "size"),
            PropertyMeta("labelStyle", "sd_labelAppearance", PropertyType.TYPOGRAPHY, "label"),
            PropertyMeta("alpha", "sd_alpha", PropertyType.FLOAT, "alpha"),
        )

        map(
            params,
            """
            "color": { "type": "color", "default": "textPrimary" },
            "size": { "value": 24.0 },
            "labelStyle": { "value": "body.l.bold" },
            "alpha": { "value": 0.4 }
            """,
        )

        val xml = styleOutput.toString()
        assertTrue(xml, xml.contains("""<item name="sd_color">?thmbldr_textPrimary</item>"""))
        assertTrue(xml, xml.contains("""<item name="sd_size">@dimen/"""))
        assertTrue(xml, xml.contains("""<item name="sd_labelAppearance">@style/"""))
        assertTrue(xml, xml.contains("""<item name="sd_alpha">0.4</item>"""))
    }

    @Test
    fun `value mapper uses enum api name`() {
        val property = PropertyMeta(
            id = "placement",
            attrName = "sd_placement",
            type = PropertyType.VALUE,
            values = listOf(EnumValue("spaceBetween", "1", "space-between")),
        )

        map(listOf(property), """"placement": { "value": "space-between" }""")

        assertTrue(
            styleOutput.toString(),
            styleOutput.toString().contains("""<item name="sd_placement">spaceBetween</item>"""),
        )
    }

    @Test
    fun `value mapper генерирует config value если enum values пустые`() {
        val property = PropertyMeta(
            id = "placement",
            attrName = "sd_placement",
            type = PropertyType.VALUE,
        )

        map(listOf(property), """"placement": { "value": "space-between" }""")

        assertTrue(
            styleOutput.toString(),
            styleOutput.toString().contains("""<item name="sd_placement">space-between</item>"""),
        )
    }

    @Test
    fun `value mapper генерирует default value если config value неизвестен`() {
        val property = PropertyMeta(
            id = "placement",
            attrName = "sd_placement",
            type = PropertyType.VALUE,
            values = listOf(EnumValue("spaceBetween", "1", "space-between")),
            defaultValue = "start",
        )

        map(listOf(property), """"placement": { "value": "unknown" }""")

        assertTrue(
            styleOutput.toString(),
            styleOutput.toString().contains("""<item name="sd_placement">start</item>"""),
        )
    }

    @Test
    fun `value mapper падает если config value неизвестен и default отсутствует`() {
        val property = PropertyMeta(
            id = "placement",
            attrName = "sd_placement",
            type = PropertyType.VALUE,
            values = listOf(EnumValue("spaceBetween", "1", "space-between")),
        )

        val exception = assertThrows(IllegalStateException::class.java) {
            map(listOf(property), """"placement": { "value": "unknown" }""")
        }

        assertTrue(exception.message.orEmpty(), exception.message.orEmpty().contains("TestComponent"))
        assertTrue(exception.message.orEmpty(), exception.message.orEmpty().contains("unknown"))
        assertTrue(exception.message.orEmpty(), exception.message.orEmpty().contains("sd_placement"))
    }

    @Test
    fun `component style mapper distinguishes style and overlay`() {
        val params = listOf(
            PropertyMeta("statusStyle", "sd_statusStyle", PropertyType.COMPONENT_STYLE),
            PropertyMeta("chipStyle", "sd_chipStyleOverlay", PropertyType.COMPONENT_STYLE),
        )

        map(
            params,
            """
            "statusStyle": { "value": "indicator.l" },
            "chipStyle": { "value": "chip.m.secondary" }
            """,
        )

        val xml = styleOutput.toString()
        assertTrue(xml, xml.contains("""@style/Thmbldr.TestTheme.Components.Indicator.L"""))
        assertTrue(xml, xml.contains("""@style/Thmbldr.TestTheme.ComponentOverlays.ChipMSecondary"""))
    }

    @Test
    fun `color mapper emits alias state before base value`() {
        val property = PropertyMeta(
            id = "valueColor",
            attrName = "sd_valueColor",
            type = PropertyType.COLOR,
            resSuffix = "value_color",
            stateValues = listOf(StateValue("readonly", "valueColorReadOnly", "alias")),
        )

        map(
            listOf(property),
            """
            "valueColor": { "type": "color", "default": "textPrimary" },
            "valueColorReadOnly": { "type": "color", "default": "textSecondary" }
            """,
            sharedStates = mapOf("readonly" to "sd_state_readonly"),
        )

        val xml = colorOutput.toString()
        val stateIndex = xml.indexOf("sd_state_readonly")
        val baseIndex = xml.indexOf("thmbldr_textPrimary")
        assertTrue(xml, stateIndex >= 0)
        assertTrue(xml, stateIndex < baseIndex)
    }

    @Test
    fun `color mapper генерирует xml value list если view state содержит gradient`() {
        val property = PropertyMeta(
            id = "backgroundColor",
            attrName = "sd_backgroundColor",
            type = PropertyType.COLOR,
            resSuffix = "background_color",
        )

        mapConfig(
            params = listOf(property),
            configJson = """
                {
                  "props": {
                    "backgroundColor": { "type": "color", "default": "surfaceDefaultSolid" }
                  },
                  "view": {
                    "active": {
                      "props": {
                        "backgroundColor": { "type": "gradient", "default": "surfaceDefaultGradient" }
                      }
                    }
                  }
                }
            """,
            sharedStates = mapOf("active" to "sd_state_active"),
        )

        val styleXml = styleOutput.toString()
        assertTrue(
            styleXml,
            styleXml.contains(
                """<item name="sd_backgroundColor">@xml/thmbldr_test_component_background_color</item>""",
            ),
        )
    }

    @Test
    fun `color mapper применяет alpha state из float property если alpha color отсутствует`() {
        val property = PropertyMeta(
            id = "labelColor",
            attrName = "sd_labelColor",
            type = PropertyType.COLOR,
            resSuffix = "label_color",
            stateValues = listOf(StateValue("disabled", "disabledAlpha", "alpha")),
        )

        map(
            params = listOf(property),
            props = """
                "labelColor": { "type": "color", "default": "textPrimary" },
                "disabledAlpha": { "value": 0.32 }
            """,
            sharedStates = mapOf("disabled" to "sd_state_disabled"),
        )

        val colorXml = colorOutput.toString()
        assertTrue(colorXml, colorXml.contains("""app:sd_state_disabled="true""""))
        assertTrue(colorXml, colorXml.contains("""android:alpha="0.32""""))
        assertTrue(colorXml, colorXml.contains("""?thmbldr_textPrimary"""))
    }

    @Test
    fun `number и typography mappers генерируют selectors для token states`() {
        val params = listOf(
            PropertyMeta("alpha", "sd_alpha", PropertyType.FLOAT, "alpha"),
            PropertyMeta("size", "sd_size", PropertyType.DIMENSION, "size"),
            PropertyMeta("labelStyle", "sd_labelAppearance", PropertyType.TYPOGRAPHY, "label"),
        )

        map(
            params = params,
            props = """
                "alpha": {
                  "value": 0.4,
                  "states": [ { "state": ["pressed"], "value": 0.8 } ]
                },
                "size": {
                  "value": 16.0,
                  "states": [ { "state": ["focused"], "value": 20.0 } ]
                },
                "labelStyle": {
                  "value": "body.m.normal",
                  "states": [ { "state": ["pressed"], "value": "body.l.bold" } ]
                }
            """,
        )

        val styleXml = styleOutput.toString()
        assertTrue(styleXml, styleXml.contains("""<item name="sd_alpha">@xml/thmbldr_test_component_alpha</item>"""))
        assertTrue(styleXml, styleXml.contains("""<item name="sd_size">@xml/thmbldr_test_component_size</item>"""))
        assertTrue(
            styleXml,
            styleXml.contains("""<item name="sd_labelAppearance">@xml/thmbldr_test_component_label</item>"""),
        )

        val selectorXml = colorOutput.toString()
        assertTrue(selectorXml, selectorXml.contains("<number-selector"))
        assertTrue(selectorXml, selectorXml.contains("<style-selector"))
        assertTrue(selectorXml, selectorXml.contains("""android:state_pressed="true""""))
        assertTrue(selectorXml, selectorXml.contains("""android:state_focused="true""""))
        assertTrue(selectorXml, selectorXml.contains("""app:sd_number="0.8""""))
        assertTrue(selectorXml, selectorXml.contains("""app:sd_style="@style/"""))
    }

    @Test
    fun `number и typography mappers генерируют selectors для view states`() {
        val params = listOf(
            PropertyMeta("alpha", "sd_alpha", PropertyType.FLOAT, "alpha"),
            PropertyMeta("size", "sd_size", PropertyType.DIMENSION, "size"),
            PropertyMeta("labelStyle", "sd_labelAppearance", PropertyType.TYPOGRAPHY, "label"),
        )

        mapConfig(
            params = params,
            configJson = """
                {
                  "props": {
                    "alpha": { "value": 0.4 },
                    "size": { "value": 16.0 },
                    "labelStyle": { "value": "body.m.normal" }
                  },
                  "view": {
                    "active": {
                      "props": {
                        "alpha": { "value": 0.8 },
                        "size": { "value": 20.0 },
                        "labelStyle": { "value": "body.l.bold" }
                      }
                    }
                  }
                }
            """,
            sharedStates = mapOf("active" to "sd_state_active"),
        )

        val styleXml = styleOutput.toString()
        assertTrue(styleXml, styleXml.contains("""<item name="sd_alpha">@xml/thmbldr_test_component_alpha</item>"""))
        assertTrue(styleXml, styleXml.contains("""<item name="sd_size">@xml/thmbldr_test_component_size</item>"""))
        assertTrue(
            styleXml,
            styleXml.contains("""<item name="sd_labelAppearance">@xml/thmbldr_test_component_label</item>"""),
        )

        val selectorXml = colorOutput.toString()
        assertTrue(selectorXml, selectorXml.contains("<number-selector"))
        assertTrue(selectorXml, selectorXml.contains("<style-selector"))
        assertTrue(selectorXml, selectorXml.contains("""app:thmbldr_testcomponent_state_active="true""""))
        assertTrue(selectorXml, selectorXml.contains("""app:sd_number="0.8""""))
        assertTrue(selectorXml, selectorXml.contains("""app:sd_style="@style/"""))
    }

    private fun map(
        params: List<PropertyMeta>,
        props: String,
        sharedStates: Map<String, String> = emptyMap(),
    ) {
        mapConfig(
            params = params,
            configJson = """{ "props": { $props } }""",
            sharedStates = sharedStates,
        )
    }

    private fun mapConfig(
        params: List<PropertyMeta>,
        configJson: String,
        sharedStates: Map<String, String> = emptyMap(),
    ) {
        val writer = writer()
        val registry = registry(params, writer, sharedStates)
        val config = Serializer.componentConfig.decodeFromString<UniversalComponentConfig>(
            configJson,
        )
        val root = config.asVariationTree("")
        with(writer) {
            document.baseStyle {
                params.forEach { registry[it].map(this, "", root) }
            }
        }
        writer.finish()
    }

    private fun registry(
        params: List<PropertyMeta>,
        writer: ViewStyleResourceWriter,
        sharedStates: Map<String, String> = emptyMap(),
    ) = ViewPropertyMapperRegistry(
        params = params,
        resources = writer,
        resolver = ViewPropertyResolver(),
        stateResolver = ViewStateResolver("TestComponent", sharedStates, emptyList()),
        componentName = "TestComponent",
        styleNames = emptyMap(),
    )

    private fun writer(): ViewStyleResourceWriter {
        val resourcePrefixConfig = ResourcePrefixConfig("thmbldr", true)
        val packageResolver = PackageResolver("com.test")
        return ViewStyleResourceWriter(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            resourcePrefix = "thmbldr",
            coreComponentName = "TestComponent",
            componentParent = "Sdds.Components.TestComponent",
            viewColorStateGeneratorFactory = ViewColorStateGeneratorFactory(
                ktFileBuilderFactory = KtFileBuilderFactory(packageResolver),
                xmlBuilderFactory = xmlBuilderFactory,
                packageResolver = packageResolver,
                namespace = "com.test",
                outputResDir = outputResDir,
                colorStateOutputLocation = KtFileBuilder.OutputLocation.Stream(ktOutput),
                resourcePrefixConfig = resourcePrefixConfig,
            ),
            colorStateListGeneratorFactory = ColorStateListGeneratorFactory(
                xmlBuilderFactory,
                resourcePrefixConfig,
                outputResDir,
            ),
            defStyleAttr = "sd_testComponentStyle",
        )
    }

    private fun param(type: String) = PropertyMeta(
        id = type,
        attrName = "sd_$type",
        type = type,
    )
}
