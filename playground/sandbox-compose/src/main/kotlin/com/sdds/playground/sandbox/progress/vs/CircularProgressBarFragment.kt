package com.sdds.playground.sandbox.progress.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.progress.CircularProgressUiState
import com.sdds.testing.vs.progress.applyState
import com.sdds.testing.vs.progress.circularProgressBar
import com.sdds.uikit.CircularProgressBar

/**
 * Фрагмент с компонентом CircularProgressBar
 * @author Малышев Александр on 12.04.2025
 */
internal class CircularProgressBarFragment :
    ComponentFragment<CircularProgressUiState, CircularProgressBar, CircularProgressBarViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        CircularProgressBarViewModelFactory(
            defaultState = getState { CircularProgressUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): CircularProgressBar {
        return circularProgressBar(contextWrapper)
    }

    override fun onComponentUpdate(component: CircularProgressBar?, state: CircularProgressUiState) {
        component?.applyState(state)
    }
}
