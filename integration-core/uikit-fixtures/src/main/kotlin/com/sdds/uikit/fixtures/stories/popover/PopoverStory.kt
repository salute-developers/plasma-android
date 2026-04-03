package com.sdds.uikit.fixtures.stories.popover

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Popover
import com.sdds.uikit.fixtures.stories.PopoverUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.PopoverUiStateTransformer

/**
 * История компонента Popover для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Popover.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Popover
 */
@Story
object PopoverStory : ViewBaseStory<PopoverUiState, View>(
    ComponentKey.Popover,
    PopoverUiState(),
    PopoverUiStatePropertiesProducer,
    PopoverUiStateTransformer,
) {
    private var currentTriggerGravity: Int = Gravity.CENTER
    private var popover: Popover? = null
    private var popoverState: PopoverUiState = PopoverUiState()

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            gravity = currentTriggerGravity
        }
    }

    override fun getComponent(context: Context): View {
        return popoverWithTrigger(context)
            .also { popover = it.popover }
            .also { popoverTrigger ->
                popoverTrigger.trigger.setOnClickListener {
                    popoverTrigger.popover.showWithState(it, popoverState)
                }
            }.trigger
    }

    override fun onComponentUpdate(component: View, state: PopoverUiState) {
        popoverState = state
        updatePopover(component)
    }

    override fun shouldRecreateComponentOnStateUpdate(state: PopoverUiState): Boolean {
        val newGravity = state.triggerAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    private fun updatePopover(trigger: View?) = popover?.run {
        trigger ?: return@run
        if (isShowing) {
            dismiss()
            showWithState(trigger, popoverState)
        }
    }
}
