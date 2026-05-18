package com.sdds.playground.integrationtest.scenarios.popup.state

import com.sdds.playground.integrationtest.testtags.TooltipTags
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState

internal enum class ActiveTooltip {
    NONE,
    FIRST,
    SECOND,
}

internal data class TooltipScenarioUiState(
    val activeTooltip: ActiveTooltip,
    val firstWasOpened: Boolean,
    val firstClosedByButton: Boolean,
    val secondWasOpened: Boolean,
    val secondClosedByOutside: Boolean,
) {
    val isFirstTooltipVisible: Boolean
        get() = activeTooltip == ActiveTooltip.FIRST

    val isSecondTooltipVisible: Boolean
        get() = activeTooltip == ActiveTooltip.SECOND

    val checks: List<ScenarioCheckUiState>
        get() = listOf(
            ScenarioCheckUiState(
                title = "Первый тултип открывается после нажатия на кнопку",
                passed = firstWasOpened,
                testTag = TooltipTags.CHECK_FIRST_OPENED,
            ),
            ScenarioCheckUiState(
                title = "Первый тултип закрывается по нажатию на кнопку закрытия в зоне тултипа",
                passed = firstClosedByButton && !isFirstTooltipVisible,
                testTag = TooltipTags.CHECK_FIRST_CLOSED_BY_BUTTON,
            ),
            ScenarioCheckUiState(
                title = "Второй тултип открывается после нажатия на кнопку",
                passed = secondWasOpened,
                testTag = TooltipTags.CHECK_SECOND_OPENED,
            ),
            ScenarioCheckUiState(
                title = "Второй тултип закрывается по тапу вне области тултипа",
                passed = secondClosedByOutside && !isSecondTooltipVisible,
                testTag = TooltipTags.CHECK_SECOND_CLOSED_BY_OUTSIDE,
            ),
        )

    fun openFirstTooltip() = copy(
        activeTooltip = ActiveTooltip.FIRST,
        firstWasOpened = true,
    )

    fun openSecondTooltip() = copy(
        activeTooltip = ActiveTooltip.SECOND,
        secondWasOpened = true,
    )

    fun closeFirstByButton() = copy(
        activeTooltip = ActiveTooltip.NONE,
        firstClosedByButton = true,
    )

    fun closeSecondByOutside() = copy(
        activeTooltip = ActiveTooltip.NONE,
        secondClosedByOutside = true,
    )

    fun dismissActiveTooltip() = copy(activeTooltip = ActiveTooltip.NONE)

    fun reset() = initial()

    companion object {
        fun initial() = TooltipScenarioUiState(
            activeTooltip = ActiveTooltip.NONE,
            firstWasOpened = false,
            firstClosedByButton = false,
            secondWasOpened = false,
            secondClosedByOutside = false,
        )
    }
}
