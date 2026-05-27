package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.isChecked
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.updateSelection
import com.sdds.playground.integrationtest.scenarios.focus.FocusSelectorClearButton
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radioboxgroup.M
import com.sdds.serv.styles.radioboxgroup.RadioBoxGroup

/**
 * Кейс для RadioboxGroup
 */
@Composable
internal fun RadioBoxGroupFocusCase(
    isFocused: Boolean,
    rootFocusRequester: FocusRequester,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.RADIO_BOX_GROUP_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "RadioBoxGroup")
        Box(
            modifier = Modifier
                .size(1.dp)
                .focusRequester(rootFocusRequester)
                .focusable(),
        )
        RadioBoxGroup(
            modifier = Modifier.testTag(FocusSelectorTags.RADIO_BOX_GROUP),
            style = RadioBoxGroup.M.style(),
            default = 1,
        ) { selection ->
            repeat(2) { index ->
                val key = index + 1
                radioBoxItem(key = key) { itemKey ->
                    val itemInteractionSource = remember { MutableInteractionSource() }
                    RadioBox(
                        checked = isChecked(selection, itemKey),
                        modifier = Modifier
                            .onFocusChanged { onFocusChanged(it.isFocused) }
                            .focusable(
                                enabled = true,
                                interactionSource = itemInteractionSource,
                            )
                            .testTag(FocusSelectorTags.radioBoxGroupItem(index)),
                        style = com.sdds.serv.styles.radiobox.RadioBox.M.style(),
                        label = "Option $itemKey",
                        description = "Description $itemKey",
                        interactionSource = itemInteractionSource,
                        onClick = { updateSelection(selection, itemKey) },
                    )
                }
            }
        }
        Text(
            text = if (isFocused) "Группа радиокнопок в фокусе" else "Радиокнопки не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.RADIO_BOX_GROUP_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}
