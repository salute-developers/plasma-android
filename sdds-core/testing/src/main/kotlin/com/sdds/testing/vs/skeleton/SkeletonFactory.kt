package com.sdds.testing.vs.skeleton

import android.content.Context
import android.view.ViewGroup
import androidx.annotation.StyleRes
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.RectSkeleton

/**
 * Создает [RectSkeleton]
 * @param context контекст
 * @param style стиль
 * @param state состояние компонента
 */
fun rectSkeleton(
    context: Context,
    @StyleRes style: Int? = null,
    state: RectSkeletonUiState = RectSkeletonUiState(),
): RectSkeleton {
    return RectSkeleton(context.styleWrapper(style)).apply {
        layoutParams = ViewGroup.LayoutParams(
            context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_50x),
        )
    }
}
