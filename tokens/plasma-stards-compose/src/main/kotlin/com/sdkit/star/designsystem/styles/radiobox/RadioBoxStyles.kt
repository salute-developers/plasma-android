package com.sdkit.star.designsystem.styles.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxColorsBuilder
import com.sdds.compose.uikit.RadioBoxDimensions
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme

/**
 * Стиль [RadioBox] размера M
 */
val RadioBox.M: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .descriptionStyle(StarDsTheme.typography.bodySNormal)
        .colors { defaultColors() }
        .dimensions(
            RadioBoxDimensions(
                controlSize = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_m_control_size),
                innerDiameter = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_m_inner_diameter),
                verticalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_m_vertical_spacing),
                horizontalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_m_horizontal_spacing),
                checkedStrokeWidth = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_m_checked_stroke_width),
                strokeWidth = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_m_stroke_width),
                checkedPadding = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_m_checked_padding),
            ),
        )

/**
 * Стиль [RadioBox] размера S
 */
val RadioBox.S: RadioBoxStyleBuilder
    @Composable
    get() = RadioBoxStyle.builder()
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .descriptionStyle(StarDsTheme.typography.bodyXsNormal)
        .colors { defaultColors() }
        .dimensions(
            RadioBoxDimensions(
                controlSize = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_s_control_size),
                innerDiameter = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_s_inner_diameter),
                verticalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_s_vertical_spacing),
                horizontalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_s_horizontal_spacing),
                strokeWidth = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_s_stroke_width),
                checkedStrokeWidth = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_s_checked_stroke_width),
                checkedPadding = dimensionResource(id = R.dimen.sdkit_cmp_radiobox_s_checked_padding),
            ),
        )

@Composable
private fun RadioBoxColorsBuilder.defaultColors(): RadioBoxColorsBuilder = apply {
    labelColor(StarDsTheme.colors.textDefaultPrimary)
    descriptionColor(StarDsTheme.colors.textDefaultSecondary)
    idleColor(StarDsTheme.colors.textDefaultSecondary)
    checkedColor(StarDsTheme.colors.surfaceDefaultAccent)
    focusedColor(StarDsTheme.colors.surfaceDefaultSolidDefault)
    baseColor(StarDsTheme.colors.textOnDarkPrimary)
}
