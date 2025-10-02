package com.sdds.playground.sandbox.codeinput.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.codeinput.CodeInputUiState
import com.sdds.testing.vs.codeinput.applyState
import com.sdds.testing.vs.codeinput.codeInput
import com.sdds.uikit.CodeInput

/**
 * Фрагмент с компонентом CodeInput
 */
internal class CodeInputFragment : ComponentFragment<CodeInputUiState, CodeInput, CodeInputParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        CodeInputParametersViewModelFactory(
            defaultState = getState { CodeInputUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): CodeInput {
        return codeInput(contextWrapper)
    }

    override fun onComponentUpdate(component: CodeInput?, state: CodeInputUiState) {
        component?.applyState(state)
    }
}
