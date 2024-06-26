package com.sdds.plugin.themebuilder.internal.token

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
    @Serializable
    val tokens: List<Token>,
)
