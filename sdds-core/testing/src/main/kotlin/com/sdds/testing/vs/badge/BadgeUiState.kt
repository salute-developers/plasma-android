package com.sdds.testing.vs.badge

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Badge
 * @property variant стиль варианта компонента
 * @property label текст
 * @property contentLeft контент слева
 * @property contentRight контент справа
 */
@Parcelize
data class BadgeUiState(
    override val variant: String = "",
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val contentRight: Boolean = false,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
