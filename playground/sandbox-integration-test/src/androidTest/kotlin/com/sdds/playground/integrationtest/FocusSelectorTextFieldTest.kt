package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.FocusSelectorPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class FocusSelectorTextFieldTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.FOCUS_SELECTOR)

    @Test
    fun test_text_field_receives_focus_after_tab_press() {
        FocusSelectorPage(composeTestRule)
            .clickShowAll()
            .selectTextFieldTab()
            .checkTextFieldTabContentVisible()
            .checkTextFieldFocusStateNotFocused()
            .pressTab()
            .checkTextFieldFocusStateFocused()
            .checkTextFieldFocusPassed()
    }

    @Test
    fun test_text_field_focus_can_be_cleared() {
        FocusSelectorPage(composeTestRule)
            .clickShowAll()
            .selectTextFieldTab()
            .checkTextFieldTabContentVisible()
            .pressTab()
            .checkTextFieldFocusStateFocused()
            .clearFocus()
            .checkTextFieldFocusStateNotFocused()
            .checkTextFieldClearFocusPassed()
    }
}
