package com.sdds.playground.sandbox.popover.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.S

/**
 * Экран с компонентом [Popover]
 */
@Composable
internal fun PopoverScreen(componentKey: ComponentKey = ComponentKey.Popover) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<PopoverViewModel>(
            factory = PopoverViewModelFactory(
                defaultState = PopoverUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { popoverUiState, style ->
            val showPopover = remember { mutableStateOf(false) }
            val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.LightGray.copy(0.3f)),
            ) {
                Button(
                    modifier = Modifier
                        .align(popoverUiState.triggerPlacement.toAlignment())
                        .popoverTrigger(triggerInfo),
                    label = "show",
                    onClick = { showPopover.value = true },
                )
                Popover(
                    show = showPopover.value,
                    triggerInfo = triggerInfo.value,
                    placement = popoverUiState.placement,
                    placementMode = popoverUiState.placementMode,
                    triggerCentered = popoverUiState.triggerCentered,
                    alignment = popoverUiState.alignment,
                    style = style,
                    tailEnabled = popoverUiState.tailEnabled,
                    onDismissRequest = {
                        showPopover.value = false
                    },
                    duration = popoverUiState.autoHide.autoHideToMs(),
                ) {
                    Column(
                        modifier = Modifier
                            .padding(
                                top = 12.dp,
                                bottom = 8.dp,
                                start = 8.dp,
                                end = 8.dp,
                            ),
                    ) {
                        Text("Title")
                        Spacer(Modifier.height(4.dp))
                        Text("Text")
                        Spacer(Modifier.height(12.dp))
                        Button(
                            modifier = Modifier.width(166.dp),
                            style = BasicButton.S.Default.style(),
                            label = "Ok",
                            onClick = {},
                        )
                    }
                }
            }
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun PopoverScreenPreview() {
    SandboxTheme {
        PopoverScreen()
    }
}
