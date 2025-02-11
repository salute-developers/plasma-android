package com.sdds.playground.sandbox.indicator.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Indicator

/**
 * Фрагмент с компонентом Indicator
 */
internal class IndicatorFragment : ComponentFragment<IndicatorUiState, Indicator>() {

    override val componentViewModel by viewModels<IndicatorParametersViewModel> {
        IndicatorParametersViewModelFactory(getState { IndicatorUiState() })
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Indicator {
        return Indicator(contextWrapper)
            .apply { id = R.id.indicator }
    }

    override fun onComponentUpdate(component: Indicator?, state: IndicatorUiState) = Unit
}
