package com.sdds.testing.vs.spinner

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Spinner
 * @property variant вариация компонента
 */
@Parcelize
data class SpinnerUiState(
    override val variant: String = "",
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
