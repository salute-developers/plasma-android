package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах градиента.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class GradientTokenResult(
    val composeTokens: List<ComposeTokenData>,
    val viewTokens: List<ViewTokenData>,
) {

    /**
     * Выходные данные о токене градиента для Compose
     *
     * @property attrName название атрибута градиента
     * @property tokenRefs список ссылок на сгенерированные токены
     * @property isLight принадлежность к светлой теме
     * @property gradientType тип градиента
     */
    internal data class ComposeTokenData(
        val attrName: String,
        val tokenRefs: List<String>,
        val isLight: Boolean,
        val gradientType: GradientType,
    ) {
        enum class GradientType {
            LINEAR, RADIAL, SWEEP
        }
    }

    /**
     * Входные данные о токене градиента для View
     *
     * @property attrName название атрибута градиента
     * @property gradientParameters список параметров, описывающих градиент
     * @property isLight принадлежность к светлой теме
     */
    internal data class ViewTokenData(
        val attrName: String,
        val gradientParameters: List<GradientParameter>,
        val isLight: Boolean,
    ) {

        /**
         * Параметр градиента
         *
         * @property attrName название атрибута параметра градиента
         * @property ref ссылка на токен параметра градиента
         */
        internal data class GradientParameter(
            val attrName: String,
            val ref: String,
        )
    }
}
