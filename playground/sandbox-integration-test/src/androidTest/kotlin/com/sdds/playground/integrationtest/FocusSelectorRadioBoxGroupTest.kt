package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.FocusSelectorPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class FocusSelectorRadioBoxGroupTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.FOCUS_SELECTOR)

    @Test
    fun test_radio_box_group_focus_after_tab_press() {
        FocusSelectorPage(composeTestRule)
            .clickShowAll()
            .selectRadioBoxGroupTab()
            .checkRadioBoxGroupTabContentVisible()
            .checkRadioBoxGroupFocusStateNotFocused()
            .pressTab(times = 5)
            .checkRadioBoxGroupFocusStateFocused()
            .checkRadioBoxGroupFocusPassed()
    }

    @Test
    fun test_radio_box_group_focus_can_be_cleared() {
        FocusSelectorPage(composeTestRule)
            .clickShowAll()
            .selectRadioBoxGroupTab()
            .checkRadioBoxGroupTabContentVisible()
            .pressTab(times = 5)
            .checkRadioBoxGroupFocusStateFocused()
            .clearFocus()
            .checkRadioBoxGroupFocusStateNotFocused()
            .checkRadioBoxAndCodeInputClearFocusPassed()
    }
}
