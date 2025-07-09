package com.sdds.testing.vs.skeleton

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента TextSkeleton
 * @property variant вариация
 * @property lineCount количество строк
 * @property text текст
 * @property width ширина строки
 * @see TextSkeletonWidth
 */
@Parcelize
data class TextSkeletonUiState(
    override val variant: String = "",
    val lineCount: Int = 3,
    val text: String = "",
    val width: TextSkeletonWidth = TextSkeletonWidth.Random,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Ширина TextSkeleton для песочницы компонента
 */
@Parcelize
enum class TextSkeletonWidth : Parcelable {
    Random,
    FullWidth,
}
