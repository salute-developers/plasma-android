package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.linkButtonXmlFile
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
 * Unit тесты [LinkButtonStyleGeneratorView]
 * @author Малышев Александр on 02.12.2024
 */
class LinkButtonStyleGeneratorViewTest {
    private lateinit var xmlBuilderFactory: XmlResourcesDocumentBuilderFactory
    private lateinit var resourceReferenceProvider: ResourceReferenceProvider
    private lateinit var dimensAggregator: DimensAggregator
    private lateinit var mockOutputResDir: File
    private lateinit var mockOutputStyleFile: File
    private lateinit var underTest: LinkButtonStyleGeneratorView

    @Before
    fun setUp() {
        mockkObject(FileProvider)
        xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme")
        resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme")
        dimensAggregator = DimensAggregator()
        mockOutputStyleFile = mockk(relaxed = true)
        mockOutputResDir = mockk(relaxed = true) {
            every { linkButtonXmlFile() } returns mockOutputStyleFile
        }
        underTest = LinkButtonStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = mockOutputResDir,
            attrPrefix = "thmbldr",
        )
    }

    @After
    fun tearDown() {
        clearAllMocks()
    }

    @Test
    fun generate() {
        val outputXml = ByteArrayOutputStream()
        every { mockOutputStyleFile.fileWriter() } returns outputXml.writer()

        underTest.generate(sizeConfig)

        Assert.assertEquals(
            getResourceAsText("component-outputs/styles-link-button.xml"),
            outputXml.toString(),
        )
    }

    private companion object {

        val sizeConfig = ButtonComponentConfig(
            variations = ButtonComponentConfig.Variations(
                size = mapOf(
                    "l" to ButtonComponentConfig.Size(
                        shape = ButtonComponentConfig.Shape("round.l"),
                        labelStyle = "body.l.bold",
                        height = 56f,
                        paddingStart = 24f,
                        paddingEnd = 24f,
                        minWidth = 98f,
                        iconSize = 24f,
                        spinnerSize = 22f,
                        iconMargin = 8f,
                        valueMargin = 4f,
                    ),
                ),
                color = emptyMap(),
            ),
        )
    }
}
