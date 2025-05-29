package com.sdds.playground.sandbox.overlay.vs

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.overlay.OverlayUiState
import com.sdds.testing.vs.overlay.applyState
import com.sdds.testing.vs.overlay.overlayWithTrigger
import com.sdds.uikit.OverlayView

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
        component?.findViewById<OverlayView>(com.sdds.testing.R.id.overlay)?.applyState(state)
    }
}
