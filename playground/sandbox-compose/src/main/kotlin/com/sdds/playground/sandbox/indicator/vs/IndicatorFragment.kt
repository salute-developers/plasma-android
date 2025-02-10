package com.sdds.playground.sandbox.indicator.vs

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.uikit.Indicator
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом Indicator
 */
internal class IndicatorFragment : ComponentFragment() {

    private val indicatorParametersViewModel by viewModels<IndicatorParametersViewModel> {
        IndicatorParametersViewModelFactory(getState { IndicatorUiState() })
    }

    override val componentLayout: Indicator
        get() = Indicator(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = R.id.indicator }
            .also { indicator = it }

    override val propertiesOwner: PropertiesOwner
        get() = indicatorParametersViewModel

    private var currentVariant: IndicatorVariant = IndicatorVariant.DefaultL
    private var indicator: Indicator? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        indicatorParametersViewModel.indicatorUiState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
