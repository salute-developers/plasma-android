package com.sdds.uikit.fixtures.stories.button

import android.content.Context
import com.sdds.sandbox.ButtonUiStatePropertiesProducer
import com.sdds.sandbox.ButtonUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.testing.vs.button.ButtonUiState
import com.sdds.testing.vs.button.applyState
import com.sdds.testing.vs.button.buttonGroup
import com.sdds.uikit.ButtonGroup

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
