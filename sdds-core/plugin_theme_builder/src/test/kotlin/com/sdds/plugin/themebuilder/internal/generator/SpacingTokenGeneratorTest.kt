package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.SpacingToken
import com.sdds.plugin.themebuilder.internal.token.SpacingTokenValue
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
 * Unit тесты [SpacingTokenGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class SpacingTokenGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var mockDimenAggregator: DimensAggregator
    private lateinit var dimensionsConfig: DimensionsConfig
    private lateinit var underTest: SpacingTokenGenerator

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
        dimensionsConfig = mockk(relaxed = true)
        underTest = SpacingTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            dimensAggregator = mockDimenAggregator,
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
            spacingTokenValues = spacingTokenValues,
            dimensionsConfig = dimensionsConfig,
            namespace = "com.test",
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
    fun `SpacingTokenGenerator добавляет токен и генерирует файлы для compose`() {
        val input = getResourceAsText("inputs/test-spacing-input.json")
        val spacingTokens = Serializer.meta.decodeFromString<List<SpacingToken>>(input)
        every { dimensionsConfig.multiplier } returns 1f

        spacingTokens.forEach { underTest.addToken(it) }
        val result = underTest.generate()

        assertEquals(
            listOf(
                "@dimen/thmbldr_spacing_0x",
                "@dimen/thmbldr_spacing_1x",
                "@dimen/thmbldr_spacing_2x",
            ),
            result.viewTokens.map { it.tokenRefName },
        )
        assertEquals(getResourceAsText("spacing-outputs/TestSpacingOutputKt.txt"), outputKt.toString())
    }

    @Test
    fun `SpacingTokenGenerator добавляет токен и генерирует файлы для compose c размерами из ресурсов`() {
        val input = getResourceAsText("inputs/test-spacing-input.json")
        val spacingTokens = Serializer.meta.decodeFromString<List<SpacingToken>>(input)
        val outputXml = ByteArrayOutputStream()
        val spacingXmlFile = mockk<File>(relaxed = true)
        every { spacingXmlFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.shapesXmlFile() } returns spacingXmlFile
        every { dimensionsConfig.multiplier } returns 1f
        every { dimensionsConfig.fromResources } returns true

        spacingTokens.forEach { underTest.addToken(it) }
        underTest.generate()

        assertEquals(getResourceAsText("spacing-outputs/TestSpacingFromResourceOutputKt.txt"), outputKt.toString())
    }

    private companion object {
        val spacingTokenValues = mapOf(
            "spacing.0x" to SpacingTokenValue(0f),
            "spacing.1x" to SpacingTokenValue(2f),
            "spacing.2x" to SpacingTokenValue(4f),
        )
    }
}
