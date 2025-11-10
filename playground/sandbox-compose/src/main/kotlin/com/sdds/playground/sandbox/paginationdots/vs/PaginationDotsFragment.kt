package com.sdds.playground.sandbox.paginationdots.vs

import android.view.ContextThemeWrapper
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.paginationdots.PaginationDotsUiState
import com.sdds.testing.vs.paginationdots.applyState
import com.sdds.testing.vs.paginationdots.paginationDotsWithControls
import com.sdds.uikit.PaginationDots

internal class PaginationDotsFragment : ComponentFragment<PaginationDotsUiState, View, PaginationDotsViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        PaginationDotsViewModelFactory(
            defaultState = getState { PaginationDotsUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return paginationDotsWithControls(contextWrapper)
    }

    override fun onComponentUpdate(component: View?, state: PaginationDotsUiState) {
        component?.findViewById<PaginationDots>(com.sdds.testing.R.id.pagination_dots)?.applyState(state)
    }
}
