package com.sdds.plasma.giga.styles.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxColorsBuilder
import com.sdds.compose.uikit.RadioBoxDimensions
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.plasma.giga.theme.PlasmaGigaTheme

/**
 * Стиль [RadioBox] размера M
 */
val RadioBox.M: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaTheme.typography.bodySNormal)
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
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaTheme.typography.bodyXsNormal)
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
    labelColor(PlasmaGigaTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaGigaTheme.colors.textDefaultSecondary)
    idleColor(PlasmaGigaTheme.colors.textDefaultSecondary)
    checkedColor(PlasmaGigaTheme.colors.surfaceDefaultAccent)
    focusedColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefault)
    baseColor(PlasmaGigaTheme.colors.textInversePrimary)
}
