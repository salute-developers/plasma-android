package com.sdds.playground.sandbox.list.vs

import android.view.ContextThemeWrapper
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.list.ListUiState
import com.sdds.testing.vs.list.applyState
import com.sdds.testing.vs.list.listView
import com.sdds.uikit.ListView

internal class ListFragment : ComponentFragment<ListUiState, ListView, ListViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ListViewModelFactory(
            defaultState = getState { ListUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = super.defaultLayoutParams.apply {
            width = resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x)
        }

    override fun getComponent(contextWrapper: ContextThemeWrapper): ListView {
        return listView(contextWrapper)
    }

    override fun onComponentUpdate(component: ListView?, state: ListUiState) {
        component?.applyState(state)
    }
}
