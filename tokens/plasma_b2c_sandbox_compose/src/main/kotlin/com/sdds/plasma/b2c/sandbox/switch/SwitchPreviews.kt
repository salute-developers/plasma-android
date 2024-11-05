package com.sdds.plasma.b2c.sandbox.switch

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Switch
import com.sdds.plasma.b2c.sandbox.SandboxTheme

@Composable
@Preview
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
@Preview
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
@Preview
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
