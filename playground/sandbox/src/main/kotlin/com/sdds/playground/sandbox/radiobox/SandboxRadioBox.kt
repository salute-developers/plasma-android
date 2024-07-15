package com.sdds.playground.sandbox.radiobox

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBox
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxSettingsProvider.descriptionTextStyleFor
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxSettingsProvider.getDimensionsFor
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxSettingsProvider.labelTextStyleFor
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

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
    val dimensions = getDimensionsFor(size)
    RadioBox(
        checked = checked,
        modifier = modifier,
        onClick = onClick,
        label = label,
        description = description,
        enabled = enabled,
        labelTextStyle = labelTextStyleFor(size),
        descriptionTextStyle = descriptionTextStyleFor(size),
        labelColor = DefaultTheme.colors.textDefaultPrimary,
        descriptionColor = DefaultTheme.colors.textDefaultSecondary,
        idleColor = DefaultTheme.colors.textDefaultSecondary,
        checkedColor = DefaultTheme.colors.surfaceDefaultPositive,
        focusedColor = DefaultTheme.colors.surfaceDefaultSolidDefault,
        baseColor = DefaultTheme.colors.textOnDarkPrimary,
        baseSize = dimensions.baseSize,
        verticalSpacing = dimensions.verticalSpacing,
        horizontalSpacing = dimensions.horizontalSpacing,
        controlSize = size.value,
        interactionSource = interactionSource,
    )
}

/**
 * Параметры компонента [SandboxRadioBox]
 */
internal object SandboxRadioBox {

    @Immutable
    data class Dimensions(
        val baseSize: Dp,
        val verticalSpacing: Dp,
        val horizontalSpacing: Dp,
    )

    /**
     * Размер компонента
     */
    enum class Size(val value: Dp) {
        M(26.dp),
        S(20.dp),
    }
}

/**
 * Превью [SandboxRadioBox]
 */
@Composable
@Preview(showBackground = true)
fun SandboxRadioBoxPreview() {
    SandboxTheme {
        SandboxRadioBox(
            checked = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}
