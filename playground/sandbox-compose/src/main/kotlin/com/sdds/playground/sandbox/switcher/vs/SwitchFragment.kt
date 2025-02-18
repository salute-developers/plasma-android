package com.sdds.playground.sandbox.switcher.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Switch

/**
 * Фрагмент с компонентом ProgressBar
 * @author Малышев Александр on 19.08.2024
 */
internal class SwitchFragment : ComponentFragment<SwitchUiState, Switch>() {

    override val componentViewModel by viewModels<SwitchViewModel> {
        SwitchViewModelFactory(getState { SwitchUiState() })
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_90x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Switch {
        return Switch(contextWrapper)
            .apply { id = R.id.switcher }
            .apply {
                setOnClickListener { componentViewModel.updateActive(isChecked) }
            }
    }

    override fun onComponentUpdate(component: Switch?, state: SwitchUiState) {
        component?.apply {
            text = state.label
            description = state.description
            isEnabled = state.enabled
            isChecked = state.active
        }
    }
}
