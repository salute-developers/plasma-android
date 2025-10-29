package com.sdds.testing.vs.counter

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Counter
 * @property variant стиль варианта компонента
 * @property count число
 * @property enabled включен ли Counter
 */
@Parcelize
data class CounterUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val count: String = "1",
    val enabled: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
