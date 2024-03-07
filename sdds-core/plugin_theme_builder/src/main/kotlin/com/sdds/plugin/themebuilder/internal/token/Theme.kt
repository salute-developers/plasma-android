package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.serializer.ExcludeNonAndroidPlatformTokens
import kotlinx.serialization.Serializable

/**
 *
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
data class Theme(
    val name: String,
    val version: String,
    @Serializable(with = ExcludeNonAndroidPlatformTokens::class)
    val tokens: List<Token<TokenValue>>
)
