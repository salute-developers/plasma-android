package com.sdds.plasma.sd.service.sandbox.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.CheckBox
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.styles.M
import com.sdds.plasma.sd.service.styles.S

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
