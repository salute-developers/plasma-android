package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.FocusSelectorPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class FocusScaleChipGroupTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.FOCUS_SCALE)

    @Test
    fun test_chip_group_focus_after_tab_press() {
        FocusSelectorPage(composeTestRule)
            .selectChipGroupTab()
            .checkChipGroupTabContentVisible()
            .pressTab()
            .checkChipGroupFocusStateFocused()
            .checkChipGroupFocusScalePassed()
    }

    @Test
    fun test_chip_group_clear_focus_after() {
        FocusSelectorPage(composeTestRule)
            .selectChipGroupTab()
            .checkChipGroupTabContentVisible()
            .pressTab()
            .checkChipGroupFocusStateFocused()
            .clearFocus()
            .checkChipGroupFocusStateNotFocused()
            .checkChipGroupClearFocusPassed()
    }
}
