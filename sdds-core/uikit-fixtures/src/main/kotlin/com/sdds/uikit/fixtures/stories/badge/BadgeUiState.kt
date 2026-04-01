package com.sdds.uikit.fixtures.stories.badge

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Badge
 * @property variant стиль варианта компонента
 * @property label текст
 * @property contentLeft контент слева
 * @property contentRight контент справа
 */
@Parcelize
@StoryUiState
data class BadgeUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val contentRight: Boolean = false,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
