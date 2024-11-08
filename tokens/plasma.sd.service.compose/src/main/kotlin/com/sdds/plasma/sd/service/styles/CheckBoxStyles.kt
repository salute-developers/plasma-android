package com.sdds.plasma.sd.service.styles

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxColorsBuilder
import com.sdds.compose.uikit.CheckBoxDimensions
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceTheme

/**
 * Стиль [CheckBox] размера M
 */
val CheckBox.M: CheckBoxStyleBuilder
    @Composable
    get() = CheckBoxStyle.builder()
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodySNormal)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
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
    labelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    idleColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    checkedColor(PlasmaSdServiceTheme.colors.surfaceDefaultAccent)
    focusedColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault)
    baseColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary)
}
