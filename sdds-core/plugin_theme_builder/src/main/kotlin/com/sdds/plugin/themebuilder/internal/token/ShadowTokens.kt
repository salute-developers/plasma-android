package com.sdds.plugin.themebuilder.internal.token

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
data class ShadowTokensScheme(
    val directions: Set<String>,
    val types: Set<String>,
    val sizes: Set<String>,
)

@Serializable
@SerialName("shadow")
data class ShadowToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String
) : Token<ShadowToken.Value>() {

    @Serializable
    data class Value(
        val color: String,
        val elevation: Float,
    ) : TokenValue
}