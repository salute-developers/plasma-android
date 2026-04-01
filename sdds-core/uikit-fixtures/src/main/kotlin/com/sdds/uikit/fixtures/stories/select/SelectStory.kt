package com.sdds.uikit.fixtures.stories.select

import android.content.Context
import android.view.Gravity
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Select
import com.sdds.uikit.fixtures.stories.SelectUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.SelectUiStateTransformer
import com.sdds.uikit.fixtures.stories.popover.toGravity

/**
 * История компонента Select для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Select.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Select
 */
@Story
object SelectStory : ViewBaseStory<SelectUiState, Select>(
    ComponentKey.Select,
    SelectUiState(),
    SelectUiStatePropertiesProducer,
    SelectUiStateTransformer,
) {
    private var currentTriggerGravity: Int = Gravity.CENTER

    override fun getComponent(context: Context): Select {
        return select(context)
    }

    override fun onComponentUpdate(component: Select, state: SelectUiState) {
        component.applyState(state)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            gravity = currentTriggerGravity
        }
    }

    override fun shouldRecreateComponentOnStateUpdate(state: SelectUiState): Boolean {
        val newGravity = state.triggerAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }
}
