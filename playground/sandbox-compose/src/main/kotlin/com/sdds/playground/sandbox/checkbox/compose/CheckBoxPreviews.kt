package com.sdds.playground.sandbox.checkbox.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.checkbox.CheckBox
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkbox.S
import com.sdds.serv.styles.checkbox.group.CheckBoxGroup
import com.sdds.serv.styles.checkbox.group.M
import com.sdds.serv.styles.checkbox.group.S

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
internal fun CheckBoxPreviewSizeM() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.M.style(),
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
internal fun CheckBoxPreviewSizeSUnchecked() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.S.style(),
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
internal fun CheckBoxPreviewSizeSDisabled() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.S.style(),
            state = ToggleableState.On,
            enabled = false,
            label = "Label",
            description = "Description",
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CheckBoxPreviewSizeMIndeterminate() {
    SandboxTheme {
        CheckBox(
            style = CheckBox.M.style(),
            state = ToggleableState.Indeterminate,
            enabled = true,
            label = "Label",
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

@Composable
@Preview(showBackground = true)
internal fun CheckBoxGroupPreviewSizeMDisabled() {
    SandboxTheme {
        CheckBoxGroup(
            style = CheckBoxGroup.M.style(),
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
}
