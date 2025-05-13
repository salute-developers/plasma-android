package com.sdds.playground.sandbox.radiobox.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.radiobox.RadioBoxUiState
import com.sdds.testing.vs.radiobox.applyState
import com.sdds.testing.vs.radiobox.radioBox
import com.sdds.uikit.RadioBox

/**
 * Фрагмент с компонентом RadioBox
 * @author Малышев Александр on 15.08.2024
 */
internal class RadioBoxFragment : ComponentFragment<RadioBoxUiState, RadioBox, RadioBoxViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        RadioBoxViewModelFactory(
            defaultState = getState { RadioBoxUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): RadioBox {
        return radioBox(contextWrapper)
    }

    override fun onComponentUpdate(component: RadioBox?, state: RadioBoxUiState) {
        component?.applyState(state)
    }
}
