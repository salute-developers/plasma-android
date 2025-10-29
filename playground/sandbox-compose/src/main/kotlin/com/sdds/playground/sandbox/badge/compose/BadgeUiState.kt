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
    override val appearance: String = "",
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val contentRight: Boolean = false,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
