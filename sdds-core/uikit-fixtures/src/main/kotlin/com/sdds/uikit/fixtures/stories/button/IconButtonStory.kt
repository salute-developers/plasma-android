package com.sdds.uikit.fixtures.stories.button

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.IconButton
import com.sdds.uikit.fixtures.stories.ButtonUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ButtonUiStateTransformer

/**
 * История компонента IconButton для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации кнопки c иконкой.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.IconButton
 */
@Story
object IconButtonStory : ViewBaseStory<ButtonUiState, IconButton>(
    ComponentKey.IconButton,
    ButtonUiState(),
    ButtonUiStatePropertiesProducer,
    ButtonUiStateTransformer,
) {
    override fun getComponent(context: Context): IconButton {
        return iconButton(context)
    }

    override fun onComponentUpdate(component: IconButton, state: ButtonUiState) {
        component.applyState(state)
    }
}
