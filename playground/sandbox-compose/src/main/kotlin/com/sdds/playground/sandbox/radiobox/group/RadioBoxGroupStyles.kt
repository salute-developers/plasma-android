package com.sdds.playground.sandbox.radiobox.group

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxGroupStyleBuilder
import com.sdds.playground.sandbox.radiobox.M
import com.sdds.playground.sandbox.radiobox.S

/**
 * Вариации [RadioBoxGroupStyle]
 * @author Малышев Александр on 24.10.2024
 */
internal val RadioBoxGroup.M: RadioBoxGroupStyleBuilder
    @Composable
    get() = RadioBoxGroupStyle.builder()
        .verticalArrangement(Arrangement.spacedBy(12.dp, Alignment.Top))
        .radioBoxStyle(RadioBox.M.style())

internal val RadioBoxGroup.S: RadioBoxGroupStyleBuilder
    @Composable
    get() = RadioBoxGroupStyle.builder()
        .verticalArrangement(Arrangement.spacedBy(10.dp, Alignment.Top))
        .radioBoxStyle(RadioBox.S.style())
