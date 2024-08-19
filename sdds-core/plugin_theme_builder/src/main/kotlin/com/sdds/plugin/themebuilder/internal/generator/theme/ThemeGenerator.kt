package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.ThemeBuilderMode
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.factory.ComposeColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeGradientAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeShapeAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeTypographyAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewGradientAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewShapeAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewTypographyAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeGradientAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeShapeAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeTypographyAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewShapeAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewTypographyAttributeGenerator
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

/**
 * Генерирует темы и атрибуты, необходимые для темы под нужный таргет [ThemeBuilderTarget]
 */
internal class ThemeGenerator(
    private val composeThemeGeneratorFactory: ComposeThemeGeneratorFactory,
    private val viewThemeGeneratorFactory: ViewThemeGeneratorFactory,
    private val composeColorAttributeGeneratorFactory: ComposeColorAttributeGeneratorFactory,
    private val viewColorAttributeGeneratorFactory: ViewColorAttributeGeneratorFactory,
    private val viewShapeAttributeGeneratorFactory: ViewShapeAttributeGeneratorFactory,
    private val composeShapeAttributeGeneratorFactory: ComposeShapeAttributeGeneratorFactory,
    private val composeGradientAttributeGeneratorFactory: ComposeGradientAttributeGeneratorFactory,
    private val viewGradientAttributeGeneratorFactory: ViewGradientAttributeGeneratorFactory,
    private val viewTypographyAttributeGeneratorFactory: ViewTypographyAttributeGeneratorFactory,
    private val composeTypographyAttributeGeneratorFactory: ComposeTypographyAttributeGeneratorFactory,
    private val target: ThemeBuilderTarget,
    private val generatorMode: ThemeBuilderMode,
    private val shouldGenerateViewShapeStyle: Boolean,
) : SimpleBaseGenerator {

    private val composeThemeGenerator: ComposeThemeGenerator by unsafeLazy {
        composeThemeGeneratorFactory.create()
    }
    private val viewThemeGenerator: ViewThemeGenerator by unsafeLazy {
        viewThemeGeneratorFactory.create()
    }
    private val composeColorAttributeGenerator: ComposeColorAttributeGenerator by unsafeLazy {
        composeColorAttributeGeneratorFactory.create()
    }
    private val composeGradientAttributeGenerator: ComposeGradientAttributeGenerator by unsafeLazy {
        composeGradientAttributeGeneratorFactory.create()
    }
    private val composeShapeAttributeGenerator: ComposeShapeAttributeGenerator by unsafeLazy {
        composeShapeAttributeGeneratorFactory.create()
    }
    private val composeTypographyAttributeGenerator: ComposeTypographyAttributeGenerator by unsafeLazy {
        composeTypographyAttributeGeneratorFactory.create()
    }
    private val viewGradientAttributeGenerator: ViewGradientAttributeGenerator by unsafeLazy {
        viewGradientAttributeGeneratorFactory.create()
    }
    private val viewColorAttributeGenerator: ViewColorAttributeGenerator by unsafeLazy {
        viewColorAttributeGeneratorFactory.create()
    }
    private val viewShapeAttributeGenerator: ViewShapeAttributeGenerator by unsafeLazy {
        viewShapeAttributeGeneratorFactory.create()
    }
    private val viewTypographyAttributeGenerator: ViewTypographyAttributeGenerator by unsafeLazy {
        viewTypographyAttributeGeneratorFactory.create()
    }

    /**
     * Устанавливает данные о токенах цвета
     *
     * @param colorTokenResult данные о токенах цвета
     * @see [ColorTokenResult]
     */
    fun setColorTokenData(colorTokenResult: ColorTokenResult) {
        if (target.isComposeOrAll) {
            composeColorAttributeGenerator.setColorTokenData(colorTokenResult.composeTokens)
            composeThemeGenerator.setColorTokenData(colorTokenResult.composeTokens)
        }
        if (target.isViewSystemOrAll) {
            viewColorAttributeGenerator.setColorTokenData(colorTokenResult.viewTokens)
            viewThemeGenerator.setColorTokenData(colorTokenResult.viewTokens)
        }
    }

    /**
     * Устанавливает данные о токенах градиентов
     *
     * @param gradientTokenResult данные о токенах градиентов
     * @see [GradientTokenResult]
     */
    fun setGradientTokenData(gradientTokenResult: GradientTokenResult) {
        if (target.isComposeOrAll) {
            composeGradientAttributeGenerator.setGradientTokenData(
                data = gradientTokenResult.composeTokens,
            )
        }
        if (target.isViewSystemOrAll) {
            viewGradientAttributeGenerator.setGradientTokenData(
                data = gradientTokenResult.viewTokens,
            )
        }
    }

    /**
     * Устанавливает данные о токенах форм
     *
     * @param shapeTokenResult данные о токенах форм
     * @see [ShapeTokenResult]
     */
    fun setShapeTokenData(shapeTokenResult: ShapeTokenResult) {
        if (target.isComposeOrAll) {
            composeShapeAttributeGenerator.setShapeTokenData(shapeTokenResult.composeTokens)
        }
        if (shouldGenerateViewShapeStyle && target.isViewSystemOrAll) {
            viewShapeAttributeGenerator.setShapeTokenData(shapeTokenResult.viewTokens)
            viewThemeGenerator.setShapeTokenData(shapeTokenResult.viewTokens)
        }
    }

    /**
     * Устанавливает данные о токенах типографики
     *
     * @param typographyTokenResult данные о токенах типографики
     * @see [TypographyTokenResult]
     */
    fun setTypographyTokenData(typographyTokenResult: TypographyTokenResult) {
        if (target.isComposeOrAll) {
            composeTypographyAttributeGenerator.setTypographyTokenData(
                typographyTokenResult.composeTokens,
            )
            composeThemeGenerator.setTypographyTokenData(typographyTokenResult.composeTokens)
        }
        if (target.isViewSystemOrAll) {
            viewTypographyAttributeGenerator.setTypographyTokenData(typographyTokenResult.viewTokens)
            viewThemeGenerator.setTypographyTokenData(typographyTokenResult.viewTokens)
        }
    }

    override fun generate() {
        if (generatorMode == ThemeBuilderMode.TOKENS_ONLY) {
            if (target.isViewSystemOrAll) viewThemeGenerator.generateEmptyTheme()
            return
        }
        if (target.isComposeOrAll) {
            composeColorAttributeGenerator.generate()
            composeGradientAttributeGenerator.generate()
            composeShapeAttributeGenerator.generate()
            composeTypographyAttributeGenerator.generate()
            composeThemeGenerator.generate()
        }
        if (target.isViewSystemOrAll) {
            viewColorAttributeGenerator.generate()
            viewGradientAttributeGenerator.generate()
            if (shouldGenerateViewShapeStyle) viewShapeAttributeGenerator.generate()
            viewTypographyAttributeGenerator.generate()
            viewThemeGenerator.generate()
        }
    }
}
