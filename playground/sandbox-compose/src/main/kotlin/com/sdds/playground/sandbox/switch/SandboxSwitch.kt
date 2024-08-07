package com.sdds.playground.sandbox.switch

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.Switch
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

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
        labelColor = StylesSaluteTheme.colors.textDefaultPrimary,
        descriptionColor = StylesSaluteTheme.colors.textDefaultSecondary,
        labelTextStyle = StylesSaluteTheme.typography.bodyMNormal,
        descriptionTextStyle = StylesSaluteTheme.typography.bodySNormal,
        thumbColor = StylesSaluteTheme.colors.surfaceOnDarkSolidDefault,
        activeTrackColor = StylesSaluteTheme.colors.surfaceDefaultPositive,
        inactiveTrackColor = StylesSaluteTheme.colors.surfaceDefaultTransparentTertiary,
        enabled = enabled,
        interactionSource = interactionSource,
    )
}
