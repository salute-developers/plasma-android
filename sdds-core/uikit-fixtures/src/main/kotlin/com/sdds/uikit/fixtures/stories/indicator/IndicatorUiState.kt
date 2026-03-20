package com.sdds.uikit.fixtures.stories.indicator

import android.os.Parcelable
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Indicator
 * @property variant вариация компонента
 */
@Parcelize
data class IndicatorUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
