package com.sdds.testing.vs.progress

import android.content.Context
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.CircularProgressBar
import com.sdds.uikit.ProgressBar

/**
 * Фабрика для создания [ProgressBar]
 */
fun progressBar(
    context: Context,
    style: Int? = null,
    state: ProgressUiState? = null,
): ProgressBar {
    return ProgressBar(context.styleWrapper(style))
        .apply {
            id = R.id.progressBar
            layoutParams = FrameLayout.LayoutParams(
                resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
                LayoutParams.WRAP_CONTENT,
            )
        }
        .applyState(state)
}

/**
 * Фабрика для создания [CircularProgressBar]
 */
fun circularProgressBar(
    context: Context,
    style: Int? = null,
    state: CircularProgressUiState? = null,
): CircularProgressBar {
    return CircularProgressBar(context.styleWrapper(style))
        .apply {
            id = R.id.circular_progress_bar
            layoutParams = FrameLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
            )
        }
        .applyState(state)
}

/**
 * Применяет [ProgressUiState] к [ProgressBar]
 */
fun ProgressBar.applyState(state: ProgressUiState?): ProgressBar = apply {
    state ?: return@apply
    setProgress(state.progress, state.animateProgress)
}

/**
 * Применяет [ProgressUiState] к [CircularProgressBar]
 */
fun CircularProgressBar.applyState(state: CircularProgressUiState?): CircularProgressBar = apply {
    state ?: return@apply
    setProgress(state.progress, state.animateProgress)
    trackEnabled = state.trackEnabled
}
