package com.sdds.uikit.fixtures.stories.counter

import android.content.Context
import com.sdds.uikit.Counter
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.styleWrapper

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
