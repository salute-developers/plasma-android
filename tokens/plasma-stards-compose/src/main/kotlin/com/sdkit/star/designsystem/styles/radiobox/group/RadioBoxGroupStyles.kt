package com.sdkit.star.designsystem.styles.radiobox.group

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxGroupStyleBuilder
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.radiobox.M
import com.sdkit.star.designsystem.styles.radiobox.RadioBox
import com.sdkit.star.designsystem.styles.radiobox.S

/**
 * Стиль [RadioBoxGroup] размера M
 */
val RadioBoxGroup.M: RadioBoxGroupStyleBuilder
    @Composable
    get() = RadioBoxGroupStyle.builder()
        .verticalArrangement(
            Arrangement.spacedBy(
                dimensionResource(id = R.dimen.sdkit_cmp_radiobox_group_m_item_spacing),
                Alignment.Top,
            ),
        )
        .radioBoxStyle(RadioBox.M.style())

/**
 * Стиль [RadioBoxGroup] размера S
 */
val RadioBoxGroup.S: RadioBoxGroupStyleBuilder
    @Composable
    get() = RadioBoxGroupStyle.builder()
        .verticalArrangement(
            Arrangement.spacedBy(
                dimensionResource(id = R.dimen.sdkit_cmp_radiobox_group_s_item_spacing),
                Alignment.Top,
            ),
        )
        .radioBoxStyle(RadioBox.S.style())
