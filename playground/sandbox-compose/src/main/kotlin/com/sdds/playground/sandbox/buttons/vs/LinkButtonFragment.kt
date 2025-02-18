package com.sdds.playground.sandbox.buttons.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Button
import com.sdds.uikit.LinkButton

/**
 * Фрагмент с компонентом BasicButton
 * @author Малышев Александр on 31.07.2024
 */
internal class LinkButtonFragment : ComponentFragment<ButtonUiState, LinkButton>() {

    override val componentViewModel by viewModels<LinkButtonViewModel> {
        LinkButtonViewModelFactory(
            defaultState = getState { ButtonUiState() },
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): LinkButton {
        return LinkButton(contextWrapper)
            .apply { id = R.id.link_button }
    }

    override fun onComponentUpdate(component: LinkButton?, state: ButtonUiState) {
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
