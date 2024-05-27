package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.factory.ComposeColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewColorAttributeGenerator
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

    private var tokenData: ColorTokenResult? = null

    /**
     * Устанавливает данные о токенах цвета
     *
     * @param colorTokenResult данные о токенах цвета
     * @see [ColorTokenResult]
     */
    fun setColorTokenData(colorTokenResult: ColorTokenResult) {
        tokenData = colorTokenResult
    }

    override fun generate() {
        if (!tokenData.isValid()) return
        generateColorAttributes()
        generateThemes()
    }

    private fun ColorTokenResult?.isValid() =
        this != null && composeTokens.isNotEmpty() && viewTokens.isNotEmpty()

    private fun generateColorAttributes() {
        val data = tokenData ?: return
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

    private fun List<ColorTokenResult.TokenData>.lightTokens() =
        filter { it.isLight }

    private fun generateThemes() {
        val data = tokenData ?: return
        if (target.isComposeOrAll) composeThemeGenerator.generate()
        if (target.isViewSystemOrAll) data.viewTokens.let { viewThemeGenerator.generate(it) }
    }
}
