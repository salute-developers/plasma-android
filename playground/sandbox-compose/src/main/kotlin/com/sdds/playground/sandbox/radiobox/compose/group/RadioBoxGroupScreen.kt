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
import com.sdds.playground.sandbox.core.compose.NewComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.CoreComponent

/**
 * Экран с RadioBoxGroup
 */
@Composable
internal fun RadioBoxGroupScreen(componentKey: ComponentKey = ComponentKey.RadioBoxGroup) {
    val radioBoxGroupViewModel: RadioBoxGroupViewModel =
        viewModel(
            factory = RadioBoxGroupViewModelFactory(RadioBoxGroupUiState(), componentKey),
            key = componentKey.toString(),
        )

    NewComponentScaffold(
        key = componentKey,
        viewModel = radioBoxGroupViewModel,
        component = { radioBoxGroupState, style ->
            RadioBoxGroup(style = style) {
                radioBoxGroupState.items.map { itemData ->
                    RadioBox(
                        checked = radioBoxGroupViewModel.isChecked(itemData.id),
                        label = itemData.label,
                        description = itemData.description,
                        onClick = { radioBoxGroupViewModel.updateCurrentItem(itemData.id) },
                    )
                }
            }
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        RadioBoxGroupScreen()
    }
}
