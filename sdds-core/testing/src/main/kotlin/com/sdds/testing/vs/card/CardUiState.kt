package com.sdds.testing.vs.card

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.FlowLayout
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Card
 * @property orientation ориентация
 * @author Малышев Александр on 14.08.2025
 */
@Parcelize
data class CardUiState(
    override val variant: String = "",
    val orientation: CardOrientation = CardOrientation.VERTICAL,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Тип ориентации компонента Card
 */
@Parcelize
enum class CardOrientation : Parcelable {
    HORIZONTAL,
    VERTICAL,
}

/**
 * Преобразует [CardOrientation] в [FlowLayout.orientation]
 */
fun CardOrientation.toOrientation(): Int = when (this) {
    CardOrientation.HORIZONTAL -> FlowLayout.ORIENTATION_HORIZONTAL
    CardOrientation.VERTICAL -> FlowLayout.ORIENTATION_VERTICAL
}
