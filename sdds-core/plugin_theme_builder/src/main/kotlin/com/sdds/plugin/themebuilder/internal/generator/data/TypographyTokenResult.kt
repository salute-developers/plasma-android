package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах типографики.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class TypographyTokenResult(
    val composeTokens: List<ComposeTokenData>,
    val viewTokens: List<ViewTokenData>,
) {

    /**
     * Данные о добавленном токене для View
     *
     * @property attrName название атрибута токена
     * @property tokenRefName ссылка на сгенерированный токен
     */
    internal data class ViewTokenData(
        val attrName: String,
        val tokenRefName: String,
    )

    /**
     * Данные о добавленном токене для Compose
     *
     * @property attrName название атрибута токена
     * @property tokenRefName ссылка на сгенерированный токен
     * @property screen тип экрана
     */
    internal data class ComposeTokenData(
        val attrName: String,
        val tokenRefName: String,
        val screen: Screen,
    ) {
        internal enum class Screen {
            SMALL, MEDIUM, LARGE
        }
    }
}
