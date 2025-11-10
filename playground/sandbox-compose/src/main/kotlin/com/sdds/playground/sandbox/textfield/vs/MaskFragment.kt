package com.sdds.playground.sandbox.textfield.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.mask.MaskUiState
import com.sdds.testing.vs.mask.applyState
import com.sdds.testing.vs.mask.maskedTextField
import com.sdds.uikit.TextField

/**
 * Фрагмент с масками в TextField
 */
internal class MaskFragment : ComponentFragment<MaskUiState, TextField, MaskViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        MaskViewModelFactory(
            defaultState = getState { MaskUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): TextField {
        return maskedTextField(contextWrapper)
    }

    override fun onComponentUpdate(component: TextField?, state: MaskUiState) {
        component?.applyState(state)
    }
}
