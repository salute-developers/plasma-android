package com.sdds.plasma.giga.app.styles.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxColorsBuilder
import com.sdds.compose.uikit.CheckBoxDimensions
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme

/**
 * Стиль [CheckBox] размера M
 */
val CheckBox.M: CheckBoxStyleBuilder
    @Composable
    get() = CheckBoxStyle.builder()
        .labelStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodySNormal)
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
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
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
    labelColor(PlasmaGigaAppTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaGigaAppTheme.colors.textDefaultSecondary)
    idleColor(PlasmaGigaAppTheme.colors.textDefaultSecondary)
    checkedColor(PlasmaGigaAppTheme.colors.surfaceDefaultAccent)
    focusedColor(PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefault)
    baseColor(PlasmaGigaAppTheme.colors.textInversePrimary)
}
