package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах градиента.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class GradientTokenResult(
    val composeTokens: List<TokenData>,
    val viewTokens: List<TokenData>,
) {

    internal data class TokenData(
        val attrName: String,
        val tokenRefs: List<String>,
        val isLight: Boolean,
        val gradientType: GradientType,
    ) {
        enum class GradientType {
            LINEAR, RADIAL, SWEEP
        }
    }
}
