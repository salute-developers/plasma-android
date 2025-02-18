package com.sdds.playground.sandbox.counter.vs

import android.os.Parcelable
import com.sdds.playground.sandbox.core.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Counter
 * @property variant стиль варианта компонента
 * @property count число
 * @property enabled включен ли Counter
 */
@Parcelize
internal data class CounterUiState(
    override val variant: String = "",
    val count: String = "1",
    val enabled: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
