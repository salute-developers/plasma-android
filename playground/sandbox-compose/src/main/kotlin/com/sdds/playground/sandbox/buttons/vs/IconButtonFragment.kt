package com.sdds.playground.sandbox.buttons.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.IconButton
import com.sdds.uikit.fixtures.stories.button.ButtonUiState
import com.sdds.uikit.fixtures.stories.button.applyState
import com.sdds.uikit.fixtures.stories.button.iconButton

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
