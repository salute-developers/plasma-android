package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах градиента.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class GradientTokenResult(
    val composeTokens: TokenData,
    val viewTokens: TokenData,
) {

    /**
     * Выходные данные о токене градиента
     */
    internal data class TokenData(
        val light: Map<String, List<Gradient>>,
        val dark: Map<String, List<Gradient>>,
    ) {
        /**
         * Параметры градиента
         */
        internal data class Gradient(
            val tokenRefs: List<String>,
            val gradientType: GradientType,
        )

        /**
         * Тип градиента
         */
        internal enum class GradientType {
            LINEAR, RADIAL, SWEEP, BACKGROUND
        }
    }
}

internal fun GradientTokenResult.TokenData.mergedLightAndDark(): Set<String> {
    return light.keys + dark.keys
}
