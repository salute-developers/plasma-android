package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.ThemeBuilderMode
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.factory.ComposeColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeGradientAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeShadowAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeShapeAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeSpacingAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeTypographyAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.SubThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewShadowAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewShapeAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewSpacingAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewTypographyAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewXmlGradientAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.SpacingTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeGradientAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeShadowAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeShapeAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeSpacingAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeSubThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeTypographyAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewShadowAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewShapeAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewSpacingAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewSubThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewTypographyAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewXmlGradientAttributeGenerator
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class ThemeGeneratorTest {

    private val composeThemeGeneratorFactory = mockk<ComposeThemeGeneratorFactory>()
    private val viewThemeGeneratorFactory = mockk<ViewThemeGeneratorFactory>()
    private val composeColorAttributeGeneratorFactory =
        mockk<ComposeColorAttributeGeneratorFactory>()
    private val viewColorAttributeGeneratorFactory = mockk<ViewColorAttributeGeneratorFactory>()
    private val viewShapeAttributeGeneratorFactory = mockk<ViewShapeAttributeGeneratorFactory>()
    private val viewSpacingAttributeGeneratorFactory = mockk<ViewSpacingAttributeGeneratorFactory>()
    private val viewShadowAttributeGeneratorFactory = mockk<ViewShadowAttributeGeneratorFactory>()
    private val composeShapeAttributeGeneratorFactory =
        mockk<ComposeShapeAttributeGeneratorFactory>()
    private val composeSpacingAttributeGeneratorFactory =
        mockk<ComposeSpacingAttributeGeneratorFactory>()
    private val composeShadowAttributeGeneratorFactory =
        mockk<ComposeShadowAttributeGeneratorFactory>()
    private val composeGradientAttributeGeneratorFactory =
        mockk<ComposeGradientAttributeGeneratorFactory>()
    private val viewXmlGradientAttributeGeneratorFactory =
        mockk<ViewXmlGradientAttributeGeneratorFactory>()
    private val viewTypographyAttributeGeneratorFactory =
        mockk<ViewTypographyAttributeGeneratorFactory>()
    private val composeTypographyAttributeGeneratorFactory =
        mockk<ComposeTypographyAttributeGeneratorFactory>()
    private val subThemeGeneratorFactory = mockk<SubThemeGeneratorFactory>()

    private val composeThemeGenerator = mockk<ComposeThemeGenerator>(relaxed = true)
    private val composeSubThemeGenerator = mockk<ComposeSubThemeGenerator>(relaxed = true)
    private val viewSubThemeGenerator = mockk<ViewSubThemeGenerator>(relaxed = true)
    private val viewThemeGenerator = mockk<ViewThemeGenerator>(relaxed = true)
    private val composeColorAttributeGenerator =
        mockk<ComposeColorAttributeGenerator>(relaxed = true)
    private val viewColorAttributeGenerator = mockk<ViewColorAttributeGenerator>(relaxed = true)
    private val composeGradientAttributeGenerator =
        mockk<ComposeGradientAttributeGenerator>(relaxed = true)
    private val viewXmlGradientAttributeGenerator =
        mockk<ViewXmlGradientAttributeGenerator>(relaxed = true)
    private val composeShapeAttributeGenerator =
        mockk<ComposeShapeAttributeGenerator>(relaxed = true)
    private val viewXmlShapeAttributeGenerator = mockk<ViewShapeAttributeGenerator>(relaxed = true)
    private val composeSpacingAttributeGenerator =
        mockk<ComposeSpacingAttributeGenerator>(relaxed = true)
    private val viewXmlSpacingAttributeGenerator =
        mockk<ViewSpacingAttributeGenerator>(relaxed = true)
    private val composeShadowAttributeGenerator =
        mockk<ComposeShadowAttributeGenerator>(relaxed = true)
    private val viewXmlShadowAttributeGenerator =
        mockk<ViewShadowAttributeGenerator>(relaxed = true)
    private val composeTypographyAttributeGenerator =
        mockk<ComposeTypographyAttributeGenerator>(relaxed = true)
    private val viewTypographyAttributeGenerator =
        mockk<ViewTypographyAttributeGenerator>(relaxed = true)

    @Before
    fun setUp() {
        every { composeThemeGeneratorFactory.create() } returns composeThemeGenerator
        every { viewThemeGeneratorFactory.create() } returns viewThemeGenerator
        every { composeColorAttributeGeneratorFactory.create() } returns composeColorAttributeGenerator
        every { viewColorAttributeGeneratorFactory.create() } returns viewColorAttributeGenerator
        every { composeGradientAttributeGeneratorFactory.create() } returns composeGradientAttributeGenerator
        every { viewXmlGradientAttributeGeneratorFactory.create() } returns viewXmlGradientAttributeGenerator
        every { composeShapeAttributeGeneratorFactory.create() } returns composeShapeAttributeGenerator
        every { viewShapeAttributeGeneratorFactory.create() } returns viewXmlShapeAttributeGenerator
        every { composeSpacingAttributeGeneratorFactory.create() } returns composeSpacingAttributeGenerator
        every { viewSpacingAttributeGeneratorFactory.create() } returns viewXmlSpacingAttributeGenerator
        every { composeShadowAttributeGeneratorFactory.create() } returns composeShadowAttributeGenerator
        every { viewShadowAttributeGeneratorFactory.create() } returns viewXmlShadowAttributeGenerator
        every { composeTypographyAttributeGeneratorFactory.create() } returns composeTypographyAttributeGenerator
        every { viewTypographyAttributeGeneratorFactory.create() } returns viewTypographyAttributeGenerator
        every { subThemeGeneratorFactory.createCompose() } returns composeSubThemeGenerator
        every { subThemeGeneratorFactory.createView() } returns viewSubThemeGenerator
    }

    @Test
    fun `generate при target compose запускает только compose генератор`() {
        val underTest = themeGenerator(
            target = ThemeBuilderTarget.COMPOSE,
            generatorMode = ThemeBuilderMode.THEME,
        )
        underTest.generate()
        verify { composeColorAttributeGenerator.generate() }
        verify { composeGradientAttributeGenerator.generate() }
        verify { composeShapeAttributeGenerator.generate() }
        verify { composeSpacingAttributeGenerator.generate() }
        verify { composeShadowAttributeGenerator.generate() }
        verify { composeTypographyAttributeGenerator.generate() }
        verify { composeThemeGenerator.generate() }
        verify { composeSubThemeGenerator.generate() }

        verify(exactly = 0) { viewColorAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlGradientAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlShapeAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlSpacingAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlShadowAttributeGenerator.generate() }
        verify(exactly = 0) { viewTypographyAttributeGenerator.generate() }
        verify(exactly = 0) { viewThemeGenerator.generate() }
        verify(exactly = 0) { viewSubThemeGenerator.generate() }
    }

    @Test
    fun `generate при target view запускает только view генератор`() {
        val underTest = themeGenerator(
            target = ThemeBuilderTarget.VIEW_SYSTEM,
            generatorMode = ThemeBuilderMode.THEME,
        )
        underTest.generate()
        verify { viewColorAttributeGenerator.generate() }
        verify { viewXmlGradientAttributeGenerator.generate() }
        verify { viewXmlShapeAttributeGenerator.generate() }
        verify { viewXmlSpacingAttributeGenerator.generate() }
        verify { viewXmlShadowAttributeGenerator.generate() }
        verify { viewTypographyAttributeGenerator.generate() }
        verify { viewThemeGenerator.generate() }
        verify { viewSubThemeGenerator.generate() }

        verify(exactly = 0) { composeColorAttributeGenerator.generate() }
        verify(exactly = 0) { composeGradientAttributeGenerator.generate() }
        verify(exactly = 0) { composeShapeAttributeGenerator.generate() }
        verify(exactly = 0) { composeSpacingAttributeGenerator.generate() }
        verify(exactly = 0) { composeShadowAttributeGenerator.generate() }
        verify(exactly = 0) { composeTypographyAttributeGenerator.generate() }
        verify(exactly = 0) { composeThemeGenerator.generate() }
        verify(exactly = 0) { composeSubThemeGenerator.generate() }
    }

    @Test
    fun `generate при tokens_only и target view_system генерирует только пустую тему`() {
        val underTest = themeGenerator(
            target = ThemeBuilderTarget.VIEW_SYSTEM,
            generatorMode = ThemeBuilderMode.TOKENS_ONLY,
        )
        underTest.generate()
        verify { viewThemeGenerator.generateEmptyTheme() }

        verify(exactly = 0) { composeColorAttributeGenerator.generate() }
        verify(exactly = 0) { composeGradientAttributeGenerator.generate() }
        verify(exactly = 0) { composeShapeAttributeGenerator.generate() }
        verify(exactly = 0) { composeSpacingAttributeGenerator.generate() }
        verify(exactly = 0) { composeShadowAttributeGenerator.generate() }
        verify(exactly = 0) { composeTypographyAttributeGenerator.generate() }
        verify(exactly = 0) { composeThemeGenerator.generate() }
        verify(exactly = 0) { composeSubThemeGenerator.generate() }

        verify(exactly = 0) { viewColorAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlGradientAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlShapeAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlSpacingAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlShadowAttributeGenerator.generate() }
        verify(exactly = 0) { viewTypographyAttributeGenerator.generate() }
        verify(exactly = 0) { viewThemeGenerator.generate() }
        verify(exactly = 0) { viewSubThemeGenerator.generate() }
    }

    @Test
    fun `generate при tokens_only и target compose генерирует только пустую тему`() {
        val underTest = themeGenerator(
            target = ThemeBuilderTarget.COMPOSE,
            generatorMode = ThemeBuilderMode.TOKENS_ONLY,
        )
        underTest.generate()
        verify(exactly = 0) { viewThemeGenerator.generateEmptyTheme() }

        verify(exactly = 0) { composeColorAttributeGenerator.generate() }
        verify(exactly = 0) { composeGradientAttributeGenerator.generate() }
        verify(exactly = 0) { composeShapeAttributeGenerator.generate() }
        verify(exactly = 0) { composeSpacingAttributeGenerator.generate() }
        verify(exactly = 0) { composeShadowAttributeGenerator.generate() }
        verify(exactly = 0) { composeTypographyAttributeGenerator.generate() }
        verify(exactly = 0) { composeThemeGenerator.generate() }
        verify(exactly = 0) { composeSubThemeGenerator.generate() }

        verify(exactly = 0) { viewColorAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlGradientAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlShapeAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlSpacingAttributeGenerator.generate() }
        verify(exactly = 0) { viewXmlShadowAttributeGenerator.generate() }
        verify(exactly = 0) { viewTypographyAttributeGenerator.generate() }
        verify(exactly = 0) { viewThemeGenerator.generate() }
        verify(exactly = 0) { viewSubThemeGenerator.generate() }
    }

    @Test
    fun `setColorTokenData при target compose запускает только copmpose генератор`() {
        val colorTokenResult = colorTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.COMPOSE)

        underTest.setColorTokenData(colorTokenResult)

        verify { composeColorAttributeGenerator.setColorTokenData(colorTokenResult.composeTokens) }
        verify { composeThemeGenerator.setColorTokenData(colorTokenResult.composeTokens) }
        verify {
            composeSubThemeGenerator.setColorTokens(
                colorTokenResult.tokens,
                colorTokenResult.composeTokens,
            )
        }

        verify(exactly = 0) { viewColorAttributeGenerator.setColorTokenData(any()) }
        verify(exactly = 0) { viewThemeGenerator.setColorTokenData(any()) }
        verify(exactly = 0) { viewSubThemeGenerator.setColorTokens(any(), any()) }
    }

    @Test
    fun `setColorTokenData при target view_system запускает только view генератор`() {
        val colorTokenResult = colorTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.VIEW_SYSTEM)

        underTest.setColorTokenData(colorTokenResult)

        verify { viewColorAttributeGenerator.setColorTokenData(colorTokenResult.viewTokens) }
        verify { viewThemeGenerator.setColorTokenData(colorTokenResult.viewTokens) }
        verify {
            viewSubThemeGenerator.setColorTokens(
                colorTokenResult.tokens,
                colorTokenResult.viewTokens,
            )
        }

        verify(exactly = 0) { composeColorAttributeGenerator.setColorTokenData(any()) }
        verify(exactly = 0) { composeThemeGenerator.setColorTokenData(any()) }
        verify(exactly = 0) { composeSubThemeGenerator.setColorTokens(any(), any()) }
    }

    @Test
    fun `setGradientTokenData при target ALL передает данные compose и view генераторы`() {
        val gradientTokenResult = gradientTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.ALL)

        underTest.setGradientTokenData(gradientTokenResult)

        verify { composeGradientAttributeGenerator.setGradientTokenData(gradientTokenResult.composeTokens) }
        verify {
            composeSubThemeGenerator.setGradientTokens(
                gradientTokenResult.tokens,
                gradientTokenResult.composeTokens,
            )
        }
        verify { viewXmlGradientAttributeGenerator.setGradientTokenData(gradientTokenResult.viewXmlTokens) }
        verify { viewThemeGenerator.setGradientTokenData(gradientTokenResult.viewXmlTokens) }
        verify {
            viewSubThemeGenerator.setGradientTokens(
                gradientTokenResult.tokens,
                gradientTokenResult.viewXmlTokens,
            )
        }
    }

    @Test
    fun `setGradientTokenData при target view_system не передает данные compose генератора`() {
        val gradientTokenResult = gradientTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.VIEW_SYSTEM)

        underTest.setGradientTokenData(gradientTokenResult)

        verify { viewXmlGradientAttributeGenerator.setGradientTokenData(gradientTokenResult.viewXmlTokens) }
        verify { viewThemeGenerator.setGradientTokenData(gradientTokenResult.viewXmlTokens) }
        verify {
            viewSubThemeGenerator.setGradientTokens(
                gradientTokenResult.tokens,
                gradientTokenResult.viewXmlTokens,
            )
        }

        verify(exactly = 0) { composeGradientAttributeGenerator.setGradientTokenData(any()) }
        verify(exactly = 0) { composeSubThemeGenerator.setGradientTokens(any(), any()) }
    }

    @Test
    fun `setGradientTokenData при target compose не передает данные view_system генератора`() {
        val gradientTokenResult = gradientTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.COMPOSE)

        underTest.setGradientTokenData(gradientTokenResult)

        verify { composeGradientAttributeGenerator.setGradientTokenData(gradientTokenResult.composeTokens) }
        verify {
            composeSubThemeGenerator.setGradientTokens(
                gradientTokenResult.tokens,
                gradientTokenResult.composeTokens,
            )
        }

        verify(exactly = 0) { viewXmlGradientAttributeGenerator.setGradientTokenData(any()) }
        verify(exactly = 0) { viewThemeGenerator.setGradientTokenData(any()) }
        verify(exactly = 0) { viewSubThemeGenerator.setGradientTokens(any(), any()) }
    }

    @Test
    fun `setShapeTokenData при target ALL передает данные compose и view генераторы`() {
        val shapeTokenResult = shapeTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.ALL)

        underTest.setShapeTokenData(shapeTokenResult)

        verify { composeShapeAttributeGenerator.setShapeTokenData(shapeTokenResult.composeTokens) }
        verify { viewXmlShapeAttributeGenerator.setShapeTokenData(shapeTokenResult.viewTokens) }
        verify { viewThemeGenerator.setShapeTokenData(shapeTokenResult.viewTokens) }
    }

    @Test
    fun `setShapeTokenData не передает view данные если генерация view shape style выключена`() {
        val shapeTokenResult = shapeTokenResult()
        val underTest = themeGenerator(
            target = ThemeBuilderTarget.VIEW_SYSTEM,
            shouldGenerateViewShapeStyle = false,
        )

        underTest.setShapeTokenData(shapeTokenResult)

        verify(exactly = 0) { viewXmlShapeAttributeGenerator.setShapeTokenData(any()) }
        verify(exactly = 0) { viewThemeGenerator.setShapeTokenData(any()) }
    }

    @Test
    fun `setShapeTokenData при включенной генерации view shape передает данные view генератора`() {
        val shapeTokenResult = shapeTokenResult()
        val underTest = themeGenerator(
            target = ThemeBuilderTarget.VIEW_SYSTEM,
            shouldGenerateViewShapeStyle = true,
        )

        underTest.setShapeTokenData(shapeTokenResult)

        verify { viewXmlShapeAttributeGenerator.setShapeTokenData(shapeTokenResult.viewTokens) }
        verify { viewThemeGenerator.setShapeTokenData(shapeTokenResult.viewTokens) }
    }

    @Test
    fun `setShapeTokenData при target compose не передает данные view генератора`() {
        val shapeTokenResult = shapeTokenResult()
        val underTest = themeGenerator(
            target = ThemeBuilderTarget.COMPOSE,
            shouldGenerateViewShapeStyle = true,
        )

        underTest.setShapeTokenData(shapeTokenResult)

        verify { composeShapeAttributeGenerator.setShapeTokenData(shapeTokenResult.composeTokens) }
        verify(exactly = 0) { viewXmlShapeAttributeGenerator.setShapeTokenData(any()) }
        verify(exactly = 0) { viewThemeGenerator.setShapeTokenData(any()) }
    }

    @Test
    fun `setShadowTokenData при target ALL передает данные compose и view генераторы`() {
        val shadowTokenResult = shadowTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.ALL)
        underTest.setShadowTokenData(shadowTokenResult)

        verify { composeShadowAttributeGenerator.setShadowTokenData(shadowTokenResult.composeTokens) }
        verify { viewXmlShadowAttributeGenerator.setShadowTokenData(shadowTokenResult.viewTokens) }
        verify { viewThemeGenerator.setShadowsTokenData(shadowTokenResult.viewTokens) }
    }

    @Test
    fun `setShadowTokenData при target view_system не передает данные compose генератора`() {
        val shadowTokenResult = shadowTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.VIEW_SYSTEM)

        underTest.setShadowTokenData(shadowTokenResult)
        verify(exactly = 0) { composeShadowAttributeGenerator.setShadowTokenData(any()) }
        verify { viewXmlShadowAttributeGenerator.setShadowTokenData(shadowTokenResult.viewTokens) }
        verify { viewThemeGenerator.setShadowsTokenData(shadowTokenResult.viewTokens) }
    }

    @Test
    fun `setShadowTokenData при target compose не передает данные view генератора`() {
        val shadowTokenResult = shadowTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.COMPOSE)

        underTest.setShadowTokenData(shadowTokenResult)
        verify { composeShadowAttributeGenerator.setShadowTokenData(shadowTokenResult.composeTokens) }
        verify(exactly = 0) { viewXmlShadowAttributeGenerator.setShadowTokenData(any()) }
        verify(exactly = 0) { viewThemeGenerator.setShadowsTokenData(any()) }
    }

    @Test
    fun `setSpacingTokenData при target ALL передает данные compose и view генераторы`() {
        val spacingTokenResult = spacingTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.ALL)

        underTest.setSpacingTokenData(spacingTokenResult)
        verify { composeSpacingAttributeGenerator.setSpacingTokenData(spacingTokenResult.composeTokens) }
        verify { viewXmlSpacingAttributeGenerator.setSpacingTokenData(spacingTokenResult.viewTokens) }
        verify { viewThemeGenerator.setSpacingTokenData(spacingTokenResult.viewTokens) }
    }

    @Test
    fun `setSpacingTokenData при target view_system не передает данные compose генератора`() {
        val spacingTokenResult = spacingTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.VIEW_SYSTEM)

        underTest.setSpacingTokenData(spacingTokenResult)
        verify(exactly = 0) { composeSpacingAttributeGenerator.setSpacingTokenData(any()) }
        verify { viewXmlSpacingAttributeGenerator.setSpacingTokenData(spacingTokenResult.viewTokens) }
        verify { viewThemeGenerator.setSpacingTokenData(spacingTokenResult.viewTokens) }
    }

    @Test
    fun `setSpacingTokenData при target compose не передает данные view генератора`() {
        val spacingTokenResult = spacingTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.COMPOSE)

        underTest.setSpacingTokenData(spacingTokenResult)

        verify { composeSpacingAttributeGenerator.setSpacingTokenData(spacingTokenResult.composeTokens) }
        verify(exactly = 0) { viewXmlSpacingAttributeGenerator.setSpacingTokenData(any()) }
        verify(exactly = 0) { viewThemeGenerator.setSpacingTokenData(any()) }
    }

    @Test
    fun `setTypographyTokenData при target ALL передает данные compose и view генераторы`() {
        val typographyTokenResult = typographyTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.ALL)

        underTest.setTypographyTokenData(typographyTokenResult)

        verify { composeTypographyAttributeGenerator.setTypographyTokenData(typographyTokenResult.composeTokens) }
        verify { composeThemeGenerator.setTypographyTokenData(typographyTokenResult.composeTokens) }
        verify { viewTypographyAttributeGenerator.setTypographyTokenData(typographyTokenResult.viewTokens) }
        verify { viewThemeGenerator.setTypographyTokenData(typographyTokenResult.viewTokens) }
    }

    @Test
    fun `setTypographyTokenData при target view_system не передает данные compose генератора`() {
        val typographyTokenResult = typographyTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.VIEW_SYSTEM)

        underTest.setTypographyTokenData(typographyTokenResult)

        verify(exactly = 0) { composeTypographyAttributeGenerator.setTypographyTokenData(any()) }
        verify(exactly = 0) { composeThemeGenerator.setTypographyTokenData(any()) }
        verify { viewTypographyAttributeGenerator.setTypographyTokenData(typographyTokenResult.viewTokens) }
        verify { viewThemeGenerator.setTypographyTokenData(typographyTokenResult.viewTokens) }
    }

    @Test
    fun `setTypographyTokenData при target compose не передает данные view генератора`() {
        val typographyTokenResult = typographyTokenResult()
        val underTest = themeGenerator(target = ThemeBuilderTarget.COMPOSE)

        underTest.setTypographyTokenData(typographyTokenResult)

        verify { composeTypographyAttributeGenerator.setTypographyTokenData(typographyTokenResult.composeTokens) }
        verify { composeThemeGenerator.setTypographyTokenData(typographyTokenResult.composeTokens) }
        verify(exactly = 0) { viewTypographyAttributeGenerator.setTypographyTokenData(any()) }
        verify(exactly = 0) { viewThemeGenerator.setTypographyTokenData(any()) }
    }

    private fun themeGenerator(
        target: ThemeBuilderTarget = ThemeBuilderTarget.ALL,
        generatorMode: ThemeBuilderMode = ThemeBuilderMode.THEME,
        shouldGenerateViewShapeStyle: Boolean = true,
    ): ThemeGenerator {
        return ThemeGenerator(
            composeThemeGeneratorFactory = composeThemeGeneratorFactory,
            viewThemeGeneratorFactory = viewThemeGeneratorFactory,
            generatorMode = generatorMode,
            shouldGenerateViewShapeStyle = shouldGenerateViewShapeStyle,
            target = target,
            composeColorAttributeGeneratorFactory = composeColorAttributeGeneratorFactory,
            viewColorAttributeGeneratorFactory = viewColorAttributeGeneratorFactory,
            viewShapeAttributeGeneratorFactory = viewShapeAttributeGeneratorFactory,
            viewSpacingAttributeGeneratorFactory = viewSpacingAttributeGeneratorFactory,
            viewShadowAttributeGeneratorFactory = viewShadowAttributeGeneratorFactory,
            composeShapeAttributeGeneratorFactory = composeShapeAttributeGeneratorFactory,
            composeSpacingAttributeGeneratorFactory = composeSpacingAttributeGeneratorFactory,
            composeShadowAttributeGeneratorFactory = composeShadowAttributeGeneratorFactory,
            composeGradientAttributeGeneratorFactory = composeGradientAttributeGeneratorFactory,
            viewXmlGradientAttributeGeneratorFactory = viewXmlGradientAttributeGeneratorFactory,
            viewTypographyAttributeGeneratorFactory = viewTypographyAttributeGeneratorFactory,
            composeTypographyAttributeGeneratorFactory = composeTypographyAttributeGeneratorFactory,
            subThemeGeneratorFactory = subThemeGeneratorFactory,
        )
    }

    private fun colorTokenResult(
        token: ColorToken = colorToken(
            name = "light.text.default.primary",
            tags = setOf("default"),
        ),
        composeTokens: Map<Tenant, ColorTokenResult.TokenData> = mapOf(
            Tenant.Default to ColorTokenResult.TokenData(
                light = mapOf(
                    "textPrimary" to ColorTokenResult.TokenData.ColorInfo("LightTextPrimary"),
                ),
                dark = emptyMap(),
            ),
        ),
        viewTokens: ColorTokenResult.TokenData = ColorTokenResult.TokenData(
            light = mapOf(
                "textPrimary" to ColorTokenResult.TokenData.ColorInfo("@color/light_text_primary"),
            ),
            dark = emptyMap(),
        ),
    ): ColorTokenResult {
        return ColorTokenResult(
            tokens = listOf(token),
            composeTokens = composeTokens,
            viewTokens = viewTokens,
            tokenInfo = emptyList(),
        )
    }

    private fun gradientTokenResult(
        token: GradientToken = gradientToken(
            name = "light.text.default.accent-gradient",
            tags = setOf("default"),
        ),
        composeTokens: Map<Tenant, GradientTokenResult.ComposeTokenData> = mapOf(
            Tenant.Default to GradientTokenResult.ComposeTokenData(
                light = mapOf(
                    "textAccentGradient" to listOf(
                        GradientTokenResult.ComposeTokenData.Gradient(
                            listOf(
                                "TextGradient.colors",
                                "TextGradient.positions",
                                "TextGradient.angle",
                            ),
                            gradientType = GradientTokenResult.ComposeTokenData.GradientType.LINEAR,
                            tokenObjectName = "LightGradientTokens",
                        ),
                    ),
                ),
                dark = emptyMap(),
            ),
        ),
        viewTokens: GradientTokenResult.ViewTokenData = GradientTokenResult.ViewTokenData(
            light = mapOf(
                "textAccentGradient" to GradientTokenResult.ViewTokenData.Gradient(
                    nameSnakeCase = "light_text_accent_gradient",
                    layers = listOf(
                        GradientTokenResult.ViewTokenData.Gradient.Layer.Linear(
                            angle = "@string/light_text_accent_gradient_angle",
                            colors = "@color/light_text_accent_gradient_colors",
                            stops = "@array/light_text_accent_gradient_stops",
                        ),
                    ),
                    description = "Accent gradient",
                    isTextGradient = true,
                ),
            ),
            dark = emptyMap(),
        ),
    ): GradientTokenResult {
        return GradientTokenResult(
            tokens = listOf(token),
            composeTokens = composeTokens,
            viewXmlTokens = viewTokens,
            tokenInfo = emptyList(),
        )
    }

    private fun shapeTokenResult(
        composeTokens: Map<Tenant, List<ShapeTokenResult.TokenData>> = mapOf(
            Tenant.Default to listOf(
                ShapeTokenResult.TokenData(
                    attrName = "roundXs",
                    tokenRefName = "RoundXs",
                ),
            ),
        ),
        viewTokens: List<ShapeTokenResult.TokenData> = listOf(
            ShapeTokenResult.TokenData(
                attrName = "shapeRoundXs",
                tokenRefName = "@style/Test.Shape.Round.Xs",
            ),
        ),
    ): ShapeTokenResult {
        return ShapeTokenResult(
            composeTokens = composeTokens,
            viewTokens = viewTokens,
            tokenInfo = emptyList(),
        )
    }

    private fun shadowTokenResult(
        tokenData: ShadowTokenResult.TokenData = ShadowTokenResult.TokenData(
            tokenTechName = "Shadow",
            tokenDescription = "Shadow",
            layers = emptyList(),
        ),
    ): ShadowTokenResult {
        return ShadowTokenResult(
            composeTokens = mapOf(Tenant.Default to listOf(tokenData)),
            viewTokens = listOf(tokenData),
            tokenInfo = emptyList(),
        )
    }

    private fun spacingTokenResult(
        composeTokens: Map<Tenant, List<SpacingTokenResult.TokenData>> = mapOf(
            Tenant.Default to listOf(
                SpacingTokenResult.TokenData(
                    attrName = "spacing12",
                    tokenRefName = "Spacing12",
                ),
            ),
        ),
        viewTokens: List<SpacingTokenResult.TokenData> = listOf(
            SpacingTokenResult.TokenData(
                attrName = "spacing12",
                tokenRefName = "@dimen/spacing_12",
            ),
        ),
    ): SpacingTokenResult {
        return SpacingTokenResult(
            composeTokens = composeTokens,
            viewTokens = viewTokens,
            tokenInfo = emptyList(),
        )
    }

    private fun typographyTokenResult(
        composeTokens: Map<Tenant, TypographyTokenResult.ComposeTokenData> = mapOf(
            Tenant.Default to TypographyTokenResult.ComposeTokenData(
                small = mapOf(
                    "bodyMNormal" to TypographyTokenResult.TypographyInfo(
                        tokenRef = "TypograpgySmallTokens.bodyMNormal",
                    ),
                ),
                medium = mapOf(
                    "bodyMNormal" to TypographyTokenResult.TypographyInfo(
                        tokenRef = "TypograpgyMediumTokens.bodyMNormal",
                    ),
                ),
                large = mapOf(
                    "bodyMNormal" to TypographyTokenResult.TypographyInfo(
                        tokenRef = "TypograpgyLargeTokens.bodyMNormal",
                    ),
                ),
            ),
        ),
        viewTokens: TypographyTokenResult.ViewTokenData = TypographyTokenResult.ViewTokenData(
            attrs = mapOf(
                "typographyBodyMNormal" to TypographyTokenResult.TypographyInfo(
                    tokenRef = "@style/Test.Typography.Body.M.Normal",
                ),
            ),
        ),
    ): TypographyTokenResult {
        return TypographyTokenResult(
            composeTokens = composeTokens,
            viewTokens = viewTokens,
            tokenInfo = emptyList(),
        )
    }

    private fun gradientToken(
        name: String,
        tags: Set<String>,
    ) = GradientToken(
        displayName = name,
        name = name,
        tags = tags,
        enabled = true,
        description = name,
    )

    private fun colorToken(
        name: String,
        tags: Set<String>,
    ) = ColorToken(
        displayName = name,
        name = name,
        tags = tags,
        enabled = true,
        description = name,
    )
}
