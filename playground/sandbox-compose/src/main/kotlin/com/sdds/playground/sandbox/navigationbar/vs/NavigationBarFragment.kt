package com.sdds.playground.sandbox.navigationbar.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.navigationbar.NavigationBarUiState
import com.sdds.testing.vs.navigationbar.applyState
import com.sdds.testing.vs.navigationbar.navigationBar
import com.sdds.uikit.NavigationBar

/**
 * Фрагмент с компонентом NoteCompact
 */
internal class NavigationBarFragment : ComponentFragment<NavigationBarUiState, NavigationBar, NavigationBarParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        NavigationBarParametersViewModelFactory(
            defaultState = getState { NavigationBarUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): NavigationBar {
        return navigationBar(contextWrapper)
    }

    override fun onComponentUpdate(component: NavigationBar?, state: NavigationBarUiState) {
        component?.applyState(state)
    }
}