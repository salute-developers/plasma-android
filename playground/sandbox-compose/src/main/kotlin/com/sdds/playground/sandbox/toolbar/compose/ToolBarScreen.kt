package com.sdds.playground.sandbox.toolbar.compose

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ToolBar
import com.sdds.compose.uikit.ToolBarOrientation
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun ToolBarScreen(componentKey: ComponentKey = ComponentKey.ToolBar) {
    val toolBarViewModel = viewModel<ToolBarViewModel>(
        factory = ToolBarViewModelFactory(ToolBarUiState(), componentKey),
        key = componentKey.toString(),
    )
    ComponentScaffold(
        key = componentKey,
        viewModel = toolBarViewModel,
        component = { uiState, style ->
            val scrollModifier = when (style.orientation) {
                ToolBarOrientation.Vertical -> Modifier.verticalScroll(rememberScrollState())
                ToolBarOrientation.Horizontal -> Modifier.horizontalScroll(rememberScrollState())
            }
            Box(modifier = scrollModifier) {
                ToolBar(
                    hasDivider = uiState.hasDivider,
                    style = style,
                ) {
                    for (section in 0 until uiState.sections) {
                        if (section % 2 == 0) {
                            section {
                                ContainerAccordingOrientation(style.orientation) {
                                    IconButton(R.drawable.ic_plasma_24) { }
                                    Spacer(modifier = Modifier.size(4.dp))
                                    IconButton(R.drawable.ic_salute_outline_24) { }
                                }
                            }
                        } else {
                            section { Button("Label", {}) }
                        }
                    }
                }
            }
        },
    )
}

@Composable
private fun ContainerAccordingOrientation(
    orientation: ToolBarOrientation,
    content: @Composable () -> Unit,
) {
    if (orientation == ToolBarOrientation.Horizontal) {
        Row { content() }
    } else {
        Column { content() }
    }
}

@Composable
internal fun ToolBarPreview(style: ToolBarStyle) {
    ToolBar(
        hasDivider = true,
        style = style,
    ) {
        for (item in 0..2) {
            if (item % 2 == 0) {
                section {
                    Row {
                        IconButton(R.drawable.ic_plasma_24) { }
                        Spacer(modifier = Modifier.size(4.dp))
                        IconButton(R.drawable.ic_salute_outline_24) { }
                    }
                }
            } else {
                section {
                    Button("Label", {})
                }
            }
        }
    }
}
