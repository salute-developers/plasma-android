package com.sdds.playground.sandbox.autocomplete.view

import android.view.ContextThemeWrapper
import android.view.Gravity
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Autocomplete
import com.sdds.uikit.fixtures.stories.autocomplete.AutocompleteUiState
import com.sdds.uikit.fixtures.stories.autocomplete.applyState
import com.sdds.uikit.fixtures.stories.autocomplete.autocomplete
import com.sdds.uikit.fixtures.stories.popover.toGravity

internal class AutocompleteFragment : ComponentFragment<AutocompleteUiState, Autocomplete, AutocompleteViewModel>() {

    private var currentTriggerGravity: Int = Gravity.CENTER

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        AutocompleteViewModelFactory(
            defaultState = getState { AutocompleteUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultGravity: Int
        get() = currentTriggerGravity

    override fun shouldRecreateComponentOnStateUpdate(state: AutocompleteUiState): Boolean {
        val newGravity = state.fieldAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Autocomplete {
        return autocomplete(contextWrapper)
    }

    override fun onComponentUpdate(component: Autocomplete?, state: AutocompleteUiState) {
        component?.applyState(state)
    }

    override fun onComponentOffsetChanged(component: Autocomplete, offset: Float) {
        super.onComponentOffsetChanged(component, offset)
        component.updateDropdownLocation()
    }
}
