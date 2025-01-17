package com.sdds.plugin.themebuilder.internal.components.button.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfig
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import com.sdds.plugin.themebuilder.internal.components.button.ButtonVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonView
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
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
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit тесты [BasicButtonStyleGeneratorView]
 * @author Малышев Александр on 02.12.2024
 */
class BasicButtonStyleGeneratorViewTest {

    private lateinit var xmlBuilderFactory: XmlResourcesDocumentBuilderFactory
    private lateinit var resourceReferenceProvider: ResourceReferenceProvider
    private lateinit var dimensAggregator: DimensAggregator
    private lateinit var mockOutputResDir: File
    private lateinit var mockOutputStyleFile: File
    private lateinit var mockOutputAttrsFile: File
    private lateinit var mockOutputColorFile: File
    private lateinit var mockOutputKt: ByteArrayOutputStream
    private lateinit var underTest: BasicButtonStyleGeneratorView

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
        val resourcePrefixConfig = ResourcePrefixConfig("thmbldr", true)
        val packageResolver = PackageResolver("com.test")
        underTest = BasicButtonStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = mockOutputResDir,
            resourcePrefix = "thmbldr",
            colorStateListGeneratorFactory = ColorStateListGeneratorFactory(xmlBuilderFactory, resourcePrefixConfig),
            viewColorStateGeneratorFactory = ViewColorStateGeneratorFactory(
                ktFileBuilderFactory = KtFileBuilderFactory(packageResolver),
                xmlBuilderFactory = xmlBuilderFactory,
                packageResolver = packageResolver,
                namespace = "com.test",
                outputResDir = mockOutputResDir,
                colorStateOutputLocation = KtFileBuilder.OutputLocation.Stream(mockOutputKt),
                resourcePrefixConfig = resourcePrefixConfig,
            ),
        )
    }

    @After
    fun tearDown() {
        mockOutputKt.close()
        clearAllMocks()
    }

    @Test
    fun generate() {
        val styleOutputXml = ByteArrayOutputStream()
        every { mockOutputStyleFile.fileWriter() } returns styleOutputXml.writer()
        val attrsOutputXml = ByteArrayOutputStream()
        every { mockOutputAttrsFile.fileWriter() } returns attrsOutputXml.writer()
        val colorOutputXml = ByteArrayOutputStream()
        every { mockOutputColorFile.fileWriter() } returns colorOutputXml.writer()

        underTest.generate(config)

        Assert.assertEquals(
            getResourceAsText("component-outputs/styles-basic-button.xml"),
            styleOutputXml.toString(),
        )
        Assert.assertEquals(
            getResourceAsText("component-outputs/attrs/basic-button-attrs.xml"),
            attrsOutputXml.toString(),
        )
        Assert.assertEquals(
            getResourceAsText("component-outputs/colors/basic-button-color.xml"),
            colorOutputXml.toString(),
        )
        Assert.assertEquals(
            getResourceAsText("component-outputs/colorstate/BasicButtonColorStateKt.txt"),
            mockOutputKt.toString(),
        )
    }

    private companion object {

        val config = ButtonConfig(
            view = mapOf(
                "default" to ButtonView(
                    props = ButtonProperties(
                        labelColor = Color(
                            default = "textInversePrimary",
                            states = listOf(
                                ColorState(
                                    listOf("pressed"),
                                    "surfaceInversePrimaryActive",
                                ),
                            ),
                        ),
                    ),
                ),
                "warning" to ButtonView(
                    props = ButtonProperties(
                        labelColor = Color(
                            default = "textInverseWarning",
                            states = listOf(
                                ColorState(
                                    listOf("pressed", "focused"),
                                    "surfaceInverseWarningActive",
                                ),
                            ),
                        ),
                    ),
                ),
            ),
            variations = listOf(
                ButtonVariation(
                    id = "l",
                    props = ButtonProperties(
                        shape = Shape("round.l"),
                        labelStyle = Typography("body.l.bold"),
                        height = Dimension(56f),
                        paddingStart = Dimension(24f),
                        paddingEnd = Dimension(24f),
                        minWidth = Dimension(98f),
                        iconSize = Dimension(24f),
                        spinnerSize = Dimension(22f),
                        iconMargin = Dimension(8f),
                        valueMargin = Dimension(4f),
                    ),
                ),
            ),
        )
    }
}
