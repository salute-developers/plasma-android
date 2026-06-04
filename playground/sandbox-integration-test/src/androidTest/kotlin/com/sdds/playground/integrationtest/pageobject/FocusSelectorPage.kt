package com.sdds.playground.integrationtest.pageobject

import androidx.compose.ui.input.key.Key
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onLast
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performKeyInput
import androidx.compose.ui.test.pressKey
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.playground.integrationtest.sandbox.AppActivity
import com.sdds.playground.integrationtest.testtags.FocusSelectorScaleTags
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags

@OptIn(ExperimentalTestApi::class)
internal class FocusSelectorPage(
    private val composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<AppActivity>, AppActivity>,
) {
    fun selectButtonTab() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_TAB).performClick()
        composeTestRule.waitForIdle()
    }

    fun selectButtonGroupTab() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_GROUP_TAB).performClick()
        composeTestRule.waitForIdle()
    }

    fun selectChipTab() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_TAB).performClick()
        composeTestRule.waitForIdle()
    }

    fun clickShowAll() = apply {
        composeTestRule.onNodeWithText("ShowAll").performClick()
        composeTestRule.waitForIdle()
    }

    fun selectChipGroupTab() = apply {
        selectOverflowTab("ChipGroup")
    }

    fun selectTextFieldTab() = apply {
        selectOverflowTab("TextField")
    }

    fun selectRadioBoxGroupTab() = apply {
        selectOverflowTab("RadioBoxGroup")
    }

    fun selectCodeInputTab() = apply {
        selectOverflowTab("CodeInput")
    }

    fun selectTabsTab() = apply {
        selectOverflowTab("Tabs")
    }

    fun pressTab() = apply {
        composeTestRule.onRoot().performKeyInput {
            pressKey(Key.Tab)
        }
        composeTestRule.waitForIdle()
    }

    fun pressTab(times: Int) = apply {
        repeat(times) {
            pressTab()
        }
    }

    fun clearFocus() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CLEAR_FOCUS).performClick()
        composeTestRule.waitForIdle()
    }

    fun checkButtonTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_TAB_CONTENT).assertExists()
    }

    fun checkButtonGroupTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_GROUP_TAB_CONTENT).assertExists()
    }

    fun checkChipTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_TAB_CONTENT).assertExists()
    }

    fun checkChipGroupTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_GROUP_TAB_CONTENT).assertExists()
    }

    fun checkTextFieldTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TEXT_FIELD_TAB_CONTENT).assertExists()
    }

    fun checkRadioBoxGroupTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.RADIO_BOX_GROUP_TAB_CONTENT).assertExists()
    }

    fun checkCodeInputTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CODE_INPUT_TAB_CONTENT).assertExists()
    }

    fun checkTabsTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TABS_TAB_CONTENT).assertExists()
    }

    fun checkButtonFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_FOCUS_STATE)
            .assertTextEquals("Кнопка в фокусе")
    }

    fun checkButtonFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_FOCUS_STATE)
            .assertTextEquals("Кнопка не в фокусе")
    }

    fun checkButtonGroupFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_GROUP_FOCUS_STATE)
            .assertTextEquals("Группа кнопок в фокусе")
    }

    fun checkButtonGroupFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_GROUP_FOCUS_STATE)
            .assertTextEquals("Кнопки не в фокусе")
    }

    fun checkChipFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_FOCUS_STATE)
            .assertTextEquals("Чип в фокусе")
    }

    fun checkChipGroupFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_GROUP_FOCUS_STATE)
            .assertTextEquals("Группа чипов в фокусе")
    }

    fun checkChipGroupFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_GROUP_FOCUS_STATE)
            .assertTextEquals("Чипы не в фокусе")
    }

    fun checkTextFieldFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TEXT_FIELD_FOCUS_STATE)
            .assertTextEquals("Текстовое поле в фокусе")
    }

    fun checkTextFieldFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TEXT_FIELD_FOCUS_STATE)
            .assertTextEquals("Текстовое поле не в фокусе")
    }

    fun checkRadioBoxGroupFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.RADIO_BOX_GROUP_FOCUS_STATE)
            .assertTextEquals("Группа радиокнопок в фокусе")
    }

    fun checkRadioBoxGroupFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.RADIO_BOX_GROUP_FOCUS_STATE)
            .assertTextEquals("Радиокнопки не в фокусе")
    }

    fun checkCodeInputFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CODE_INPUT_FOCUS_STATE)
            .assertTextEquals("CodeInput в фокусе")
    }

    fun checkCodeInputFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CODE_INPUT_FOCUS_STATE)
            .assertTextEquals("CodeInput не в фокусе")
    }

    fun checkTabsFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TABS_FOCUS_STATE)
            .assertTextEquals("Tabs в фокусе")
    }

    fun checkTabsFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TABS_FOCUS_STATE)
            .assertTextEquals("Tabs не в фокусе")
    }

    fun checkButtonFocusRequestPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(1))
            .assertTextContains("PASS", substring = true)
    }

    fun checkButtonGroupFocusRequestPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(2))
            .assertTextContains("PASS", substring = true)
    }

    fun checkChipFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(3))
            .assertTextContains("PASS", substring = true)
    }

    fun checkChipGroupFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(4))
            .assertTextContains("PASS", substring = true)
    }

    fun checkButtonAndChipClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(5))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTextFieldFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(6))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTextFieldClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(7))
            .assertTextContains("PASS", substring = true)
    }

    fun checkRadioBoxGroupFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(8))
            .assertTextContains("PASS", substring = true)
    }

    fun checkCodeInputFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(9))
            .assertTextContains("PASS", substring = true)
    }

    fun checkRadioBoxAndCodeInputClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(10))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTabsFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(11))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTabsClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(12))
            .assertTextContains("PASS", substring = true)
    }

    fun checkChipGroupFocusScalePassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorScaleTags.check(1))
            .assertTextContains("PASS", substring = true)
    }

    fun checkChipGroupClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(2))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTextFieldFocusScalePassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorScaleTags.check(3))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTextFieldClearFocusScalePassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(4))
            .assertTextContains("PASS", substring = true)
    }

    private fun selectOverflowTab(title: String) {
        composeTestRule.onAllNodesWithText(title).onLast().performClick()
        composeTestRule.waitForIdle()
    }
}
