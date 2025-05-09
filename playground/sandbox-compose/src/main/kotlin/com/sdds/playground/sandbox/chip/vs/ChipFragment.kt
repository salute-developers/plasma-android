package com.sdds.playground.sandbox.chip.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.chip.ChipUiState
import com.sdds.testing.vs.chip.applyState
import com.sdds.testing.vs.chip.chip
import com.sdds.uikit.Chip

/**
 * Фрагмент с компонентом Chip
 * @author Малышев Александр on 22.08.2024
 */
internal class ChipFragment : ComponentFragment<ChipUiState, Chip, ChipParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ChipParametersViewModelFactory(
            defaultState = getState { ChipUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Chip {
        return chip(contextWrapper)
    }

    override fun onComponentUpdate(component: Chip?, state: ChipUiState) {
        component?.applyState(state)
    }
}
