package com.sdds.playground.sandbox.checkbox.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.checkbox.CheckBoxUiState
import com.sdds.testing.vs.checkbox.applyState
import com.sdds.testing.vs.checkbox.checkBox
import com.sdds.uikit.CheckBox

/**
 * Фрагмент с компонентом CheckBox
 * @author Малышев Александр on 15.08.2024
 */
internal class CheckBoxFragment : ComponentFragment<CheckBoxUiState, CheckBox>() {

    override val componentViewModel by viewModels<CheckBoxParametersViewModel> {
        CheckBoxParametersViewModelFactory(
            defaultState = getState { CheckBoxUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): CheckBox {
        return checkBox(contextWrapper)
    }

    override fun onComponentUpdate(component: CheckBox?, state: CheckBoxUiState) {
        component?.applyState(state)
    }
}
