package com.sdds.playground.sandbox.radiobox

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.RadioBox
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом CheckBox
 * @author Малышев Александр on 15.08.2024
 */
internal class RadioBoxFragment : ComponentFragment() {

    private val radioBoxParametersViewModel by viewModels<RadioBoxParametersViewModel>()

    override val componentLayout: RadioBox
        get() = RadioBox(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .also { radioBox = it }

    override val propertiesOwner: PropertiesOwner
        get() = radioBoxParametersViewModel

    private var currentVariant: RadioBoxVariant = RadioBoxVariant.RadioBoxM
    private var radioBox: RadioBox? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        radioBoxParametersViewModel.radioBoxState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                radioBox?.apply {
                    text = state.label
                    isChecked = state.checked
                    description = state.description
                    isEnabled = state.enabled
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}