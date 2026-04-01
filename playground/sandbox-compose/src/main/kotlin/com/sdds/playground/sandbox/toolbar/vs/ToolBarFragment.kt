package com.sdds.playground.sandbox.toolbar.vs

import android.view.ContextThemeWrapper
import android.widget.LinearLayout.HORIZONTAL
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.ToolBar
import com.sdds.uikit.fixtures.stories.toolbar.ToolBarUiState
import com.sdds.uikit.fixtures.stories.toolbar.applyState
import com.sdds.uikit.fixtures.stories.toolbar.toolBar

/**
 * Фрагмент с компонентом ToolBar
 */
internal class ToolBarFragment : ComponentFragment<ToolBarUiState, ToolBar, ToolBarViewModel>() {

    private var state: ToolBarUiState = ToolBarUiState()
    private var orientation: Int = HORIZONTAL

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ToolBarViewModelFactory(
            defaultState = getState { state },
            componentKey = componentKey,
        )
    }

    override val scrollMode: ScrollMode
        get() = when (orientation) {
            HORIZONTAL -> ScrollMode.HORIZONTAL
            else -> ScrollMode.VERTICAL
        }

    override fun getComponent(contextWrapper: ContextThemeWrapper): ToolBar {
        return toolBar(contextWrapper, state = state)
    }

    override fun onComponentUpdate(component: ToolBar?, state: ToolBarUiState) {
        component?.applyState(state)
        orientation = (component?.orientation) ?: HORIZONTAL
    }
}
