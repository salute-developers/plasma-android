package com.sdds.playground.sandbox.buttons.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.button.ButtonUiState
import com.sdds.testing.vs.button.applyState
import com.sdds.testing.vs.button.basicButton
import com.sdds.uikit.Button

/**
 * Фрагмент с компонентом BasicButton
 * @author Малышев Александр on 31.07.2024
 */
internal class BasicButtonFragment : ComponentFragment<ButtonUiState, Button>() {

    private var isFixedSize: Boolean = false

    override val componentViewModel by viewModels<BasicButtonViewModel> {
        BasicButtonViewModelFactory(
            defaultState = getState { ButtonUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = if (isFixedSize) {
            FrameLayout.LayoutParams(
                resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        } else {
            super.defaultLayoutParams
        }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Button {
        return basicButton(contextWrapper)
    }

    override fun shouldRecreateComponentOnStateUpdate(state: ButtonUiState): Boolean {
        return if (isFixedSize != state.fixedSize) {
            isFixedSize = state.fixedSize
            true
        } else {
            false
        }
    }

    override fun onComponentUpdate(component: Button?, state: ButtonUiState) {
        component?.applyState(state)
    }
}
