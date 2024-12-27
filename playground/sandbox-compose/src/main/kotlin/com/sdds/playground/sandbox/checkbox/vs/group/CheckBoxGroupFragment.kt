package com.sdds.playground.sandbox.checkbox.vs.group

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.checkbox.vs.CheckBoxGroupVariant
import com.sdds.playground.sandbox.checkbox.vs.CheckBoxParametersViewModel
import com.sdds.playground.sandbox.checkbox.vs.CheckBoxParametersViewModelFactory
import com.sdds.playground.sandbox.checkbox.vs.CheckBoxUiState
import com.sdds.playground.sandbox.checkbox.vs.toGroupVariant
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.uikit.CheckBox
import com.sdds.uikit.CheckBoxGroup
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом CheckBox
 * @author Малышев Александр on 15.08.2024
 */
internal class CheckBoxGroupFragment : ComponentFragment() {

    private val checkBoxViewModel by viewModels<CheckBoxParametersViewModel> {
        CheckBoxParametersViewModelFactory(true, getState { CheckBoxUiState() })
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_80x),
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    override val componentLayout: CheckBoxGroup
        get() = CheckBoxGroup(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = R.id.checkBox_group }
            .also { checkBoxGroup = it }

    override val propertiesOwner: PropertiesOwner
        get() = checkBoxViewModel

    private var currentVariant: CheckBoxGroupVariant = CheckBoxGroupVariant.CheckBoxGroupM
    private var checkBoxGroup: CheckBoxGroup? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkBoxViewModel.checkboxState
            .onEach { state ->
                val newGroupVariant = state.variant.toGroupVariant()
                if (currentVariant != newGroupVariant) {
                    currentVariant = newGroupVariant
                    dispatchComponentStyleChanged()
                }
                checkBoxGroup?.populate(state)
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    private fun CheckBoxGroup.populate(state: CheckBoxUiState) {
        removeAllViews()
        val theme = ContextThemeWrapper(context, state.variant.styleRes)
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
