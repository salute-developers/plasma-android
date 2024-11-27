package com.sdds.playground.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.isChecked
import com.sdds.compose.uikit.updateSelection
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.S
import com.sdds.serv.styles.radiobox.group.M
import com.sdds.serv.styles.radiobox.group.S

/**
 * Превью [RadioBox]
 */
@Composable
@Preview(showBackground = true)
internal fun RadioBoxPreview() {
    SandboxTheme {
        RadioBox(
            checked = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxPreviewSizeM() {
    SandboxTheme {
        RadioBox(
            style = RadioBox.M.style(),
            checked = true,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxPreviewSizeS() {
    SandboxTheme {
        RadioBox(
            style = RadioBox.S.style(),
            checked = false,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxPreviewSizeMNoDescription() {
    SandboxTheme {
        RadioBox(
            style = RadioBox.M.style(),
            checked = true,
            enabled = true,
            label = "Label",
            description = "",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxPreviewDisabled() {
    SandboxTheme {
        RadioBox(
            style = RadioBox.M.style(),
            checked = true,
            enabled = false,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxGroupPreviewSizeM() {
    SandboxTheme {
        RadioBoxGroup(
            style = RadioBoxGroup.M.style(),
            default = 1,
        ) { selection ->
            radioBoxItem(key = 1) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 2) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 3) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxGroupPreviewSizeS() {
    SandboxTheme {
        RadioBoxGroup(
            style = RadioBoxGroup.S.style(),
            default = 2,
        ) { selection ->
            radioBoxItem(key = 1) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 2) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 3) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxGroupPreviewSizeMDescription() {
    SandboxTheme {
        RadioBoxGroup(
            style = RadioBoxGroup.M.style(),
            default = 1,
        ) { selection ->
            radioBoxItem(key = 1) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 2) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 3) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxGroupPreviewSizeSLabel() {
    SandboxTheme {
        RadioBoxGroup(
            style = RadioBoxGroup.S.style(),
            default = 2,
        ) { selection ->
            radioBoxItem(key = 1) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 2) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 3) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    onClick = { updateSelection(selection, key) },
                )
            }
        }
    }
}
