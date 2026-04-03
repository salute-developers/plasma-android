package com.sdds.uikit.fixtures.stories.switcher

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Switch
import com.sdds.uikit.fixtures.stories.SwitchUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.SwitchUiStateTransformer

/**
 * История компонента Switch для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Switch.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Switch
 */
@Story
object SwitchStory : ViewBaseStory<SwitchUiState, Switch>(
    ComponentKey.Switch,
    SwitchUiState(),
    SwitchUiStatePropertiesProducer,
    SwitchUiStateTransformer,
) {
    override fun getComponent(context: Context): Switch {
        return switch(context).apply {
            resetMinimumWidth(true)
        }
    }

    override fun onComponentUpdate(component: Switch, state: SwitchUiState) {
        val isTextEmpty = state.label.isNullOrBlank() && state.description.isNullOrBlank()
        component.resetMinimumWidth(!isTextEmpty)
        component.applyState(state)
    }

    private fun Switch.resetMinimumWidth(enabled: Boolean) {
        minimumWidth = if (enabled) {
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_90x)
        } else {
            0
        }
    }
}
