package com.sdds.serv.styles.radioboxgroup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxGroupStyleBuilder
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.RadioBox
import com.sdds.serv.styles.radiobox.S

/**
 * Стиль [RadioBoxGroup] размера M
 */
val RadioBoxGroup.M: RadioBoxGroupStyleBuilder
    @Composable
    get() = RadioBoxGroupStyle.builder()
        .verticalArrangement(Arrangement.spacedBy(12.dp, Alignment.Top))
        .radioBoxStyle(RadioBox.M.style())

/**
 * Стиль [RadioBoxGroup] размера S
 */
val RadioBoxGroup.S: RadioBoxGroupStyleBuilder
    @Composable
    get() = RadioBoxGroupStyle.builder()
        .verticalArrangement(Arrangement.spacedBy(10.dp, Alignment.Top))
        .radioBoxStyle(RadioBox.S.style())
