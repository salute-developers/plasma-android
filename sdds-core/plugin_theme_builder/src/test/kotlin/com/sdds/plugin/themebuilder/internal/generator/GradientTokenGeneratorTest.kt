package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.LinearGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.RadialGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.SweepGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientParametersXmlFile
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
 * Unit тесты [GradientTokenGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class GradientTokenGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var underTest: GradientTokenGenerator

    @Before
    fun setUp() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        mockOutputResDir = mockk(relaxed = true)
        underTest = GradientTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            gradientTokenValues = gradientTokenValues,
            palette = mockk(),
            resourceReferenceProvider = ResourceReferenceProvider(resourcePrefix = "thmbldr", "TestTheme"),
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
    fun `GradientGenerator добавляет токен и генерирует файлы для compose и view system`() {
        val input = getResourceAsText("inputs/test-gradient-input.json")
        val gradientTokens = Serializer.meta.decodeFromString<List<Token>>(input)
        val outputXml = ByteArrayOutputStream()
        val gradientsXmlFile = mockk<File>(relaxed = true)
        every { gradientsXmlFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.gradientParametersXmlFile() } returns gradientsXmlFile

        gradientTokens
            .filterIsInstance<GradientToken>()
            .forEach { token ->
                underTest.addToken(token)
            }
        underTest.generate()

        assertEquals(
            getResourceAsText("gradient-outputs/test-gradient-output.xml"),
            outputXml.toString(),
        )
        assertEquals(
            getResourceAsText("gradient-outputs/TestGradientOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val gradientTokenValues = mapOf(
            "dark.inverse.surface.accent" to listOf(
                SweepGradientTokenValue(
                    colors = listOf("#000", "#fff"),
                    locations = listOf(0f, 0.7f),
                    centerX = 0.5f,
                    centerY = 0.5f,
                ),
            ),
            "light.on-dark.surface.tertiary" to listOf(
                LinearGradientTokenValue(
                    colors = listOf("#000", "#fff"),
                    locations = listOf(0f, 0.7f),
                    angle = 90f,
                ),
            ),
            "light.on-dark.surface.secondary" to listOf(
                RadialGradientTokenValue(
                    colors = listOf("#000", "#fff"),
                    locations = listOf(0f, 0.7f),
                    radius = 0.8f,
                    centerX = 0.5f,
                    centerY = 0.5f,
                ),
            ),
        )
    }
}
