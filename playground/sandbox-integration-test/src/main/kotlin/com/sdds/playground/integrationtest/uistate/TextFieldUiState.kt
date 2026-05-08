package com.sdds.playground.integrationtest.uistate

/**
 * UiState для TextField
 */
@Suppress("UndocumentedPublicProperty")
internal data class TextFieldUiState(
    val value: String,
    val label: String,
    val placeholder: String,
    val testTag: String,
    val isPassword: Boolean = false,
)
