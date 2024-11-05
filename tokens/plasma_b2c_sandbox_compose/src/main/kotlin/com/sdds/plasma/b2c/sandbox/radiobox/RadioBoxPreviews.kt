package com.sdds.plasma.b2c.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.RadioBox
import com.sdds.playground.sandbox.SandboxTheme

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
    RadioBox(
        style = RadioBox.M.style(),
        checked = true,
        enabled = true,
        label = "Title",
        description = "Description",
        onClick = {},
    )
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
    RadioBox(
        style = RadioBox.M.style(),
        checked = false,
        enabled = true,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}

@Composable
@Preview
internal fun RadioBoxPreviewOff() {
    RadioBox(
        style = RadioBox.M.style(),
        checked = false,
        enabled = false,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}
