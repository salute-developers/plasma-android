package com.sdds.playground.sandbox.switch

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Switch
import com.sdds.playground.sandbox.SandboxTheme

@Composable
@Preview(showBackground = true)
internal fun SandboxSwitchPreviewOn() {
    SandboxTheme {
        Switch(
            active = true,
            label = "Label",
            description = "Description",
            enabled = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxSwitchPreviewOff() {
    SandboxTheme {
        Switch(
            active = false,
            label = "Label",
            description = "Description",
            enabled = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxSwitchPreviewOnDisabled() {
    SandboxTheme {
        Switch(
            active = true,
            label = "Label",
            description = "Description",
            enabled = false,
        )
    }
}
