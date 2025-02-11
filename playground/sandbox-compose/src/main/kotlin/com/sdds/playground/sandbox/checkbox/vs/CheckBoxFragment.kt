package com.sdds.playground.sandbox.checkbox.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.CheckBox

/**
 * Фрагмент с компонентом CheckBox
 * @author Малышев Александр on 15.08.2024
 */
internal class CheckBoxFragment : ComponentFragment<CheckBoxUiState, CheckBox>() {

    override val componentViewModel by viewModels<CheckBoxParametersViewModel> {
        CheckBoxParametersViewModelFactory(getState { CheckBoxUiState() })
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): CheckBox {
        return CheckBox(contextWrapper)
            .apply { id = R.id.checkBox }
    }

    override fun onComponentUpdate(component: CheckBox?, state: CheckBoxUiState) {
        component?.apply {
            text = state.label
            toggleState = state.state
            description = state.description
            isEnabled = state.enabled
        }
    }
}
