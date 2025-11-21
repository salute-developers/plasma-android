package com.sdds.plugin.themebuilder.internal.generator.data

import com.sdds.plugin.themebuilder.internal.token.ColorToken

/**
 * Данные о токенах цвета.
 *
 * @property tokens исходные данные о токенах цвета
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class ColorTokenResult(
    val tokens: List<ColorToken>,
    val composeTokens: TokenData,
    val viewTokens: TokenData,
) {

    /**
     * Данные о токенах для фреймворка View или Compose
     *
     * @property light словарь название атрибута цвета - ссылка на токен цвета для светлой темы
     * @property dark словарь название атрибута цвета - ссылка на токен цвета для темной темы
     */
    internal data class TokenData(
        val light: Map<String, ColorInfo>,
        val dark: Map<String, ColorInfo>,
    ) {
        /**
         * Возвращает описание токена градиента
         */
        fun description(color: String): String =
            (light[color] ?: dark[color])?.description.orEmpty()

        internal data class ColorInfo(
            val colorRef: String,
            val description: String = "",
        )
    }
}

internal fun ColorTokenResult.TokenData.mergedLightAndDark(): Set<String> {
    return light.keys + dark.keys
}
