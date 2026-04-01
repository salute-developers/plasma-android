package com.sdds.playground.sandbox.buttons.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.LinkButton
import com.sdds.uikit.fixtures.stories.button.ButtonUiState
import com.sdds.uikit.fixtures.stories.button.applyState
import com.sdds.uikit.fixtures.stories.button.linkButton

/**
 * Фрагмент с компонентом LinkButton
 * @author Малышев Александр on 31.07.2024
 */
internal class LinkButtonFragment : ComponentFragment<ButtonUiState, LinkButton, LinkButtonViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        LinkButtonViewModelFactory(
            defaultState = getState { ButtonUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): LinkButton {
        return linkButton(contextWrapper)
    }

    override fun onComponentUpdate(component: LinkButton?, state: ButtonUiState) {
        component?.applyState(state)
    }
}
