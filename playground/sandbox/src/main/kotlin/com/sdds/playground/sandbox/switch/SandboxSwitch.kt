package com.sdds.playground.sandbox.switch

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.Switch
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

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
        labelColor = DefaultTheme.colors.textDefaultPrimary,
        descriptionColor = DefaultTheme.colors.textDefaultSecondary,
        labelTextStyle = DefaultTheme.typography.bodyMNormal,
        descriptionTextStyle = DefaultTheme.typography.bodySNormal,
        thumbColor = DefaultTheme.colors.surfaceOnDarkSolidDefault,
        activeTrackColor = DefaultTheme.colors.surfaceDefaultPositive,
        inactiveTrackColor = DefaultTheme.colors.surfaceDefaultTransparentTertiary,
        enabled = enabled,
        interactionSource = interactionSource,
    )
}
