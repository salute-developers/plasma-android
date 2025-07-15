package com.sdds.testing.vs.image

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Image
 * @property variant вариация компонента
 */
@Parcelize
data class ImageUiState(
    override val variant: String = "",
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
