package com.sdds.testing.vs.checkbox

import android.content.Context
import android.view.ViewGroup
import android.widget.FrameLayout
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.CheckBox
import com.sdds.uikit.CheckBoxGroup

/**
 * Фабрика для создания [CheckBox]
 */
fun checkBox(
    context: Context,
    style: Int? = null,
    state: CheckBoxUiState? = null,
): CheckBox {
    return CheckBox(context.styleWrapper(style))
        .apply {
            id = R.id.checkBox
        }
        .applyState(state)
}

/**
 * Фабрика для создания [CheckBoxGroup]
 */
fun checkBoxGroup(
    context: Context,
    style: Int? = null,
    state: CheckBoxUiState? = null,
): CheckBoxGroup {
    return CheckBoxGroup(context.styleWrapper(style))
        .apply {
            id = R.id.checkBox_group
            layoutParams = FrameLayout.LayoutParams(
                resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_80x),
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
        .applyState(state)
}

/**
 * Применяет [CheckBoxUiState] к [CheckBox]
 */
fun CheckBox.applyState(state: CheckBoxUiState?): CheckBox = apply {
    state ?: return@apply
    text = state.label
    toggleState = state.state
    description = state.description
    isEnabled = state.enabled
}

/**
 * Применяет [CheckBoxUiState] к [CheckBoxGroup]
 */
fun CheckBoxGroup.applyState(state: CheckBoxUiState?): CheckBoxGroup = apply {
    state ?: return@apply
    removeAllViews()
    isEnabled = state.enabled
    repeat(3) {
        addView(
            checkBox(
                context = context,
                state = state
                    .copy(state = CheckBox.ToggleableState.OFF),
            ).apply { id = it },
        )
    }
}
