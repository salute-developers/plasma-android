package com.sdds.playground.sandbox.overlay.vs

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.OverlayView
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.overlay.OverlayUiState
import com.sdds.uikit.fixtures.stories.overlay.applyState
import com.sdds.uikit.fixtures.stories.overlay.overlayWithTrigger

internal class OverlayFragment : ComponentFragment<OverlayUiState, View, OverlayViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        OverlayViewModelFactory(
            defaultState = getState { OverlayUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return overlayWithTrigger(contextWrapper)
    }

    override fun onComponentUpdate(component: View?, state: OverlayUiState) {
        component?.findViewById<OverlayView>(R.id.overlay)?.applyState(state)
    }
}
