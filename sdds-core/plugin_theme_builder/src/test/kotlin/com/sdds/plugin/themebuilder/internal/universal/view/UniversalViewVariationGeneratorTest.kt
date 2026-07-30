package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.compare.GeneratedResourceComparator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
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
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import kotlinx.serialization.decodeFromString
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Гейт обратной совместимости универсального View-генератора.
 *
 * Тот же конфиг, что у рукописного [BasicButtonStyleGeneratorView][com.sdds.plugin.themebuilder
 * `BasicButtonStyleGeneratorView`, но описанный метой,
 * должен давать тот же вывод. Эталоны переиспользуются целиком — это и есть проверка
 * «универсальный ≡ рукописный».
 *
 * Контракт сравнения (см. change `universal-view-variation-generator`):
 * стили сравниваются семантически (порядок `<item>` внутри стиля не важен),
 * state-list, attrs и `ColorState` — точно, включая порядок.
 */
class UniversalViewVariationGeneratorTest {

    @get:Rule
    val tempFolder = TemporaryFolder()

    private lateinit var xmlBuilderFactory: XmlResourcesDocumentBuilderFactory
    private lateinit var resourceReferenceProvider: ResourceReferenceProvider
    private lateinit var dimensAggregator: DimensAggregator
    private lateinit var mockOutputResDir: File
    private lateinit var mockOutputStyleFile: File
    private lateinit var mockOutputAttrsFile: File
    private lateinit var mockOutputColorFile: File
    private lateinit var mockOutputKt: ByteArrayOutputStream

    @Before
    fun setUp() {
        mockkObject(FileProvider)
        xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme")
        resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme")
        dimensAggregator = DimensAggregator()
        mockOutputStyleFile = mockk(relaxed = true)
        mockOutputAttrsFile = mockk(relaxed = true)
        mockOutputColorFile = mockk(relaxed = true)
        mockOutputResDir = mockk(relaxed = true) {
            every { componentStyleXmlFile(any()) } returns mockOutputStyleFile
            every { attrsFile(any()) } returns mockOutputAttrsFile
            every { colorXmlFile(any(), any()) } returns mockOutputColorFile
        }
        mockOutputKt = ByteArrayOutputStream()
    }

    @After
    fun tearDown() {
        mockOutputKt.close()
        clearAllMocks()
    }

    @Test
    fun `universal generator reproduces handwritten basic button output`() {
        val styleOutputXml = ByteArrayOutputStream()
        every { mockOutputStyleFile.fileWriter() } returns styleOutputXml.writer()
        val attrsOutputXml = ByteArrayOutputStream()
        every { mockOutputAttrsFile.fileWriter() } returns attrsOutputXml.writer()
        val colorOutputXml = ByteArrayOutputStream()
        every { mockOutputColorFile.fileWriter() } returns colorOutputXml.writer()

        generator().generate(config())

        // Стили — семантически: порядок <item> внутри стиля задаётся порядком объявления
        // атрибутов в declare-styleable и не обязан совпадать с рукописным генератором.
        assertStylesEquivalent(
            expected = getResourceAsText("component-outputs/styles-basic-button.xml"),
            actual = styleOutputXml.toString(),
        )
        // Остальное — точно: имена ресурсов, порядок элементов selector'а и ordinal
        // значений ColorState являются контрактом.
        assertEquals(
            getResourceAsText("component-outputs/attrs/basic-button-attrs.xml"),
            attrsOutputXml.toString(),
        )
        assertEquals(
            getResourceAsText("component-outputs/colors/basic-button-color.xml"),
            colorOutputXml.toString(),
        )
        assertEquals(
            getResourceAsText("component-outputs/colorstate/BasicButtonColorStateKt.txt"),
            mockOutputKt.toString(),
        )
    }

    @Test
    fun `dimension properties produce the same dimens as handwritten generator`() {
        every { mockOutputStyleFile.fileWriter() } returns ByteArrayOutputStream().writer()
        every { mockOutputAttrsFile.fileWriter() } returns ByteArrayOutputStream().writer()
        every { mockOutputColorFile.fileWriter() } returns ByteArrayOutputStream().writer()

        generator().generate(config())

        val dimens = dimensAggregator.dimens.map { it.name }
        assertTrue(
            "Ожидались dimen'ы с суффиксами из меты, получено: $dimens",
            dimens.containsAll(
                listOf(
                    "basic_button_l_min_height",
                    "basic_button_l_min_width",
                    "basic_button_l_padding_start",
                    "basic_button_l_padding_end",
                    "basic_button_l_icon_size",
                    "basic_button_l_spinner_size",
                    "basic_button_l_icon_padding",
                    "basic_button_l_value_padding",
                ),
            ),
        )
    }

    private fun assertStylesEquivalent(expected: String, actual: String) {
        val baseline = tempFolder.newFolder("baseline").resolve("values").apply { mkdirs() }
        val current = tempFolder.newFolder("actual").resolve("values").apply { mkdirs() }
        baseline.resolve("styles.xml").writeText(expected)
        current.resolve("styles.xml").writeText(actual)

        val report = GeneratedResourceComparator().compare(baseline.parentFile, current.parentFile)

        assertTrue(report.format(), report.isCompatible)
    }

    private fun generator(): UniversalViewVariationGenerator {
        val resourcePrefixConfig = ResourcePrefixConfig("thmbldr", true)
        val packageResolver = PackageResolver("com.test")
        return UniversalViewVariationGenerator(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = mockOutputResDir,
            resourcePrefix = "thmbldr",
            coreComponentName = "Button",
            styleComponentName = "BasicButton",
            componentParent = "Sdds.Components.Button",
            viewColorStateGeneratorFactory = ViewColorStateGeneratorFactory(
                ktFileBuilderFactory = KtFileBuilderFactory(packageResolver),
                xmlBuilderFactory = xmlBuilderFactory,
                packageResolver = packageResolver,
                namespace = "com.test",
                outputResDir = mockOutputResDir,
                colorStateOutputLocation = KtFileBuilder.OutputLocation.Stream(mockOutputKt),
                resourcePrefixConfig = resourcePrefixConfig,
            ),
            colorStateListGeneratorFactory = ColorStateListGeneratorFactory(
                xmlBuilderFactory,
                resourcePrefixConfig,
                mockOutputResDir,
            ),
            defStyleAttr = "android:buttonStyle",
            meta = basicButtonMeta,
            sharedStates = emptyMap(),
        )
    }

    private fun config(): UniversalComponentConfig =
        Serializer.componentConfig.decodeFromString(CONFIG_JSON)

    private companion object {

        /** Свойства BasicButton в том виде, в каком их несёт разметка `declare-styleable`. */
        val basicButtonMeta = MergedComponentMeta(
            componentName = "BasicButton",
            identity = ComponentIdentity(
                coreName = "Button",
                defStyleAttr = "android:buttonStyle",
                parent = "Sdds.Components.Button",
            ),
            params = listOf(
                dimension("height", "android:minHeight", "min_height"),
                dimension("minWidth", "android:minWidth", "min_width"),
                dimension("paddingStart", "android:paddingStart", "padding_start"),
                dimension("paddingEnd", "android:paddingEnd", "padding_end"),
                dimension("iconSize", "sd_iconSize", "icon_size"),
                dimension("spinnerSize", "sd_spinnerSize", "spinner_size"),
                dimension("iconMargin", "sd_iconPadding", "icon_padding"),
                dimension("valueMargin", "sd_valuePadding", "value_padding"),
                PropertyMeta("shape", "sd_shapeAppearance", PropertyType.SHAPE, "shape_appearance"),
                PropertyMeta("labelStyle", "android:textAppearance", PropertyType.TYPOGRAPHY, "text_appearance"),
                PropertyMeta("labelColor", "android:textColor", PropertyType.COLOR, "text_color"),
            ),
            stateSets = emptyList(),
        )

        fun dimension(id: String, attr: String, suffix: String) =
            PropertyMeta(id, attr, PropertyType.DIMENSION, suffix)

        /** Тот же конфиг, что у рукописного golden-теста BasicButton. */
        val CONFIG_JSON = """
            {
              "view": {
                "default": {
                  "props": {
                    "labelColor": {
                      "type": "color",
                      "default": "textInversePrimary",
                      "states": [
                        { "state": ["pressed"], "value": "surfaceInversePrimaryActive" }
                      ]
                    }
                  }
                },
                "warning": {
                  "props": {
                    "labelColor": {
                      "type": "color",
                      "default": "textInverseWarning",
                      "states": [
                        { "state": ["pressed", "focused"], "value": "surfaceInverseWarningActive" }
                      ]
                    }
                  }
                }
              },
              "variations": [
                {
                  "id": "l",
                  "props": {
                    "shape": { "value": "round.l" },
                    "labelStyle": { "value": "body.l.bold" },
                    "height": { "value": 56.0 },
                    "paddingStart": { "value": 24.0 },
                    "paddingEnd": { "value": 24.0 },
                    "minWidth": { "value": 98.0 },
                    "iconSize": { "value": 24.0 },
                    "spinnerSize": { "value": 22.0 },
                    "iconMargin": { "value": 8.0 },
                    "valueMargin": { "value": 4.0 }
                  }
                }
              ]
            }
        """.trimIndent()
    }
}
