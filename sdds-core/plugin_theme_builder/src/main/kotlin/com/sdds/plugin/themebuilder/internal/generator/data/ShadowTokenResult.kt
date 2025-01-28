package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах тени.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class ShadowTokenResult(
    val composeTokens: List<TokenData>,
    val viewTokens: List<TokenData>,
) {

    /**
     * Данные о добавленном токене тени
     *
     * @property tokenTechName техническое название токена тени
     * @property layers данные о слоях тени
     * @property tokenDescription описание токена
     */
    internal data class TokenData(
        val tokenTechName: String,
        val layers: List<ShadowLayer>,
        val tokenDescription: String,
    )

    /**
     * Данные о слоях тени
     * @property colorRef ссылка на цвет в ресурсах
     * @property offsetXRef ссылка на смещение по X в ресурсах
     * @property offsetYRef ссылка на смещение по Y в ресурсах
     * @property spreadRef ссылка на радиус распространения в ресурсах
     * @property blurRef ссылка на радиус сглаживания границ в ресурсах
     */
    internal data class ShadowLayer(
        val colorRef: String,
        val offsetXRef: String,
        val offsetYRef: String,
        val spreadRef: String,
        val blurRef: String,
    )
}
