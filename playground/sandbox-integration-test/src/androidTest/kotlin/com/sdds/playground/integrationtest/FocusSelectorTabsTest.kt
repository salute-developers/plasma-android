package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.FocusSelectorPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class FocusSelectorTabsTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.FOCUS_SELECTOR)

    @Test
    fun test_tabs_focus_after_tab_press() {
        FocusSelectorPage(composeTestRule)
            .clickShowAll()
            .selectTabsTab()
            .checkTabsTabContentVisible()
            .checkTabsFocusStateNotFocused()
            .pressTab(5)
            .checkTabsFocusStateFocused()
            .checkTabsFocusPassed()
    }

    @Test
    fun test_tabs_focus_can_be_cleared() {
        FocusSelectorPage(composeTestRule)
            .clickShowAll()
            .selectTabsTab()
            .checkTabsTabContentVisible()
            .pressTab(5)
            .checkTabsFocusStateFocused()
            .clearFocus()
            .checkTabsFocusStateNotFocused()
            .checkTabsClearFocusPassed()
    }
}
