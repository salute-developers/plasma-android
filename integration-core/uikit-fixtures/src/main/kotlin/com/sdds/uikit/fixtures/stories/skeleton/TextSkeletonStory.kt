package com.sdds.uikit.fixtures.stories.skeleton

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.TextSkeleton
import com.sdds.uikit.TextView
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.TextSkeletonUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.TextSkeletonUiStateTransformer

/**
 * История компонента TextSkeleton для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации TextSkeleton.
 *
 * @see Story
 * @see com.sdds.sandbox.ViewBaseStory
 * @see com.sdds.sandbox.ComponentKey.Companion.TextSkeleton
 */
@Story
object TextSkeletonStory : ViewBaseStory<TextSkeletonUiState, View>(
    ComponentKey.Companion.TextSkeleton,
    TextSkeletonUiState(),
    TextSkeletonUiStatePropertiesProducer,
    TextSkeletonUiStateTransformer,
) {
    override fun getComponent(context: Context): View {
        return textSkeleton(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        ).apply {
            gravity = Gravity.CENTER
        }
    }

    override fun onComponentUpdate(component: View, state: TextSkeletonUiState) {
        component.findViewById<TextSkeleton>(R.id.text_skeleton)?.applyState(state)
        component.findViewById<TextView>(R.id.text_over_skeleton)?.applyState(state)
    }
}
