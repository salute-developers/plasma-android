package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue

/**
 * Валидатор значений токенов теней [ShadowTokenValue]
 */
internal object ShadowTokenValidator : TokenValidator<ShadowTokenValue> {
    override fun validate(tokenValue: ShadowTokenValue, tokenName: String) = Unit
}
