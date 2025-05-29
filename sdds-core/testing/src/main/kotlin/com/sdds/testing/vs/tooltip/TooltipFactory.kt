@file:Suppress("MatchingDeclarationName")

package com.sdds.testing.vs.tooltip

import android.content.Context
import android.view.View
import com.sdds.testing.R
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.popover.PopoverTrigger
import com.sdds.testing.vs.popover.toAlignment
import com.sdds.testing.vs.popover.toPlacement
import com.sdds.testing.vs.popover.toPlacementMode
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Tooltip

/**
 * Создает [Tooltip]
 * @param context контекст
 * @param style стиль компонента
 */
fun tooltip(
    context: Context,
    style: Int? = null,
): Tooltip {
    return Tooltip(context.styleWrapper(style)).apply {
        isFocusable = true
    }
}

/**
 * Создает [PopoverTrigger] с [Tooltip]
 * @param context контекст
 * @param style стиль компонента
 * @param state состояние [Tooltip]
 */
fun tooltipWithTrigger(
    context: Context,
    style: Int? = null,
    state: TooltipUiState = TooltipUiState(),
): PopoverTrigger<Tooltip> {
    val popover = tooltip(context, style)
    val trigger = basicButton(context).apply {
        id = R.id.popover_trigger
        text = "Show Tooltip"
        setOnClickListener { popover.showWithState(it, state) }
    }
    return PopoverTrigger(popover, trigger)
}

/**
 * Отображает [Tooltip] рядом с [trigger]
 */
fun Tooltip.showWithState(trigger: View, state: TooltipUiState) {
    text = state.text
    if (state.contentStart) {
        setContentStartRes(com.sdds.icons.R.drawable.ic_scribble_diagonal_16)
    } else {
        contentStart = null
    }
    showWithTrigger(
        trigger = trigger,
        placement = state.placement.toPlacement(),
        placementMode = state.placementMode.toPlacementMode(),
        alignment = state.alignment.toAlignment(),
        triggerCentered = state.triggerCentered,
        tailEnabled = state.tailEnabled,
        duration = POPOVER_LENGTH_SHORT.takeIf { state.autoDismiss },
    )
}

private const val POPOVER_LENGTH_SHORT = 3000L
