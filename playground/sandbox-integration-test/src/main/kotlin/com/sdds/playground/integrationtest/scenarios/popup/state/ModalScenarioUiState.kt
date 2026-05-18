package com.sdds.playground.integrationtest.scenarios.popup.state

import com.sdds.playground.integrationtest.testtags.ModalTags
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState

/**
 * State для сценария Modal
 */
internal data class ModalScenarioUiState(
    val firstModalVisible: Boolean,
    val firstModalOpened: Boolean,
    val firstModalClosed: Boolean,
    val firstScrolled: Boolean,
    val secondModalVisible: Boolean,
    val secondModalOpened: Boolean,
    val secondModalClosed: Boolean,
    val secondScrolled: Boolean,
) {
    val isFirstModalVisible: Boolean
        get() = firstModalVisible

    val isSecondModalVisible: Boolean
        get() = secondModalVisible

    val checks: List<ScenarioCheckUiState>
        get() = listOf(
            ScenarioCheckUiState(
                title = "First modal opens",
                passed = firstModalOpened,
                testTag = ModalTags.CHECK_FIRST_OPENED,
            ),
            ScenarioCheckUiState(
                title = "First modal closes before scrolling",
                passed = firstModalClosed && !firstModalVisible,
                testTag = ModalTags.CHECK_FIRST_CLOSED,
            ),
            ScenarioCheckUiState(
                title = "First scenario content scrolls after modal close",
                passed = firstScrolled,
                testTag = ModalTags.CHECK_FIRST_SCROLLED,
            ),
            ScenarioCheckUiState(
                title = "Second modal opens",
                passed = secondModalOpened,
                testTag = ModalTags.CHECK_SECOND_OPENED,
            ),
            ScenarioCheckUiState(
                title = "Second modal closes before scrolling",
                passed = secondModalClosed && !secondModalVisible,
                testTag = ModalTags.CHECK_SECOND_CLOSED,
            ),
            ScenarioCheckUiState(
                title = "Second scenario content scrolls after modal close",
                passed = secondScrolled,
                testTag = ModalTags.CHECK_SECOND_SCROLLED,
            ),
        )

    fun openFirstModal() = copy(
        firstModalVisible = true,
        firstModalOpened = true,
    )

    fun closeFirstModal() = copy(
        firstModalVisible = false,
        firstModalClosed = true,
    )

    fun markFirstScrolled(): ModalScenarioUiState = if (firstModalClosed) {
        copy(firstScrolled = true)
    } else {
        this
    }

    fun openSecondModal() = copy(
        secondModalVisible = true,
        secondModalOpened = true,
    )

    fun closeSecondModal() = copy(
        secondModalVisible = false,
        secondModalClosed = true,
    )

    fun markSecondScrolled(): ModalScenarioUiState = if (secondModalClosed) {
        copy(secondScrolled = true)
    } else {
        this
    }

    fun reset(): ModalScenarioUiState = initial()

    companion object {
        fun initial() = ModalScenarioUiState(
            firstModalVisible = false,
            firstModalOpened = false,
            firstModalClosed = false,
            firstScrolled = false,
            secondModalVisible = false,
            secondModalOpened = false,
            secondModalClosed = false,
            secondScrolled = false,
        )
    }
}
