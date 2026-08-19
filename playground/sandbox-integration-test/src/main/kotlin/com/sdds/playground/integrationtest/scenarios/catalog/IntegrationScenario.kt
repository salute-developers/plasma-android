package com.sdds.playground.integrationtest.scenarios.catalog

import androidx.compose.runtime.Composable

/**
 * Категория сценария
 */
internal enum class ScenarioCategory(val title: String) {
    Input("Input & Validation"),
    Popup("Popup components"),
    Performance("Performance"),
}

internal enum class ScenarioPresentation {
    Standard,
    Fullscreen,
}

/**
 * Сценарий
 */
internal data class IntegrationScenario(
    val id: String,
    val title: String,
    val description: String,
    val category: ScenarioCategory,
    val presentation: ScenarioPresentation = ScenarioPresentation.Standard,
    val screen: @Composable () -> Unit,
)
