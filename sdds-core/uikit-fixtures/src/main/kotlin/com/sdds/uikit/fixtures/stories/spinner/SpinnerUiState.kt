package com.sdds.uikit.fixtures.stories.spinner

import android.os.Parcelable
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Spinner
 * @property variant вариация компонента
 */
@Parcelize
data class SpinnerUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
