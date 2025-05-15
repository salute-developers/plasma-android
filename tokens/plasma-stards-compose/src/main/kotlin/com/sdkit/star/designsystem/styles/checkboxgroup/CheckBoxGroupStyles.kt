package com.sdkit.star.designsystem.styles.checkboxgroup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxGroupStyleBuilder
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.checkbox.CheckBox
import com.sdkit.star.designsystem.styles.checkbox.Default
import com.sdkit.star.designsystem.styles.checkbox.M
import com.sdkit.star.designsystem.styles.checkbox.S

/**
 * Стиль [CheckBoxGroup] размера M
 */
val CheckBoxGroup.M: CheckBoxGroupStyleBuilder
    @Composable
    get() = CheckBoxGroupStyle.builder()
        .startIndent(dimensionResource(id = R.dimen.sdkit_cmp_checkbox_group_m_start_indent))
        .verticalArrangement(
            Arrangement.spacedBy(dimensionResource(id = R.dimen.sdkit_cmp_checkbox_group_m_item_spacing)),
        )
        .checkBoxStyle(CheckBox.M.Default.style())

/**
 * Стиль [CheckBoxGroup] размера S
 */
val CheckBoxGroup.S: CheckBoxGroupStyleBuilder
    @Composable
    get() = CheckBoxGroupStyle.builder()
        .startIndent(dimensionResource(id = R.dimen.sdkit_cmp_checkbox_group_s_start_indent))
        .verticalArrangement(
            Arrangement.spacedBy(dimensionResource(id = R.dimen.sdkit_cmp_checkbox_group_s_item_spacing)),
        )
        .checkBoxStyle(CheckBox.S.Default.style())
