package com.sdkit.star.designsystem.styles.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxColorsBuilder
import com.sdds.compose.uikit.CheckBoxDimensions
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdkit.star.designsystem.R
import com.sdkit.star.designsystem.theme.StarDsTheme

/**
 * Стиль [CheckBox] размера M
 */
val CheckBox.M: CheckBoxStyleBuilder
    @Composable
    get() = CheckBoxStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .descriptionStyle(StarDsTheme.typography.bodySNormal)
        .colors { defaultColors() }
        .dimensions(
            CheckBoxDimensions(
                controlSize = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_m_control_size),
                controlRadius = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_m_control_radius),
                verticalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_m_vertical_spacing),
                horizontalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_m_horizontal_spacing),
                innerCheckBoxPadding = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_m_control_padding),
            ),
        )

/**
 * Стиль [CheckBox] размера M
 */
val CheckBox.S: CheckBoxStyleBuilder
    @Composable
    get() = CheckBoxStyle.builder()
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .descriptionStyle(StarDsTheme.typography.bodyXsNormal)
        .colors { defaultColors() }
        .dimensions(
            CheckBoxDimensions(
                controlSize = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_s_control_size),
                controlRadius = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_s_control_radius),
                verticalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_s_vertical_spacing),
                horizontalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_s_horizontal_spacing),
                innerCheckBoxPadding = dimensionResource(id = R.dimen.sdkit_cmp_checkbox_s_control_padding),
            ),
        )

@Composable
private fun CheckBoxColorsBuilder.defaultColors(): CheckBoxColorsBuilder = apply {
    labelColor(StarDsTheme.colors.textDefaultPrimary)
    descriptionColor(StarDsTheme.colors.textDefaultSecondary)
    idleColor(StarDsTheme.colors.textDefaultSecondary)
    checkedColor(StarDsTheme.colors.surfaceDefaultAccent)
    focusedColor(StarDsTheme.colors.surfaceDefaultSolidDefault)
    baseColor(StarDsTheme.colors.textOnDarkPrimary)
}
