package com.sdds.compose.uikit.fixtures.stories.codeinput

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.sandbox.internal.FIELD_FOCUS_SELECTOR_MODE_SWITCH
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.CodeInput
import com.sdds.compose.uikit.CodeInputCaptionAlignment
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.fixtures.R
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.isEnabled
import com.sdds.sandbox.CodeInputUiStatePropertiesProducer
import com.sdds.sandbox.CodeInputUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class CodeInputUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 4,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val captionAlignment: CodeInputCaptionAlignment = CodeInputCaptionAlignment.Center,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object CodeInputStory : ComposeBaseStory<CodeInputUiState, CodeInputStyle>(
    ComponentKey.CodeInput,
    CodeInputUiState(),
    CodeInputUiStatePropertiesProducer,
    CodeInputUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: CodeInputStyle,
        state: CodeInputUiState,
    ) {
        val focusRequester = remember { FocusRequester() }
        val focusManager = LocalFocusManager.current
        var isFocusSelectorOn by remember { mutableStateOf(!FIELD_FOCUS_SELECTOR_MODE_SWITCH) }
        Column {
            val validCode =
                buildString { repeat(state.codeLength) { append(it + 1) } }
            CodeInput(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .focusRequester(focusRequester)
                    .focusTarget(),
                style = style,
                codeLength = state.codeLength,
                hidden = state.hidden,
                onCodeComplete = { it == validCode },
                isItemValid = { it != state.errorItem },
                caption = state.caption,
                hasItemFocusSelector = if (isFocusSelectorOn) {
                    LocalFocusSelectorSettings.current.isEnabled()
                } else {
                    false
                },
                captionAlignment = state.captionAlignment,
            )

            if (FIELD_FOCUS_SELECTOR_MODE_SWITCH) {
                Spacer(Modifier.size(64.dp))
                Switch(
                    active = isFocusSelectorOn,
                    label = stringResource(R.string.sandbox_enable_focus_selector),
                    onActiveChanged = { isFocusSelectorOn = it },
                )
                Button(
                    label = stringResource(R.string.sandbox_clear_focus),
                    onClick = { focusManager.clearFocus(true) },
                )
            }
            LaunchedEffect(Unit) {
                focusRequester.requestFocus()
            }
        }
    }
}
