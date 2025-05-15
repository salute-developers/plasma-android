package com.sdds.playground.sandbox.indicator.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.indicator.IndicatorUiState
import com.sdds.testing.vs.indicator.indicator
import com.sdds.uikit.Indicator

/**
 * Фрагмент с компонентом Indicator
 */
internal class IndicatorFragment : ComponentFragment<IndicatorUiState, Indicator, IndicatorParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        IndicatorParametersViewModelFactory(
            defaultState = getState { IndicatorUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Indicator {
        return indicator(contextWrapper)
    }

    override fun onComponentUpdate(component: Indicator?, state: IndicatorUiState) = Unit
}
