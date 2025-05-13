package com.sdds.playground.sandbox.switcher.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.switcher.SwitchUiState
import com.sdds.testing.vs.switcher.applyState
import com.sdds.testing.vs.switcher.switch
import com.sdds.uikit.Switch

/**
 * Фрагмент с компонентом ProgressBar
 * @author Малышев Александр on 19.08.2024
 */
internal class SwitchFragment : ComponentFragment<SwitchUiState, Switch, SwitchViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        SwitchViewModelFactory(
            defaultState = getState { SwitchUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_90x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Switch {
        return switch(contextWrapper)
            .apply {
                setOnClickListener { componentViewModel.updateActive(isChecked) }
            }
    }

    override fun onComponentUpdate(component: Switch?, state: SwitchUiState) {
        component?.applyState(state)
    }
}
