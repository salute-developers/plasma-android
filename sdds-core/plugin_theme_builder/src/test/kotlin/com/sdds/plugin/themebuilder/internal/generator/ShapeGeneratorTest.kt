package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shapesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import kotlinx.serialization.decodeFromString
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit тесты [ShapeGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class ShapeGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var mockDimenAggregator: DimensAggregator
    private lateinit var underTest: ShapeGenerator

    @Before
    fun setUp() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        mockOutputResDir = mockk(relaxed = true)
        mockDimenAggregator = mockk(relaxed = true)
        underTest = ShapeGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            xmlBuilderFactory = XmlDocumentBuilderFactory("thmbldr"),
            ktFileBuilderFactory = KtFileBuilderFactory("com.test"),
            dimensAggregator = mockDimenAggregator,
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr"),
        )
    }

    @After
    fun tearDown() {
        clearAllMocks(true)
        unmockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
    }

    @Test
    fun `ShapeGenerator добавляет токен и генерирует файлы для compose и view system`() {
        val input = getResourceAsText("inputs/test-shape-input.json")
        val shapeTokens = Serializer.instance.decodeFromString<List<RoundedShapeToken>>(input)
        val outputXml = ByteArrayOutputStream()
        val shapesXmlFile = mockk<File>(relaxed = true)
        every { shapesXmlFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.shapesXmlFile() } returns shapesXmlFile

        shapeTokens.forEach { underTest.addToken(it) }
        underTest.generate()

        assertEquals(getResourceAsText("shape-outputs/test-shape-output.xml"), outputXml.toString())
        assertEquals(getResourceAsText("shape-outputs/TestShapeOutputKt.txt"), outputKt.toString())
    }
}