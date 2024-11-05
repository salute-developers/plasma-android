package com.sdds.plasma.b2c.styles

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxColorsBuilder
import com.sdds.compose.uikit.CheckBoxDimensions
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

/**
 * Стиль [CheckBox] размера M
 */
val CheckBox.M: CheckBoxStyleBuilder
    @Composable
    get() = CheckBoxStyle.builder()
        .labelStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaB2cTheme.typography.bodySNormal)
        .colors { defaultColors() }
        .dimensions(
            CheckBoxDimensions(
                controlSize = 24.dp,
                controlRadius = 6.dp,
                verticalSpacing = 2.dp,
                horizontalSpacing = 12.dp,
                innerCheckBoxPadding = 2.dp,
            ),
        )

/**
 * Стиль [CheckBox] размера M
 */
val CheckBox.S: CheckBoxStyleBuilder
    @Composable
    get() = CheckBoxStyle.builder()
        .labelStyle(PlasmaB2cTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .colors { defaultColors() }
        .dimensions(
            CheckBoxDimensions(
                controlSize = 16.dp,
                controlRadius = 4.dp,
                verticalSpacing = 2.dp,
                horizontalSpacing = 8.dp,
                innerCheckBoxPadding = 1.dp,
            ),
        )

@Composable
private fun CheckBoxColorsBuilder.defaultColors(): CheckBoxColorsBuilder = apply {
    labelColor(PlasmaB2cTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    idleColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    checkedColor(PlasmaB2cTheme.colors.surfaceDefaultAccent)
    focusedColor(PlasmaB2cTheme.colors.surfaceDefaultSolidDefault)
    baseColor(PlasmaB2cTheme.colors.textOnDarkPrimary)
}
