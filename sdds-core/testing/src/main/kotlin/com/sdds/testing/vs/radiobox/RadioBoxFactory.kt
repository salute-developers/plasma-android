package com.sdds.testing.vs.radiobox

import android.content.Context
import android.view.ViewGroup
import android.widget.FrameLayout
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.RadioBox
import com.sdds.uikit.RadioBoxGroup

/**
 * Фабрика для создания [RadioBox]
 */
fun radioBox(
    context: Context,
    style: Int? = null,
    state: RadioBoxUiState? = null,
): RadioBox {
    return RadioBox(context.styleWrapper(style))
        .apply {
            id = R.id.radioBox
        }
        .applyState(state)
}

/**
 * Фабрика для создания [RadioBoxGroup]
 */
fun radioBoxGroup(
    context: Context,
    style: Int? = null,
    state: RadioBoxUiState? = null,
): RadioBoxGroup {
    return RadioBoxGroup(context.styleWrapper(style))
        .apply {
            id = R.id.radioBox_group
            layoutParams = FrameLayout.LayoutParams(
                resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_80x),
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
        .applyState(state)
}

/**
 * Применяет [RadioBoxUiState] к [RadioBox]
 */
fun RadioBox.applyState(state: RadioBoxUiState?): RadioBox = apply {
    state ?: return@apply
    text = state.label
    isChecked = state.checked
    description = state.description
    isEnabled = state.enabled
}

/**
 * Применяет [RadioBoxUiState] к [RadioBoxGroup]
 */
fun RadioBoxGroup.applyState(state: RadioBoxUiState?): RadioBoxGroup = apply {
    state ?: return@apply
    isEnabled = state.enabled
    removeAllViews()
    clearCheck()
    repeat(3) {
        addView(
            radioBox(
                context,
                state = state,
            ).apply { id = it },
        )
    }
}
