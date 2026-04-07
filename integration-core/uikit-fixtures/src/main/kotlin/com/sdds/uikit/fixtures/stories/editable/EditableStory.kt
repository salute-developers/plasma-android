package com.sdds.uikit.fixtures.stories.editable

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Editable
import com.sdds.uikit.fixtures.stories.EditableUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.EditableUiStateTransformer

/**
 * История компонента Editable для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Editable.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Editable
 */
@Story
object EditableStory : ViewBaseStory<EditableUiState, Editable>(
    ComponentKey.Editable,
    EditableUiState(),
    EditableUiStatePropertiesProducer,
    EditableUiStateTransformer,
) {
    override fun getComponent(context: Context): Editable {
        return editable(context)
    }

    override fun onComponentUpdate(component: Editable, state: EditableUiState) {
        component.applyState(state)
    }
}
