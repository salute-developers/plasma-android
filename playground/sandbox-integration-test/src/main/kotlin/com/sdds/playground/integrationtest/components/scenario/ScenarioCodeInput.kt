package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CodeInput
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.scenarios.focus.FocusSelectorClearButton
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.serv.styles.codeinput.CodeInput
import com.sdds.serv.styles.codeinput.M

/**
 * Кейс для CodeInput
 */
@Composable
internal fun CodeInputFocusCase(
    isFocused: Boolean,
    interactionSource: MutableInteractionSource,
    rootFocusRequester: FocusRequester,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.CODE_INPUT_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "CodeInput")
        Box(
            modifier = Modifier
                .size(1.dp)
                .focusRequester(rootFocusRequester)
                .focusable(),
        )
        CodeInput(
            modifier = Modifier
                .onFocusChanged { onFocusChanged(it.isFocused) }
                .testTag(FocusSelectorTags.FOCUSABLE_CODE_INPUT),
            style = CodeInput.M.style(),
            codeLength = 4,
            caption = "Введите код",
            hidden = false,
            onCodeComplete = { true },
            interactionSource = interactionSource,
        )
        Text(
            text = if (isFocused) "CodeInput в фокусе" else "CodeInput не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.CODE_INPUT_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}
