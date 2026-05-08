package com.sdds.playground.integrationtest.scenarios.popup

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Toast
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayHost
import com.sdds.compose.uikit.overlay.OverlayManager
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showToast
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.components.scenario.ScenarioButton
import com.sdds.playground.integrationtest.components.scenario.ScenarioModal
import com.sdds.playground.integrationtest.components.scenario.ScenarioTextField
import com.sdds.playground.integrationtest.scaffold.ScenarioScaffold
import com.sdds.playground.integrationtest.scenarios.login.state.LoginFormScenarioUiState
import com.sdds.playground.integrationtest.scenarios.login.state.ValidationState
import com.sdds.playground.integrationtest.testtags.LoginFormTags
import com.sdds.playground.integrationtest.testtags.ModalTags
import com.sdds.playground.integrationtest.testtags.ToastTags
import com.sdds.playground.integrationtest.uistate.ButtonUiState
import com.sdds.playground.integrationtest.uistate.ModalUiState
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.modal.Default
import com.sdds.serv.styles.modal.Modal
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.Error
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.RequiredEnd
import com.sdds.serv.styles.textfield.Success
import com.sdds.serv.styles.textfield.TextField
import com.sdds.serv.styles.toast.Positive
import com.sdds.serv.styles.toast.Rounded
import com.sdds.serv.styles.toast.Toast

@Composable
internal fun ToastModalLoginFormScenarioScreen() {
    var uiState by remember { mutableStateOf(LoginFormScenarioUiState.initial()) }
    var isModalVisible by remember { mutableStateOf(false) }
    var toastShownAfterValidSubmit by remember { mutableStateOf(false) }

    val emailStyle = when (uiState.emailValidation) {
        ValidationState.Default -> TextField.L.InnerLabel.Default.style()
        ValidationState.Success -> TextField.L.InnerLabel.Success.style()
        ValidationState.Error -> TextField.L.InnerLabel.Error.style()
    }

    val passwordStyle = when (uiState.passwordValidation) {
        ValidationState.Default -> TextField.L.InnerLabel.RequiredEnd.Default.style()
        ValidationState.Success -> TextField.L.InnerLabel.RequiredEnd.Success.style()
        ValidationState.Error -> TextField.L.InnerLabel.RequiredEnd.Error.style()
    }

    val checks = uiState.checks + ScenarioCheckUiState(
        title = "Toast появляется после успешного ввода",
        passed = toastShownAfterValidSubmit,
        testTag = ToastTags.CHECK_TOAST_AFTER_VALID_SUBMIT,
    )

    ScenarioScaffold(
        title = "Интеграционный сценарий: Toast показывается после ввода",
        description = "Toast появляется после ввода и закрытия модал",
        checks = checks,
        rootTestTag = ToastTags.ROOT,
    ) {
        OverlayHost {
            val overlayManager = LocalOverlayManager.current
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                ScenarioModal(
                    state = ModalUiState(
                        hasDimBackground = true,
                        useNativeBlackout = true,
                        edgeToEdge = true,
                        hasClose = false,
                    ),
                    style = Modal.Default.style(),
                    buttonStyle = BasicButton.M.Default.style(),
                    isVisible = isModalVisible,
                    onOpenClick = { isModalVisible = true },
                    onDismissRequest = { isModalVisible = false },
                    openButtonTag = ModalTags.FIRST_OPEN_BUTTON,
                    modalTag = ModalTags.FIRST_MODAL,
                    closeButtonTag = ModalTags.FIRST_CLOSE_BUTTON,
                    openButtonLabel = "Open modal",
                ) {
                    ScenarioTextField(
                        modifier = Modifier.fillMaxWidth(),
                        state = uiState.emailField,
                        style = emailStyle,
                        onValueChange = {
                            toastShownAfterValidSubmit = false
                            uiState = uiState.updateEmail(it)
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    )
                    ScenarioTextField(
                        modifier = Modifier.fillMaxWidth(),
                        state = uiState.passwordField,
                        style = passwordStyle,
                        onValueChange = {
                            toastShownAfterValidSubmit = false
                            uiState = uiState.updatePassword(it)
                        },
                        visualTransformation = PasswordVisualTransformation(),
                    )

                    uiState.errorMessage?.let {
                        Text(
                            text = it,
                            modifier = Modifier.testTag(LoginFormTags.ERROR),
                        )
                    }

                    ScenarioButton(
                        state = uiState.continueButton,
                        style = BasicButton.Xs.Default.style(),
                        onClick = {
                            val nextState = uiState.submit()
                            uiState = nextState
                            val isSuccess = nextState.errorMessage == null &&
                                nextState.loadingMessage != null
                            if (isSuccess) {
                                toastShownAfterValidSubmit = true

                                overlayManager.showToast(
                                    onDismiss = {},
                                    position = OverlayPosition.Center,
                                    durationMillis = OverlayManager.OVERLAY_DURATION_SLOW_MILLIS,
                                ) {
                                        id ->
                                    Toast(
                                        modifier = Modifier.testTag(ToastTags.TOAST),
                                        style = Toast.Rounded.Positive.style(),
                                        text = "Успешный логин",
                                        contentStart = {
                                            Icon(
                                                painterResource(com.sdds.icons.R.drawable.ic_shazam_16),
                                                contentDescription = "",
                                            )
                                        },
                                        contentEnd = {
                                            Icon(
                                                modifier = Modifier.clickable(
                                                    indication = null,
                                                    interactionSource = remember { MutableInteractionSource() },
                                                ) {
                                                    overlayManager.remove(id)
                                                },
                                                painter = painterResource(com.sdds.icons.R.drawable.ic_close_16),
                                                contentDescription = "",
                                            )
                                        },
                                    )
                                }
                            }
                        },
                    )
                }

                ScenarioButton(
                    state = ButtonUiState(
                        label = "Reset scenario",
                        testTag = ToastTags.RESET,
                    ),
                    style = BasicButton.S.Secondary.style(),
                    onClick = {
                        toastShownAfterValidSubmit = false
                        uiState = uiState.reset()
                    },
                )
            }
        }
    }
}
