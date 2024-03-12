package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.serializer.ExcludeNonAndroidPlatformTokens
import kotlinx.serialization.Serializable

/**
 * Данные о теме
 * @property name название темы
 * @property version версия темы
 * @property tokens токены темы
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
internal data class Theme(
    val name: String,
    val version: String,
    @Serializable(with = ExcludeNonAndroidPlatformTokens::class)
    val tokens: List<Token<TokenValue>>,
)
