package com.sdds.uikit.fixtures.stories.card

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.FlowLayout
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Card
 * @property orientation ориентация
 * @author Малышев Александр on 14.08.2025
 */
@Parcelize
@StoryUiState
data class CardUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val orientation: CardOrientation = CardOrientation.VERTICAL,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
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
