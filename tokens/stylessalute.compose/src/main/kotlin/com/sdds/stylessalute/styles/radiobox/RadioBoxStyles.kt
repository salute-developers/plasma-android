package com.sdds.stylessalute.styles.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxColorsBuilder
import com.sdds.compose.uikit.RadioBoxDimensions
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.stylessalute.theme.StylesSaluteTheme

/**
 * Стиль [RadioBox] размера M
 */
val RadioBox.M: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(StylesSaluteTheme.typography.bodyMNormal)
        .descriptionStyle(StylesSaluteTheme.typography.bodySNormal)
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
        .labelStyle(StylesSaluteTheme.typography.bodySNormal)
        .descriptionStyle(StylesSaluteTheme.typography.bodyXsNormal)
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
    labelColor(StylesSaluteTheme.colors.textDefaultPrimary)
    descriptionColor(StylesSaluteTheme.colors.textDefaultSecondary)
    idleColor(StylesSaluteTheme.colors.textDefaultSecondary)
    checkedColor(StylesSaluteTheme.colors.surfaceDefaultAccentMain)
    focusedColor(StylesSaluteTheme.colors.surfaceDefaultSolidDefault)
    baseColor(StylesSaluteTheme.colors.textOnDarkPrimary)
}
