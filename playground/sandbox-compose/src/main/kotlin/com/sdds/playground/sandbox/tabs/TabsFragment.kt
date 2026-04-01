package com.sdds.playground.sandbox.tabs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Tabs
import com.sdds.uikit.fixtures.stories.tabs.TabsUiState
import com.sdds.uikit.fixtures.stories.tabs.applyState
import com.sdds.uikit.fixtures.stories.tabs.tabs

internal class TabsFragment : ComponentFragment<TabsUiState, Tabs, TabsViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        TabsViewModelFactory(
            defaultState = getState { TabsUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Tabs {
        return tabs(contextWrapper)
    }

    override fun onComponentUpdate(component: Tabs?, state: TabsUiState) {
        component?.applyState(state)
    }
}
