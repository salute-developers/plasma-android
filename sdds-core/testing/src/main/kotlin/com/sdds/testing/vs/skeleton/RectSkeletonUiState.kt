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
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
