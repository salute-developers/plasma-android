package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult.ComposeTokenData
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeTypographyAttributeGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import io.mockk.verify
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream

/**
 * Unit-тесты [ComposeTypographyAttributeGenerator]
 */
class ComposeTypographyAttributeGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var underTest: ComposeTypographyAttributeGenerator
    private lateinit var mockKtFileBuilderFactory: KtFileBuilderFactory
    private lateinit var mockKtFileFromResourceBuilderFactory: KtFileFromResourcesBuilderFactory
    private lateinit var ktFileBuilder: KtFileBuilder
    private lateinit var ktFileFromResourcesBuilder: KtFileFromResourcesBuilder

    @Before
    fun before() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        ktFileBuilder = KtFileBuilder(
            packageName = "com.sdds.playground.themebuilder.tokens",
            fileName = "ThemeColors",
        )
        ktFileFromResourcesBuilder = KtFileFromResourcesBuilder(
            packageName = "com.sdds.playground.themebuilder.tokens",
        )
        mockKtFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every { create("ThemeTypography") } returns ktFileBuilder
        }
        mockKtFileFromResourceBuilderFactory = mockk<KtFileFromResourcesBuilderFactory> {
            every { create() } returns ktFileFromResourcesBuilder
        }
        underTest = ComposeTypographyAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = mockKtFileFromResourceBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
        )
    }

    @After
    fun after() {
        clearAllMocks()
        unmockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
    }

    @Test
    fun `KtAttributeGenerator должен генерировать kotlin файлы с атрибутами типографики`() {
        underTest.setTypographyTokenData(inputAttrs)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeTypography")
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/TypographyOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val inputAttrs = listOf(
            ComposeTokenData(
                "displayLNormal",
                "TypographySmallTokens.DisplayLNormal",
                ComposeTokenData.Screen.SMALL,
            ),
            ComposeTokenData(
                "displayLNormal",
                "TypographyMediumTokens.DisplayLNormal",
                ComposeTokenData.Screen.MEDIUM,
            ),
            ComposeTokenData(
                "displayLNormal",
                "TypographyLargeTokens.DisplayLNormal",
                ComposeTokenData.Screen.LARGE,
            ),
        )
    }
}
