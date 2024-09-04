package com.sdds.playground.sandbox.checkbox

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.CheckBox
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом CheckBox
 * @author Малышев Александр on 15.08.2024
 */
internal class CheckBoxFragment : ComponentFragment() {

    private val checkBoxViewModel by viewModels<CheckBoxParametersViewModel> {
        CheckBoxParametersViewModelFactory(getState { CheckBoxUiState() })
    }

    override val componentLayout: CheckBox
        get() = CheckBox(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = R.id.checkBox }
            .also { checkBox = it }

    override val propertiesOwner: PropertiesOwner
        get() = checkBoxViewModel

    private var currentVariant: CheckBoxVariant = CheckBoxVariant.CheckBoxM
    private var checkBox: CheckBox? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkBoxViewModel.checkboxState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                checkBox?.apply {
                    text = state.label
                    toggleState = state.state
                    description = state.description
                    isEnabled = state.enabled
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
