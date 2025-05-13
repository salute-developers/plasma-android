package com.sdds.playground.sandbox.counter.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.counter.CounterUiState
import com.sdds.testing.vs.counter.applyState
import com.sdds.testing.vs.counter.counter
import com.sdds.uikit.Counter

/**
 * Фрагмент с компонентом Counter
 */
internal class CounterFragment : ComponentFragment<CounterUiState, Counter, CounterParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        CounterParametersViewModelFactory(
            defaultState = getState { CounterUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Counter {
        return counter(contextWrapper)
    }

    override fun onComponentUpdate(component: Counter?, state: CounterUiState) {
        component?.applyState(state)
    }
}
