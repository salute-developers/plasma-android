package com.sdds.playground.sandbox.scrollbar.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.scrollbar.ScrollBarContainer
import com.sdds.testing.vs.scrollbar.ScrollBarUiState
import com.sdds.testing.vs.scrollbar.ScrollOrientation
import com.sdds.testing.vs.scrollbar.applyState
import com.sdds.testing.vs.scrollbar.scrollBar

/**
 * Фрагмент с компонентом ScrollBar
 */
internal class ScrollBarFragment : ComponentFragment<ScrollBarUiState, ViewGroup, ScrollBarParametersViewModel>() {

    private var scrollOrientation: ScrollOrientation = ScrollOrientation.HORIZONTAL
    private var scrollBarState: ScrollBarUiState = ScrollBarUiState()

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ScrollBarParametersViewModelFactory(
            defaultState = getState { ScrollBarUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): ViewGroup {
        return scrollBar(contextWrapper, state = scrollBarState)
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

    override fun onComponentUpdate(component: ViewGroup?, state: ScrollBarUiState) {
        scrollBarState = state
        component?.findViewById<ScrollBarContainer>(com.sdds.testing.R.id.scroll_container)?.applyState(state)
    }
}
