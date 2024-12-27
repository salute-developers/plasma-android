package com.sdds.playground.sandbox.chip.vs

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.uikit.Chip
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import com.sdds.icons.R as Icons

/**
 * Фрагмент с компонентом Chip
 * @author Малышев Александр on 22.08.2024
 */
internal class ChipFragment : ComponentFragment() {

    private val chipParametersViewModel by viewModels<ChipParametersViewModel> {
        ChipParametersViewModelFactory(false, getState { ChipUiState() })
    }

    override val componentLayout: Chip
        get() = Chip(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .apply { id = R.id.chip }
            .also { chip = it }

    override val propertiesOwner: PropertiesOwner
        get() = chipParametersViewModel

    private var currentVariant: ChipVariant = ChipVariant.ChipLDefault
    private var chip: Chip? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chipParametersViewModel.chipState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                chip?.apply {
                    text = state.label
                    if (state.contentLeft) {
                        setDrawableStartRes(Icons.drawable.ic_plasma_24)
                    } else {
                        drawableStart = null
                    }

                    if (state.hasClose) {
                        setDrawableEndRes(Icons.drawable.ic_close_24)
                    } else {
                        drawableEnd = null
                    }
                    isEnabled = state.enabled
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
