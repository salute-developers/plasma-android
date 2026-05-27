package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.ModalStyle
import com.sdds.icons.R
import com.sdds.playground.integrationtest.uistate.ModalUiState

/**
 * Modal для сценария
 */
@Composable
internal fun ScenarioModal(
    state: ModalUiState,
    style: ModalStyle,
    buttonStyle: ButtonStyle,
    isVisible: Boolean,
    onOpenClick: () -> Unit,
    onDismissRequest: () -> Unit,
    openButtonTag: String,
    modalTag: String,
    closeButtonTag: String,
    modifier: Modifier = Modifier,
    openButtonLabel: String = "Show modal",
    closeButtonLabel: String = "Close modal",
    content: @Composable () -> Unit,
) {
    Box(modifier = modifier) {
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.Center)
                .testTag(openButtonTag),
            label = openButtonLabel,
            onClick = onOpenClick,
        )
        Modal(
            show = isVisible,
            style = style,
            modifier = Modifier.width(300.dp),
            gravity = state.gravity,
            onDismissRequest = onDismissRequest,
            dimBackground = state.hasDimBackground,
            hasClose = state.hasClose,
            edgeToEdge = state.edgeToEdge,
            useNativeBlackout = state.useNativeBlackout,
            closeIcon = painterResource(R.drawable.ic_close_24),
        ) {
            Column(
                modifier = Modifier
                    .width(300.dp)
                    .testTag(modalTag),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                content()

                Button(
                    style = buttonStyle,
                    modifier = Modifier.testTag(closeButtonTag),
                    label = closeButtonLabel,
                    onClick = onDismissRequest,
                )
            }
        }
    }
}
