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
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

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
        labelColor = DefaultTheme.colors.textDefaultPrimary,
        descriptionColor = DefaultTheme.colors.textDefaultSecondary,
        idleColor = DefaultTheme.colors.textDefaultSecondary,
        checkedColor = DefaultTheme.colors.surfaceDefaultPositive,
        focusedColor = DefaultTheme.colors.surfaceDefaultSolidDefault,
        baseColor = DefaultTheme.colors.textOnDarkPrimary,
        labelTextStyle = labelTextStyleFor(size),
        descriptionTextStyle = descriptionTextStyleFor(size),
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
    enum class Size(val value: Dp) {
        M(26.dp),
        S(20.dp),
    }

    data class CheckBoxDimensions(
        val controlRadius: Dp,
        val verticalSpacing: Dp,
        val horizontalSpacing: Dp,
    )
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
