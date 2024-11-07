package com.sdds.plasma.sd.service.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.VerticalRadioBoxGroup
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

@Composable
@Preview(showBackground = true)
internal fun RadioBoxPreviewSizeM() {
    SandboxTheme {
        VerticalRadioBoxGroup(
            style = RadioBoxGroup.M.style(),
            items = listOf(
                RadioBoxGroup.Item(
                    id = 1,
                    label = "Label",
                    description = "Description",
                ),
                RadioBoxGroup.Item(
                    id = 2,
                    label = "Label",
                    description = "Description",
                ),
                RadioBoxGroup.Item(
                    id = 3,
                    label = "Label",
                    description = "Description",
                ),
            ),
            default = 2,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun RadioBoxPreviewSizeS() {
    SandboxTheme {
        VerticalRadioBoxGroup(
            style = RadioBoxGroup.S.style(),
            items = listOf(
                RadioBoxGroup.Item(
                    id = 1,
                    label = "Label",
                    description = "Description",
                ),
                RadioBoxGroup.Item(
                    id = 2,
                    label = "Label",
                    description = "Description",
                ),
                RadioBoxGroup.Item(
                    id = 3,
                    label = "Label",
                    description = "Description",
                ),
            ),
            default = 2,
        )
    }
}
