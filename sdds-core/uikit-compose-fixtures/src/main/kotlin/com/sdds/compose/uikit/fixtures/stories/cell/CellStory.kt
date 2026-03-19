package com.sdds.compose.uikit.fixtures.stories.cell

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.icons.R
import com.sdds.sandbox.CellUiStatePropertiesProducer
import com.sdds.sandbox.CellUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class CellUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val title: String = "Title",
    val subtitle: String = "Subtitle",
    val hasDisclosure: Boolean = true,
    val disclosureText: String = "",
    val startContent: CellContent = CellContent.AVATAR,
    val endContent: CellContent = CellContent.NONE,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class CellContent {
    NONE,
    AVATAR,
    ICON,
    SWITCH,
    CHECKBOX,
    RADIOBOX,
}

@Story
object CellStory : ComposeBaseStory<CellUiState, CellStyle>(
    ComponentKey.Cell,
    CellUiState(),
    CellUiStatePropertiesProducer,
    CellUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: CellStyle,
        state: CellUiState,
    ) {
        val interactionSource = remember { MutableInteractionSource() }
        val isFocused = interactionSource.collectIsFocusedAsState()

        Cell(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .focusable(interactionSource = interactionSource)
                .focusSelector(
                    settings = LocalFocusSelectorSettings.current,
                ) { isFocused.value },
            style = style,
            title = AnnotatedString(state.title),
            subtitle = AnnotatedString(state.subtitle),
            label = AnnotatedString(state.label),
            disclosureContentEnabled = state.hasDisclosure,
            disclosureText = AnnotatedString(state.disclosureText),
            startContent = cellContent(contentType = state.startContent),
            endContent = cellContent(contentType = state.endContent),
            interactionSource = interactionSource,
        )
    }

    @Composable
    override fun Preview(
        style: CellStyle,
        key: ComponentKey,
    ) {
        Cell(
            modifier = Modifier.fillMaxWidth(),
            style = style,
            title = AnnotatedString("Title"),
            subtitle = AnnotatedString(""),
            label = AnnotatedString("Label"),
            disclosureContentEnabled = false,
            startContent = {
                Avatar(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
private fun cellContent(contentType: CellContent): (@Composable RowScope.() -> Unit)? {
    return if (contentType != CellContent.NONE) {
        {
            when (contentType) {
                CellContent.AVATAR -> Avatar(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                )

                CellContent.ICON -> Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )

                CellContent.SWITCH -> @Composable {
                    var active by remember { mutableStateOf(false) }
                    Switch(active = active, onActiveChanged = { active = it })
                }

                CellContent.CHECKBOX -> @Composable {
                    var checked by remember { mutableStateOf(false) }
                    CheckBox(checked = checked, onCheckedChange = { checked = it })
                }

                CellContent.RADIOBOX -> @Composable {
                    var checked by remember { mutableStateOf(false) }
                    RadioBox(checked = checked, onClick = { checked = true })
                }

                CellContent.NONE -> {}
            }
        }
    } else {
        null
    }
}
