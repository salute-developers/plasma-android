package com.sdds.uikit.fixtures.stories.radiobox

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.RadioBox
import com.sdds.uikit.fixtures.stories.RadioBoxUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.RadioBoxUiStateTransformer

/**
 * История компонента RadioBox для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации RadioBox.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.RadioBox
 */
@Story
object RadioBoxStory : ViewBaseStory<RadioBoxUiState, RadioBox>(
    ComponentKey.RadioBox,
    RadioBoxUiState(),
    RadioBoxUiStatePropertiesProducer,
    RadioBoxUiStateTransformer,
) {
    override fun getComponent(context: Context): RadioBox {
        return radioBox(context)
    }

    override fun onComponentUpdate(component: RadioBox, state: RadioBoxUiState) {
        component.applyState(state)
    }
}
