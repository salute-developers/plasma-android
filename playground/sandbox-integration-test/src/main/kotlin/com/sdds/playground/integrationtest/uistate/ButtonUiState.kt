package com.sdds.playground.integrationtest.uistate

/**
 * UiState для BasicButton
 */
@Suppress("UndocumentedPublicProperty")
internal data class ButtonUiState(
    val label: String,
    val testTag: String,
    val enabled: Boolean = true,
    val loading: Boolean = false,
)
