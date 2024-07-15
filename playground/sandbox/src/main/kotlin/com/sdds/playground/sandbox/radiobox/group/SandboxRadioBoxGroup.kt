package com.sdds.playground.sandbox.radiobox.group

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.VerticalRadioBoxGroup
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.radiobox.SandboxRadioBox
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxSettingsProvider.descriptionTextStyleFor
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxSettingsProvider.getDimensionsFor
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxSettingsProvider.labelTextStyleFor
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

@Composable
internal fun SandboxRadioBoxGroup(
    items: List<RadioBoxGroup.Item>,
    modifier: Modifier = Modifier,
    size: SandboxRadioBox.Size = SandboxRadioBox.Size.M,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    default: Any? = null,
    onSelectionChanged: (Any) -> Unit = {},
) {
    val dimensions = getDimensionsFor(size)
    VerticalRadioBoxGroup(
        items = items,
        modifier = modifier,
        default = default,
        onSelectionChanged = onSelectionChanged,
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
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
    )
}

/**
 * Превью [SandboxRadioBox]
 */
@Composable
@Preview(showBackground = true)
fun SandboxRadioBoxPreview() {
    SandboxTheme {
        SandboxRadioBoxGroup(
            items = listOf(
                RadioBoxGroup.Item(
                    id = 1,
                    label = "RadioBox 1",
                    description = "Description 1",
                ),
                RadioBoxGroup.Item(
                    id = 2,
                    label = "RadioBox 2",
                    description = "Description 2",
                ),
                RadioBoxGroup.Item(
                    id = 3,
                    label = "RadioBox 3",
                    description = "Description 3",
                ),
            ),
            default = 1,
        )
    }
}
