package com.sdds.testing.vs.counter

import android.content.Context
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Counter

/**
 * Фабрика для создания [Counter]
 */
fun counter(
    context: Context,
    style: Int? = null,
    state: CounterUiState? = null,
): Counter {
    return Counter(context.styleWrapper(style))
        .apply { id = R.id.counter }
        .applyState(state)
}

/**
 * Применяет [CounterUiState] к [Counter]
 */
fun Counter.applyState(state: CounterUiState?): Counter = apply {
    state ?: return@apply
    text = state.count
    isEnabled = state.enabled
}
