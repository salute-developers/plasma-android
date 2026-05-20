package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.scenarios.focus.FocusSelectorClearButton
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.serv.styles.chip.Chip
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chipgroup.ChipGroupDense
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.M

/**
 * Кейс-для чипа
 */
@Composable
internal fun ChipFocusCase(
    isFocused: Boolean,
    interactionSource: MutableInteractionSource,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.CHIP_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Chip")
        Chip(
            modifier = Modifier
                .onFocusChanged { onFocusChanged(it.isFocused) }
                .focusable(
                    enabled = true,
                    interactionSource = interactionSource,
                )
                .testTag(FocusSelectorTags.FOCUSABLE_CHIP),
            style = Chip.L.Default.style(),
            label = "Фокусируемый чип",
            interactionSource = interactionSource,
            onClick = {},
        )
        Text(
            text = if (isFocused) "Чип в фокусе" else "Чип не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.CHIP_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}

@Composable
internal fun ChipGroupFocusCase(
    isFocused: Boolean,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.CHIP_GROUP_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "ChipGroup")
        ChipGroup(
            modifier = Modifier.testTag(FocusSelectorTags.CHIP_GROUP),
            style = ChipGroupDense.M.Default.style(),
        ) {
            repeat(3) { index ->
                val itemInteractionSource = remember { MutableInteractionSource() }
                Chip(
                    modifier = Modifier
                        .onFocusChanged { onFocusChanged(it.isFocused) }
                        .focusable(
                            enabled = true,
                            interactionSource = itemInteractionSource,
                        )
                        .testTag(FocusSelectorTags.chipGroupItem(index)),
                    style = Chip.M.Default.style(),
                    label = "Chips",
                    interactionSource = itemInteractionSource,
                    onClick = {},
                )
            }
        }
        Text(
            text = if (isFocused) "Группа чипов в фокусе" else "Чипы не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.CHIP_GROUP_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}
