package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах цвета.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class ColorTokenResult(
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
        val light: Map<String, String>,
        val dark: Map<String, String>,
    )
}

internal fun ColorTokenResult.TokenData.mergedLightAndDark(): Set<String> {
    return light.keys + dark.keys
}
