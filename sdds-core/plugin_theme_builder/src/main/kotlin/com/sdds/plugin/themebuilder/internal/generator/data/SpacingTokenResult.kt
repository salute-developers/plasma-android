package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах отступов.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class SpacingTokenResult(
    val composeTokens: List<TokenData>,
    val viewTokens: List<TokenData>,
) {

    /**
     * Данные о добавленном токене
     *
     * @property attrName название атрибута токена
     * @property tokenRefName ссылка на сгенерированный токен отступа
     */
    internal data class TokenData(
        val attrName: String,
        val tokenRefName: String,
    )
}
