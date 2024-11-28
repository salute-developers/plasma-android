package com.sdds.plasma.sd.service.sandbox.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.styles.checkbox.M
import com.sdds.plasma.sd.service.styles.checkbox.S
import com.sdds.plasma.sd.service.styles.checkbox.group.M
import com.sdds.plasma.sd.service.styles.checkbox.group.S

/**
 * Превью [CheckBox]
 */
@Composable
@Preview(showBackground = true)
internal fun CheckBoxPreview() {
    SandboxTheme {
        CheckBox(
            state = ToggleableState.Indeterminate,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxPreviewUncheckedSizeMedium() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.M.style(),
            state = ToggleableState.Off,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxPreviewCheckedSizeSmall() {
    SandboxTheme(darkTheme = true) {
        CheckBox(
            style = CheckBox.S.style(),
            state = ToggleableState.On,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxPreviewOffSizeSmall() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.S.style(),
            state = ToggleableState.Indeterminate,
            enabled = false,
            label = "Label",
            description = "Description",
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxPreviewOnSizeMediumNoDesc() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.M.style(),
            state = ToggleableState.On,
            enabled = true,
            label = "Label",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxPreviewOnSizeMediumNoLabel() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.M.style(),
            state = ToggleableState.On,
            enabled = true,
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxPreviewSizeMediumNoLabelAndDesc() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.M.style(),
            state = ToggleableState.On,
            enabled = true,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxGroupPreviewSizeM() {
    SandboxTheme {
        CheckBoxGroup(
            style = CheckBoxGroup.M.style(),
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
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxGroupPreviewSizeS() {
    SandboxTheme {
        CheckBoxGroup(
            style = CheckBoxGroup.S.style(),
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
}
