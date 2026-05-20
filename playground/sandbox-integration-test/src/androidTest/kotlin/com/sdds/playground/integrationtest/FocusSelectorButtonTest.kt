package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.FocusSelectorPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class FocusSelectorButtonTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.FOCUS_SELECTOR)

    @Test
    fun test_button_receives_focus_after_tab_press() {
        FocusSelectorPage(composeTestRule)
            .selectButtonTab()
            .checkButtonTabContentVisible()
            .checkButtonFocusStateNotFocused()
            .pressTab()
            .pressTab()
            .pressTab()
            .pressTab()
            .pressTab()
            .checkButtonFocusStateFocused()
            .checkButtonFocusRequestPassed()
    }

    @Test
    fun test_button_focus_can_be_cleared() {
        FocusSelectorPage(composeTestRule)
            .selectButtonTab()
            .checkButtonTabContentVisible()
            .pressTab()
            .pressTab()
            .pressTab()
            .pressTab()
            .pressTab()
            .checkButtonFocusStateFocused()
            .clearFocus()
            .checkButtonFocusStateNotFocused()
            .checkButtonAndChipClearFocusPassed()
    }
}
