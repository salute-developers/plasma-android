package com.sdds.playground.sandbox.radiobox.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.RadioBox
import com.sdds.uikit.fixtures.stories.radiobox.RadioBoxUiState
import com.sdds.uikit.fixtures.stories.radiobox.applyState
import com.sdds.uikit.fixtures.stories.radiobox.radioBox

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
