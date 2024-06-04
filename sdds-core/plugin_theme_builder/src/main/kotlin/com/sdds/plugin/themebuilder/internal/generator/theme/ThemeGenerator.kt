package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.factory.ComposeColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeGradientAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeShapeAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewGradientAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewShapeAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeGradientAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeShapeAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewShapeAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
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
    private val target: ThemeBuilderTarget,
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
    private val viewColorAttributeGenerator: ViewColorAttributeGenerator by unsafeLazy {
        viewColorAttributeGeneratorFactory.create()
    }
    private val viewGradientAttributeGenerator: ViewGradientAttributeGenerator by unsafeLazy {
        viewGradientAttributeGeneratorFactory.create()
    }
    private val viewShapeAttributeGenerator: ViewShapeAttributeGenerator by unsafeLazy {
        viewShapeAttributeGeneratorFactory.create()
    }

    /**
     * Устанавливает данные о токенах цвета
     *
     * @param colorTokenResult данные о токенах цвета
     * @see [ColorTokenResult]
     */
    fun setColorTokenData(colorTokenResult: ColorTokenResult) {
        if (target.isComposeOrAll) {
            composeColorAttributeGenerator.setColorTokenData(colorTokenResult.composeTokens.lightColorTokens())
        }
        if (target.isViewSystemOrAll) {
            viewColorAttributeGenerator.setColorTokenData(colorTokenResult.viewTokens.lightColorTokens())
            viewThemeGenerator.setColorTokenData(colorTokenResult.viewTokens)
        }
    }

    fun setGradientTokenData(gradientTokenResult: GradientTokenResult) {
        if (target.isComposeOrAll) {
            composeGradientAttributeGenerator.setGradientTokenData(
                gradients = gradientTokenResult.composeTokens.lightComposeGradientTokens(),
            )
        }
        if (target.isViewSystemOrAll) {
            viewGradientAttributeGenerator.setGradientTokenData(
                gradients = gradientTokenResult.viewTokens.lightViewGradientTokens(),
            )
            viewThemeGenerator.setGradientTokenData(gradientTokenResult.viewTokens)
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
        if (target.isViewSystemOrAll) {
            viewShapeAttributeGenerator.setShapeTokenData(shapeTokenResult.viewTokens)
            viewThemeGenerator.setShapeTokenData(shapeTokenResult.viewTokens)
        }
    }

    override fun generate() {
        if (target.isComposeOrAll) {
            composeColorAttributeGenerator.generate()
            composeGradientAttributeGenerator.generate()
            composeShapeAttributeGenerator.generate()
            composeThemeGenerator.generate()
        }
        if (target.isViewSystemOrAll) {
            viewColorAttributeGenerator.generate()
            viewShapeAttributeGenerator.generate()
            viewGradientAttributeGenerator.generate()
            viewThemeGenerator.generate()
        }
    }

    private fun List<ColorTokenResult.TokenData>.lightColorTokens() =
        filter { it.isLight }

    private fun List<GradientTokenResult.ComposeTokenData>.lightComposeGradientTokens() =
        filter { it.isLight }

    private fun List<GradientTokenResult.ViewTokenData>.lightViewGradientTokens() =
        filter { it.isLight }
}
