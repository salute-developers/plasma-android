package com.sdds.uikit.fixtures.stories.checkbox

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.CheckBox
import com.sdds.uikit.fixtures.stories.CheckBoxUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CheckBoxUiStateTransformer

/**
 * История компонента CheckBox для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации CheckBox.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.CheckBox
 */
@Story
object CheckBoxStory : ViewBaseStory<CheckBoxUiState, CheckBox>(
    ComponentKey.CheckBox,
    CheckBoxUiState(),
    CheckBoxUiStatePropertiesProducer,
    CheckBoxUiStateTransformer,
) {
    override fun getComponent(context: Context): CheckBox {
        return checkBox(context)
    }

    override fun onComponentUpdate(component: CheckBox, state: CheckBoxUiState) {
        component.applyState(state)
    }
}
