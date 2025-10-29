package com.sdds.testing.vs.chip

import android.content.Context
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Chip
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.colorstate.ColorState

/**
 * Фабрика для создания [Chip]
 */
fun chip(
    context: Context,
    style: Int? = null,
    state: ChipUiState? = null,
): Chip {
    return Chip(context.styleWrapper(style))
        .apply {
            id = R.id.chip
        }
        .applyState(state)
}

/**
 * Фабрика для создания [ChipGroup]
 */
fun chipGroup(
    context: Context,
    style: Int? = null,
    colorState: ColorState? = null,
    state: ChipUiState? = null,
): ChipGroup {
    return ChipGroup(context.styleWrapper(style))
        .apply { id = R.id.chip_group }
        .applyState(state, colorState)
}

/**
 * Применяет [ChipUiState] к [Chip]
 */
fun Chip.applyState(state: ChipUiState?): Chip = apply {
    state ?: return@apply
    text = state.label
    if (state.contentLeft) {
        setDrawableStartRes(com.sdds.icons.R.drawable.ic_plasma_24)
    } else {
        drawableStart = null
    }

    if (state.hasClose) {
        setDrawableEndRes(com.sdds.icons.R.drawable.ic_close_24)
    } else {
        drawableEnd = null
    }
    isEnabled = state.enabled
}

/**
 * Применяет [ChipUiState] к [ChipGroup]
 */
fun ChipGroup.applyState(state: ChipUiState?, colorState: ColorState? = null): ChipGroup = apply {
    state ?: return@apply
    if (colorState != null) {
        this.colorState = colorState
    }
    arrangement = state.gravityMode.arrangement
    this.selectionMode = state.selectionMode
    removeAllViews()
    repeat(state.quantity) {
        addView(
            chip(context, state = state).apply {
                id = it
            },
        )
    }
}
