package com.sdds.playground.integrationtest.scenarios.login.state

import com.sdds.playground.integrationtest.testtags.LoginFormTags
import com.sdds.playground.integrationtest.uistate.ButtonUiState
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState
import com.sdds.playground.integrationtest.uistate.TextFieldUiState

/**
 * Состояние сценария логина
 */
internal enum class ValidationState {
    Default,
    Success,
    Error,
}

internal data class LoginFormScenarioUiState(
    val emailField: TextFieldUiState,
    val passwordField: TextFieldUiState,
    val emailValidation: ValidationState,
    val passwordValidation: ValidationState,
    val continueButton: ButtonUiState,
    val useInvalidSampleButton: ButtonUiState,
    val useValidSampleButton: ButtonUiState,
    val resetButton: ButtonUiState,
    val checks: List<ScenarioCheckUiState>,
    val errorMessage: String? = null,
    val loadingMessage: String? = null,
) {

    fun updateEmail(value: String): LoginFormScenarioUiState = from(
        email = value,
        password = passwordField.value,
        showError = false,
        loading = false,
    )

    fun updatePassword(value: String): LoginFormScenarioUiState = from(
        email = emailField.value,
        password = value,
        showError = false,
        loading = false,
    )

    fun submit(): LoginFormScenarioUiState =
        if (emailField.value == "demo" && passwordField.value == "demo") {
            from(
                email = emailField.value,
                password = passwordField.value,
                showError = false,
                loading = true,
            )
        } else {
            from(
                email = emailField.value,
                password = passwordField.value,
                showError = true,
                loading = false,
            )
        }

    fun applyInvalidSample(): LoginFormScenarioUiState = from(
        email = "demo",
        password = "wrong",
        showError = false,
        loading = false,
    )

    fun applyValidSample(): LoginFormScenarioUiState = from(
        email = "demo",
        password = "demo",
        showError = false,
        loading = false,
    )

    fun reset(): LoginFormScenarioUiState = initial()

    companion object {
        fun initial(): LoginFormScenarioUiState = from(
            email = "",
            password = "",
            showError = false,
            loading = false,
        )

        private fun from(
            email: String,
            password: String,
            showError: Boolean,
            loading: Boolean,
        ): LoginFormScenarioUiState {
            val isSubmitEnabled = isSubmitEnabled(email, password, loading)
            val isValidCredentials = hasValidCredentials(email, password)

            val emailValidation = resolveValidation(
                value = email,
                showError = showError,
                loading = loading,
                isValidCredentials = isValidCredentials,
            )

            val passwordValidation = resolveValidation(
                value = password,
                showError = showError,
                loading = loading,
                isValidCredentials = isValidCredentials,
            )

            return LoginFormScenarioUiState(
                emailField = buildEmailField(email),
                passwordField = buildPasswordField(password),
                emailValidation = emailValidation,
                passwordValidation = passwordValidation,
                continueButton = buildContinueButton(isSubmitEnabled, loading),
                useInvalidSampleButton = buildInvalidSampleButton(),
                useValidSampleButton = buildValidSampleButton(),
                resetButton = buildResetButton(),
                checks = buildChecks(
                    email = email,
                    password = password,
                    showError = showError,
                    loading = loading,
                    isSubmitEnabled = isSubmitEnabled,
                ),
                errorMessage = buildErrorMessage(showError),
                loadingMessage = buildLoadingMessage(loading),
            )
        }
    }
}

private fun resolveValidation(
    value: String,
    showError: Boolean,
    loading: Boolean,
    isValidCredentials: Boolean,
): ValidationState = when {
    value.isBlank() -> ValidationState.Default
    showError -> ValidationState.Error
    loading && isValidCredentials -> ValidationState.Success
    else -> ValidationState.Default
}

private fun isSubmitEnabled(email: String, password: String, loading: Boolean): Boolean =
    email.isNotBlank() && password.isNotBlank() && !loading

private fun hasValidCredentials(email: String, password: String): Boolean =
    email == "demo" && password == "demo"

private fun buildChecks(
    email: String,
    password: String,
    showError: Boolean,
    loading: Boolean,
    isSubmitEnabled: Boolean,
): List<ScenarioCheckUiState> = listOf(
    ScenarioCheckUiState(
        title = "Кнопка выключена когда форма не заполнена",
        passed = email.isBlank() && password.isBlank() && !isSubmitEnabled && !showError && !loading,
        testTag = LoginFormTags.check(1),
    ),
    ScenarioCheckUiState(
        title = "Кнопка активна когда обе формы заполнены",
        passed = email.isNotBlank() && password.isNotBlank() && isSubmitEnabled && !showError && !loading,
        testTag = LoginFormTags.check(2),
    ),
    ScenarioCheckUiState(
        title = "Неправильный ввод показывает ошибку",
        passed = showError && !loading && email.isNotBlank() && password.isNotBlank(),
        testTag = LoginFormTags.check(3),
    ),
    ScenarioCheckUiState(
        title = "Правильный ввод переводит кнопку в статус Loading",
        passed = loading && email == "demo" && password == "demo",
        testTag = LoginFormTags.check(4),
    ),
)

private fun buildEmailField(email: String): TextFieldUiState = TextFieldUiState(
    value = email,
    label = "Email",
    placeholder = "введите ваш email, например: name@example.com",
    testTag = LoginFormTags.EMAIL,
)

private fun buildPasswordField(password: String): TextFieldUiState = TextFieldUiState(
    value = password,
    label = "Пароль",
    placeholder = "Введите пароль",
    testTag = LoginFormTags.PASSWORD,
    isPassword = true,
)

private fun buildContinueButton(enabled: Boolean, loading: Boolean): ButtonUiState = ButtonUiState(
    label = "Continue",
    testTag = LoginFormTags.CONTINUE,
    enabled = enabled,
    loading = loading,
)

private fun buildInvalidSampleButton(): ButtonUiState = ButtonUiState(
    label = "Use invalid sample",
    testTag = LoginFormTags.USE_INVALID,
)

private fun buildValidSampleButton(): ButtonUiState = ButtonUiState(
    label = "Use valid sample",
    testTag = LoginFormTags.USE_VALID,
)

private fun buildResetButton(): ButtonUiState = ButtonUiState(
    label = "Reset scenario",
    testTag = LoginFormTags.RESET,
)

private fun buildErrorMessage(showError: Boolean): String? =
    if (showError) "Invalid credentials" else null

private fun buildLoadingMessage(loading: Boolean): String? =
    if (loading) "Loading state reached for a valid submit." else null
