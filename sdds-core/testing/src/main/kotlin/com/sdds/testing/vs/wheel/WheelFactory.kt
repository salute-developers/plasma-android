package com.sdds.testing.vs.wheel

import android.content.Context
import androidx.core.view.doOnPreDraw
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Wheel

/**
 * Создаёт [Wheel] с заданным контекстом, стилем и состоянием.
 *
 * @param context Контекст.
 * @param style Необязательный стиль.
 * @param state Состояние колеса.
 * @return Настроенный [Wheel].
 */
fun wheel(
    context: Context,
    style: Int? = null,
    state: WheelUiState = WheelUiState(),
): Wheel {
    return Wheel(context.styleWrapper(style))
        .applyState(state)
        .apply {
            doOnPreDraw {
                repeat(state.wheelCount) {
                    setSelectedEntry(it, 0, true)
                }
            }
        }
}

/**
 * Применяет состояние [WheelUiState] к [Wheel].
 *
 * @param state Состояние для применения.
 * @return Этот же [Wheel] с обновлённым состоянием.
 */
fun Wheel.applyState(state: WheelUiState): Wheel = apply {
    wheelCount = state.wheelCount
    visibleItemsCount = state.visibleItemsCount
    separatorType = state.separatorType.toSeparatorType()
    repeat(state.wheelCount) {
        setData(
            it,
            mutableListOf<Wheel.WheelItemEntry>().apply {
                repeat(60) { index ->
                    add(
                        Wheel.WheelItemEntry(
                            id = index.toLong(),
                            title = state.itemLabel + index,
                            textAfter = state.itemTextAfter,
                        ),
                    )
                }
            },
        )
    }
    controlsEnabled = state.hasControls
    controlsClickable = state.controlsClickable
    setControlsDisplayMode(state.controlsDisplayMode.toDisplayMode())
    setDescription(state.description)
    infiniteScrollEnabled = state.hasInfiniteScroll
}
