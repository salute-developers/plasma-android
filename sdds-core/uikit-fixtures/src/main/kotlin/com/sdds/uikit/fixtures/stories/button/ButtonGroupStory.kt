package com.sdds.uikit.fixtures.stories.button

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.ButtonGroup
import com.sdds.uikit.fixtures.stories.ButtonUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ButtonUiStateTransformer

/**
 * История компонента ButtonGroup для сторибука.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.ButtonGroup
 */
@Story
object ButtonGroupStory : ViewBaseStory<ButtonUiState, ButtonGroup>(
    ComponentKey.ButtonGroup,
    ButtonUiState(),
    ButtonUiStatePropertiesProducer,
    ButtonUiStateTransformer,
) {

    override fun getComponent(context: Context): ButtonGroup {
        return buttonGroup(context)
    }

    override fun onComponentUpdate(component: ButtonGroup, state: ButtonUiState) {
        component.applyState(state)
    }
}
