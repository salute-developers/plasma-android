package com.sdds.uikit.fixtures.stories.checkbox

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.CheckBoxGroup
import com.sdds.uikit.fixtures.stories.CheckBoxUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CheckBoxUiStateTransformer

/**
 * История компонента CheckBoxGroup для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации CheckBoxGroup.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.CheckBoxGroup
 */
@Story
object CheckBoxGroupStory : ViewBaseStory<CheckBoxUiState, CheckBoxGroup>(
    ComponentKey.CheckBoxGroup,
    CheckBoxUiState(),
    CheckBoxUiStatePropertiesProducer,
    CheckBoxUiStateTransformer,
) {
    override fun getComponent(context: Context): CheckBoxGroup {
        return checkBoxGroup(context)
    }

    override fun onComponentUpdate(component: CheckBoxGroup, state: CheckBoxUiState) {
        component.applyState(state)
    }
}
