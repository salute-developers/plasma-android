package com.sdds.playground.sandbox.tooltip.vs

import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.popover.toGravity
import com.sdds.testing.vs.tooltip.TooltipUiState
import com.sdds.testing.vs.tooltip.showWithState
import com.sdds.testing.vs.tooltip.tooltipWithTrigger
import com.sdds.uikit.Tooltip

/**
 * Фрагмент с компонентом Tooltip
 * @author Малышев Александр on 19.05.2025
 */
internal class TooltipFragment : ComponentFragment<TooltipUiState, View, TooltipViewModel>() {

    private var tooltip: Tooltip? = null
    private var tooltipUiState: TooltipUiState = TooltipUiState()
    private var currentTriggerGravity: Int = Gravity.CENTER

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        TooltipViewModelFactory(
            defaultState = getState { tooltipUiState },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )

    override val defaultGravity: Int
        get() = currentTriggerGravity

    override fun shouldRecreateComponentOnStateUpdate(state: TooltipUiState): Boolean {
        val newGravity = state.triggerAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return tooltipWithTrigger(contextWrapper)
            .also { tooltip = it.popover }
            .also { popoverTrigger ->
                popoverTrigger.trigger.setOnClickListener {
                    popoverTrigger.popover.showWithState(it, tooltipUiState)
                }
            }.trigger
    }

    override fun onComponentUpdate(component: View?, state: TooltipUiState) {
        tooltipUiState = state
        updatePopover(component)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        tooltip = null
    }

    private fun updatePopover(trigger: View?) = tooltip?.run {
        trigger ?: return@run
        if (isShowing) {
            dismiss()
            showWithState(trigger, tooltipUiState)
        }
    }
}
