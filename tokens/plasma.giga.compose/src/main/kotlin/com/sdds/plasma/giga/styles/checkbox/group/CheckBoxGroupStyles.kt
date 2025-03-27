package com.sdds.plasma.giga.styles.checkbox.group

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxGroupStyleBuilder
import com.sdds.plasma.giga.styles.checkbox.CheckBox
import com.sdds.plasma.giga.styles.checkbox.M
import com.sdds.plasma.giga.styles.checkbox.S

/**
 * Стиль [CheckBoxGroup] размера M
 */
val CheckBoxGroup.M: CheckBoxGroupStyleBuilder
    @Composable
    get() = CheckBoxGroupStyle.builder()
        .startIndent(36.dp)
        .verticalArrangement(Arrangement.spacedBy(12.dp))
        .checkBoxStyle(CheckBox.M.style())

/**
 * Стиль [CheckBoxGroup] размера S
 */
val CheckBoxGroup.S: CheckBoxGroupStyleBuilder
    @Composable
    get() = CheckBoxGroupStyle.builder()
        .startIndent(24.dp)
        .verticalArrangement(Arrangement.spacedBy(10.dp))
        .checkBoxStyle(CheckBox.S.style())
