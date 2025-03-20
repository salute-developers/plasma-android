package com.sdds.testing.vs.divider

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Divider
 * @property variant вариация компонента
 */
@Parcelize
data class DividerUiState(
    override val variant: String = "",
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
