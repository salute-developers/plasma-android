package com.sdds.playground.integrationtest.scenarios.popup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.components.scenario.ScenarioButton
import com.sdds.playground.integrationtest.components.scenario.ScenarioTooltip
import com.sdds.playground.integrationtest.scaffold.ScenarioScaffold
import com.sdds.playground.integrationtest.scenarios.popup.state.TooltipScenarioUiState
import com.sdds.playground.integrationtest.testtags.TooltipTags
import com.sdds.playground.integrationtest.uistate.ButtonUiState
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.Positive
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.styles.tooltip.M
import com.sdds.serv.styles.tooltip.Tooltip

@Composable
internal fun TooltipScenarioScreen() {
    var uiState by remember { mutableStateOf(TooltipScenarioUiState.initial()) }

    ScenarioScaffold(
        title = "Интеграционный сценарий: Tooltip popupProperties",
        description = "Первый тултип закрывается по нажатию на встроенную кнопку. " +
            "Второй тултип закрывается по тапу вне области тултипа.",
        checks = uiState.checks,
        rootTestTag = TooltipTags.ROOT,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            ScenarioTooltip(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.M.Default.style(),
                isVisible = uiState.isFirstTooltipVisible,
                text = "Нажмите на кнопку с крестиком для продолжения",
                onOpenClick = { uiState = uiState.openFirstTooltip() },
                onDismissRequest = { uiState = uiState.dismissActiveTooltip() },
                openButtonTag = TooltipTags.FIRST_OPEN_BUTTON,
                tooltipTag = TooltipTags.FIRST_TOOLTIP,
                triggerLabel = "Show tooltip with close button",
                popupProperties = PopupProperties(
                    focusable = false,
                    dismissOnBackPress = true,
                    dismissOnClickOutside = false,
                ),
                inlineCloseButtonStyle = IconButton.Xs.Positive.style(),
                inlineCloseButtonTag = TooltipTags.FIRST_CLOSE_BUTTON,
                onInlineCloseClick = { uiState = uiState.closeFirstByButton() },
            )

            Spacer(modifier = Modifier.size(36.dp))

            ScenarioTooltip(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.M.Default.style(),
                isVisible = uiState.isSecondTooltipVisible,
                text = "Нажмите на область вне тултипа для закрытия",
                onOpenClick = { uiState = uiState.openSecondTooltip() },
                onDismissRequest = { uiState = uiState.closeSecondByOutside() },
                openButtonTag = TooltipTags.SECOND_OPEN_BUTTON,
                tooltipTag = TooltipTags.SECOND_TOOLTIP,
                triggerLabel = "Show tooltip with outside dismiss",
                popupProperties = PopupProperties(
                    focusable = true,
                    dismissOnBackPress = true,
                    dismissOnClickOutside = true,
                ),
                inlineCloseButtonStyle = IconButton.S.Positive.style(),
            )

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
