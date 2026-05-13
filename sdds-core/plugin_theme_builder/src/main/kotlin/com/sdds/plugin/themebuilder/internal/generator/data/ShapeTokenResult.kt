package com.sdds.plugin.themebuilder.internal.generator.data

import com.sdds.plugin.themebuilder.internal.tenant.Tenant

/**
 * Данные о токенах формы.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 */
internal data class ShapeTokenResult(
    val composeTokens: Map<Tenant, List<TokenData>>,
    val viewTokens: List<TokenData>,
) {

    /**
     * Данные о добавленном токене
     *
     * @property attrName название атрибута токена
     * @property tokenRefName ссылка на сгенерированный токен цвета
     * @property description описание токена
     */
    internal data class TokenData(
        val attrName: String,
        val tokenRefName: String,
        val description: String = "",
        val tokenObjectName: String? = null,
    )
}
