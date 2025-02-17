package com.sdds.playground.sandbox.counter.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.counter.CounterUiState
import com.sdds.testing.vs.counter.applyState
import com.sdds.testing.vs.counter.counter
import com.sdds.uikit.Counter

/**
 * Фрагмент с компонентом Counter
 */
internal class CounterFragment : ComponentFragment<CounterUiState, Counter>() {

    override val componentViewModel by viewModels<CounterParametersViewModel> {
        CounterParametersViewModelFactory(defaultState = getState { CounterUiState() })
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Counter {
        return counter(contextWrapper)
    }

    override fun onComponentUpdate(component: Counter?, state: CounterUiState) {
        component?.applyState(state)
    }
}
