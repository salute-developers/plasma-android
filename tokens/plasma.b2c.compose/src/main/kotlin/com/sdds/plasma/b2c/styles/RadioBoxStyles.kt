package com.sdds.plasma.b2c.styles

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxColorsBuilder
import com.sdds.compose.uikit.RadioBoxDimensions
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

/**
 * Стиль [RadioBox] размера M
 */
val RadioBox.M: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaB2cTheme.typography.bodySNormal)
        .colors { defaultColors() }
        .dimensions(
            RadioBoxDimensions(
                controlSize = 24.dp,
                innerDiameter = 10.dp,
                verticalSpacing = 2.dp,
                horizontalSpacing = 10.dp,
                strokeWidth = 2.dp,
                checkedPadding = 1.dp,
            ),
        )

/**
 * Стиль [RadioBox] размера S
 */
val RadioBox.S: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(PlasmaB2cTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .colors { defaultColors() }
        .dimensions(
            RadioBoxDimensions(
                controlSize = 16.dp,
                innerDiameter = 8.dp,
                verticalSpacing = 2.dp,
                horizontalSpacing = 8.dp,
                strokeWidth = 1.5f.dp,
                checkedPadding = 0.dp,
            ),
        )

@Composable
private fun RadioBoxColorsBuilder.defaultColors(): RadioBoxColorsBuilder = apply {
    labelColor(PlasmaB2cTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    idleColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    checkedColor(PlasmaB2cTheme.colors.surfaceDefaultPositive)
    focusedColor(PlasmaB2cTheme.colors.surfaceDefaultSolidDefault)
    baseColor(PlasmaB2cTheme.colors.textOnDarkPrimary)
}
