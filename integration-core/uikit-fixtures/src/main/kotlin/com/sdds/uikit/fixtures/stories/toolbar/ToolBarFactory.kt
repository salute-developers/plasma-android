package com.sdds.uikit.fixtures.stories.toolbar

import android.content.Context
import com.sdds.icons.R
import com.sdds.uikit.ToolBar
import com.sdds.uikit.fixtures.stories.button.basicButton
import com.sdds.uikit.fixtures.stories.button.iconButton
import com.sdds.uikit.fixtures.styleWrapper

/**
 * Создает [ToolBar]
 * @param context контекст
 * @param state состояние
 * @param style стиль
 */
fun toolBar(
    context: Context,
    style: Int? = null,
    state: ToolBarUiState = ToolBarUiState(),
): ToolBar {
    return ToolBar(context.styleWrapper(style)).applyState(state)
}

/**
 * Применяет [ToolBarUiState] к [ToolBar]
 */
fun ToolBar.applyState(state: ToolBarUiState) = apply {
    hasDivider = state.hasDivider
    if (slotsAmount != state.slotsAmount) {
        slotsAmount = state.slotsAmount
        createContent(slotsAmount)
    }
}

private fun ToolBar.createContent(slotsAmount: Int) {
    clearSlots()
    for (index in 0 until slotsAmount) {
        if (index % 2 == 0) {
            addViewsToSlot(
                index,
                listOf(
                    iconButton(context).apply { setIconResource(R.drawable.ic_plasma_24) },
                    iconButton(context).apply { setIconResource(R.drawable.ic_salute_outline_24) },
                ),
            )
        } else {
            addViewToSlot(index, basicButton(context).apply { text = "Label" })
        }
    }
}
