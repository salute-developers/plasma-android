package com.sdds.uikit.fixtures.stories.tooltip

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Tooltip
import com.sdds.uikit.fixtures.stories.TooltipUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.TooltipUiStateTransformer
import com.sdds.uikit.fixtures.stories.popover.toGravity

/**
 * История компонента Tooltip для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Tooltip.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Tooltip
 */
@Story
object TooltipStory : ViewBaseStory<TooltipUiState, View>(
    ComponentKey.Tooltip,
    TooltipUiState(),
    TooltipUiStatePropertiesProducer,
    TooltipUiStateTransformer,
) {
    private var tooltip: Tooltip? = null
    private var tooltipUiState: TooltipUiState = TooltipUiState()
    private var currentTriggerGravity: Int = Gravity.CENTER

    override fun getComponent(context: Context): View {
        return tooltipWithTrigger(context)
            .also { tooltip = it.popover }
            .also { popoverTrigger ->
                popoverTrigger.trigger.setOnClickListener {
                    popoverTrigger.popover.showWithState(it, tooltipUiState)
                }
            }.trigger
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            gravity = currentTriggerGravity
        }
    }

    override fun shouldRecreateComponentOnStateUpdate(state: TooltipUiState): Boolean {
        val newGravity = state.triggerAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun onComponentUpdate(component: View, state: TooltipUiState) {
        tooltipUiState = state
        updatePopover(component)
    }

    private fun updatePopover(trigger: View?) = tooltip?.run {
        trigger ?: return@run
        if (isShowing) {
            dismiss()
            showWithState(trigger, tooltipUiState)
        }
    }
}
