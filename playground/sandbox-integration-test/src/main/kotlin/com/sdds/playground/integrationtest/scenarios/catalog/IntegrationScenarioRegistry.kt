package com.sdds.playground.integrationtest.scenarios.catalog

import FocusSelectorScaleScenarioScreen
import com.sdds.playground.integrationtest.scenarios.focus.FocusSelectorScenarioScreen
import com.sdds.playground.integrationtest.scenarios.login.LoginFormScenarioScreen
import com.sdds.playground.integrationtest.scenarios.performance.BottomSheetWheelPerformanceScreen
import com.sdds.playground.integrationtest.scenarios.performance.ComponentsFeedPerformanceScreen
import com.sdds.playground.integrationtest.scenarios.performance.MassStateUpdatePerformanceScreen
import com.sdds.playground.integrationtest.scenarios.performance.ModalPerformanceScreen
import com.sdds.playground.integrationtest.scenarios.performance.PopoverTriggersPerformanceScreen
import com.sdds.playground.integrationtest.scenarios.popup.ModalScenarioScreen
import com.sdds.playground.integrationtest.scenarios.popup.ToastModalLoginFormScenarioScreen
import com.sdds.playground.integrationtest.scenarios.popup.TooltipScenarioScreen
import com.sdds.playground.integrationtest.scenarios.textfield.TextFieldInvalidSelectionScenarioScreen

internal object IntegrationScenarioRegistry {
    val scenarios: List<IntegrationScenario> = listOf(
        IntegrationScenario(
            id = "text-field-invalid-selection",
            title = "Каретка за пределами отображаемого текста",
            description = "Воспроизводит падение scrollToCaret, когда TextFieldValue изменяется " +
                "раньше, чем обновляется текстовый layout.",
            category = ScenarioCategory.Input,
            screen = { TextFieldInvalidSelectionScenarioScreen() },
        ),
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
        IntegrationScenario(
            id = "perf-components-feed",
            title = "Performance: components feed",
            description = "Scroll 200 deterministic Cell items.",
            category = ScenarioCategory.Performance,
            presentation = ScenarioPresentation.Fullscreen,
            screen = { ComponentsFeedPerformanceScreen() },
        ),
        IntegrationScenario(
            id = "perf-mass-state-update",
            title = "Performance: mass state update",
            description = "Select or clear 100 items rendered by a LazyColumn.",
            category = ScenarioCategory.Performance,
            presentation = ScenarioPresentation.Fullscreen,
            screen = { MassStateUpdatePerformanceScreen() },
        ),
        IntegrationScenario(
            id = "perf-modal-cycle",
            title = "Performance: modal interaction cycle",
            description = "Open and close a deterministic performance-only Modal repeatedly.",
            category = ScenarioCategory.Performance,
            presentation = ScenarioPresentation.Fullscreen,
            screen = { ModalPerformanceScreen() },
        ),
        IntegrationScenario(
            id = "perf-popover-100-triggers",
            title = "Performance: 100 popover triggers",
            description = "Open and close Popovers from five triggers in a LazyColumn containing 100 triggers.",
            category = ScenarioCategory.Performance,
            presentation = ScenarioPresentation.Fullscreen,
            screen = { PopoverTriggersPerformanceScreen() },
        ),
        IntegrationScenario(
            id = "perf-bottom-sheet-wheel",
            title = "Performance: BottomSheet with Wheel",
            description = "Open a BottomSheet, scroll a Wheel with 100 items and close it repeatedly.",
            category = ScenarioCategory.Performance,
            presentation = ScenarioPresentation.Fullscreen,
            screen = { BottomSheetWheelPerformanceScreen() },
        ),
    )
}
