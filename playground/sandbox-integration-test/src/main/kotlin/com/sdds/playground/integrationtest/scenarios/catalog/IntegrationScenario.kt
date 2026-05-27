package com.sdds.playground.integrationtest.scenarios.catalog

import androidx.compose.runtime.Composable

/**
 * Категория сценария
 */
internal enum class ScenarioCategory(val title: String) {
    Input("Input & Validation"),
    Popup("Popup components"),
}

/**
 * Сценарий
 */
internal data class IntegrationScenario(
    val id: String,
    val title: String,
    val description: String,
    val category: ScenarioCategory,
    val screen: @Composable () -> Unit,
)
