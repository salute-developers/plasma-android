package com.sdds.playground.sandbox.switch

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Switch
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

@Composable
internal fun SandboxSwitch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Switch(
        active = active,
        modifier = modifier,
        onActiveChanged = onActiveChanged,
        label = label,
        description = description,
        labelColor = SddsServTheme.colors.textDefaultPrimary,
        descriptionColor = SddsServTheme.colors.textDefaultSecondary,
        labelTextStyle = SddsServTheme.typography.bodyMNormal,
        descriptionTextStyle = SddsServTheme.typography.bodySNormal,
        thumbColor = SddsServTheme.colors.surfaceOnDarkSolidDefault,
        activeTrackColor = SddsServTheme.colors.surfaceDefaultPositive,
        inactiveTrackColor = SddsServTheme.colors.surfaceDefaultTransparentTertiary,
        enabled = enabled,
        interactionSource = interactionSource,
    )
}

@Composable
@Preview
internal fun SandboxSwitchPreviewOn() {
    SandboxTheme {
        SandboxSwitch(
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
        SandboxSwitch(
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
        SandboxSwitch(
            active = true,
            label = "Label",
            description = "Description",
            enabled = false,
        )
    }
}
