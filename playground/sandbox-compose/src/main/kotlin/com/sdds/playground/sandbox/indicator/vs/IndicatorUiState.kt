package com.sdds.playground.sandbox.indicator.vs

import android.os.Parcelable
import com.sdds.playground.sandbox.core.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Indicator
 * @property variant вариация компонента
 */
@Parcelize
internal data class IndicatorUiState(
    override val variant: String = "",
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
