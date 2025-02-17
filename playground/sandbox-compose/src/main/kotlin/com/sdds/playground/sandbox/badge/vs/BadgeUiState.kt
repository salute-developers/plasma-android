package com.sdds.playground.sandbox.badge.vs

import android.os.Parcelable
import com.sdds.playground.sandbox.core.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Badge
 * @property variant стиль варианта компонента
 * @property label текст
 * @property contentLeft контент слева
 * @property contentRight контент справа
 */
@Parcelize
internal data class BadgeUiState(
    override val variant: String = "",
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val contentRight: Boolean = false,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
