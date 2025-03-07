package com.sdds.playground.sandbox.chip.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.chip.ChipUiState
import com.sdds.testing.vs.chip.applyState
import com.sdds.testing.vs.chip.chipGroup
import com.sdds.uikit.ChipGroup

/**
 * Фрагмент с компонентом [ChipGroup]
 * @author Малышев Александр on 30.08.2024
 */
internal class ChipGroupFragment : ComponentFragment<ChipUiState, ChipGroup>() {

    override val componentViewModel by viewModels<ChipGroupParametersViewModel> {
        ChipGroupParametersViewModelFactory(
            defaultState = getState { ChipUiState() },
            componentKey = componentKey,
        )
    }

    override val scrollMode: ScrollMode
        get() = if (isWrapped) ScrollMode.VERTICAL else ScrollMode.HORIZONTAL

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    private var isWrapped: Boolean = false

    override fun shouldRecreateComponentOnStateUpdate(state: ChipUiState): Boolean {
        return if (isWrapped != state.isWrapped) {
            isWrapped = state.isWrapped
            true
        } else {
            false
        }
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): ChipGroup {
        return chipGroup(contextWrapper)
    }

    override fun onComponentUpdate(component: ChipGroup?, state: ChipUiState) {
        component?.applyState(state)
    }
}
