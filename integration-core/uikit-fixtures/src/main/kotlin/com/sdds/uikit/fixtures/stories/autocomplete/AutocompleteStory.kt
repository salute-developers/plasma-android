package com.sdds.uikit.fixtures.stories.autocomplete

import android.content.Context
import android.view.Gravity
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Autocomplete
import com.sdds.uikit.fixtures.stories.AutocompleteUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.AutocompleteUiStateTransformer
import com.sdds.uikit.fixtures.stories.popover.toGravity

/**
 * История компонента Autocomplete для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Autocomplete.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Autocomplete
 */
@Story
object AutocompleteStory : ViewBaseStory<AutocompleteUiState, Autocomplete>(
    ComponentKey.Autocomplete,
    AutocompleteUiState(),
    AutocompleteUiStatePropertiesProducer,
    AutocompleteUiStateTransformer,
) {
    private var currentTriggerGravity: Int = Gravity.CENTER

    override fun getComponent(context: Context): Autocomplete {
        return autocomplete(context)
    }

    override fun onComponentUpdate(component: Autocomplete, state: AutocompleteUiState) {
        component.applyState(state)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            gravity = currentTriggerGravity
        }
    }

    override fun shouldRecreateComponentOnStateUpdate(state: AutocompleteUiState): Boolean {
        val newGravity = state.fieldAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }
}
