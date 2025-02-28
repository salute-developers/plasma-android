package com.sdds.testing.vs.indicator

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Indicator
 * @property variant вариация компонента
 */
@Parcelize
data class IndicatorUiState(
    override val variant: String = "",
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
