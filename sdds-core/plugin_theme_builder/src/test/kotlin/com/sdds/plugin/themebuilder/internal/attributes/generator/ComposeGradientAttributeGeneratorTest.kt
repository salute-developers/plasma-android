package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.ComposeTokenData
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeGradientAttributeGenerator
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
 * Unit-тесты [ComposeGradientAttributeGenerator]
 */
class ComposeGradientAttributeGeneratorTest {
    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var underTest: ComposeGradientAttributeGenerator
    private lateinit var mockKtFileBuilderFactory: KtFileBuilderFactory
    private lateinit var ktFileBuilder: KtFileBuilder
    private lateinit var mockKtFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory
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
            packageName = "com.sdds.playground.themebuilder.tokens.compose",
            fileName = "ThemeGradients",
        )
        ktFileFromResourcesBuilder = KtFileFromResourcesBuilder(
            packageName = "com.sdds.playground.themebuilder.tokens.compose",
        )
        mockKtFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every { create("ThemeGradients") } returns ktFileBuilder
        }
        mockKtFileFromResourcesBuilderFactory = mockk<KtFileFromResourcesBuilderFactory> {
            every { create() } returns ktFileFromResourcesBuilder
        }
        underTest = ComposeGradientAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = mockKtFileFromResourcesBuilderFactory,
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
        underTest.setGradientTokenData(inputData)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeGradients")
            mockKtFileFromResourcesBuilderFactory.create()
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/GradientsOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val inputData = ComposeTokenData(
            light = mapOf(
                "textDefaultAccentGradient" to listOf(
                    ComposeTokenData.Gradient(
                        tokenRefs = listOf(
                            "TextDefaultAccentGradient.colors",
                            "TextDefaultAccentGradient.positions",
                            "TextDefaultAccentGradient.angle",
                        ),
                        gradientType = ComposeTokenData.GradientType.LINEAR,
                    ),
                ),
                "textDefaultGradientJoyActive" to listOf(
                    ComposeTokenData.Gradient(
                        tokenRefs = listOf(
                            "TextDefaultGradientJoyActive.colors",
                            "TextDefaultGradientJoyActive.positions",
                            "TextDefaultGradientJoyActive.centerX",
                            "TextDefaultGradientJoyActive.centerY",
                        ),
                        gradientType = ComposeTokenData.GradientType.SWEEP,
                    ),
                ),
            ),
            dark = mapOf(
                "textDefaultAccentGradient" to listOf(
                    ComposeTokenData.Gradient(
                        tokenRefs = listOf(
                            "TextDefaultAccentGradient.colors",
                            "TextDefaultAccentGradient.positions",
                            "TextDefaultAccentGradient.radius",
                            "TextDefaultAccentGradient.centerX",
                            "TextDefaultAccentGradient.centerY",
                        ),
                        gradientType = ComposeTokenData.GradientType.RADIAL,
                    ),
                ),
            ),
        )
    }
}
