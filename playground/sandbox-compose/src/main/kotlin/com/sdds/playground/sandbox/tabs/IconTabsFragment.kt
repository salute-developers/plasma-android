package com.sdds.playground.sandbox.tabs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout.LayoutParams
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.tabs.DisplayMode
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
    private var _currentStretch: Boolean = false
    private var _currentAmount: Int = 0
    private var _currentOrientation: Int = 0

    override fun shouldRecreateComponentOnStateUpdate(state: TabsUiState): Boolean {
        var isChanged = false
        val stateStretch = state.displayMode == DisplayMode.STRETCH
        if (_currentStretch != stateStretch) {
            _currentStretch = stateStretch
            isChanged = true
        }
        if (_currentAmount != state.amount) {
            _currentAmount = state.amount
            isChanged = true
        }
        return isChanged
    }

    override val defaultLayoutParams: LayoutParams
        get() = when {
            _currentStretch && _currentOrientation == Tabs.HORIZONTAL -> LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            else -> super.defaultLayoutParams
        }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Tabs {
        return iconTabs(contextWrapper).also {
            _currentOrientation = it.orientation
        }
    }

    override fun onComponentUpdate(component: Tabs?, state: TabsUiState) {
        component?.applyIconsState(state)
    }
}
