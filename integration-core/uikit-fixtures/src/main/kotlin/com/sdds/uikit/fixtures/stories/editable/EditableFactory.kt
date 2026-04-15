package com.sdds.uikit.fixtures.stories.editable

import android.content.Context
import androidx.appcompat.content.res.AppCompatResources
import com.sdds.icons.R
import com.sdds.uikit.Editable
import com.sdds.uikit.fixtures.styleWrapper

/**
 * Фабрика для создания [Editable]
 */
fun editable(
    context: Context,
    style: Int? = null,
    state: EditableUiState = EditableUiState(),
): Editable {
    return Editable(context.styleWrapper(style))
        .apply { id = com.sdds.uikit.fixtures.R.id.editable }
        .applyState(state)
}

/**
 * Применяет [EditableUiState] к [Editable]
 */
fun Editable.applyState(state: EditableUiState) = apply {
    if (text.isNullOrBlank()) setText("Value")
    icon = AppCompatResources.getDrawable(context, R.drawable.ic_edit_fill_36)
    isReadOnly = state.readonly
    setSingleLine(state.singleLine)
    isEnabled = state.enabled
    iconPlacement = state.iconPlacement.toEditableIconPlacement()
    gravity = state.textAlignment.toEditableTextAlignment()
}
