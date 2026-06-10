package com.sdds.playground.integrationtest.scenarios.catalog

import FocusSelectorScaleScenarioScreen
import com.sdds.playground.integrationtest.scenarios.focus.FocusSelectorScenarioScreen
import com.sdds.playground.integrationtest.scenarios.login.LoginFormScenarioScreen
import com.sdds.playground.integrationtest.scenarios.popup.ModalScenarioScreen
import com.sdds.playground.integrationtest.scenarios.popup.ToastModalLoginFormScenarioScreen
import com.sdds.playground.integrationtest.scenarios.popup.TooltipScenarioScreen

internal object IntegrationScenarioRegistry {
    val scenarios: List<IntegrationScenario> = listOf(
        IntegrationScenario(
            id = "focus-scale-tabs",
            title = "Фокус-scale",
            description = "Чипы и текстовое поле могут получать scale и сбрасывать состояние " +
                "focus scale на изолированных вкладках.",
            category = ScenarioCategory.Input,
            screen = { FocusSelectorScaleScenarioScreen() },
        ),
        IntegrationScenario(
            id = "focus-selector-tabs",
            title = "Фокус-селектор",
            description = "Кнопка, чип и текстовое поле могут получать фокус и сбрасывать состояние " +
                "focus selector на изолированных вкладках.",
            category = ScenarioCategory.Input,
            screen = { FocusSelectorScenarioScreen() },
        ),
        IntegrationScenario(
            id = "login-form-basic",
            title = "Форма входа",
            description = "Сценарий формы с CTA gating, встроенной ошибкой и переходом в состояние загрузки.",
            category = ScenarioCategory.Input,
            screen = { LoginFormScenarioScreen() },
        ),
        IntegrationScenario(
            id = "popup-tooltip-basic",
            title = "Всплывающий тултип",
            description = "Проверка поведения тултипа.",
            category = ScenarioCategory.Popup,
            screen = { TooltipScenarioScreen() },
        ),
        IntegrationScenario(
            id = "modal-scrollbar-basic",
            title = "Модальное окно и скроллбар",
            description = "Два сценария с модальными окнами, которые проверяют, что контент снова " +
                "прокручивается после закрытия оверлеев.",
            category = ScenarioCategory.Popup,
            screen = { ModalScenarioScreen() },
        ),
        IntegrationScenario(
            id = "toast-modal-login-basic",
            title = "Toast после ввода в модальном окне",
            description = "После ввода в два текстовых поля внутри модального окна появляется toast.",
            category = ScenarioCategory.Popup,
            screen = { ToastModalLoginFormScenarioScreen() },
        ),
    )
}
