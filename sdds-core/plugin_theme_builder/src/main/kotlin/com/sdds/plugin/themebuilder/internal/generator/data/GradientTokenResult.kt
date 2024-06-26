package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах градиента.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class GradientTokenResult(
    val composeTokens: ComposeTokenData,
    val viewTokens: ViewTokenData,
) {

    /**
     * Выходные данные о токене градиента для Compose
     */
    internal data class ComposeTokenData(
        val light: Map<String, Parameters>,
        val dark: Map<String, Parameters>,
    ) {
        /**
         * Параметры градиента
         */
        internal data class Parameters(
            val tokenRefs: List<String>,
            val gradientType: GradientType,
        )

        /**
         * Тип градиента
         */
        internal enum class GradientType {
            LINEAR, RADIAL, SWEEP
        }
    }

    /**
     * Входные данные о токене градиента для View
     */
    internal data class ViewTokenData(
        val light: Map<String, List<Parameter>>,
        val dark: Map<String, List<Parameter>>,
    ) {

        /**
         * Параметр градиента
         *
         * @property attrName название атрибута параметра градиента
         * @property ref ссылка на токен параметра градиента
         */
        internal data class Parameter(
            val attrName: String,
            val ref: String,
        )
    }
}

internal fun GradientTokenResult.ComposeTokenData.mergedLightAndDark(): Set<String> {
    return light.keys + dark.keys
}
