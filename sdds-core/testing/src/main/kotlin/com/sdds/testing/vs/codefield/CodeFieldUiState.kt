package com.sdds.testing.vs.codefield

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента CodeField
 * @property variant стиль варианта компонента
 */
@Parcelize
data class CodeFieldUiState(
    override val variant: String = "",
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}