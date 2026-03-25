package com.sdds.compose.uikit.fixtures.stories.codefield

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CodeField
import com.sdds.compose.uikit.CodeFieldCaptionAlignment
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.fixtures.stories.CodeFieldUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.CodeFieldUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class CodeFieldUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 4,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val captionAlignment: CodeFieldCaptionAlignment = CodeFieldCaptionAlignment.Center,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object CodeFieldStory : ComposeBaseStory<CodeFieldUiState, CodeFieldStyle>(
    ComponentKey.CodeField,
    CodeFieldUiState(),
    CodeFieldUiStatePropertiesProducer,
    CodeFieldUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: CodeFieldStyle,
        state: CodeFieldUiState,
    ) {
        val focusRequester = remember { FocusRequester() }
        val validCode = buildString { repeat(state.codeLength) { append(it + 1) } }
        CodeField(
            modifier = Modifier.focusRequester(focusRequester),
            style = style,
            codeLength = state.codeLength,
            hidden = state.hidden,
            onCodeComplete = { it == validCode },
            isItemValid = { it != state.errorItem },
            caption = state.caption,
            captionAlignment = state.captionAlignment,
        )

        LaunchedEffect(Unit) { focusRequester.requestFocus() }
    }

    @Composable
    override fun Preview(
        style: CodeFieldStyle,
        key: ComponentKey,
    ) {
        CodeField(
            style = style,
            codeLength = 6,
            hidden = false,
            caption = "Caption",
        )
    }
}
