package com.sdds.stylessalute.styles.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxColorsBuilder
import com.sdds.compose.uikit.CheckBoxDimensions
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.stylessalute.theme.StylesSaluteTheme

/**
 * Стиль [CheckBox] размера M
 */
val CheckBox.M: CheckBoxStyleBuilder
    @Composable
    get() = CheckBoxStyle.builder()
        .labelStyle(StylesSaluteTheme.typography.bodyMNormal)
        .descriptionStyle(StylesSaluteTheme.typography.bodySNormal)
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
        .labelStyle(StylesSaluteTheme.typography.bodySNormal)
        .descriptionStyle(StylesSaluteTheme.typography.bodyXsNormal)
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
    labelColor(StylesSaluteTheme.colors.textDefaultPrimary)
    descriptionColor(StylesSaluteTheme.colors.textDefaultSecondary)
    idleColor(StylesSaluteTheme.colors.textDefaultSecondary)
    checkedColor(StylesSaluteTheme.colors.surfaceDefaultAccentMain)
    focusedColor(StylesSaluteTheme.colors.surfaceDefaultSolidDefault)
    baseColor(StylesSaluteTheme.colors.textOnDarkPrimary)
}
