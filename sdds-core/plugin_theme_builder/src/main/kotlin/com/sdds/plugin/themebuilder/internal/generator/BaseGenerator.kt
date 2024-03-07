package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.token.TokenValue

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
internal interface BaseGenerator {

    fun generate()
}

internal interface TokenGenerator<T : Token<TokenValue>> : BaseGenerator {

    fun addToken(token: T)
}