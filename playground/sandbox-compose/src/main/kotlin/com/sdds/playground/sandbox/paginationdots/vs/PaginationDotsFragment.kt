package com.sdds.playground.sandbox.paginationdots.vs

import android.view.ContextThemeWrapper
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.PaginationDots
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.paginationdots.PaginationDotsUiState
import com.sdds.uikit.fixtures.stories.paginationdots.applyState
import com.sdds.uikit.fixtures.stories.paginationdots.paginationDotsWithControls

internal class PaginationDotsFragment : ComponentFragment<PaginationDotsUiState, View, PaginationDotsViewModel>() {

    private var currentState = PaginationDotsUiState()

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        PaginationDotsViewModelFactory(
            defaultState = getState { currentState },
            componentKey = componentKey,
        )
    }

    override fun shouldRecreateComponentOnStateUpdate(state: PaginationDotsUiState): Boolean {
        if (currentState.step != state.step) {
            currentState = state
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return paginationDotsWithControls(contextWrapper, state = currentState)
    }

    override fun onComponentUpdate(component: View?, state: PaginationDotsUiState) {
        component?.findViewById<PaginationDots>(R.id.pagination_dots)?.applyState(state)
    }
}
