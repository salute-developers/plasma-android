package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.FocusSelectorPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class FocusSelectorChipTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.FOCUS_SELECTOR)

    @Test
    fun test_chip_receives_focus_after_tab_press() {
        FocusSelectorPage(composeTestRule)
            .selectChipTab()
            .checkChipTabContentVisible()
            .pressTab()
            .checkChipFocusStateFocused()
            .checkChipFocusPassed()
    }

    @Test
    fun test_chip_clear_focus_after() {
        FocusSelectorPage(composeTestRule)
            .selectChipTab()
            .checkChipTabContentVisible()
            .pressTab()
            .checkChipFocusStateFocused()
            .checkChipFocusPassed()
            .clearFocus()
            .checkButtonAndChipClearFocusPassed()
    }
}
