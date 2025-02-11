package com.sdds.playground.sandbox.buttons.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Button

/**
 * Фрагмент с компонентом BasicButton
 * @author Малышев Александр on 31.07.2024
 */
internal class BasicButtonFragment : ComponentFragment<ButtonUiState, Button>() {

    override val componentViewModel by viewModels<BasicButtonViewModel> {
        BasicButtonViewModelFactory(
            defaultState = getState { ButtonUiState() },
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Button {
        return Button(contextWrapper)
            .apply { id = R.id.basic_button }
    }

    override fun onComponentUpdate(component: Button?, state: ButtonUiState) {
        component?.apply {
            text = state.buttonLabel
            value = state.buttonValue
            isLoading = state.loading
            isEnabled = state.enabled
            spacing = state.spacing
            if (state.icon != ButtonIcon.No) {
                setIconResource(state.icon.iconId)
            } else {
                icon = null
            }
            iconPosition = when (state.icon) {
                ButtonIcon.End -> Button.IconPosition.TextEnd
                else -> Button.IconPosition.TextStart
            }
        }
    }
}
