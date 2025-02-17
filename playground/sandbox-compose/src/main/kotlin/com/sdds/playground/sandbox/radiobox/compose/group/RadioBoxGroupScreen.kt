package com.sdds.playground.sandbox.radiobox.compose.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с RadioBoxGroup
 */
@Composable
internal fun RadioBoxGroupScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val radioBoxGroupViewModel: RadioBoxGroupViewModel =
        viewModel(
            factory = RadioBoxGroupViewModelFactory(RadioBoxGroupUiState(), theme),
            key = theme.toString(),
        )
    val radioBoxGroupState by radioBoxGroupViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                RadioBoxGroup(
                    style = radioBoxGroupViewModel
                        .getStyleProvider()
                        .style(radioBoxGroupState.variant),
                ) {
                    radioBoxGroupState.items.map { itemData ->
                        RadioBox(
                            checked = radioBoxGroupViewModel.isChecked(itemData.id),
                            label = itemData.label,
                            description = itemData.description,
                            onClick = { radioBoxGroupViewModel.updateCurrentItem(itemData.id) },
                        )
                    }
                }
            }
        },
        propertiesOwner = radioBoxGroupViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        RadioBoxGroupScreen()
    }
}
