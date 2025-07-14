package com.sdds.playground.sandbox.buttongroup.compose

import ButtonGroup
import ButtonGroupOrientation
import ButtonGroupScope
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
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
                ButtonGroupOrientation.Vertical -> Modifier.horizontalScroll(rememberScrollState())
                ButtonGroupOrientation.Horizontal -> Modifier.verticalScroll(rememberScrollState())
            }
            ButtonGroup(
                style = style,
                modifier = scrollModifier,
                orientation = btnGroupUiState.orientation,
            ) {
                repeat(btnGroupUiState.amount) {
                    buttonContent(componentKey)
                }
            }
        },
    )
}

@Composable
internal fun ButtonGroupPreview(style: ButtonGroupStyle, key: ComponentKey) {
    ButtonGroup(
        style = style,
        orientation = ButtonGroupOrientation.Horizontal,
    ) {
        repeat(3) {
            buttonContent(key)
        }
    }
}

private fun ButtonGroupScope.buttonContent(key: ComponentKey) {
    if (key.value.contains("Icon")) {
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
