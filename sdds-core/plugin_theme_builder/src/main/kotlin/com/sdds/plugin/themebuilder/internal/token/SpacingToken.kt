package com.sdds.plugin.themebuilder.internal.token

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Токен отступа
 * @see Token
 * @author Малышев Александр on 31.01.2025
 */
@Serializable
@SerialName("spacing")
internal data class SpacingToken(
    override val displayName: String,
    override val name: String,
    override val tags: Set<String>,
    override val enabled: Boolean,
    override val description: String,
) : Token() {

    companion object {
        fun getAttrName(tokenName: String): String =
            tokenName.split(".").joinToString(separator = "")
    }
}

/**
 * Значение токена отступа
 * @property value значение отступа в dp
 */
@Serializable
internal data class SpacingTokenValue(
    val value: Float,
) : TokenValue
