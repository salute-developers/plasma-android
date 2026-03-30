package com.sdds.uikit.fixtures.stories.divider

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Divider
 * @property variant вариация компонента
 */
@Parcelize
@StoryUiState
data class DividerUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
