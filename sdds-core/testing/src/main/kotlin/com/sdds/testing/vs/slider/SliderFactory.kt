package com.sdds.testing.vs.slider

import android.content.Context
import com.sdds.icons.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Slider

/**
 * Фабрика для создания [Slider]
 */
fun slider(
    context: Context,
    style: Int? = null,
    state: SliderUiState = SliderUiState(),
): Slider {
    return Slider(context.styleWrapper(style)).apply {
        setProgressFormatTransformer { progress ->
            val totalSeconds = progress.toInt()
            val minutes = totalSeconds / 60
            val seconds = totalSeconds % 60
            "%02d:%02d".format(minutes, seconds)
        }
    }.applyState(state)
}

/**
 * Применяет [SliderUiState] к [Slider]
 */
fun Slider.applyState(state: SliderUiState) = apply {
    val horizontal = state.appearance.contains("Horizontal", true)
    if (horizontal) alignment = state.alignment.toAlignment()
    title = state.title
    limitLabelEnabled = state.limitLabelEnabled
    labelEnabled = state.labelEnabled
    setIconResource(R.drawable.ic_salute_outline_24)
    slideDirection = state.slideDirection.toSlideDirection()
    thumbEnabled = state.thumbEnabled
    minProgress = state.minLabel.toFloatOrNull() ?: 0f
    maxProgress = state.maxLabel.toFloatOrNull() ?: 1f
}
