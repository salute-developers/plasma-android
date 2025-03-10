package com.sdds.playground.sandbox.indicator.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.indicator.IndicatorUiState
import com.sdds.testing.vs.indicator.indicator
import com.sdds.uikit.Indicator

/**
 * Фрагмент с компонентом Indicator
 */
internal class IndicatorFragment : ComponentFragment<IndicatorUiState, Indicator>() {

    override val componentViewModel by viewModels<IndicatorParametersViewModel> {
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
