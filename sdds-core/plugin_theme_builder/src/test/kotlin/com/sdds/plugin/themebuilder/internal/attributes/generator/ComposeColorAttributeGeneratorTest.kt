package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeColorAttributeGenerator
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
 * Unit-тесты [ComposeColorAttributeGenerator]
 */
class ComposeColorAttributeGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var underTest: ComposeColorAttributeGenerator
    private lateinit var mockKtFileBuilderFactory: KtFileBuilderFactory
    private lateinit var ktFileBuilder: KtFileBuilder

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
        mockKtFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every { create("ThemeColors") } returns ktFileBuilder
        }
        underTest = ComposeColorAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
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
    fun `KtAttributeGenerator должен генерировать kotlin файлы с атрибутами цвета`() {
        underTest.generate(inputAttrs)

        verify {
            mockKtFileBuilderFactory.create("ThemeColors")
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/CoreColorsOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val inputAttrs = listOf(
            ColorTokenResult.TokenData("textPrimary", "TextPrimary", true),
            ColorTokenResult.TokenData("textTertiary", "TextTertiary", true),
        )
    }
}
