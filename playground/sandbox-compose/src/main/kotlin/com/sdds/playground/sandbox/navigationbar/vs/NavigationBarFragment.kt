package com.sdds.playground.sandbox.navigationbar.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import android.widget.FrameLayout.LayoutParams
import androidx.core.view.setMargins
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

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply { setMargins(50) }

    override fun getComponent(contextWrapper: ContextThemeWrapper): NavigationBar {
        return navigationBar(contextWrapper)
    }

    override fun onComponentUpdate(component: NavigationBar?, state: NavigationBarUiState) {
        component?.applyState(state)
    }
}