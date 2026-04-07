package com.sdds.uikit.fixtures.stories.counter

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Counter
import com.sdds.uikit.fixtures.stories.CounterUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CounterUiStateTransformer

/**
 * История компонента Counter для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Counter.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Counter
 */
@Story
object CounterStory : ViewBaseStory<CounterUiState, Counter>(
    ComponentKey.Counter,
    CounterUiState(),
    CounterUiStatePropertiesProducer,
    CounterUiStateTransformer,
) {
    override fun getComponent(context: Context): Counter {
        return counter(context)
    }

    override fun onComponentUpdate(component: Counter, state: CounterUiState) {
        component.applyState(state)
    }
}
