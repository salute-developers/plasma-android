package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.factory.ComposeColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewShapeAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewColorAttributeGenerator
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
    private val viewColorAttributeGenerator: ViewColorAttributeGenerator by unsafeLazy {
        viewColorAttributeGeneratorFactory.create()
    }
    private val viewShapeAttributeGenerator: ViewShapeAttributeGenerator by unsafeLazy {
        viewShapeAttributeGeneratorFactory.create()
    }

    private var colorTokenData: ColorTokenResult? = null
    private var shapeTokenData: ShapeTokenResult? = null

    /**
     * Устанавливает данные о токенах цвета
     *
     * @param colorTokenResult данные о токенах цвета
     * @see [ColorTokenResult]
     */
    fun setColorTokenData(colorTokenResult: ColorTokenResult) {
        colorTokenData = colorTokenResult
    }

    /**
     * Устанавливает данные о токенах форм
     *
     * @param shapeTokenResult данные о токенах форм
     * @see [ShapeTokenResult]
     */
    fun setShapeTokenData(shapeTokenResult: ShapeTokenResult) {
        shapeTokenData = shapeTokenResult
    }

    override fun generate() {
        if (!tokenDataIsValid()) return
        generateColorAttributes()
        generateShapeAttributes()
        generateThemes()
    }

    private fun tokenDataIsValid(): Boolean {
        return colorTokenData.isValid() && shapeTokenData.isValid()
    }

    private fun ColorTokenResult?.isValid() =
        this != null && composeTokens.isNotEmpty() && viewTokens.isNotEmpty()

    private fun ShapeTokenResult?.isValid() =
        this != null && composeTokens.isNotEmpty() && viewTokens.isNotEmpty()

    private fun generateColorAttributes() {
        val data = colorTokenData ?: return
        if (target.isComposeOrAll) {
            data
                .composeTokens
                // Для генерации атрибутов нужен просто список цветов
                // без признака светлой или темной темы.
                // Поскольку список цветов для темной и светлой темы должен совпадать,
                // в качестве источника берутся токены для светлой темы.
                .lightTokens()
                .let(composeColorAttributeGenerator::generate)
        }
        if (target.isViewSystemOrAll) {
            data
                .viewTokens
                .lightTokens()
                .let(viewColorAttributeGenerator::generate)
        }
    }

    private fun generateShapeAttributes() {
        val data = shapeTokenData ?: return
        if (target.isViewSystemOrAll) {
            data
                .viewTokens
                .let(viewShapeAttributeGenerator::generate)
        }
    }

    private fun List<ColorTokenResult.TokenData>.lightTokens() =
        filter { it.isLight }

    private fun generateThemes() {
        if (target.isComposeOrAll) composeThemeGenerator.generate()
        if (target.isViewSystemOrAll) {
            viewThemeGenerator.generate(
                colors = colorTokenData?.viewTokens.orEmpty(),
                shapes = shapeTokenData?.viewTokens.orEmpty(),
            )
        }
    }
}
