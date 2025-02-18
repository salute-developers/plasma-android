package com.sdds.playground.sandbox.buttons.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.IconButton

/**
 * Фрагмент с компонентом IconButton
 * @author Малышев Александр on 31.07.2024
 */
internal class IconButtonFragment : ComponentFragment<ButtonUiState, IconButton>() {

    override val componentViewModel by viewModels<IconButtonViewModel> {
        IconButtonViewModelFactory(
            defaultState = getState { ButtonUiState() },
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): IconButton {
        return IconButton(contextWrapper)
            .apply { id = com.sdds.playground.sandbox.R.id.icon_button }
    }

    override fun onComponentUpdate(component: IconButton?, state: ButtonUiState) {
        component?.apply {
            isLoading = state.loading
            isEnabled = state.enabled
            setIconResource(R.drawable.ic_plasma_24)
        }
    }
}
