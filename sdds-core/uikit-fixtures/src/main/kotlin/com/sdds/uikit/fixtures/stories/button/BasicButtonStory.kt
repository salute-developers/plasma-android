package com.sdds.uikit.fixtures.stories.button

import android.content.Context
import com.sdds.sandbox.ButtonUiStatePropertiesProducer
import com.sdds.sandbox.ButtonUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.testing.vs.button.ButtonUiState
import com.sdds.testing.vs.button.applyState
import com.sdds.testing.vs.button.basicButton
import com.sdds.uikit.Button

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
