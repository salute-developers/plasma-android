package com.sdds.testing.vs.toast

import com.sdds.testing.vs.UiState
import com.sdds.uikit.overlays.OverlayPosition

/**
 * Состояние компонента Toast
 * @property variant вариация
 * @property text текстовое сообщение
 * @property hasContentStart отображать ли контент вначале
 * @property hasContentEnd отображать ли контент вконце
 * @property position положение Toast
 * @property autoDismiss автоматическое скрытие Toast
 */
data class ToastUiState(
    override val variant: String = "",
    val text: String = "Toast Text",
    val hasContentStart: Boolean = true,
    val hasContentEnd: Boolean = true,
    val position: OverlayPosition = OverlayPosition.BottomCenter,
    val autoDismiss: Boolean = true,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
