package com.sdds.plugin.themebuilder.internal.generator.data

import com.sdds.plugin.themebuilder.internal.generator.TokenResult
import com.sdds.plugin.themebuilder.internal.token.GeneratedTokenInfo

/**
 * Данные о токенах типографики.
 *
 * @property tokenInfo данные о сгенерированных токенах
 */
internal data class FontTokenResult(
    override val tokenInfo: List<GeneratedTokenInfo>,
) : TokenResult
