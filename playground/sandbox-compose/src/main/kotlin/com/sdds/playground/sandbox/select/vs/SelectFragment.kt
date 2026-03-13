package com.sdds.playground.sandbox.select.vs

import android.view.ContextThemeWrapper
import android.view.Gravity
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.popover.toGravity
import com.sdds.testing.vs.select.SelectUiState
import com.sdds.testing.vs.select.applyState
import com.sdds.uikit.Select

internal class SelectFragment : ComponentFragment<SelectUiState, Select, SelectParametersViewModel>() {

    private var currentTriggerGravity: Int = Gravity.CENTER

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        SelectViewModelFactory(
            defaultState = getState { SelectUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultGravity: Int
        get() = currentTriggerGravity

    override fun shouldRecreateComponentOnStateUpdate(state: SelectUiState): Boolean {
        val newGravity = state.triggerAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Select {
        return Select(contextWrapper)
    }

    override fun onComponentUpdate(component: Select?, state: SelectUiState) {
        component?.applyState(state)
    }

    override fun onComponentOffsetChanged(component: Select, offset: Float) {
        super.onComponentOffsetChanged(component, offset)
        component.updateDropdownLocation()
    }
}
