package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsXmlFile
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
 * Unit тесты [ShadowTokenGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class ShadowTokenGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var mockDimenAggregator: DimensAggregator
    private lateinit var underTest: ShadowTokenGenerator

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
        underTest = ShadowTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            shadowTokenValues = shadowTokenValues,
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
    fun `ShadowGenerator добавляет токен и генерирует файлы для compose и view system`() {
        val input = getResourceAsText("inputs/test-shadow-input.json")
        val shadowToken = Serializer.meta.decodeFromString<ShadowToken>(input)
        val outputXml = ByteArrayOutputStream()
        val shadowsXmlFile = mockk<File>(relaxed = true)
        every { shadowsXmlFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.shadowsXmlFile() } returns shadowsXmlFile

        underTest.addToken(shadowToken)
        underTest.generate()

        assertEquals(
            getResourceAsText("shadow-outputs/test-shadow-output.xml"),
            outputXml.toString(),
        )
        assertEquals(
            getResourceAsText("shadow-outputs/TestShadowOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val shadowTokenValues = mapOf("down.hard.l" to ShadowTokenValue("#99000000", 1.0f))
    }
}
