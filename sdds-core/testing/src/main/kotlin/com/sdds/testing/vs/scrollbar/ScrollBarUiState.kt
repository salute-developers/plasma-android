package com.sdds.testing.vs.scrollbar

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента ScrollBar
 * @property variant вариация
 * @property orientation ориентация списка
 * @property itemsAmount количество элементов списка
 * @property hasTrack отображение track
 * @property hoverExpand увеличение ScrollBar при взаимодействии с ним
 * @property autoHideScrollBar скрывать ScrollBar при бездействии
 */
@Parcelize
data class ScrollBarUiState(
    override val variant: String = "",
    val orientation: ScrollOrientation = ScrollOrientation.HORIZONTAL,
    val itemsAmount: Int = 30,
    val hasTrack: Boolean = true,
    val hoverExpand: Boolean = true,
    val autoHideScrollBar: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Тип ориентации скролла
 */
@Parcelize
enum class ScrollOrientation : Parcelable {
    HORIZONTAL,
    VERTICAL,
}
