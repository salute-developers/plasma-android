package com.sdds.playground.sandbox.counter.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Counter
import com.sdds.uikit.fixtures.stories.counter.CounterUiState
import com.sdds.uikit.fixtures.stories.counter.applyState
import com.sdds.uikit.fixtures.stories.counter.counter

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
