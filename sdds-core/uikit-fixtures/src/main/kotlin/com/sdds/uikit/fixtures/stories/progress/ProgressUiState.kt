package com.sdds.uikit.fixtures.stories.progress

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента ProgressBar
 * @property variant вариация компонента
 * @property progress текущий прогресс
 * @property animateProgress включает анимацию изменения прогресса
 */
@Parcelize
@StoryUiState
data class ProgressUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val progress: Float = 0.5f,
    val animateProgress: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
