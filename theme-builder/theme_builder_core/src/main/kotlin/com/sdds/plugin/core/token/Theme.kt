package com.sdds.plugin.core.token

import kotlinx.serialization.Serializable

/**
 * Данные о теме
 * @property name название темы
 * @property version версия темы
 * @property tokens токены темы
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
data class Theme(
    val name: String,
    val version: String,
    @Serializable
    val tokens: List<Token>,
)
