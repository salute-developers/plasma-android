package com.sdds.playground.sandbox.badge.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние Badge
 * @property type вариации стилией
 * @see [BadgeType]
 * @property label текст
 * @property contentLeft контент слева
 * @property contentRight контент справа
 */
internal data class BadgeUiState(
    override val variant: String = "",
    val type: BadgeType = BadgeType.Solid,
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val contentRight: Boolean = false,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Вариации стилей отображения Badge
 */
internal enum class BadgeType {
    Solid,
    Clear,
    Transparent,
}
