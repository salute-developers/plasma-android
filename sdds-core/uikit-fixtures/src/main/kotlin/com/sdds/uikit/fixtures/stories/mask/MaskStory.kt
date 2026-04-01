package com.sdds.uikit.fixtures.stories.mask

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.TextField
import com.sdds.uikit.fixtures.stories.MaskUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.MaskUiStateTransformer

/**
 * История компонента TextField с применением Mask для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации TextField с применением Mask.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Mask
 */
@Story
object MaskStory : ViewBaseStory<MaskUiState, TextField>(
    ComponentKey.Mask,
    MaskUiState(),
    MaskUiStatePropertiesProducer,
    MaskUiStateTransformer,
) {
    override fun getComponent(context: Context): TextField {
        return maskedTextField(context)
    }

    override fun onComponentUpdate(component: TextField, state: MaskUiState) {
        component.applyState(state)
    }
}
