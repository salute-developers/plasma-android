package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.factory.ComposeColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ComposeThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewThemeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenData
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.xmlNameWithoutDarkLightPrefix
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.util.Locale

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

    private var tokenData: ColorTokenData? = null

    /**
     * Устанавливает данные о токенах цвета
     *
     * @param colorTokenData данные о токенах цвета
     * @see [ColorTokenData]
     */
    fun setColorTokenData(colorTokenData: ColorTokenData) {
        tokenData = colorTokenData
    }

    override fun generate() {
        if (!tokenData.isValid()) return
        generateColorAttributes()
        generateThemes()
    }

    private fun ColorTokenData?.isValid() =
        this != null && composeTokens.isNotEmpty() && viewTokens.isNotEmpty()

    private fun generateColorAttributes() {
        val data = tokenData ?: return
        if (target.isComposeOrAll) {
            data
                .composeTokens
                // Для генерации атрибутов нужен просто список цветов
                // без признака светлой или темной темы.
                // Поскольку список цветов для темной и светлой темы должен совпадать,
                // в качестве источника берутся цвета для темной темы.
                .darkTokens()
                .let { composeColorAttributeGenerator.generate(it.extractComposeAttrs()) }
        }
        if (target.isViewSystemOrAll) {
            data
                .viewTokens
                .darkTokens()
                .let { viewColorAttributeGenerator.generate(it.extractViewAttrs()) }
        }
    }

    private fun List<ColorToken>.extractComposeAttrs(): List<String> =
        map { it.ktName.decapitalize(Locale.getDefault()) }

    private fun List<ColorToken>.extractViewAttrs(): List<String> =
        map { it.xmlNameWithoutDarkLightPrefix() }

    private fun Map<ColorToken, String>.darkTokens(): List<ColorToken> =
        keys
            .toList()
            .filter { it.isDark }

    private fun generateThemes() {
        val data = tokenData ?: return
        if (target.isComposeOrAll) composeThemeGenerator.generate()
        if (target.isViewSystemOrAll) data.viewTokens.let { viewThemeGenerator.generate(it) }
    }
}
