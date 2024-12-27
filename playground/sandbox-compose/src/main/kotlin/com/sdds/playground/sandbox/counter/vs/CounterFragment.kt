package com.sdds.playground.sandbox.counter.vs

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.uikit.Counter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Фрагмент с компонентом Counter
 */
internal class CounterFragment : ComponentFragment() {

    private val counterParametersViewModel by viewModels<CounterParametersViewModel> {
        CounterParametersViewModelFactory(defaultState = getState { CounterUiState() })
    }
    private var _currentVariant: CounterVariant = CounterVariant.CounterLDefault
    private var _counter: Counter? = null

    override val componentLayout: Counter
        get() = Counter(ContextThemeWrapper(requireContext(), _currentVariant.styleRes))
            .apply { id = R.id.counter }
            .also { _counter = it }

    override val propertiesOwner: PropertiesOwner
        get() = counterParametersViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        counterParametersViewModel.counterUiState
            .onEach { state ->
                if (_currentVariant != state.variant) {
                    _currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                _counter?.apply {
                    text = state.count
                    isEnabled = state.enabled
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
