package com.sdds.playground.sandbox.chip.vs

import android.view.ContextThemeWrapper
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Chip
import com.sdds.icons.R as Icons

/**
 * Фрагмент с компонентом Chip
 * @author Малышев Александр on 22.08.2024
 */
internal class ChipFragment : ComponentFragment<ChipUiState, Chip>() {

    override val componentViewModel by viewModels<ChipParametersViewModel> {
        ChipParametersViewModelFactory(false, getState { ChipUiState() })
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Chip {
        return Chip(contextWrapper)
            .apply { id = R.id.chip }
    }

    override fun onComponentUpdate(component: Chip?, state: ChipUiState) {
        component?.apply {
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
}
