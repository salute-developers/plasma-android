package com.sdds.plasma.giga.app.styles.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxColorsBuilder
import com.sdds.compose.uikit.RadioBoxDimensions
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme

/**
 * Стиль [RadioBox] размера M
 */
val RadioBox.M: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodySNormal)
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
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
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
    labelColor(PlasmaGigaAppTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaGigaAppTheme.colors.textDefaultSecondary)
    idleColor(PlasmaGigaAppTheme.colors.textDefaultSecondary)
    checkedColor(PlasmaGigaAppTheme.colors.surfaceDefaultAccent)
    focusedColor(PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefault)
    baseColor(PlasmaGigaAppTheme.colors.textInversePrimary)
}
