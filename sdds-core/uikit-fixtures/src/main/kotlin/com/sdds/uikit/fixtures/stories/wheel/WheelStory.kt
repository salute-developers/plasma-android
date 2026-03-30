package com.sdds.uikit.fixtures.stories.wheel

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Wheel
import com.sdds.uikit.fixtures.stories.WheelUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.WheelUiStateTransformer

/**
 * История компонента Wheel для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Wheel.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Wheel
 */
@Story
object WheelStory : ViewBaseStory<WheelUiState, Wheel>(
    ComponentKey.Wheel,
    WheelUiState(),
    WheelUiStatePropertiesProducer,
    WheelUiStateTransformer,
) {
    override fun getComponent(context: Context): Wheel {
        return wheel(context)
    }

    override fun onComponentUpdate(component: Wheel, state: WheelUiState) {
        component.applyState(state)
    }
}
