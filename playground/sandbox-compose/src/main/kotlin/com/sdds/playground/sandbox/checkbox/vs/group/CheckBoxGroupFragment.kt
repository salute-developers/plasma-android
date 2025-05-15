package com.sdds.playground.sandbox.checkbox.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.checkbox.CheckBoxUiState
import com.sdds.testing.vs.checkbox.applyState
import com.sdds.testing.vs.checkbox.checkBoxGroup
import com.sdds.uikit.CheckBoxGroup

/**
 * Фрагмент с компонентом CheckBoxGroup
 * @author Малышев Александр on 15.08.2024
 */
internal class CheckBoxGroupFragment : ComponentFragment<CheckBoxUiState, CheckBoxGroup, CheckBoxGroupViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        CheckBoxGroupViewModelFactory(
            defaultState = getState { CheckBoxUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): CheckBoxGroup {
        return checkBoxGroup(contextWrapper)
    }

    override fun onComponentUpdate(component: CheckBoxGroup?, state: CheckBoxUiState) {
        component?.applyState(state)
    }
}
