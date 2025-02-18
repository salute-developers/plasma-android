package com.sdds.testing.compose.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxStyle

/**
 * Тест кейсы для ChecBox, CheckBoxGroup
 */

/**
 * PLASMA-T1406
 */
@Composable
fun CheckBoxSizeM(style: CheckBoxStyle) {
    CheckBox(
        style = style,
        state = ToggleableState.On,
        enabled = true,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}

/**
 * PLASMA-T1406
 */
@Composable
fun CheckBoxSizeSUnchecked(style: CheckBoxStyle) {
    CheckBox(
        style = style,
        state = ToggleableState.Off,
        enabled = true,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}

/**
 * PLASMA-T1411
 */
@Composable
fun CheckBoxSizeSDisabled(style: CheckBoxStyle) {
    CheckBox(
        style = style,
        state = ToggleableState.On,
        enabled = false,
        label = "Label",
        description = "Description",
    )
}

/**
 * PLASMA-T1412
 */
@Composable
fun CheckBoxSizeMIndeterminate(style: CheckBoxStyle) {
    CheckBox(
        style = style,
        state = ToggleableState.Indeterminate,
        enabled = true,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}

/**
 * PLASMA-T1541
 */
@Composable
fun CheckBoxSizeMediumNoLabelAndDesc(style: CheckBoxStyle) {
    CheckBox(
        style = style,
        state = ToggleableState.On,
        enabled = true,
        onClick = {},
    )
}

/**
 * PLASMA-T1413
 */
@Composable
fun CheckBoxGroupSizeM(style: CheckBoxGroupStyle) {
    CheckBoxGroup(
        style = style,
    ) {
        rootCheckbox {
            CheckBox(
                state = ToggleableState.On,
                label = "Label",
                description = "Description",
            )
        }
        checkbox {
            CheckBox(
                state = ToggleableState.On,
                label = "Label",
                description = "Description",
            )
        }
        checkbox {
            CheckBox(
                state = ToggleableState.On,
                label = "Label",
                description = "Description",
            )
        }
    }
}

/**
 * PLASMA-T1414
 */
@Composable
fun CheckBoxGroupSizeS(style: CheckBoxGroupStyle) {
    CheckBoxGroup(
        style = style,
    ) {
        rootCheckbox {
            CheckBox(
                state = ToggleableState.Indeterminate,
                label = "Label",
                description = "Description",
            )
        }
        checkbox {
            CheckBox(
                state = ToggleableState.On,
                label = "Label",
                description = "Description",
            )
        }
        checkbox {
            CheckBox(
                state = ToggleableState.Off,
                label = "Label",
                description = "Description",
            )
        }
    }
}

/**
 * PLASMA-T1415
 */
@Composable
fun CheckBoxGroupSizeMDisabled(style: CheckBoxGroupStyle) {
    CheckBoxGroup(
        style = style,
    ) {
        rootCheckbox {
            CheckBox(
                state = ToggleableState.Off,
                label = "Label",
                description = "Description",
                enabled = false,
            )
        }
        checkbox {
            CheckBox(
                state = ToggleableState.Off,
                label = "Label",
                description = "Description",
                enabled = false,
            )
        }
        checkbox {
            CheckBox(
                state = ToggleableState.Off,
                label = "Label",
                description = "Description",
                enabled = false,
            )
        }
    }
}
