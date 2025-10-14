package com.sdds.testing.vs.modal

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Modal
 * @property variant вариация
 * @property useNativeBlackout использовать ли нативное затемнение
 * @property hasClose включить ли кнопку закрытия
 */
@Parcelize
data class ModalUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val useNativeBlackout: Boolean = false,
    val hasClose: Boolean = false,
) : UiState, Parcelable {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
