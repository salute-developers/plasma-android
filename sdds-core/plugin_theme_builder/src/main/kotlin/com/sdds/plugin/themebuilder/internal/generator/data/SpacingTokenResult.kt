package com.sdds.plugin.themebuilder.internal.generator.data

import com.sdds.plugin.themebuilder.internal.generator.TokenResult
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.GeneratedTokenInfo

/**
 * Данные о токенах отступов.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewTokens данные о токенах для View
 * @property tokenInfo данные о сгенерированных токенах
 */
internal data class SpacingTokenResult(
    val composeTokens: Map<Tenant, List<TokenData>>,
    val viewTokens: List<TokenData>,
    override val tokenInfo: List<GeneratedTokenInfo>,
) : TokenResult {

    /**
     * Данные о добавленном токене
     *
     * @property attrName название атрибута токена
     * @property tokenRefName ссылка на сгенерированный токен отступа
     * @property description описание токена
     */
    internal data class TokenData(
        val attrName: String,
        val tokenRefName: String,
        val description: String? = null,
        val tokenObjectName: String? = null,
    )
}
