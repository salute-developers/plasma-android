package com.sdds.compose.uikit.fixtures.stories.editable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Editable
import com.sdds.compose.uikit.EditableIconPlacement
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.EditableUiStatePropertiesProducer
import com.sdds.sandbox.EditableUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class EditableUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val enabled: Boolean = true,
    val singleLine: Boolean = true,
    val readonly: Boolean = false,
    val iconPlacement: EditableIconPlacement = EditableIconPlacement.Relative,
    val textAlign: EditableTextAlign = EditableTextAlign.Start,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class EditableTextAlign(val align: TextAlign) {
    Center(TextAlign.Center),
    Start(TextAlign.Start),
    End(TextAlign.End),
}

@Story
object EditableStory : ComposeBaseStory<EditableUiState, EditableStyle>(
    ComponentKey.Editable,
    EditableUiState(),
    EditableUiStatePropertiesProducer,
    EditableUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: EditableStyle,
        state: EditableUiState,
    ) {
        var text by remember { mutableStateOf(TextFieldValue("Value")) }
        val focusRequester = remember { FocusRequester() }
        Editable(
            modifier = Modifier
                .focusRequester(focusRequester),
            style = style,
            value = text,
            onValueChange = { text = it },
            icon = {
                Icon(
                    modifier = Modifier
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ) {
                            focusRequester.requestFocus()
                            text = text.copy(selection = TextRange(text.text.length))
                        },
                    painter = painterResource(R.drawable.ic_edit_fill_36),
                    contentDescription = null,
                )
            },
            iconPlacement = state.iconPlacement,
            textAlign = state.textAlign.align,
            singleLine = state.singleLine,
            enabled = state.enabled,
            readOnly = state.readonly,
        )
    }
}
