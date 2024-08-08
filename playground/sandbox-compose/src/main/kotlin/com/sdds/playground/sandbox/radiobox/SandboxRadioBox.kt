package com.sdds.playground.sandbox.radiobox

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBox
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxSettingsProvider.descriptionTextStyleFor
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxSettingsProvider.labelTextStyleFor
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

@Composable
internal fun SandboxRadioBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    size: SandboxRadioBox.Size = SandboxRadioBox.Size.M,
    label: String? = null,
    description: String? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    RadioBox(
        checked = checked,
        modifier = modifier,
        onClick = onClick,
        label = label,
        description = description,
        enabled = enabled,
        labelTextStyle = labelTextStyleFor(size),
        descriptionTextStyle = descriptionTextStyleFor(size),
        labelColor = StylesSaluteTheme.colors.textDefaultPrimary,
        descriptionColor = StylesSaluteTheme.colors.textDefaultSecondary,
        idleColor = StylesSaluteTheme.colors.textDefaultSecondary,
        checkedColor = StylesSaluteTheme.colors.surfaceDefaultPositive,
        focusedColor = StylesSaluteTheme.colors.surfaceDefaultSolidDefault,
        baseColor = StylesSaluteTheme.colors.textOnDarkPrimary,
        innerDiameter = size.innerDiameter,
        verticalSpacing = size.verticalSpacing,
        horizontalSpacing = size.horizontalSpacing,
        controlSize = size.controlSize,
        checkedPadding = size.checkedPadding,
        strokeWidth = size.strokeWidth,
        interactionSource = interactionSource,
    )
}

/**
 * Параметры компонента [SandboxRadioBox]
 */
internal object SandboxRadioBox {

    /**
     * Размер компонента
     */
    enum class Size(
        val controlSize: Dp,
        val innerDiameter: Dp,
        val verticalSpacing: Dp,
        val horizontalSpacing: Dp,
        val checkedPadding: Dp,
        val strokeWidth: Dp,
    ) {
        M(
            controlSize = 24.dp,
            innerDiameter = 10.dp,
            verticalSpacing = 2.dp,
            horizontalSpacing = 10.dp,
            strokeWidth = 2.dp,
            checkedPadding = 1.dp,
        ),
        S(
            controlSize = 16.dp,
            innerDiameter = 8.dp,
            verticalSpacing = 2.dp,
            horizontalSpacing = 8.dp,
            strokeWidth = 1.5f.dp,
            checkedPadding = 0.dp,
        ),
    }
}

/**
 * Превью [SandboxRadioBox]
 */
@Composable
@Preview(showBackground = true)
internal fun SandboxRadioBoxPreview() {
    SandboxTheme {
        SandboxRadioBox(
            checked = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

@Composable
@Preview
internal fun SandboxRadioBoxPreviewMedium() {
    SandboxRadioBox(
        size = SandboxRadioBox.Size.M,
        checked = true,
        enabled = true,
        label = "Title",
        description = "Description",
        onClick = {},
    )
}

@Composable
@Preview
internal fun SandboxRadioBoxPreviewSmallDark() {
    SandboxTheme(darkTheme = true) {
        SandboxRadioBox(
            size = SandboxRadioBox.Size.S,
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
internal fun SandboxRadioBoxPreviewUnchecked() {
    SandboxRadioBox(
        size = SandboxRadioBox.Size.M,
        checked = false,
        enabled = true,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}

@Composable
@Preview
internal fun SandboxRadioBoxPreviewOff() {
    SandboxRadioBox(
        size = SandboxRadioBox.Size.M,
        checked = false,
        enabled = false,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}
