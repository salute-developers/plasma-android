package com.sdds.testing.vs.mask

import android.content.Context
import android.widget.Toast
import com.sdds.testing.vs.textfield.textField
import com.sdds.uikit.TextField
import com.sdds.uikit.colorstate.ColorState

/**
 * Фабрика для создания [TextField] с масками
 */
fun maskedTextField(
    context: Context,
    style: Int? = null,
    colorState: ColorState? = null,
    state: MaskUiState = MaskUiState(),
): TextField {
    return textField(context, style, colorState)
        .applyState(state, colorState)
}

/**
 * Применяет [MaskUiState] к [TextField]
 */
fun TextField.applyState(state: MaskUiState?, colorState: ColorState? = null) = apply {
    state ?: return@apply
    if (colorState != null) {
        this.colorState = colorState
    }
    label = state.labelText
    placeholder = state.placeholderText
    state.valueText?.let { this.value = it }
    prefixText = state.prefix
    suffixText = state.suffix
    if (state.icon) {
        setIcon(com.sdds.icons.R.drawable.ic_scribble_diagonal_24)
    } else {
        setIcon(null)
    }
    if (state.action) {
        setAction(com.sdds.icons.R.drawable.ic_shazam_24)
    } else {
        setAction(null)
    }
    setActionClickListener {
        Toast.makeText(context, "action clicked", Toast.LENGTH_SHORT)
            .show()
    }
    isEnabled = state.enabled
    isReadOnly = state.readOnly
    setMask(state.mask.raw, state.maskDisplayMode.raw)
}
