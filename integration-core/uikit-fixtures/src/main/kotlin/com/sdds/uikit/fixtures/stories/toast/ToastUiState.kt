package com.sdds.uikit.fixtures.stories.toast

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import com.sdds.uikit.overlays.OverlayPosition
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Toast
 * @property variant вариация
 * @property text текстовое сообщение
 * @property hasContentStart отображать ли контент вначале
 * @property hasContentEnd отображать ли контент вконце
 * @property position положение Toast
 * @property autoDismiss автоматическое скрытие Toast
 * @property hasAnimation включает/выключает анимацию
 */
@Parcelize
@StoryUiState
data class ToastUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val text: String = "Toast Text",
    val hasContentStart: Boolean = true,
    val hasContentEnd: Boolean = true,
    val position: OverlayPosition = OverlayPosition.BottomCenter,
    val autoDismiss: Boolean = true,
    val hasAnimation: Boolean = true,
) : Parcelable, UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
