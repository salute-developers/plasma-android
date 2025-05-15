package com.sdds.playground.sandbox.navigationdrawer

import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.view.setMargins
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.navigationdrawer.NavigationDrawerUiState
import com.sdds.testing.vs.navigationdrawer.applyState
import com.sdds.testing.vs.navigationdrawer.navigationDrawer
import com.sdds.uikit.NavigationDrawer

internal class NavigationDrawerFragment :
    ComponentFragment<NavigationDrawerUiState, NavigationDrawer, NavigationDrawerViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        NavigationDrawerViewModelFactory(
            defaultState = getState { NavigationDrawerUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = super.defaultLayoutParams.apply {
            height = ViewGroup.LayoutParams.MATCH_PARENT
            setMargins(resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_10x))
        }

    override val defaultGravity: Int = Gravity.CENTER_VERTICAL or Gravity.START

    override fun getComponent(contextWrapper: ContextThemeWrapper): NavigationDrawer {
        return navigationDrawer(contextWrapper)
    }

    override fun onComponentUpdate(component: NavigationDrawer?, state: NavigationDrawerUiState) {
        component?.applyState(state)
    }
}
