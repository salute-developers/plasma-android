package com.sdds.playground.sandbox.tabs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Tabs
import com.sdds.uikit.fixtures.stories.tabs.TabsUiState
import com.sdds.uikit.fixtures.stories.tabs.applyIconsState
import com.sdds.uikit.fixtures.stories.tabs.iconTabs

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
