package com.sdds.playground.sandbox.wheel.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.wheel.WheelUiState
import com.sdds.testing.vs.wheel.applyState
import com.sdds.testing.vs.wheel.wheel
import com.sdds.uikit.Wheel

internal class WheelFragment : ComponentFragment<WheelUiState, Wheel, WheelViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        WheelViewModelFactory(
            defaultState = getState { WheelUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Wheel {
        return wheel(contextWrapper)
    }

    override fun onComponentUpdate(component: Wheel?, state: WheelUiState) {
        component?.applyState(state)
    }
}
