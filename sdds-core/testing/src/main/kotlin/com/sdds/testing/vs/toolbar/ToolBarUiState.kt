package com.sdds.testing.vs.toolbar

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента ToolBar
 * @property variant вариация
 * @property hasDivider включить отображение разделителя
 * @property slotsAmount количество слотов в ToolBar
 */
@Parcelize
data class ToolBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val hasDivider: Boolean = true,
    val slotsAmount: Int = 3,
) : UiState, Parcelable {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
