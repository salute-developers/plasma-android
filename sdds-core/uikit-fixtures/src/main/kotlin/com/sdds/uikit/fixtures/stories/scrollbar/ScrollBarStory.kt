package com.sdds.uikit.fixtures.stories.scrollbar

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.ScrollBarUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ScrollBarUiStateTransformer

/**
 * История компонента ScrollBar для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации ScrollBar.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.ScrollBar
 */
@Story
object ScrollBarStory : ViewBaseStory<ScrollBarUiState, View>(
    ComponentKey.ScrollBar,
    ScrollBarUiState(),
    ScrollBarUiStatePropertiesProducer,
    ScrollBarUiStateTransformer,
) {

    private var scrollOrientation: ScrollOrientation = ScrollOrientation.HORIZONTAL
    private var scrollBarState: ScrollBarUiState = ScrollBarUiState()

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return when (scrollOrientation) {
            ScrollOrientation.HORIZONTAL -> FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
            )
            ScrollOrientation.VERTICAL -> FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT,
            )
        }
    }

    override fun shouldRecreateComponentOnStateUpdate(state: ScrollBarUiState): Boolean {
        val newOrientation = state.orientation
        if (newOrientation != scrollOrientation) {
            scrollOrientation = newOrientation
            scrollBarState = scrollBarState.copy(orientation = newOrientation)
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun getComponent(context: Context): View {
        return scrollBar(context, state = scrollBarState)
    }

    override fun onComponentUpdate(component: View, state: ScrollBarUiState) {
        scrollBarState = state
        component.findViewById<ScrollBarContainer>(R.id.scroll_container)?.applyState(state)
    }
}
