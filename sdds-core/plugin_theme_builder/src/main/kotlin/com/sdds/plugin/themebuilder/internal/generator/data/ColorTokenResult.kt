package com.sdds.plugin.themebuilder.internal.generator.data

import com.sdds.plugin.themebuilder.internal.token.ColorToken

/**
 * Данные о токена цвета [ColorToken]
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class ColorTokenResult(
    val composeTokens: List<TokenData>,
    val viewTokens: List<TokenData>,
) {

    /**
     * Данные о добавленном токене
     *
     * @property attrName название атрибута токена
     * @property tokenRefName ссылка на сгенерированный токен цвета
     * @property isLight принадлежность к светлой/темной теме
     */
    internal data class TokenData(
        val attrName: String,
        val tokenRefName: String,
        val isLight: Boolean,
    )
}
