package com.sdds.testing.vs.progress

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента ProgressBar
 * @property variant вариация компонента
 * @property progress текущий прогресс
 * @property animateProgress включает анимацию изменения прогресса
 * @property trackEnabled включает/выключает отображение фоновой линии прогресса
 */
@Parcelize
data class CircularProgressUiState(
    override val variant: String = "",
    val progress: Float = 0.5f,
    val animateProgress: Boolean = true,
    val trackEnabled: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
