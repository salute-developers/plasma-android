@file:Suppress("MatchingDeclarationName")

package com.sdds.testing.vs.popover

import android.content.Context
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import com.sdds.testing.R
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Popover
import com.sdds.uikit.TextView

/**
 * [Popover] со своим тригером [View]
 * @property popover всплывающее окно
 * @property trigger [View] рядом с которым отображается [popover]
 */
data class PopoverTrigger(
    val popover: Popover,
    val trigger: View,
)

/**
 * Создает [Popover]
 * @param context контекст
 * @param style стиль компонента
 */
fun popover(
    context: Context,
    style: Int? = null,
): Popover {
    return Popover(context.styleWrapper(style)).apply {
        isFocusable = true
        contentView = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            TextView(context)
                .apply {
                    text = "Content"
                }.also {
                    val lp = MarginLayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT)
                    lp.bottomMargin = context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_10x)
                    addView(it, lp)
                }

            basicButton(context).apply {
                text = "Dismiss"
                setOnClickListener { dismiss() }
            }.also {
                addView(it)
            }
        }
    }
}

/**
 * Создает [PopoverTrigger]
 * @param context контекст
 * @param style стиль компонента
 * @param state состояние [Popover]
 */
fun popoverWithTrigger(
    context: Context,
    style: Int? = null,
    state: PopoverUiState = PopoverUiState(),
): PopoverTrigger {
    val popover = popover(context, style)
    val trigger = basicButton(context).apply {
        id = R.id.popover_trigger
        text = "Show Popover"
        setOnClickListener { popover.showWithState(it, state) }
    }
    return PopoverTrigger(popover, trigger)
}

/**
 * Отображает [Popover] рядом с [trigger]
 */
fun Popover.showWithState(trigger: View, state: PopoverUiState) {
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
