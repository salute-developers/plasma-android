package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.download.FileDownloader
import com.sdds.plugin.themebuilder.internal.download.FontDownloader
import com.sdds.plugin.themebuilder.internal.download.FontDownloaderWithCache
import com.sdds.plugin.themebuilder.internal.factory.FontDownloaderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlFontFamilyDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.fonts.FontsAggregator
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.FontToken
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fontFamilyXmlFile
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
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit тесты [FontTokenGenerator]
 */
class FontTokenGeneratorTest {
    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var mockDownloaderFactory: FontDownloaderFactory
    private lateinit var mockFileDownloader: FileDownloader
    private lateinit var fontDownloader: FontDownloader
    private lateinit var underTest: FontTokenGenerator

    @Before
    fun setUp() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        mockOutputResDir = mockk(relaxed = true)
        mockFileDownloader = mockk(relaxed = true)
        fontDownloader = FontDownloaderWithCache(mockFileDownloader)
        mockDownloaderFactory = mockk<FontDownloaderFactory>(relaxed = true)
        every { mockDownloaderFactory.create() } returns fontDownloader

        underTest = FontTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            xmlFontFamilyBuilderFactory = XmlFontFamilyDocumentBuilderFactory(),
            fontDownloaderFactory = mockDownloaderFactory,
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            namespace = "com.test",
            resPrefix = "thmbldr",
            fontTokenValues = fontTokenValues,
            fontsAggregator = FontsAggregator(),
            dimensionsConfig = DimensionsConfig(),
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
    fun `FontGenerator добавляет токен и генерирует файлы для compose и view system`() {
        val input = getResourceAsText("inputs/test-font-input.json")
        val fontTokens = Serializer.meta.decodeFromString<List<FontToken>>(input)
        val outputFontFamilyDisplayXml = ByteArrayOutputStream()
        val outputFontFamilyTextXml = ByteArrayOutputStream()
        val fontFamilyDisplayXmlFile = mockk<File>(relaxed = true)
        val fontFamilyTextXmlFile = mockk<File>(relaxed = true)
        every { fontFamilyDisplayXmlFile.fileWriter() } returns outputFontFamilyDisplayXml.writer()
        every { fontFamilyTextXmlFile.fileWriter() } returns outputFontFamilyTextXml.writer()
        every {
            mockOutputResDir.fontFamilyXmlFile(
                "display",
                "thmbldr",
            )
        } returns fontFamilyDisplayXmlFile
        every {
            mockOutputResDir.fontFamilyXmlFile(
                "text",
                "thmbldr",
            )
        } returns fontFamilyTextXmlFile

        fontTokens.forEach { token ->
            underTest.addToken(token)
        }
        underTest.generate()

        Assert.assertEquals(
            getResourceAsText("font-outputs/test-font-family-display-output.xml"),
            outputFontFamilyDisplayXml.toString(),
        )

        Assert.assertEquals(
            getResourceAsText("font-outputs/test-font-family-text-output.xml"),
            outputFontFamilyTextXml.toString(),
        )

        Assert.assertEquals(
            getResourceAsText("font-outputs/TestFontFamilyOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val fontTokenValues = mapOf(
            "font-family.display" to FontTokenValue(
                name = "SB Sans Display",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://cdn-app.sberdevices.ru/shared-static/0.0.0/" +
                            "fonts/SBSansDisplay.0.2.0/SBSansDisplay-Regular.otf",
                        fontWeight = 300,
                        fontStyle = "normal",
                    ),
                    FontToken.FontVariant(
                        link = "https://cdn-app.sberdevices.ru/shared-static/0.0.0/" +
                            "fonts/SBSansDisplay.0.2.0/SBSansDisplay-Bold.otf",
                        fontWeight = 600,
                        fontStyle = "normal",
                    ),
                ),
            ),
            "font-family.text" to FontTokenValue(
                name = "SB Sans Text",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://cdn-app.sberdevices.ru/shared-static/0.0.0/" +
                            "fonts/SBSansText.0.2.0/SBSansText-Regular.otf",
                        fontWeight = 300,
                        fontStyle = "normal",
                    ),
                    FontToken.FontVariant(
                        link = "https://cdn-app.sberdevices.ru/shared-static/0.0.0/" +
                            "fonts/SBSansText.0.2.0/SBSansText-Italic.otf",
                        fontWeight = 300,
                        fontStyle = "italic",
                    ),
                    FontToken.FontVariant(
                        link = "https://cdn-app.sberdevices.ru/shared-static/0.0.0/" +
                            "fonts/SBSansText.0.2.0/SBSansText-Bold.otf",
                        fontWeight = 600,
                        fontStyle = "normal",
                    ),
                ),
            ),
        )
    }
}
