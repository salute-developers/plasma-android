package com.sdds.playground.sandbox.modal.compose

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.Text
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Modal]
 */
@Composable
internal fun ModalScreen(componentKey: ComponentKey = ComponentKey.Modal) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ModalViewModel>(
            factory = ModalViewModelFactory(
                defaultState = ModalUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { modalUiState, style ->
            val showModal = remember { mutableStateOf(false) }
            Button(
                modifier = Modifier.align(Alignment.Center),
                label = "show",
                onClick = { showModal.value = true },
            )
            Modal(
                show = showModal.value,
                style = style,
                onDismissRequest = { showModal.value = false },
                modifier = Modifier.width(300.dp),
                hasClose = modalUiState.hasClose,
                edgeToEdge = modalUiState.edgeToEdge,
                gravity = modalUiState.gravity,
                dimBackground = modalUiState.hasDimBackground,
                useNativeBlackout = modalUiState.useNativeBlackout,
                closeIcon = painterResource(R.drawable.ic_close_24),
            ) {
                Text("Modal", modifier = Modifier.wrapContentSize())
            }
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun ModalScreenPreview() {
    SandboxTheme {
        ModalScreen()
    }
}
