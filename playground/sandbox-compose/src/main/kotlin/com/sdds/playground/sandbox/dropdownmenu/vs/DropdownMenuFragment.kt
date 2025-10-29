package com.sdds.playground.sandbox.dropdownmenu.vs

import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.updateMargins
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.dropdownmenu.DropdownMenuUiState
import com.sdds.testing.vs.dropdownmenu.dropdownMenuTrigger
import com.sdds.testing.vs.dropdownmenu.showWithState
import com.sdds.testing.vs.popover.toGravity

internal class DropdownMenuFragment : ComponentFragment<DropdownMenuUiState, View, DropdownMenuViewModel>() {

    private var dropdownMenuState: DropdownMenuUiState = DropdownMenuUiState()
    private var currentTriggerGravity: Int = Gravity.CENTER

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        DropdownMenuViewModelFactory(
            defaultState = getState { DropdownMenuUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        ).apply {
            val margin = resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_3x)
            updateMargins(margin, margin, margin, margin)
        }

    override val defaultGravity: Int
        get() = currentTriggerGravity

    override fun shouldRecreateComponentOnStateUpdate(state: DropdownMenuUiState): Boolean {
        val newGravity = state.triggerAlignment.toGravity()
        if (newGravity != currentTriggerGravity) {
            currentTriggerGravity = newGravity
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return dropdownMenuTrigger(contextWrapper, state = dropdownMenuState)
            .also { popoverTrigger ->
                popoverTrigger.trigger.setOnClickListener {
                    popoverTrigger.popover.showWithState(it, dropdownMenuState)
                }
            }.trigger
    }

    override fun onComponentUpdate(component: View?, state: DropdownMenuUiState) {
        dropdownMenuState = state
    }
}
