package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
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
    private lateinit var packageResolver: PackageResolver

    @Before
    fun before() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        ktFileBuilder = KtFileBuilder(
            packageName = "com.sdds.playground.themebuilder.theme",
            fileName = "ThemeColors",
        )
        mockKtFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every { create("ThemeColors", TargetPackage.THEME) } returns ktFileBuilder
        }
        packageResolver = PackageResolver("com.sdds.playground.themebuilder")
        underTest = ComposeColorAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
            packageResolver = packageResolver,
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
        underTest.setColorTokenData(inputData)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeColors", TargetPackage.THEME)
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/ColorsOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val inputData = ColorTokenResult.TokenData(
            light = mapOf(
                "textPrimary" to ColorTokenResult.TokenData.ColorInfo("TextPrimary"),
                "textTertiary" to ColorTokenResult.TokenData.ColorInfo("TextTertiary"),
            ),
            dark = mapOf(
                "textPrimary" to ColorTokenResult.TokenData.ColorInfo("TextPrimary"),
                "textTertiary" to ColorTokenResult.TokenData.ColorInfo("TextTertiary"),
            ),
        )
    }
}
