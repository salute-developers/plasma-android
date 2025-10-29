package com.sdds.testing.vs.skeleton

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента RectSkeleton
 * @property variant вариация
 */
@Parcelize
data class RectSkeletonUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
