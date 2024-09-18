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
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

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
        labelColor = SddsServTheme.colors.textDefaultPrimary,
        descriptionColor = SddsServTheme.colors.textDefaultSecondary,
        idleColor = SddsServTheme.colors.textDefaultSecondary,
        checkedColor = SddsServTheme.colors.surfaceDefaultPositive,
        focusedColor = SddsServTheme.colors.surfaceDefaultSolidDefault,
        baseColor = SddsServTheme.colors.textOnDarkPrimary,
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
internal fun SandboxCheckBoxPreview() {
    SandboxTheme {
        SandboxCheckBox(
            state = ToggleableState.Indeterminate,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxCheckBoxPreviewUncheckedSizeMedium() {
    SandboxTheme {
        SandboxCheckBox(
            state = ToggleableState.Off,
            size = SandboxCheckBox.Size.M,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxCheckBoxPreviewCheckedSizeSmall() {
    SandboxTheme(darkTheme = true) {
        SandboxCheckBox(
            state = ToggleableState.On,
            size = SandboxCheckBox.Size.S,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxCheckBoxPreviewOffSizeSmall() {
    SandboxTheme {
        SandboxCheckBox(
            state = ToggleableState.Indeterminate,
            size = SandboxCheckBox.Size.S,
            enabled = false,
            label = "Label",
            description = "Description",
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxCheckBoxPreviewOnSizeMediumNoDesc() {
    SandboxTheme {
        SandboxCheckBox(
            state = ToggleableState.On,
            size = SandboxCheckBox.Size.M,
            enabled = true,
            label = "Label",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxCheckBoxPreviewOnSizeMediumNoLabel() {
    SandboxTheme {
        SandboxCheckBox(
            state = ToggleableState.On,
            size = SandboxCheckBox.Size.M,
            enabled = true,
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxCheckBoxPreviewSizeMediumNoLabelAndDesc() {
    SandboxTheme {
        SandboxCheckBox(
            state = ToggleableState.On,
            size = SandboxCheckBox.Size.M,
            enabled = true,
            onClick = {},
        )
    }
}
