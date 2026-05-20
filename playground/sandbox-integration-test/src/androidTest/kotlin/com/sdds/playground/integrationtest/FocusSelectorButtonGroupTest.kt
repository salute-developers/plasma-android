package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.FocusSelectorPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class FocusSelectorButtonGroupTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.FOCUS_SELECTOR)

    @Test
    fun test_button_group_focus_after_tab_press() {
        FocusSelectorPage(composeTestRule)
            .selectButtonGroupTab()
            .checkButtonGroupTabContentVisible()
            .checkButtonGroupFocusStateNotFocused()
            .pressTab()
            .pressTab()
            .pressTab()
            .pressTab()
            .pressTab()
            .checkButtonGroupFocusStateFocused()
            .checkButtonGroupFocusRequestPassed()
    }

    @Test
    fun test_button_group_focus_can_be_cleared() {
        FocusSelectorPage(composeTestRule)
            .selectButtonGroupTab()
            .checkButtonGroupTabContentVisible()
            .pressTab()
            .pressTab()
            .pressTab()
            .pressTab()
            .pressTab()
            .checkButtonGroupFocusStateFocused()
            .clearFocus()
            .checkButtonGroupFocusStateNotFocused()
    }
}
