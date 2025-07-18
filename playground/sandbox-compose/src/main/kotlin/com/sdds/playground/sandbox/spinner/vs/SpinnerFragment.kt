package com.sdds.playground.sandbox.spinner.vs

import android.view.ContextThemeWrapper
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.spinner.SpinnerUiState
import com.sdds.testing.vs.spinner.spinner
import com.sdds.uikit.Spinner

/**
 * Фрагмент с компонентом Spinner
 */
internal class SpinnerFragment :
    ComponentFragment<SpinnerUiState, View, SpinnerParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        SpinnerParametersViewModelFactory(
            defaultState = getState { SpinnerUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Spinner {
        return spinner(contextWrapper)
    }

    override fun onComponentUpdate(component: View?, state: SpinnerUiState) = Unit
}
