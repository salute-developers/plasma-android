package com.sdds.uikit.fixtures.stories.button

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Button
import com.sdds.uikit.fixtures.stories.ButtonUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ButtonUiStateTransformer

/**
 * История компонента BasicButton для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации базовой кнопки.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.BasicButton
 */
@Story
object BasicButtonStory : ViewBaseStory<ButtonUiState, Button>(
    ComponentKey.BasicButton,
    ButtonUiState(),
    ButtonUiStatePropertiesProducer,
    ButtonUiStateTransformer,
) {
    override fun getComponent(context: Context): Button {
        return basicButton(context)
    }

    override fun onComponentUpdate(component: Button, state: ButtonUiState) {
        component.applyState(state)
    }
}
