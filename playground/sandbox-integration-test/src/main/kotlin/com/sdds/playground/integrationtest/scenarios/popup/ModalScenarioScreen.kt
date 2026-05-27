package com.sdds.playground.integrationtest.scenarios.popup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.components.scenario.ScenarioButton
import com.sdds.playground.integrationtest.components.scenario.ScenarioModal
import com.sdds.playground.integrationtest.components.scenario.ScenarioScrollBar
import com.sdds.playground.integrationtest.scaffold.ScenarioScaffold
import com.sdds.playground.integrationtest.scenarios.popup.state.ModalScenarioUiState
import com.sdds.playground.integrationtest.testtags.ModalTags
import com.sdds.playground.integrationtest.testtags.TooltipTags
import com.sdds.playground.integrationtest.uistate.ButtonUiState
import com.sdds.playground.integrationtest.uistate.ModalUiState
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.modal.Default
import com.sdds.serv.styles.modal.Modal
import com.sdds.serv.styles.scrollbar.M
import com.sdds.serv.styles.scrollbar.ScrollBar

@Composable
internal fun ModalScenarioScreen() {
    var uiState by remember { mutableStateOf(ModalScenarioUiState.initial()) }
    val screenScrollState = rememberScrollState()

    ScenarioScaffold(
        title = "Интеграционный сценарий: Модальное окно и скроллбар",
        description = "Проверяем скролится ли контент после открытия и закрытия модального окна",
        checks = uiState.checks,
        rootTestTag = ModalTags.ROOT,
    ) {
        Column(
            modifier = Modifier.verticalScroll(screenScrollState),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Text(text = "Сценарий: Открываем модал, закрываем, затем скроллим контент")

            ScenarioModal(
                state = ModalUiState(),
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
                isVisible = uiState.isFirstModalVisible,
                onOpenClick = { uiState = uiState.openFirstModal() },
                onDismissRequest = { uiState = uiState.closeFirstModal() },
                openButtonTag = ModalTags.FIRST_OPEN_BUTTON,
                modalTag = ModalTags.FIRST_MODAL,
                closeButtonTag = ModalTags.FIRST_CLOSE_BUTTON,
                openButtonLabel = "Open modal",
                content = {},
            )

            ScenarioScrollBar(
                style = ScrollBar.M.style(),
                scrollContainerTag = ModalTags.FIRST_SCROLL_CONTAINER,
                scrollTargetTag = ModalTags.FIRST_SCROLL_TARGET,
                onScrolled = { uiState = uiState.markFirstScrolled() },
            )
            Spacer(modifier = Modifier.height(12.dp))

            ScenarioButton(
                state = ButtonUiState(
                    label = "Reset scenario",
                    testTag = TooltipTags.RESET,
                ),
                style = BasicButton.S.Secondary.style(),
                onClick = { uiState = uiState.reset() },
            )
        }
    }
}
