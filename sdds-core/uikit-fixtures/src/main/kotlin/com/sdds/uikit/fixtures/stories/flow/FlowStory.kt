package com.sdds.uikit.fixtures.stories.flow

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.FlowLayout
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.FlowUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.FlowUiStateTransformer

/**
 * История компонента Flow для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Flow.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Flow
 */
@Story
object FlowStory : ViewBaseStory<FlowUiState, FlowLayout>(
    ComponentKey.Flow,
    FlowUiState(),
    FlowUiStatePropertiesProducer,
    FlowUiStateTransformer,
) {

    override fun getComponent(context: Context): FlowLayout {
        return flowLayout(context).apply { id = R.id.flow }
    }

    override fun onComponentUpdate(component: FlowLayout, state: FlowUiState) {
        component.applyState(state)
    }
}
