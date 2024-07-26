package com.sdds.playground.sandbox.checkbox

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBox
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxSettingsProvider.descriptionTextStyleFor
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxSettingsProvider.labelTextStyleFor
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

@Composable
internal fun SandboxCheckBox(
    state: ToggleableState,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    size: SandboxCheckBox.Size = SandboxCheckBox.Size.M,
    label: String? = null,
    description: String? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CheckBox(
        state = state,
        modifier = modifier,
        onClick = onClick,
        enabled = enabled,
        label = label,
        description = description,
        labelColor = StylesSaluteTheme.colors.textDefaultPrimary,
        descriptionColor = StylesSaluteTheme.colors.textDefaultSecondary,
        idleColor = StylesSaluteTheme.colors.textDefaultSecondary,
        checkedColor = StylesSaluteTheme.colors.surfaceDefaultPositive,
        focusedColor = StylesSaluteTheme.colors.surfaceDefaultSolidDefault,
        baseColor = StylesSaluteTheme.colors.textOnDarkPrimary,
        labelTextStyle = labelTextStyleFor(size),
        descriptionTextStyle = descriptionTextStyleFor(size),
        controlSize = size.controlSize,
        controlRadius = size.controlRadius,
        verticalSpacing = size.verticalSpacing,
        horizontalSpacing = size.horizontalSpacing,
        innerCheckBoxPadding = size.innerCheckBoxPadding,
        interactionSource = interactionSource,
    )
}

/**
 * Параметры компонента [SandboxCheckBox]
 */
internal object SandboxCheckBox {

    /**
     * Размер компонента
     */
    enum class Size(
        val controlSize: Dp,
        val controlRadius: Dp,
        val verticalSpacing: Dp,
        val horizontalSpacing: Dp,
        val innerCheckBoxPadding: Dp,
    ) {
        M(
            controlSize = 24.dp,
            controlRadius = 6.dp,
            verticalSpacing = 2.dp,
            horizontalSpacing = 12.dp,
            innerCheckBoxPadding = 2.dp,
        ),
        S(
            controlSize = 16.dp,
            controlRadius = 4.dp,
            verticalSpacing = 2.dp,
            horizontalSpacing = 8.dp,
            innerCheckBoxPadding = 1.dp,
        ),
    }
}

/**
 * Превью [SandboxCheckBox]
 */
@Composable
@Preview(showBackground = true)
fun SandboxCheckBoxPreview() {
    SandboxTheme {
        SandboxCheckBox(
            state = ToggleableState.Indeterminate,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}
