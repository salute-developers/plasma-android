package com.sdds.playground.sandbox.chip.vs.group

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.chip.vs.ChipUiState
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Chip
import com.sdds.uikit.ChipGroup
import com.sdds.icons.R as Icons

/**
 * Фрагмент с компонентом [ChipGroup]
 * @author Малышев Александр on 30.08.2024
 */
internal class ChipGroupFragment : ComponentFragment<ChipUiState, ChipGroup>() {

    override val componentViewModel by viewModels<ChipGroupParametersViewModel> {
        ChipGroupParametersViewModelFactory(getState { ChipUiState() })
    }

    override val scrollMode: ScrollMode
        get() = if (isWrapped) ScrollMode.VERTICAL else ScrollMode.HORIZONTAL

    override fun shouldRecreateComponentOnStateUpdate(state: ChipUiState): Boolean {
        return if (isWrapped != state.isWrapped) {
            isWrapped = state.isWrapped
            true
        } else {
            false
        }
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): ChipGroup {
        return ChipGroup(contextWrapper)
            .apply { id = R.id.chip_group }
    }

    override fun onComponentUpdate(component: ChipGroup?, state: ChipUiState) {
        component?.populate(state)
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    private var isWrapped: Boolean = false

    private fun ChipGroup.populate(state: ChipUiState) {
        removeAllViews()
        gravity = state.gravityMode.gravity
        this.state = state.checkedState.viewState
        this.selectionMode = state.selectionMode
        repeat(state.quantity) {
            val chip = Chip(requireContext()).apply {
                text = state.label
                id = it
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
            }
            addView(chip)
        }
    }
}
