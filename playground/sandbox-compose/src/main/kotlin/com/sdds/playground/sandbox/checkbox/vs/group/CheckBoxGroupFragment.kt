package com.sdds.playground.sandbox.checkbox.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.checkbox.vs.CheckBoxUiState
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.stylesProvider
import com.sdds.uikit.CheckBox
import com.sdds.uikit.CheckBoxGroup

/**
 * Фрагмент с компонентом CheckBox
 * @author Малышев Александр on 15.08.2024
 */
internal class CheckBoxGroupFragment : ComponentFragment<CheckBoxUiState, CheckBoxGroup>() {

    override val componentViewModel by viewModels<CheckBoxGroupViewModel> {
        CheckBoxGroupViewModelFactory(getState { CheckBoxUiState() })
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_80x),
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): CheckBoxGroup {
        return CheckBoxGroup(contextWrapper)
            .apply { id = R.id.checkBox_group }
    }

    override fun onComponentUpdate(component: CheckBoxGroup?, state: CheckBoxUiState) {
        component?.populate(state)
    }

    private fun CheckBoxGroup.populate(state: CheckBoxUiState) {
        removeAllViews()
        val theme = ContextThemeWrapper(context, componentViewModel.stylesProvider.checkBox.styleRes(state.variant))
        repeat(3) {
            val checkBox = CheckBox(theme)
                .apply {
                    text = state.label
                    description = state.description
                    isEnabled = state.enabled
                    id = it
                }
            addView(checkBox)
        }
    }
}
