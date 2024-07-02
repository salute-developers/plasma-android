package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.TokenData
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientAttributeGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.mockkObject
import io.mockk.unmockkObject
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream

/**
 * Unit-тесты [ViewGradientAttributeGenerator]
 */
class ViewGradientAttributeGeneratorTest {
    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var underTest: ViewGradientAttributeGenerator
    private lateinit var ktFileBuilderFactory: KtFileBuilderFactory
    private lateinit var ktFileBuilder: KtFileBuilder
    private lateinit var ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory
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
        ktFileBuilderFactory = KtFileBuilderFactory("com.sdds.playground.themebuilder.tokens")
        ktFileFromResourcesBuilderFactory = KtFileFromResourcesBuilderFactory("com.sdds.playground.themebuilder.tokens")
        underTest = ViewGradientAttributeGenerator(
            ktFileBuilderFactory = ktFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = ktFileFromResourcesBuilderFactory,
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
    fun `ViewGradientAttributeGenerator должен генерировать kotlin файлы с атрибутами градиента`() {
        underTest.setGradientTokenData(inputData)
        underTest.generate()

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/ViewGradientsOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val inputData = TokenData(
            light = mapOf(
                "textDefaultAccentGradient" to listOf(
                    TokenData.Gradient(
                        tokenRefs = listOf(
                            "TextDefaultAccentGradient.colors",
                            "TextDefaultAccentGradient.positions",
                            "TextDefaultAccentGradient.angle",
                        ),
                        gradientType = TokenData.GradientType.LINEAR,
                    ),
                ),
                "textDefaultGradientJoyActive" to listOf(
                    TokenData.Gradient(
                        tokenRefs = listOf(
                            "TextDefaultGradientJoyActive.Layer1.background",
                        ),
                        gradientType = TokenData.GradientType.BACKGROUND,
                    ),
                    TokenData.Gradient(
                        tokenRefs = listOf(
                            "TextDefaultGradientJoyActive.Layer0.colors",
                            "TextDefaultGradientJoyActive.Layer0.positions",
                            "TextDefaultGradientJoyActive.Layer0.centerX",
                            "TextDefaultGradientJoyActive.Layer0.centerY",
                        ),
                        gradientType = TokenData.GradientType.SWEEP,
                    ),
                    TokenData.Gradient(
                        tokenRefs = listOf(
                            "TextDefaultAccentGradient.colors",
                            "TextDefaultAccentGradient.positions",
                            "TextDefaultAccentGradient.angle",
                        ),
                        gradientType = TokenData.GradientType.LINEAR,
                    ),
                ),
            ),
            dark = mapOf(
                "textDefaultAccentGradient" to listOf(
                    TokenData.Gradient(
                        tokenRefs = listOf(
                            "TextDefaultAccentGradient.colors",
                            "TextDefaultAccentGradient.positions",
                            "TextDefaultAccentGradient.radius",
                            "TextDefaultAccentGradient.centerX",
                            "TextDefaultAccentGradient.centerY",
                        ),
                        gradientType = TokenData.GradientType.RADIAL,
                    ),
                ),
            ),
        )
    }
}
