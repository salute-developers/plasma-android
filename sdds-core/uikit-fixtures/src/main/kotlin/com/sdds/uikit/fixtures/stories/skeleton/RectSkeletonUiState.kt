package com.sdds.uikit.fixtures.stories.skeleton

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента RectSkeleton
 * @property variant вариация
 */
@Parcelize
@StoryUiState
data class RectSkeletonUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
