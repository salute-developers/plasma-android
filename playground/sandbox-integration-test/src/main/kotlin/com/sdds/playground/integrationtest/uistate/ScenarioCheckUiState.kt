package com.sdds.playground.integrationtest.uistate

/**
 * UiState для проверки сценария
 */
@Suppress("UndocumentedPublicProperty")
internal data class ScenarioCheckUiState(
    val title: String,
    val passed: Boolean,
    val testTag: String,
)
