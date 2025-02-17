package com.sdds.playground.sandbox.radiobox.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.RadioBox

/**
 * Фрагмент с компонентом RadioBox
 * @author Малышев Александр on 15.08.2024
 */
internal class RadioBoxFragment : ComponentFragment<RadioBoxUiState, RadioBox>() {

    override val componentViewModel by viewModels<RadioBoxViewModel> {
        RadioBoxViewModelFactory(getState { RadioBoxUiState() })
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): RadioBox {
        return RadioBox(contextWrapper)
            .apply { id = R.id.radioBox }
    }

    override fun onComponentUpdate(component: RadioBox?, state: RadioBoxUiState) {
        component?.apply {
            text = state.label
            isChecked = state.checked
            description = state.description
            isEnabled = state.enabled
        }
    }
}
