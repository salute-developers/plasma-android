package com.sdds.testing.vs.switcher

import android.content.Context
import android.view.ViewGroup
import android.widget.FrameLayout
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Switch

/**
 * Фабрика для создания [Switch]
 */
fun switch(
    context: Context,
    style: Int? = null,
    state: SwitchUiState? = null,
): Switch {
    return Switch(context.styleWrapper(style))
        .apply {
            this.id = R.id.switcher
        }
        .applyState(state)
        .apply {
            layoutParams = FrameLayout.LayoutParams(
                resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_90x),
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
}

/**
 * Применяет [SwitchUiState] к [Switch]
 */
fun Switch.applyState(state: SwitchUiState?): Switch = apply {
    state ?: return@apply
    text = state.label
    description = state.description
    isEnabled = state.enabled
    isChecked = state.active
}
