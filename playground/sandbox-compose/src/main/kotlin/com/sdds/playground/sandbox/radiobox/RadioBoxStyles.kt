package com.sdds.playground.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxColorsBuilder
import com.sdds.compose.uikit.RadioBoxDimensions
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 * Вариации [RadioBoxStyle]
 * @author Малышев Александр on 24.10.2024
 */
internal val RadioBox.M: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .descriptionStyle(SddsServTheme.typography.bodySNormal)
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

internal val RadioBox.S: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .descriptionStyle(SddsServTheme.typography.bodyXsNormal)
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
    labelColor(SddsServTheme.colors.textDefaultPrimary)
    descriptionColor(SddsServTheme.colors.textDefaultSecondary)
    idleColor(SddsServTheme.colors.textDefaultSecondary)
    checkedColor(SddsServTheme.colors.surfaceDefaultAccent)
    focusedColor(SddsServTheme.colors.surfaceDefaultSolidDefault)
    baseColor(SddsServTheme.colors.textOnDarkPrimary)
}
