package com.sdds.playground.sandbox.popover.vs

import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.popover.PopoverUiState
import com.sdds.testing.vs.popover.popoverWithTrigger
import com.sdds.testing.vs.popover.showWithState
import com.sdds.testing.vs.popover.toGravity
import com.sdds.uikit.Popover

/**
 * Фрагмент с компонентом Popover
 * @author Малышев Александр on 19.05.2025
 */
internal class PopoverFragment : ComponentFragment<PopoverUiState, View, PopoverViewModel>() {

    private var popover: Popover? = null
    private var popoverState: PopoverUiState = PopoverUiState()
    private var currentTriggerGravity: Int = Gravity.CENTER

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        PopoverViewModelFactory(
            defaultState = getState { popoverState },
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

    override fun shouldRecreateComponentOnStateUpdate(state: PopoverUiState): Boolean {
        val newGravity = state.triggerAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return popoverWithTrigger(contextWrapper)
            .also { popover = it.popover }
            .also { popoverTrigger ->
                popoverTrigger.trigger.setOnClickListener {
                    popoverTrigger.popover.showWithState(it, popoverState)
                }
            }.trigger
    }

    override fun onComponentUpdate(component: View?, state: PopoverUiState) {
        popoverState = state
        updatePopover(component)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        popover = null
    }

    private fun updatePopover(trigger: View?) = popover?.run {
        trigger ?: return@run
        if (isShowing) {
            dismiss()
            showWithState(trigger, popoverState)
        }
    }
}
