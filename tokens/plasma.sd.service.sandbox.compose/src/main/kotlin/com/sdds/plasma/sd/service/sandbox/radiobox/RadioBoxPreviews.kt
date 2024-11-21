package com.sdds.plasma.sd.service.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.isChecked
import com.sdds.compose.uikit.updateSelection
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.styles.M
import com.sdds.plasma.sd.service.styles.S

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
@Preview
internal fun RadioBoxPreviewMedium() {
    SandboxTheme {
        RadioBox(
            style = RadioBox.M.style(),
            checked = true,
            enabled = true,
            label = "Title",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview
internal fun RadioBoxPreviewSmallDark() {
    SandboxTheme(darkTheme = true) {
        RadioBox(
            style = RadioBox.S.style(),
            checked = true,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview
internal fun RadioBoxPreviewUnchecked() {
    SandboxTheme {
        RadioBox(
            style = RadioBox.M.style(),
            checked = false,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview
internal fun RadioBoxPreviewOff() {
    SandboxTheme {
        RadioBox(
            style = RadioBox.M.style(),
            checked = false,
            enabled = false,
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
        RadioBoxGroup(
            style = RadioBoxGroup.M.style(),
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
internal fun RadioBoxPreviewSizeS() {
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
