package com.sdds.playground.sandbox.buttons.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.button.ButtonUiState
import com.sdds.testing.vs.button.applyState
import com.sdds.testing.vs.button.iconButton
import com.sdds.uikit.IconButton

/**
 * Фрагмент с компонентом IconButton
 * @author Малышев Александр on 31.07.2024
 */
internal class IconButtonFragment : ComponentFragment<ButtonUiState, IconButton, IconButtonViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        IconButtonViewModelFactory(
            defaultState = getState { ButtonUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): IconButton {
        return iconButton(contextWrapper)
    }

    override fun onComponentUpdate(component: IconButton?, state: ButtonUiState) {
        component?.applyState(state)
    }
}
