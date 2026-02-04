package com.sdds.playground.sandbox.buttongroup.compose

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [ButtonGroup]
 */
@Composable
internal fun ButtonGroupScreen(componentKey: ComponentKey = ComponentKey.ButtonGroup) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ButtonGroupViewModel>(
            factory = ButtonGroupViewModelFactory(
                defaultState = ButtonGroupUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { btnGroupUiState, style ->
            val scrollModifier = when (btnGroupUiState.orientation) {
                ButtonGroupOrientation.Vertical -> Modifier.verticalScroll(rememberScrollState())
                ButtonGroupOrientation.Horizontal -> Modifier.horizontalScroll(rememberScrollState())
            }
            Box(modifier = scrollModifier) {
                ButtonGroup(
                    style = style,
                    modifier = Modifier.padding(12.dp),
                    orientation = btnGroupUiState.orientation,
                ) {
                    repeat(btnGroupUiState.amount) {
                        buttonContent(btnGroupUiState.appearance)
                    }
                }
            }
        },
    )
}

@Composable
internal fun ButtonGroupPreview(style: ButtonGroupStyle) {
    ButtonGroup(
        style = style,
        orientation = ButtonGroupOrientation.Horizontal,
    ) {
        repeat(3) {
            buttonContent()
        }
    }
}

private fun ButtonGroupScope.buttonContent(appearance: String = "") {
    if (appearance.contains("Icon")) {
        button { IconButton(painterResource(R.drawable.ic_plasma_24), {}) }
    } else {
        button {
            Button(
                label = "label",
                value = "value",
                onClick = {},
            )
        }
    }
}
