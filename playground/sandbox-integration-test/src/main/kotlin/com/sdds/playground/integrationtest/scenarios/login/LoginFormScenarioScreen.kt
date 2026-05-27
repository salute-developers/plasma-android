package com.sdds.playground.integrationtest.scenarios.login

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.components.scenario.ScenarioButton
import com.sdds.playground.integrationtest.components.scenario.ScenarioTextField
import com.sdds.playground.integrationtest.scaffold.ScenarioScaffold
import com.sdds.playground.integrationtest.scenarios.login.state.LoginFormScenarioUiState
import com.sdds.playground.integrationtest.scenarios.login.state.ValidationState
import com.sdds.playground.integrationtest.testtags.LoginFormTags
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.bottomsheet.Default
import com.sdds.serv.styles.bottomsheet.ModalBottomSheet
import com.sdds.serv.styles.divider.Default
import com.sdds.serv.styles.divider.Divider
import com.sdds.serv.styles.iconbutton.Clear
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.Error
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.RequiredEnd
import com.sdds.serv.styles.textfield.Success
import com.sdds.serv.styles.textfield.TextField
import kotlinx.coroutines.launch

/**
 * Экран для интеграционного сценария: Login Form
 */
@Composable
internal fun LoginFormScenarioScreen() {
    var uiState by remember { mutableStateOf(LoginFormScenarioUiState.initial()) }
    val sheetState = rememberModalBottomSheetState(initialValue = BottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
    val bodyScrollState = rememberScrollState()

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

    ScenarioScaffold(
        title = "Интеграционный сценарий: Форма входа",
        description = "Реалистичный сценарий формы, который проверяет композицию полей, CTA gating, " +
            "отображение ошибки и переход в состояние загрузки.",
        checks = uiState.checks,
        rootTestTag = LoginFormTags.ROOT,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            ScenarioButton(
                state = uiState.resetButton.copy(
                    label = "Open login sheet",
                    testTag = "login_form_open_sheet",
                ),
                style = BasicButton.L.Default.style(),
                onClick = {
                    scope.launch { sheetState.show() }
                },
            )

            ModalBottomSheet(
                modifier = Modifier.testTag(LoginFormTags.SHEET),
                style = ModalBottomSheet.Default.style(),
                edgeToEdge = false,
                sheetState = sheetState,
                handlePlacement = BottomSheetHandlePlacement.Auto,
                onDismiss = {
                    Log.d(LOG_TAG, "onDismiss")
                },
                fitContent = true,
                header = {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Text(text = "Форма входа")
                            IconButton(
                                style = IconButton.M.Clear.style(),
                                modifier = Modifier.testTag("login_form_close_sheet_btn"),
                                iconRes = com.sdds.icons.R.drawable.ic_close_24,
                            ) {
                                scope.launch { sheetState.hide() }
                            }
                        }
                        Spacer(modifier = Modifier.padding(6.dp))
                        Divider(style = Divider.Default.style())
                        Spacer(modifier = Modifier.padding(6.dp))
                    }
                },
                body = {
                    Column(
                        modifier = Modifier
                            .verticalScroll(bodyScrollState),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        ScenarioTextField(
                            modifier = Modifier.fillMaxWidth(),
                            state = uiState.emailField,
                            style = emailStyle,
                            onValueChange = { uiState = uiState.updateEmail(it) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        )
                        ScenarioTextField(
                            modifier = Modifier.fillMaxWidth(),
                            state = uiState.passwordField,
                            style = passwordStyle,
                            onValueChange = { uiState = uiState.updatePassword(it) },
                            visualTransformation = PasswordVisualTransformation(),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Password,
                                imeAction = ImeAction.Done,
                            ),
                        )
                        ScenarioButton(
                            state = uiState.continueButton,
                            style = BasicButton.Xs.Default.style(),
                            onClick = { uiState = uiState.submit() },
                        )
                        uiState.errorMessage?.let {
                            Text(
                                text = it,
                                modifier = Modifier.testTag(LoginFormTags.ERROR),
                            )
                        }
                        uiState.loadingMessage?.let {
                            Text(
                                text = it,
                                modifier = Modifier.testTag(LoginFormTags.LOADING_HINT),
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.spacedBy(12.dp),
                        ) {
                            ScenarioButton(
                                state = uiState.useInvalidSampleButton,
                                style = BasicButton.Xs.Secondary.style(),
                                onClick = { uiState = uiState.applyInvalidSample() },
                            )
                            ScenarioButton(
                                state = uiState.useValidSampleButton,
                                style = BasicButton.Xs.Secondary.style(),
                                onClick = { uiState = uiState.applyValidSample() },
                            )
                            ScenarioButton(
                                state = uiState.resetButton,
                                style = BasicButton.Xs.Secondary.style(),
                                onClick = { uiState = uiState.reset() },
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                },
                footer = {},
            )
        }
    }
}

private const val LOG_TAG = "LoginFormScenario"
