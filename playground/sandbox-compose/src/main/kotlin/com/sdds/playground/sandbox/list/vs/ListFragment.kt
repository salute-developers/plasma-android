package com.sdds.playground.sandbox.list.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.core.view.updateMargins
import androidx.core.view.updateMarginsRelative
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.list.ListUiState
import com.sdds.testing.vs.list.applyState
import com.sdds.testing.vs.list.listView
import com.sdds.uikit.ListView
import com.sdds.uikit.dp

internal class ListFragment : ComponentFragment<ListUiState, ListView, ListViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ListViewModelFactory(
            defaultState = getState { ListUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = super.defaultLayoutParams.apply {
            width = LayoutParams.MATCH_PARENT
            updateMarginsRelative(end = 20.dp, start = 20.dp)
        }

    override fun getComponent(contextWrapper: ContextThemeWrapper): ListView {
        return listView(contextWrapper)
    }

    override fun onComponentUpdate(component: ListView?, state: ListUiState) {
        component?.applyState(state)
    }
}
