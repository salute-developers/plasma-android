package com.sdds.playground.sandbox.modal.vs

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.modal.ModalUiState
import com.sdds.testing.vs.modal.modalTrigger

/**
 * Фрагмент с компонентом Modal
 * @author Малышев Александр on 29.05.2025
 */
internal class ModalFragment : ComponentFragment<ModalUiState, View, ModalViewModel>() {

    private var state: ModalUiState = ModalUiState()

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ModalViewModelFactory(
            defaultState = getState { state },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return modalTrigger(contextWrapper, state = state)
    }

    override fun shouldRecreateComponentOnStateUpdate(state: ModalUiState): Boolean {
        this.state = state
        return true
    }

    override fun onComponentUpdate(component: View?, state: ModalUiState) = Unit
}
