package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeShadowAttributeGenerator
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import io.mockk.verify
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream

class ComposeShadowAttributeGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var ktFileBuilderFactory: KtFileBuilderFactory
    private lateinit var ktFileBuilder: KtFileBuilder
    private lateinit var dimensionsConfig: DimensionsConfig
    private lateinit var underTest: ComposeShadowAttributeGenerator

    @Before
    fun setUp() {
        mockkObject(PropertySpec, TypeSpec)
        outputKt = ByteArrayOutputStream()
        ktFileBuilder = KtFileBuilder(
            packageName = "com.sdds.playground.themebuilder.theme",
            fileName = "ThemeShadows",
        )
        ktFileBuilderFactory = mockk {
            every { create("ThemeShadows", TargetPackage.THEME) } returns ktFileBuilder
        }
        dimensionsConfig = mockk(relaxed = true) {
            every { fromResources } returns false
        }
        underTest = ComposeShadowAttributeGenerator(
            ktFileBuilderFactory = ktFileBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
            dimensionsConfig = dimensionsConfig,
            packageResolver = PackageResolver("com.sdds.playground.themebuilder"),
        )
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkObject(PropertySpec, TypeSpec)
    }

    @Test
    fun `generate не создает файл если список теней пустой или нет default tenant`() {
        underTest.generate()

        verify(exactly = 0) { ktFileBuilderFactory.create("ThemeShadows", TargetPackage.THEME) }
        assertEquals("", outputKt.toString())

        underTest.setShadowTokenData(
            mapOf(
                Tenant("Dark") to listOf(shadowTokenData("down.soft.m")),
            ),
        )

        underTest.generate()

        verify(exactly = 0) { ktFileBuilderFactory.create("ThemeShadows", TargetPackage.THEME) }
        assertEquals("", outputKt.toString())
    }

    @Test
    fun `generate создает класс теней и factory функции для tenants`() {
        every { dimensionsConfig.fromResources } returns true
        underTest.setShadowTokenData(
            mapOf(
                Tenant.Default to listOf(
                    shadowTokenData(
                        tokenTechName = "down.soft.s",
                        fallbackElevationRef = "2.0.dp",
                    ),
                ),
                Tenant("Dark") to listOf(
                    shadowTokenData(
                        tokenTechName = "down.soft.s",
                        colorRef = "ShadowTokensDark.downSoftSColor",
                    ),
                    shadowTokenData(
                        tokenTechName = "down.hard.m",
                    ),
                ),
            ),
        )

        underTest.generate()

        verify { ktFileBuilderFactory.create("ThemeShadows", TargetPackage.THEME) }
        val content = outputKt.toString()
        assertTrue(content.contains("import androidx.compose.runtime.Composable"))
        assertTrue(content.contains("import androidx.compose.runtime.Immutable"))
        assertTrue(content.contains("import androidx.compose.runtime.ReadOnlyComposable"))
        assertTrue(content.contains("import com.sdds.playground.themebuilder.tokens.ShadowTokens"))
        assertTrue(content.contains("import com.sdds.playground.themebuilder.tokens.ShadowTokensDark"))
        assertTrue(content.contains("data class ThemeShadows("))
        assertTrue(content.contains("val downSoftS: ShadowAppearance = ShadowAppearance()"))
        assertTrue(content.contains("internal val LocalThemeShadows: ProvidableCompositionLocal<ThemeShadows>"))
        assertTrue(content.contains("fun defaultThemeShadows(): ThemeShadows"))
        assertTrue(content.contains("fun defaultThemeShadowsDark(): ThemeShadows"))
        assertTrue(content.contains("downSoftS = ShadowAppearance("))
        assertTrue(content.contains("downHardM = ShadowAppearance("))
        assertTrue(content.contains("color = ShadowTokens.DownSoftSColor"))
        assertTrue(content.contains("color = ShadowTokensDark.downSoftSColor"))
        assertTrue(content.contains("fallbackElevation = 2.0.dp"))
    }

    private fun shadowTokenData(
        tokenTechName: String,
        colorRef: String = "ShadowTokens.${tokenTechName.tokenObjectName()}Color",
        fallbackElevationRef: String? = null,
    ): ShadowTokenResult.TokenData =
        ShadowTokenResult.TokenData(
            tokenTechName = tokenTechName,
            layers = listOf(
                ShadowTokenResult.ShadowLayer(
                    colorRef = colorRef,
                    offsetXRef = "ShadowTokens.${tokenTechName.tokenObjectName()}OffsetX",
                    offsetYRef = "ShadowTokens.${tokenTechName.tokenObjectName()}OffsetY",
                    spreadRef = "ShadowTokens.${tokenTechName.tokenObjectName()}Spread",
                    blurRef = "ShadowTokens.${tokenTechName.tokenObjectName()}Blur",
                    fallbackElevationRef = fallbackElevationRef,
                ),
            ),
            tokenDescription = "Shadow $tokenTechName",
        )

    private fun String.tokenObjectName(): String =
        split(".").joinToString("") { segment -> segment.replaceFirstChar(Char::uppercaseChar) }
}
