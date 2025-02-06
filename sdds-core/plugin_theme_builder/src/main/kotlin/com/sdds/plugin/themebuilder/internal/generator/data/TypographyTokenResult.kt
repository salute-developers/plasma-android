package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах типографики.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class TypographyTokenResult(
    val composeTokens: ComposeTokenData,
    val viewTokens: ViewTokenData,
) {

    /**
     * Данные о добавленных токенах для Compose
     *
     * @property small атрибуты типографики для маленьких экранов
     * @property medium атрибуты типографики для средних экранов
     * @property large атрибуты типографики для больших экранов
     */
    internal data class ComposeTokenData(
        val small: Map<String, TypographyInfo>,
        val medium: Map<String, TypographyInfo>,
        val large: Map<String, TypographyInfo>,
    ) {

        /**
         * Возвращает описание токена
         */
        fun description(typography: String): String? =
            (large[typography] ?: medium[typography] ?: small[typography])?.description
    }

    /**
     * Данные о добавленных токенах для View
     *
     * @property attrs атрибуты типографики (ключ - название атрибута, значение - ссылка на токен)
     */
    internal data class ViewTokenData(
        val attrs: Map<String, TypographyInfo>,
    )

    internal data class TypographyInfo(
        val tokenRef: String,
        val description: String = "",
    )
}

internal fun TypographyTokenResult.ComposeTokenData.mergedScreenClasses(): Set<String> {
    return small.keys + medium.keys + large.keys
}
