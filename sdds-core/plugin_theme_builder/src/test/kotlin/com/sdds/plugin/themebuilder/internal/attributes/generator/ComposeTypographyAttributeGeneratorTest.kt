package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.BreakPoints
import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult.ComposeTokenData
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult.TypographyInfo
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
    private lateinit var dimensionsConfig: DimensionsConfig
    private lateinit var packageResolver: PackageResolver

    @Before
    fun before() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        ktFileBuilder = KtFileBuilder(
            packageName = "com.sdds.playground.themebuilder.theme",
            fileName = "ThemeColors",
        )
        dimensionsConfig = DimensionsConfig(1f, BreakPoints(600, 840))
        ktFileFromResourcesBuilder = KtFileFromResourcesBuilder(
            packageName = "com.sdds.playground.themebuilder.theme",
        )
        packageResolver = PackageResolver("com.sdds.playground.themebuilder")
        mockKtFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every { create("ThemeTypography", TargetPackage.THEME) } returns ktFileBuilder
        }
        mockKtFileFromResourceBuilderFactory = mockk<KtFileFromResourcesBuilderFactory> {
            every { create(TargetPackage.THEME) } returns ktFileFromResourcesBuilder
        }
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
        outputKt = ByteArrayOutputStream()

        underTest = ComposeTypographyAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = mockKtFileFromResourceBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
            dimensionsConfig = dimensionsConfig,
            packageResolver = packageResolver,
        )

        underTest.setTypographyTokenData(input1)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeTypography", TargetPackage.THEME)
            mockKtFileFromResourceBuilderFactory.create(TargetPackage.THEME)
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/TypographyOutputKt_1.txt"),
            outputKt.toString(),
        )
    }

    @Test
    fun `KtAttributeGenerator должен генерировать kotlin файлы с атрибутами типографики и размерами из ресурсов`() {
        outputKt = ByteArrayOutputStream()
        underTest = ComposeTypographyAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = mockKtFileFromResourceBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
            dimensionsConfig = dimensionsConfig.copy(fromResources = true),
            packageResolver = packageResolver,
        )

        underTest.setTypographyTokenData(input1)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeTypography", TargetPackage.THEME)
            mockKtFileFromResourceBuilderFactory.create(TargetPackage.THEME)
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/TypographyOutputKt_4.txt"),
            outputKt.toString(),
        )
    }

    @Test
    fun `KtAttributeGenerator генерирует атрибуты типографики с недостающими токенами`() {
        outputKt = ByteArrayOutputStream()
        underTest = ComposeTypographyAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = mockKtFileFromResourceBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
            dimensionsConfig = dimensionsConfig,
            packageResolver = packageResolver,
        )

        underTest.setTypographyTokenData(input2)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeTypography", TargetPackage.THEME)
            mockKtFileFromResourceBuilderFactory.create(TargetPackage.THEME)
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/TypographyOutputKt_2.txt"),
            outputKt.toString(),
        )
    }

    @Test
    fun `KtAttributeGenerator генерирует атрибуты типографики только на основе large токенов`() {
        outputKt = ByteArrayOutputStream()
        underTest = ComposeTypographyAttributeGenerator(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = mockKtFileFromResourceBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
            dimensionsConfig = dimensionsConfig,
            packageResolver = packageResolver,
        )

        underTest.setTypographyTokenData(input3)
        underTest.generate()

        verify {
            mockKtFileBuilderFactory.create("ThemeTypography", TargetPackage.THEME)
            mockKtFileFromResourceBuilderFactory.create(TargetPackage.THEME)
        }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/TypographyOutputKt_3.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val input1 = ComposeTokenData(
            small = mapOf(
                "displayLNormal" to TypographyInfo("TypographySmallTokens.DisplayLNormal"),
                "displayLBold" to TypographyInfo("TypographySmallTokens.DisplayLBold"),
            ),
            medium = mapOf(
                "displayLNormal" to TypographyInfo("TypographyMediumTokens.DisplayLNormal"),
                "displayLBold" to TypographyInfo("TypographyMediumTokens.DisplayLBold"),
            ),
            large = mapOf(
                "displayLNormal" to TypographyInfo("TypographyLargeTokens.DisplayLNormal"),
                "displayLBold" to TypographyInfo("TypographyLargeTokens.DisplayLBold"),
            ),
        )
        val input2 = ComposeTokenData(
            small = mapOf(
                "displayLNormal" to TypographyInfo("TypographySmallTokens.DisplayLNormal"),
            ),
            medium = mapOf(
                "displayLBold" to TypographyInfo("TypographyMediumTokens.DisplayLBold"),
            ),
            large = mapOf(
                "displayLNormal" to TypographyInfo("TypographyLargeTokens.DisplayLNormal"),
            ),
        )
        val input3 = ComposeTokenData(
            small = emptyMap(),
            medium = emptyMap(),
            large = mapOf(
                "displayLNormal" to TypographyInfo("TypographyLargeTokens.DisplayLNormal"),
                "displayLBold" to TypographyInfo("TypographyLargeTokens.DisplayLBold"),
            ),
        )
    }
}
