package com.sdds.playground.sandbox.drawer.vs

import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.DrawerLayout
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.drawer.DrawerUiState
import com.sdds.uikit.fixtures.stories.drawer.applyState
import com.sdds.uikit.fixtures.stories.drawer.drawer

/**
 * Фрагмент с компонентом Drawer
 */
internal class DrawerFragment : ComponentFragment<DrawerUiState, View, DrawerViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        DrawerViewModelFactory(
            defaultState = getState { DrawerUiState() },
            componentKey = componentKey,
        )
    }
    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return drawer(contextWrapper)
    }

    override fun onComponentUpdate(component: View?, state: DrawerUiState) {
        component?.findViewById<DrawerLayout>(R.id.drawer_layout)?.applyState(state)
    }
}
