package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.FocusSelectorPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class FocusSelectorCodeInputTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.FOCUS_SELECTOR)

    @Test
    fun test_code_input_focus_after_tab_press() {
        FocusSelectorPage(composeTestRule)
            .clickShowAll()
            .selectCodeInputTab()
            .checkCodeInputTabContentVisible()
            .checkCodeInputFocusStateNotFocused()
            .pressTab(times = 5)
            .checkCodeInputFocusStateFocused()
            .checkCodeInputFocusPassed()
    }

    @Test
    fun test_code_input_focus_can_be_cleared() {
        FocusSelectorPage(composeTestRule)
            .clickShowAll()
            .selectCodeInputTab()
            .checkCodeInputTabContentVisible()
            .pressTab(times = 5)
            .checkCodeInputFocusStateFocused()
            .clearFocus()
            .checkCodeInputFocusStateNotFocused()
            .checkRadioBoxAndCodeInputClearFocusPassed()
    }
}
