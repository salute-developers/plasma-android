package com.sdds.playground.sandbox.buttongroup.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.button.ButtonUiState
import com.sdds.testing.vs.button.GroupOrientation
import com.sdds.testing.vs.button.applyState
import com.sdds.testing.vs.button.buttonGroup
import com.sdds.uikit.ButtonGroup

/**
 * Фрагмент с компонентом ButtonGroup
 */
internal class ButtonGroupFragment : ComponentFragment<ButtonUiState, ButtonGroup, ButtonGroupParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ButtonGroupParametersViewModelFactory(
            defaultState = getState { ButtonUiState() },
            componentKey = componentKey,
        )
    }

    override val scrollMode: ScrollMode
        get() = if (orientation == GroupOrientation.Vertical) ScrollMode.VERTICAL else ScrollMode.HORIZONTAL

    private var orientation: GroupOrientation = GroupOrientation.Horizontal

    override fun shouldRecreateComponentOnStateUpdate(state: ButtonUiState): Boolean {
        return if (orientation != state.orientation) {
            orientation = state.orientation
            true
        } else {
            false
        }
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): ButtonGroup {
        return buttonGroup(contextWrapper)
    }

    override fun onComponentUpdate(component: ButtonGroup?, state: ButtonUiState) {
        if (componentKey.value.contains("Icon")) {
            component?.applyState(state, true)
        } else {
            component?.applyState(state)
        }
    }
}
