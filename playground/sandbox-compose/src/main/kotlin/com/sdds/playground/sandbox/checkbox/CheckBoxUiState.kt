package com.sdds.playground.sandbox.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxStyle

/**
 * Состояние checkbox
 *
 * @property state состояние checkbox
 * @property size размер checkbox [Size]
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли checkbox
 */
internal data class CheckBoxUiState(
    val state: ToggleableState = ToggleableState.Indeterminate,
    val size: Size = Size.M,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)

internal enum class Size {
    M, S
}

@Composable
internal fun CheckBoxUiState.checkBoxStyle(): CheckBoxStyle =
    when (size) {
        Size.M -> CheckBox.M.style()
        Size.S -> CheckBox.S.style()
    }
