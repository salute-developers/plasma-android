package com.sdds.playground.sandbox.checkbox.group

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxGroupStyleBuilder
import com.sdds.playground.sandbox.checkbox.M
import com.sdds.playground.sandbox.checkbox.S

/**
 * Вариации [CheckBoxGroupStyle]
 * @author Малышев Александр on 24.10.2024
 */
internal val CheckBoxGroup.M: CheckBoxGroupStyleBuilder
    @Composable
    get() = CheckBoxGroupStyle.builder()
        .startIndent(36.dp)
        .verticalArrangement(Arrangement.spacedBy(12.dp))
        .checkBoxStyle(CheckBox.M.style())

internal val CheckBoxGroup.S: CheckBoxGroupStyleBuilder
    @Composable
    get() = CheckBoxGroupStyle.builder()
        .startIndent(24.dp)
        .verticalArrangement(Arrangement.spacedBy(10.dp))
        .checkBoxStyle(CheckBox.S.style())
