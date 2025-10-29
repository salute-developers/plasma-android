package com.sdds.playground.sandbox.switcher.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.switcher.SwitchUiState
import com.sdds.testing.vs.switcher.applyState
import com.sdds.testing.vs.switcher.switch
import com.sdds.uikit.Switch

/**
 * Фрагмент с компонентом Switch
 * @author Малышев Александр on 19.08.2024
 */
internal class SwitchFragment : ComponentFragment<SwitchUiState, Switch, SwitchViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        SwitchViewModelFactory(
            defaultState = getState { SwitchUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Switch {
        return switch(contextWrapper)
            .apply {
                layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
                resetMinimumWidth(true)
                setOnClickListener { componentViewModel.updateActive(isChecked) }
            }
    }

    override fun onComponentUpdate(component: Switch?, state: SwitchUiState) {
        val isTextEmpty = state.label.isNullOrBlank() && state.description.isNullOrBlank()
        component?.resetMinimumWidth(!isTextEmpty)
        component?.applyState(state)
    }

    private fun Switch.resetMinimumWidth(enabled: Boolean) {
        minimumWidth = if (enabled) {
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_90x)
        } else {
            0
        }
    }
}
