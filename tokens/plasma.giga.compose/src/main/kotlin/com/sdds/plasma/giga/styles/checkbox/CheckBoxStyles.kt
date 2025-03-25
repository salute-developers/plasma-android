package com.sdds.plasma.giga.styles.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxColorsBuilder
import com.sdds.compose.uikit.CheckBoxDimensions
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.plasma.giga.theme.PlasmaGigaTheme

/**
 * Стиль [CheckBox] размера M
 */
val CheckBox.M: CheckBoxStyleBuilder
    @Composable
    get() = CheckBoxStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaTheme.typography.bodySNormal)
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
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaTheme.typography.bodyXsNormal)
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
    labelColor(PlasmaGigaTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaGigaTheme.colors.textDefaultSecondary)
    idleColor(PlasmaGigaTheme.colors.textDefaultSecondary)
    checkedColor(PlasmaGigaTheme.colors.surfaceDefaultAccent)
    focusedColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefault)
    baseColor(PlasmaGigaTheme.colors.textInversePrimary)
}
