package com.sdds.playground.sandbox.editable.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.editable.EditableUiState
import com.sdds.testing.vs.editable.applyState
import com.sdds.testing.vs.editable.editable
import com.sdds.uikit.Editable

/**
 * Фрагмент с компонентом Editable
 */
internal class EditableFragment :
    ComponentFragment<EditableUiState, Editable, EditableParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        EditableParametersViewModelFactory(
            defaultState = getState { EditableUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Editable {
        return editable(contextWrapper)
    }

    override fun onComponentUpdate(component: Editable?, state: EditableUiState) {
        component?.applyState(state)
    }
}
