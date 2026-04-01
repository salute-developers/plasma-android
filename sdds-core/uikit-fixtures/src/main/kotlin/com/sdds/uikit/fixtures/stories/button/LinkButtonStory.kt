package com.sdds.uikit.fixtures.stories.button

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.LinkButton
import com.sdds.uikit.fixtures.stories.ButtonUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ButtonUiStateTransformer

/**
 * История компонента LinkButton для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации кнопки.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.LinkButton
 */
@Story
object LinkButtonStory : ViewBaseStory<ButtonUiState, LinkButton>(
    ComponentKey.LinkButton,
    ButtonUiState(),
    ButtonUiStatePropertiesProducer,
    ButtonUiStateTransformer,
) {
    override fun getComponent(context: Context): LinkButton {
        return linkButton(context)
    }

    override fun onComponentUpdate(component: LinkButton, state: ButtonUiState) {
        component.applyState(state)
    }
}
