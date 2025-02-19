package com.sdds.testing.vs.button

import android.content.Context
import android.view.ViewGroup
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Button
import com.sdds.uikit.IconButton
import com.sdds.uikit.LinkButton

/**
 * Фабрика [Button]
 */
fun basicButton(
    context: Context,
    style: Int? = null,
    state: ButtonUiState? = null,
): Button {
    val lp = if (state?.fixedSize == true) {
        ViewGroup.LayoutParams(
            context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
    } else {
        null
    }
    return Button(context.styleWrapper(style))
        .applyState(state)
        .apply {
            id = R.id.basic_button
            if (lp != null) {
                layoutParams = lp
            }
        }
}

/**
 * Фабрика [IconButton]
 */
fun iconButton(
    context: Context,
    style: Int? = null,
    state: ButtonUiState? = null,
): IconButton {
    return IconButton(context.styleWrapper(style))
        .apply {
            id = R.id.icon_button
        }
        .applyState(state)
}

/**
 * Фабрика [LinkButton]
 */
fun linkButton(
    context: Context,
    style: Int? = null,
    state: ButtonUiState? = null,
): LinkButton {
    return LinkButton(context.styleWrapper(style))
        .apply {
            id = R.id.link_button
        }
        .applyState(state)
}

/**
 * Применяет [ButtonUiState] к [Button]
 */
fun <B : Button> B.applyState(state: ButtonUiState?): B = apply {
    state ?: return@apply
    text = state.buttonLabel
    value = state.buttonValue
    isLoading = state.loading
    isEnabled = state.enabled
    spacing = state.spacing
    if (state.icon != ButtonIcon.No) {
        setIconResource(state.icon.iconId)
    } else {
        icon = null
    }
    iconPosition = when (state.icon) {
        ButtonIcon.End -> Button.IconPosition.TextEnd
        else -> Button.IconPosition.TextStart
    }
}

/**
 * Применяет [ButtonUiState] к [IconButton]
 */
fun IconButton.applyState(state: ButtonUiState?): IconButton = apply {
    state ?: return@apply
    isLoading = state.loading
    isEnabled = state.enabled
    setIconResource(com.sdds.icons.R.drawable.ic_plasma_24)
}
