package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeShapeAttributeGenerator
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
 * Unit-тесты [ComposeShapeAttributeGenerator]
 */
class ComposeShapeAttributeGeneratorTest {
    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var underTest: ComposeShapeAttributeGenerator
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
            fileName = "ThemeShapes",
        )
        mockKtFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every { create("ThemeShapes") } returns ktFileBuilder
        }
        underTest = ComposeShapeAttributeGenerator(
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
        underTest.setShapeTokenData(inputAttrs)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeShapes")
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/ShapesOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val inputAttrs = listOf(
            ShapeTokenResult.TokenData("roundXs", "RoundXs"),
            ShapeTokenResult.TokenData("roundXxs", "RoundXxs"),
        )
    }
}
