package com.sdds.playground.integrationtest.scenarios.catalog

import com.sdds.playground.integrationtest.scenarios.login.LoginFormScenarioScreen
import com.sdds.playground.integrationtest.scenarios.popup.ModalScenarioScreen
import com.sdds.playground.integrationtest.scenarios.popup.ToastModalLoginFormScenarioScreen
import com.sdds.playground.integrationtest.scenarios.popup.TooltipScenarioScreen

internal object IntegrationScenarioRegistry {
    val scenarios: List<IntegrationScenario> = listOf(
        IntegrationScenario(
            id = "login-form-basic",
            title = "Login Form",
            description = "A realistic form flow with CTA gating, inline error and loading transition.",
            category = ScenarioCategory.Input,
            screen = { LoginFormScenarioScreen() },
        ),
        IntegrationScenario(
            id = "popup-tooltip-basic",
            title = "Tooltip popup",
            description = "Testing tooltip",
            category = ScenarioCategory.Popup,
            screen = { TooltipScenarioScreen() },
        ),
        IntegrationScenario(
            id = "modal-scrollbar-basic",
            title = "Modal Scrollbar",
            description = "Two modal flows that verify content can scroll again after closing overlays.",
            category = ScenarioCategory.Popup,
            screen = { ModalScenarioScreen() },
        ),
        IntegrationScenario(
            id = "toast-modal-login-basic",
            title = "Toast Modal TextField",
            description = "After input in two text fields inside modal toast appears",
            category = ScenarioCategory.Popup,
            screen = { ToastModalLoginFormScenarioScreen() },
        ),
    )
}
