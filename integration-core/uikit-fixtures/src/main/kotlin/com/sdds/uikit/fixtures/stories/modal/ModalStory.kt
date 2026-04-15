package com.sdds.uikit.fixtures.stories.modal

import android.content.Context
import android.view.View
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.fixtures.stories.ModalUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ModalUiStateTransformer

/**
 * История компонента Modal для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Modal.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Modal
 */
@Story
object ModalStory : ViewBaseStory<ModalUiState, View>(
    ComponentKey.Modal,
    ModalUiState(),
    ModalUiStatePropertiesProducer,
    ModalUiStateTransformer,
) {
    private var state: ModalUiState = ModalUiState()

    override fun getComponent(context: Context): View {
        return modalTrigger(context, state = state, style = currentStyle.res)
    }

    override fun shouldRecreateComponentOnStateUpdate(state: ModalUiState): Boolean {
        this.state = state
        return true
    }

    override fun onComponentUpdate(component: View, state: ModalUiState) = Unit
}
