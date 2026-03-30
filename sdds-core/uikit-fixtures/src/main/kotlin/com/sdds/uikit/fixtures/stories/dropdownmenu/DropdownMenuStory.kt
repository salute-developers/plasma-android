package com.sdds.uikit.fixtures.stories.dropdownmenu

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.updateMargins
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.DropdownMenuUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.DropdownMenuUiStateTransformer
import com.sdds.uikit.fixtures.stories.popover.toGravity

/**
 * История компонента DropdownMenu для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации DropdownMenu.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.DropdownMenu
 */
@Story
object DropdownMenuStory : ViewBaseStory<DropdownMenuUiState, View>(
    ComponentKey.DropdownMenu,
    DropdownMenuUiState(),
    DropdownMenuUiStatePropertiesProducer,
    DropdownMenuUiStateTransformer,
) {
    private var dropdownMenuState: DropdownMenuUiState = DropdownMenuUiState()
    private var currentTriggerGravity: Int = Gravity.CENTER

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            gravity = currentTriggerGravity
            val margin = 6.dp
            updateMargins(margin, margin, margin, margin)
        }
    }

    override fun getComponent(context: Context): View {
        return dropdownMenuTrigger(context, state = dropdownMenuState)
            .also { popoverTrigger ->
                popoverTrigger.trigger.setOnClickListener {
                    popoverTrigger.popover.showWithState(it, dropdownMenuState)
                }
            }.trigger
    }

    override fun shouldRecreateComponentOnStateUpdate(state: DropdownMenuUiState): Boolean {
        val newGravity = state.triggerAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun onComponentUpdate(component: View, state: DropdownMenuUiState) {
        dropdownMenuState = state
    }
}
