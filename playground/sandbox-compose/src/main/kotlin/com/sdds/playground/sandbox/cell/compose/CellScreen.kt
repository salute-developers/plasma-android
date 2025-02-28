package com.sdds.playground.sandbox.cell.compose

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.applyFocusSelector
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

@Composable
internal fun CellScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val cellViewModel: CellViewModel =
        viewModel(
            factory = CellViewModelFactory(CellUiState(), theme),
            key = theme.toString(),
        )
    val uiState by cellViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                val interactionSource = remember { MutableInteractionSource() }
                val isFocused = interactionSource.collectIsFocusedAsState()
                Cell(
                    modifier = Modifier
                        .focusable(interactionSource = interactionSource)
                        .applyFocusSelector(
                            focusSelectorMode = LocalFocusSelectorMode.current,
                        ) { isFocused.value },
                    style = cellViewModel
                        .getStyleProvider()
                        .style(uiState.variant),
                    title = AnnotatedString(uiState.title),
                    subtitle = AnnotatedString(uiState.subtitle),
                    label = AnnotatedString(uiState.label),
                    disclosureEnabled = uiState.hasDisclosure,
                    disclosureText = AnnotatedString(uiState.disclosureText),
                    startContent = cellContent(contentType = uiState.startContent),
                    endContent = cellContent(contentType = uiState.endContent),
                    interactionSource = interactionSource,
                )
            }
        },
        propertiesOwner = cellViewModel,
    )
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

@Preview
@Composable
internal fun CellScreenPreview() {
    SandboxTheme {
        CellScreen()
    }
}
