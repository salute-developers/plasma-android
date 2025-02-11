package com.sdds.playground.sandbox.counter.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Counter

/**
 * Фрагмент с компонентом Counter
 */
internal class CounterFragment : ComponentFragment<CounterUiState, Counter>() {

    override val componentViewModel by viewModels<CounterParametersViewModel> {
        CounterParametersViewModelFactory(defaultState = getState { CounterUiState() })
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Counter {
        return Counter(contextWrapper)
            .apply { id = R.id.counter }
    }

    override fun onComponentUpdate(component: Counter?, state: CounterUiState) {
        component?.apply {
            text = state.count
            isEnabled = state.enabled
        }
    }
}
