package com.sdds.playground.sandbox.textfield.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.TextField
import com.sdds.uikit.fixtures.stories.mask.MaskUiState
import com.sdds.uikit.fixtures.stories.mask.applyState
import com.sdds.uikit.fixtures.stories.mask.maskedTextField

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
