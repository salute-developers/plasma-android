package com.sdds.playground.sandbox.codefield.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.CodeField
import com.sdds.uikit.fixtures.stories.codefield.CodeFieldUiState
import com.sdds.uikit.fixtures.stories.codefield.applyState
import com.sdds.uikit.fixtures.stories.codefield.codeField

/**
 * Фрагмент с компонентом CodeField
 */
internal class CodeFieldFragment : ComponentFragment<CodeFieldUiState, CodeField, CodeFieldParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        CodeFieldParametersViewModelFactory(
            defaultState = getState { CodeFieldUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): CodeField {
        return codeField(contextWrapper)
    }

    override fun onComponentUpdate(component: CodeField?, state: CodeFieldUiState) {
        component?.applyState(state)
    }
}
