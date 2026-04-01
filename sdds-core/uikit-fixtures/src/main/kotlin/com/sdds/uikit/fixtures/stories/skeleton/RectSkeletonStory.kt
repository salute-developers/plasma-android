package com.sdds.uikit.fixtures.stories.skeleton

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.RectSkeleton
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.RectSkeletonUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.RectSkeletonUiStateTransformer

/**
 * История компонента RectSkeleton для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации RectSkeleton.
 *
 * @see Story
 * @see com.sdds.sandbox.ViewBaseStory
 * @see com.sdds.sandbox.ComponentKey.Companion.RectSkeleton
 */
@Story
object RectSkeletonStory : ViewBaseStory<RectSkeletonUiState, RectSkeleton>(
    ComponentKey.Companion.RectSkeleton,
    RectSkeletonUiState(),
    RectSkeletonUiStatePropertiesProducer,
    RectSkeletonUiStateTransformer,
) {
    override fun getComponent(context: Context): RectSkeleton {
        return rectSkeleton(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = 216.dp
            height = 100.dp
        }
    }

    override fun onComponentUpdate(component: RectSkeleton, state: RectSkeletonUiState) = Unit
}
