package com.sdds.plugin.themebuilder.internal.generator.data

import com.sdds.plugin.themebuilder.internal.token.ColorToken

/**
 * Данные о токена цвета [ColorToken]
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class ColorTokenData(
    val composeTokens: Map<ColorToken, String>,
    val viewTokens: Map<ColorToken, String>,
)
