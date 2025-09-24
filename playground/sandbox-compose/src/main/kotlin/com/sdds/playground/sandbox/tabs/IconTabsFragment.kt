package com.sdds.playground.sandbox.tabs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.tabs.TabsUiState
import com.sdds.testing.vs.tabs.applyIconsState
import com.sdds.testing.vs.tabs.iconTabs
import com.sdds.testing.vs.tabs.tabs
import com.sdds.uikit.Tabs

internal class IconTabsFragment : ComponentFragment<TabsUiState, Tabs, IconTabsViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        IconTabsViewModelFactory(
            defaultState = getState { TabsUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Tabs {
        return iconTabs(contextWrapper)
    }

    override fun onComponentUpdate(component: Tabs?, state: TabsUiState) {
        component?.applyIconsState(state)
    }
}
