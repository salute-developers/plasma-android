package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
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
    private lateinit var dimensionsConfig: DimensionsConfig
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
            fileName = "ThemeShapes",
        )
        mockKtFileBuilderFactory = mockk {
            every { create("ThemeShapes", TargetPackage.THEME) } returns ktFileBuilder
        }
        dimensionsConfig = mockk(relaxed = true) {
            every { multiplier } returns 1f
        }
        packageResolver = PackageResolver("com.sdds.playground.themebuilder")
        underTest = ComposeShapeAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
            dimensionsConfig = dimensionsConfig,
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
    fun `ComposeShapeAttributeGenerator должен генерировать kotlin файлы с атрибутами формы`() {
        underTest.setShapeTokenData(inputAttrs)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeShapes", TargetPackage.THEME)
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/ShapesOutputKt.txt"),
            outputKt.toString(),
        )
    }

    @Test
    fun `ComposeShapeAttributeGenerator должен генерировать kotlin файлы с атрибутами формы с размерами из ресурсов`() {
        every { dimensionsConfig.fromResources } returns true
        underTest.setShapeTokenData(inputAttrs)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeShapes", TargetPackage.THEME)
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/ShapesFromResourcesOutputKt.txt"),
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
